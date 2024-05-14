#!/bin/bash
# URL of the API endpoint with increased limit
url="https://data.sfgov.org/resource/wr8u-xric.csv?\$limit=700000"
#url="https://data.sfgov.org/api/views/wr8u-xric/rows.tsv?limit=70000"

# Output directory and file name relative to the script location
output_directory="./data"
output_file="data.csv"
#output_file="data.tsv"

# Create the output directory if it does not exist
mkdir -p "$output_directory"

# Use curl to download the data
curl -L "$url" -o "${output_directory}/${output_file}"

# Check if the download was successful
if [ $? -ne 0 ]; then
  echo -e "Data download failed.\n"
  exit 1
else
  echo -e "Download completed. Data saved to ${output_directory}/${output_file}. \n"
fi

# Navigate to the directory containing the build_projectdb.py script

# Check if the directory change was successful
if [ $? -ne 0 ]; then
  echo -e "Failed to change directory to the script's location.\n"
  exit 1
fi

# Run the Python script
python3 scripts/build_projectdb.py

# Check the exit status of the Python script and exit with it
exit_status=$?
if [ $exit_status -ne 0 ]; then
  echo -e "The build_projectdb.py script failed with exit status: $exit_status \n"
  exit $exit_status
else
  echo -e "The build_projectdb.py script completed successfully. \n"
fi

# Import database into HDFS via Sqoop
password=$(head -n 1 scripts/secrets/.psql.pass)

hdfs dfs -rm -R -skipTrash project/warehouse/*
sqoop import-all-tables --connect jdbc:postgresql://hadoop-04.uni.innopolis.ru/team4_projectdb --username team4 --password "$password" --compression-codec=snappy --compress --as-avrodatafile --warehouse-dir=project/warehouse --m 1

# Move generated Java and Avro schema files to output directory
mv *.java output/
mv *.avsc output/
