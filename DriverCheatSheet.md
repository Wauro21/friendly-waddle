# JDBC BD DRIVER

- Is an api. Helps with three main activities:
	1. Connect to data source
	2. Send queries/update statements to the DB.
	3. Retrieve and process the result received from the DB.
-With the api, is possible to query in sqlite queries.
-**Select statements:** to get information from a table. Syntax:
```
		SELECT column1, column2, ..., columnN FROM tableName WHERE condition
```
To retrieve all the columns in the table, can be done by using:
```
		SELECT * FROM tableName
```
-**WHERE clauses:**  Criteria for selecting value.
```
		... WHERE condition
```
	**Conditions:**
	- **LIKE** - Used to compare strings, wild cards can be used:
		1. `KeyWord%` will search for any row that matches the pattern plus zero or more characters at the end.
		2. `Key_Word` will search for any row that matches the ends, the underscore acts like the wild card for **any character**.
