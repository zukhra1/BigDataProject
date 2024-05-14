#!/bin/bash

#hdfs dfs -mkdir -p project/warehouse/avsc
#hdfs dfs -put output/*.avsc project/warehouse/avsc

password=$(head -n 1 scripts/secrets/.hive.pass)

beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team4 -p $password -f sql/db.hql > output/hive_results.txt 2> /dev/null


#! query #1
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team4 -p $password -f sql/q1.hql
# Add a header to the output file
echo "city, sincident_count" > output/q1.csv 
# concatenate all file partitions and 
# append the output to the file output/q1.csv
hdfs dfs -cat project/output/q1/* >> output/q1.csv

#! query #2
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team4 -p $password -f sql/q2.hql
echo "city, total_property_loss" > output/q2.csv 
hdfs dfs -cat project/output/q2/* >> output/q2.csv

#! query #3
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team4 -p $password -f sql/q3.hql
echo "city, avg_response_time_seconds" > output/q3.csv 
hdfs dfs -cat project/output/q3/* >> output/q3.csv

#! query #4
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team4 -p $password -f sql/q4.hql
echo "ignition_cause, cause_count" > output/q4.csv 
hdfs dfs -cat project/output/q4/* >> output/q4.csv

#! query #5
beeline -u jdbc:hive2://hadoop-03.uni.innopolis.ru:10001 -n team4 -p $password -f sql/q5.hql
echo "city, fatal_incidents_count" > output/q5.csv 
hdfs dfs -cat project/output/q5/* >> output/q5.csv