# JDBC Classes and Interfaces

JDBC stands for Java Database Connectivity. It is a relatively low-level API used to write Java code that interacts with relational databases via SQL.

The [JDBC classes and interfaces](https://docs.oracle.com/javase/8/docs/api/index.html?java/sql/package-summary.html) are located in the `java.sql` and `javax.sql` packages. There are several key classes and interfaces that are commonly encountered when writing JDBC code:

* `DriverManager` class - to make a connection with a database driver
* `DataSource` interface - for retrieving connections, an alternative to `DriverManager`
* `Connection` interface - represents a physical connection with a database
* `SQLException` class - a general exception thrown when something goes wrong when accessing the database
* `Statement` interface - used for executing static SQL statements
* `PreparedStatement` interface - represents pre-compiled SQL statements
* `CallableStatement` interface - used to execute stored procedures
* `ResultSet` interface - represents data returned from the database

## Creating a Database Connection

In order to interact with a database, we need to do several things:
1. Register the JDBC driver
2. Open a connection using:
  - Database URL
  - Username
  - Password
3. Execute some SQL statement using either:
  - `Statement`
  - `PreparedStatement`
  - `CallableStatement`
4. Retrieve the results that are returned in a `ResultSet` object

