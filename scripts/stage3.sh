#!/bin/bash
# Run Python scripts using spark-submit
spark-submit --master yarn bigdata-final-project-iu-2024/models/model.py
# Add more spark-submit commands for other Python scripts as needed

# Move output files to appropriate locations
# hdfs dfs -mkdir -p project/data
hdfs dfs -put project/data/train.json project/data/
hdfs dfs -put project/data/test.json project/data/
# hdfs dfs -mkdir -p project/models
hdfs dfs -put project/models/model1 project/models/
hdfs dfs -put project/models/model2 project/models/
# hdfs dfs -mkdir -p project/output
hdfs dfs -put project/output/model1_predictions.csv project/output/
hdfs dfs -put project/output/model2_predictions.csv project/output/

hdfs dfs -cat project/output/model1_predictions.csv/*.csv > project/output/model1_predictions.csv
hdfs dfs -cat project/output/model2_predictions.csv/*.csv > project/output/model2_predictions.csv

# Run any other post-processing commands here
# For example, combining model predictions into evaluation.csv
# Assuming both CSV files have the same structure (label, prediction)
hdfs dfs -cat project/output/model1_predictions.csv/*.csv project/output/model2_predictions.csv/*.csv | hdfs dfs -put - project/output/all_predictions.csv

# Run any other post-processing commands here to manipulate the data further
# For example, combining predictions, aggregating statistics, etc.

# Once all post-processing is done, save the final output to a CSV file
hdfs dfs -cat project/output/all_predictions.csv/*.csv > project/output/evaluation.csv

# Optionally, you can also move the evaluation.csv file to a different location if needed
hdfs dfs -put project/output/evaluation.csv project/output/
