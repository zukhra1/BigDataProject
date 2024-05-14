-- File: sql/q2.hql
USE team4_projectdb;

DROP TABLE IF EXISTS q2_results;
CREATE EXTERNAL TABLE q2_results(
    city STRING,
    total_property_loss FLOAT)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
LOCATION 'project/hive/warehouse/q2';

SET hive.resultset.use.unique.column.names = false;


INSERT OVERWRITE TABLE q2_results
SELECT lower(city) as city, SUM(estimated_property_loss) AS total_property_loss
FROM incidents_part
GROUP BY lower(city);
--LIMIT 10;

--SELECT * FROM q2_results LIMIT 3;
--SELECT * FROM q2_results;
INSERT OVERWRITE DIRECTORY 'project/output/q2' 
ROW FORMAT DELIMITED FIELDS 
TERMINATED BY ',' 
SELECT * FROM q2_results;
