# `Statement` and `PreparedStatement` Interfaces

`Statement` interface is used for executing static SQL statements. `PreparedStatement` interface is used for executing pre-compiled SQL statements.

Once we have the `Connection` object, we can write our SQL and execute it:

```java
Statement stmt = conn.createStatement();
String sql = "SELECT * FROM employees";
ResultSet rs = stmt.executeQuery(sql);
```

Alternatively, a `PreparedStatement` can be used. This interface gives us the flexibility of specifying parameters with the `?` symbol. It also protects against [SQL injection](https://en.wikipedia.org/wiki/SQL_injection) when user input is used by pre-compiling the SQL statement.

```java
PreparedStatement ps = conn.prepareStatement();
String sql = "SELECT * FROM employees WHERE age > ? AND location = ?";
ps.setInt(1, 40);
ps.setString(2, "New York");
ResultSet rs = ps.executeQuery(sql);
```

The `Statement` and `PreparedStatement` also have additional methods for sending SQL, including:
* `.execute()` - for any kind of SQL statement, returns a `boolean`
* `.executeUpdate()` - for DML statements, returns an `int` which is the number of rows affected

### Retreiving Results
Results from an SQL query are returned as a `ResultSet`, which can be iterated over to extract the data:

```java
List<Employee> empList = new ArrayList<>();
while (rs.next()) {
  int id = rs.getInt("id");
  String name = rs.getString("first_name");
  empList.add(new Employee(id, name));
}
```


