import os
import pandas as pd
import psycopg2
from io import StringIO
from tqdm import tqdm
from psycopg2.extras import execute_values


# Path to CSV data
DATA_PATH = "data/data.csv"
# Path to secrets file
SECRETS_PATH = "scripts/secrets/.psql.pass"
# Path to create sql table
CREATE_TABLE_PATH = "sql/create_tables.sql"
# Path to SQL test script
TEST_SCRIPT_PATH = "sql/test_database.sql"

# Function to check if table exists and drop it if it does
def drop_table_if_exists(conn):
    cursor = conn.cursor()
    cursor.execute("DROP TABLE IF EXISTS incidents")
    conn.commit()
    cursor.close()

# Function to create database table
def create_table(conn):
    with open(CREATE_TABLE_PATH, 'r') as f:
        create_table_query = f.read()

    cursor = conn.cursor()
    cursor.execute(create_table_query)
    conn.commit()
    cursor.close()

# Function to download and insert CSV data into the database
def insert_data(conn):
    # Download the CSV file
    df = pd.read_csv(DATA_PATH, low_memory=False)
    df.drop_duplicates(['incident_number'], inplace=True)
    df = df.where(pd.notnull(df), None)

    cursor = conn.cursor()

    # Insert data row by row with tqdm
    with tqdm(total=len(df)) as pbar:
        for _, row in df.iterrows():
            columns = ', '.join(row.index)
            placeholders = ', '.join(['%s'] * len(row))
            insert_query = f"INSERT INTO Incidents ({columns}) VALUES ({placeholders})"
            cursor.execute(insert_query, tuple(row))
            pbar.update(1)

    conn.commit()
    cursor.close()
    print("done\n")



# Function to execute test script
def run_test_script(conn):
    with open(TEST_SCRIPT_PATH, 'r') as f:
        test_script = f.read()

    cursor = conn.cursor()
    cursor.execute(test_script)
    rows = cursor.fetchall()
    print("Results of test query:")
    for row in rows:
        print(row)
    cursor.close()

# Main execution
if __name__ == '__main__':
    # Read password from secrets file
    with open(SECRETS_PATH, "r") as file:
        password = file.read().rstrip()

    # Build connection string
    conn_string = f"host=hadoop-04.uni.innopolis.ru port=5432 user=team4 dbname=team4_projectdb password={password}"

    # Connect to the database
    conn = psycopg2.connect(conn_string)

    drop_table_if_exists(conn)
    create_table(conn)
    insert_data(conn)
    run_test_script(conn)

    # Close the database connection
    conn.close()
