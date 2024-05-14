from pyspark.sql import SparkSession
from pyspark.ml.feature import StringIndexer, OneHotEncoder, VectorAssembler, VectorIndexer
from pyspark.ml import Pipeline
from pyspark.ml.regression import LinearRegression, RandomForestRegressor
from pyspark.ml.evaluation import RegressionEvaluator
from pyspark.ml.tuning import ParamGridBuilder, CrossValidator
import pyspark.sql.functions as F
from pyspark.sql.functions import col
import numpy as np
from pprint import pprint

def connect_to_spark():
    # Add your team number
    team = "team4"
    warehouse = "project/hive/warehouse"
    return SparkSession.builder.appName("{} - spark ML".format(team)).getOrCreate()

def list_hive_databases(spark):
    print(spark.catalog.listDatabases())
    spark.sql("SHOW DATABASES;").show()

def read_hive_tables(spark):
    return spark.read.format("avro").table('team4_projectdb.incidents_part')

def feature_selection(df):
    features = ['incident_number', 'primary_situation', 'ems_units', 'suppression_units', 'action_taken_primary']
    label = 'suppression_personnel'

    df = df.select(features + [label])

    for col_name in ['primary_situation', 'action_taken_primary']:
        df = df.withColumn(col_name, F.translate(col_name, "'", ""))

    df = df.withColumn('incident_number', df['incident_number'].cast('string'))
    df = df.withColumn('ems_units', df['ems_units'].cast('integer'))
    df = df.withColumn('suppression_units', df['suppression_units'].cast('integer'))

    df = df.dropna(subset=features + [label])
    df = df.filter(col(label) > 0)

    return df

def feature_extraction(df):
    indexers = [StringIndexer(inputCol=col_name, outputCol=f"{col_name}_indexed", handleInvalid="keep") for col_name in ['primary_situation', 'action_taken_primary']]

    encoders = [OneHotEncoder(inputCol=indexer.getOutputCol(), outputCol=f"{indexer.getOutputCol()}_encoded") for indexer in indexers]

    assembler = VectorAssembler(inputCols=[encoder.getOutputCol() for encoder in encoders] + ['ems_units', 'suppression_units'], outputCol="features")

    pipeline = Pipeline(stages=indexers + encoders + [assembler])

    model = pipeline.fit(df)
    transformed_data = model.transform(df)
    transformed_data = transformed_data.withColumnRenamed('suppression_personnel', 'label')

    featureIndexer = VectorIndexer(inputCol="features", outputCol="indexedFeatures", maxCategories=4).fit(transformed_data)
    transformed_data = featureIndexer.transform(transformed_data)

    return transformed_data

def split_dataset(transformed_data):
    train_data, test_data = transformed_data.randomSplit([0.6, 0.4], seed=10)
    return train_data, test_data

def build_linear_regression_model(train_data):
    lr = LinearRegression()
    
    model_lr = lr.fit(train_data)
    
    return model_lr

def predict_and_evaluate_model(model, test_data):
    predictions = model.transform(test_data)
    
    evaluator_rmse = RegressionEvaluator(labelCol="label", predictionCol="prediction", metricName="rmse")
    evaluator_r2 = RegressionEvaluator(labelCol="label", predictionCol="prediction", metricName="r2")
    
    rmse = evaluator_rmse.evaluate(predictions)
    r2 = evaluator_r2.evaluate(predictions)
    
    print("Root Mean Squared Error (RMSE) on test data = {}".format(rmse))
    print("R^2 on test data = {}".format(r2))
    
    return predictions, rmse, r2

def hyperparameter_optimization_lr(train_data):
    lr = LinearRegression()
    
    grid = ParamGridBuilder() \
        .addGrid(lr.aggregationDepth, [2, 3, 4]) \
        .addGrid(lr.regParam, np.logspace(1e-3, 1e-1)) \
        .build()
    
    evaluator_rmse = RegressionEvaluator(labelCol="label", predictionCol="prediction", metricName="rmse")
    
    cv = CrossValidator(estimator=lr, 
                        estimatorParamMaps=grid, 
                        evaluator=evaluator_rmse,
                        parallelism=5,
                        numFolds=3)
    
    cvModel = cv.fit(train_data)
    bestModel = cvModel.bestModel
    
    return bestModel

def build_random_forest_model(train_data):
    rf = RandomForestRegressor()
    
    model_rf = rf.fit(train_data)
    
    return model_rf

def hyperparameter_optimization_rf(train_data):
    rf = RandomForestRegressor()
    
    grid = ParamGridBuilder() \
        .addGrid(rf.maxDepth, [2, 5]) \
        .addGrid(rf.numTrees, [5, 10]) \
        .build()
    
    evaluator_rmse = RegressionEvaluator(labelCol="label", predictionCol="prediction", metricName="rmse")
    
    cv = CrossValidator(estimator=rf, 
                        estimatorParamMaps=grid, 
                        evaluator=evaluator_rmse,
                        parallelism=5,
                        numFolds=3)
    
    cvModel = cv.fit(train_data)
    bestModel = cvModel.bestModel
    
    return bestModel

def compare_models(model1, model2, predictions1, predictions2):
    evaluator_rmse = RegressionEvaluator(labelCol="label", predictionCol="prediction", metricName="rmse")
    evaluator_r2 = RegressionEvaluator(labelCol="label", predictionCol="prediction", metricName="r2")

    rmse1 = evaluator_rmse.evaluate(predictions1)
    r21 = evaluator_r2.evaluate(predictions1)
    
    rmse2 = evaluator_rmse.evaluate(predictions2)
    r22 = evaluator_r2.evaluate(predictions2)
    
    models = [[str(model1), rmse1, r21], [str(model2), rmse2, r22]]
    df = spark.createDataFrame(models, ["model", "RMSE", "R2"])
    df.show(truncate=False)

def main():
    spark = connect_to_spark()
    
    print("Connected to Spark.")
    
    list_hive_databases(spark)
    
    inc_part = read_hive_tables(spark)
    
    print("Read Hive tables.")
    
    df = feature_selection(inc_part)
    
    print("Performed feature selection.")
    
    transformed_data = feature_extraction(df)
    
    print("Performed feature extraction.")
    
    train_data, test_data = split_dataset(transformed_data)
    
    print("Split the dataset into train and test.")
    
    model_lr = build_linear_regression_model(train_data)
    
    print("Built Linear Regression model.")
    
    predictions_lr, rmse_lr, r2_lr = predict_and_evaluate_model(model_lr, test_data)
    
    best_model_lr = hyperparameter_optimization_lr(train_data)
    
    print("Hyperparameter optimization for Linear Regression completed.")
    
    model_rf = build_random_forest_model(train_data)
    
    print("Built Random Forest model.")
    
    predictions_rf, rmse_rf, r2_rf = predict_and_evaluate_model(model_rf, test_data)
    
    best_model_rf = hyperparameter_optimization_rf(train_data)
    
    print("Hyperparameter optimization for Random Forest completed.")
    
    compare_models(best_model_lr, best_model_rf, predictions_lr, predictions_rf)
    
    print("Comparison of best models completed.")

if __name__ == "__main__":
    main()
