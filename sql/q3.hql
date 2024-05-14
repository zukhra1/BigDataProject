-- File: sql/q3.hql
USE team4_projectdb;

DROP TABLE IF EXISTS q3_results;
CREATE EXTERNAL TABLE q3_results(
    city STRING,
    avg_response_time_seconds FLOAT)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
LOCATION 'project/hive/warehouse/q3_results';

SET hive.resultset.use.unique.column.names = false;


INSERT OVERWRITE TABLE q3_results
SELECT 
    lower(city) as city, 
    AVG(
        CASE 
            WHEN arrival_dttm IS NOT NULL AND alarm_dttm IS NOT NULL THEN
                UNIX_TIMESTAMP(regexp_replace(arrival_dttm, 'T', ' '), 'yyyy-MM-dd HH:mm:ss.SSS') - 
                UNIX_TIMESTAMP(regexp_replace(alarm_dttm, 'T', ' '), 'yyyy-MM-dd HH:mm:ss.SSS')
            ELSE 
                NULL
        END
    ) AS avg_response_time_seconds
FROM incidents_part
GROUP BY lower(city);


--SELECT * FROM q3_results  LIMIT 3;
INSERT OVERWRITE DIRECTORY 'project/output/q3' 
ROW FORMAT DELIMITED FIELDS 
TERMINATED BY ',' 
SELECT * FROM q3_results;

