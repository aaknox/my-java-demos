## JDBC Module

The purpose of this module is to provide information on the Java Database Connectivity API, or JDBC. We'll delve into the core classes and interfaces of the API, connecting to a database, executing SQL commands from our Java code, parsing results returned, and introduce a new design pattern - the DAO.

Additional resources in this module:
* [Lecture notes](./lecture-notes.md)
* [Exercises](./exercises.md)

## List of Topics
* JDBC Introduction
* API Overview
  * `DriverManager`
  * `DataSource`
  * `Connection`
  * `SQLException`
  * `Statement`
  * `PreparedStatement`
  * `CallableStatement`
  * `ResultSet`
* Setting up a connection
  * Auto-commit mode
  * Committing transactions
* Executing DDL commands
* Executing DML commands
* Executing DQL commands and retrieving returned data
* The Data Access Object design pattern

## Prerequisites & Learning Objectives

Before starting with the material in this module, associates should be familiar with:
* IDE setup should be complete
* Java syntax and constructs
* Common SQL DDL, DML, and DQL commands and syntax

After completing all the modules in this repository, associates should be able to:
* Name and explain the interfaces and classes of JDBC API
* Write JDBC code to connect to and query data from an SQL database
* Explain the differences between `Statement`, `PreparedStatement`, and `CallableStatement`
* Retrieve data from a `ResultSet` and store in an object
* Commit transactions
* Implement the data access object design pattern
