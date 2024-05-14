-- File: sql/q4.hql
USE team4_projectdb;

DROP TABLE IF EXISTS q4_results;
CREATE EXTERNAL TABLE q4_results(
    ignition_cause STRING,
    cause_count FLOAT)
ROW FORMAT DELIMITED
FIELDS TERMINATED BY ','
LOCATION 'project/hive/warehouse/q4';

SET hive.resultset.use.unique.column.names = false;

INSERT OVERWRITE TABLE q4_results
SELECT 
  TRIM(
    REGEXP_REPLACE(
      LOWER(ignition_cause), 
      '^([uU]\\s*-?\\s*|[0-9\\s-]*)',   -- Regex to remove leading 'u' followed by optional hyphen and spaces, or numbers, spaces, and hyphens
      ''                                 -- Replace the matched pattern with an empty string
    )
  ) AS standardized_ignition_cause, 
  COUNT(*) AS cause_count
FROM incidents_part
GROUP BY TRIM(
           REGEXP_REPLACE(
             LOWER(ignition_cause),
             '^([uU]\\s*-?\\s*|[0-9\\s-]*)',   -- Same regex for consistent grouping
             ''
           )
         );



--SELECT * FROM q4_results  LIMIT 3;
INSERT OVERWRITE DIRECTORY 'project/output/q4' 
ROW FORMAT DELIMITED FIELDS 
TERMINATED BY ',' 
SELECT * FROM q4_results;

