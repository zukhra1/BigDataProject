-- File: sql/q1.hql
USE team4_projectdb;

DROP TABLE IF EXISTS q1_results;
CREATE EXTERNAL TABLE q1_results(
    city STRING,
    incident_count FLOAT)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
LOCATION 'project/hive/warehouse/q1';

SET hive.resultset.use.unique.column.names = false;


INSERT OVERWRITE TABLE q1_results
SELECT lower(city) as city, COUNT(*) AS incident_count
FROM incidents_part
GROUP BY lower(city);

INSERT OVERWRITE DIRECTORY 'project/output/q1' 
ROW FORMAT DELIMITED FIELDS 
TERMINATED BY ',' 
SELECT * FROM q1_results;

