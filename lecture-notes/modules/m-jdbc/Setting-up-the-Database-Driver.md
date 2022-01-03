### Database JDBC Drivers

Because JDBC is a Java language API, it is database agnostic. It uses database drivers which implement the interfaces defined in the JDBC API for the given database. For example, to connect with an Oracle database, you would use an [OJDBC driver](https://www.oracle.com/technetwork/database/features/jdbc/default-2280470.html). Other database vendors have different drivers which implement the JDBC API.

Many JDBC drivers are available through Maven's central repository and can be added as a dependency in the `pom.xml` file. Oracle is a special exception due to license restrictions. You must accept the licese agreement, download, and install it to your local Maven repository ([tutorial here](https://www.mkyong.com/maven/how-to-add-oracle-jdbc-driver-in-your-maven-local-repository/) before you can add it to the `pom.xml` file.

Finally, in your application code, you can register the driver using:
```
try {
   Class.forName("oracle.jdbc.driver.OracleDriver");
}
catch(ClassNotFoundException e) {
   System.out.println("Can't load driver class!");
}
```

This step is only necessary for drivers prior to JDBC 4.0 (released with Java SE 6). After JDBC 4.0, drivers will be autoloaded if they are included in the classpath.



