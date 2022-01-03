# JDBC
## Purpose:
This will example will demonstrate the setup and usage for the JDBC API.
> The code examples are located under the `jdbc` folder organized as a Maven project.
## Environment:
* Currently, this project is using a Java 8 environment.
## Resources:
[Celebrity](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/jdbc/src/main/java/com/revature/jdbc/celebrity/model/Celebrity.java) `com.revature.jdbc.model.Celebrity.java`

[CelebrityRepository](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/jdbc/src/main/java/com/revature/jdbc/celebrity/repository/CelebrityRepository.java) `com.revature.jdbc.repository.CelebrityRepository.java`

[CelebrityRepositoryJdbc](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/jdbc/src/main/java/com/revature/jdbc/celebrity/repository/CelebrityRepositoryJdbc.java) `com.revature.jdbc.repository.CelebrityRepositoryJdbc.java`

[CelebrityDataAccessTest](https://gitlab.com/revature_training/java-team/-/blob/master/java-standard-examples/jdbc/src/test/java/com/revature/jdbc/celebrity/test/CelebrityDataAccessTest.java) `com.revature.jdbc.celebrity.test.CelebrityDataAccessTest.java`
## Topics:
* JDBC
* Connection interface
* Statement interface
* PreparedStatement interface
* CallableStatement interface
* DriverManager class

## Getting Started
Move to the `jdbc` directory:
```
cd java-standard-examples/jdbc
```
Then install Oracle ojdbc7 file:
```
mvn install:install-file -Dfile={Path/to/your/ojdbc7.jar} -DgroupId=com.oracle -DartifactId=ojdbc7 -Dversion=12.1.0 -Dpackaging=jar
```

There is a sql script in `src/main/resources` for generating the table with the sequence and trigger and also creating the stored procedure.

There is a pdf file located in `src/main/resources` for creating an Oracle database utilizing AWS RDS and the different configurations to set.


## How to teach
### Step 1
Create the `Celebrity` class and fill with fields and methods.
### Step 2
Create the table in the database to mirror the `Celebrity` class.
### Step 3
Create the `ConnectionUtil` class and provide the dependency to the `pom.xml`.
### Step 4
Fill the `ConnectionUtil` class with necessary information while explaining the `Connection` interface and the `DriverManager` class. Create the `getConnection()` method and test it with the main method.
### Step 5
Create the `CelebrityRepository` interface and explain the DAO design pattern. Add the abstract methods into the interface.
### Step 6
Create the `CelebrityRepositoryJdbc` class and implement the `CelebrityRepository` interface.
### Step 7
Implement the `selectAll()` method with a `Statement`. Explain the drawbacks with using this type of statement.
### Step 8
Implement either the `findByUsername()` or `insert()` methods with a `PreparedStatement`. Explain the safeguards that are built in to the `PreparedStatement` and notable improvements.
> Note: It can help associates to see one of these methods implemented by using a `Statement`. This way they are familiar with the syntax and performance differences.
### Step 9
Create a stored procedure in the db and implement the `insertProcedure()` method. Explain the syntactical and usage differences between a callable and a prepared statement.
### Step 10
Create the `CelebrityDataAccessTest` class in `src/test/java` and demonstrate to associates how to test the dao layer.