import pyodbc
import pandas as pd
con = pyodbc.connect("DRIVER=JDBC Driver for SQL Server;SERVER=localhost;PORT=1433;DATABASE=test;UID=sa;PWD=cuong0907359621")
con.execute("USE test")

df=pd.read_sql('SELECT * FROM Persons', con)