## Connection Interface

`java.sql.Connection` interface represents a session between java application and database. All SQL statements are executed and results are returned with in the context of a Connection object.

We can use the `DriverManager` class to get a `Connection` to the database, given that we have the JDBC URL, username, and password. Generally these parameters should be stored in an external configuration file that can be loaded dynamically and changed without affecting the application code.

```java
try (Connection conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD)) {
  // more code goes here
} catch (SQLException e) {}
```

Alternatively, the `DataSource` interface could be used to make connections and is covered extensively in this [Oracle tutorial](https://docs.oracle.com/javase/tutorial/jdbc/basics/sqldatasources.html).

It's always a good idea to close your resources - here we've used the `try-with-resources` syntax to automatically close the `Connection` being created after the block ends.

#### Autocommit mode
By default, when a connection is created it is in auto-commit mode, so every SQL statement acts as a transaction and is committed immediately after execution. In order to manually group statements into a transaction, simply call:

```java
Connection conn = DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
conn.setAutoCommit(false);
// execute some SQL statements...
con.commit();
```

#### JDBC String

The database URL is an address pointing to the database to be used, also known as the JDBC String. The format of this URL varies between database vendors, as shown in the table below:

| RDBMS | JDBC driver | URL format |
| ----- | ----------- | ---------- |
| MySQL | `com.mysql.jdbc.Driver` | jdbc:mysql://hostname/databaseName |
| Oracle | `oracle.jdbc.driver.OracleDriver` | jdbc:oracle:thin:@hostname:portNumber:databaseName |
| SQLServer | `com.microsoft.sqlserver.jdbc.SQLServerDriver` | jdbc:sqlserver://serverName:portNumber;property=value |
| PostgreSQL | `org.postgresql.Driver` | jdbc:postgresql://hostname:port/databaseName |
