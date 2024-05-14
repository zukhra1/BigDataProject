-- File: sql/q5.hql
USE team4_projectdb;

DROP TABLE IF EXISTS q5_results;
CREATE EXTERNAL TABLE q5_results(
    city STRING,
    fatal_incidents_count FLOAT)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
LOCATION 'project/hive/warehouse/q5';

SET hive.resultset.use.unique.column.names = false;


INSERT OVERWRITE TABLE q5_results
SELECT lower(city) as city, COUNT(*) AS fatal_incidents_count
FROM incidents_part
WHERE fire_fatalities > 0 OR civilian_fatalities > 0
GROUP BY lower(city);
--LIMIT 10;


--SELECT * FROM  q5_results  LIMIT 3;
INSERT OVERWRITE DIRECTORY 'project/output/q5' 
ROW FORMAT DELIMITED FIELDS 
TERMINATED BY ',' 
SELECT * FROM q5_results;

