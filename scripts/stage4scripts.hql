use team4_projectdb;

DROP TABLE IF EXISTS model1_predictions;
CREATE TABLE IF NOT EXISTS model1_predictions (
                                                  label float,
                                                  prediction float
)
    row format delimited fields terminated by ','
    tblproperties("skip.header.line.count"="1");
LOAD DATA INPATH '../team4/project/output/model1_predictions.csv' OVERWRITE INTO TABLE model1_predictions;

DROP TABLE IF EXISTS model2_predictions;
CREATE TABLE IF NOT EXISTS model2_predictions (
                                                  label float,
                                                  prediction float
)
    row format delimited fields terminated by ','
    tblproperties("skip.header.line.count"="1");
LOAD DATA INPATH '../team4/project/output/model2_predictions.csv' OVERWRITE INTO TABLE model2_predictions;
