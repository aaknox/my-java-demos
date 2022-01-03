## Data Access Objects
When writing JDBC code, the application business logic may get mixed in with JDBC boilerplate code for querying the database, resulting in hard to read spaghetti code. One way to address this problem is to logically separate the code that accesses the database into Data Access Objects - this is referred to as the **DAO design pattern**.

To use the DAO design pattern, define an interface which declares methods through which the database will be queried. Then, concrete implementation classes can implement the interface and contain the data access logic to return the required data.

For example, if we have an Employee table in our database we'd like to query, we would create a `EmployeeDAO` interface:

```java
public interface EmployeeDAO {
  // define some CRUD operations here
  public List<Employee> getAllEmployees();
  public List<Employee> getEmployeesByLocation(String location);
  public void updateEmployeeById(int id);
  public void deleteEmployeeById(int id);
  public void addEmployee(Employee e);
}
```

This interface would be implemented for a specific database - e.g. Oracle:

```java
public class EmployeeDAOImplOracle implements EmployeeDAO {
  public List<Employee> getAllEmployees() {
    List<Employee> list = new ArrayList<>();
    // JDBC code here...
	return list;
  };
  public List<Employee> getEmployeesByLocation(String location) {
    List<Employee> list = new ArrayList<>();
    // JDBC code here...
	return list;
  };
  public void updateEmployeeById(int id) {
    // JDBC code here...
  };
  public void deleteEmployeeById(int id) {
    // JDBC code here...
  };
  public void addEmployee(Employee e) {
    // JDBC code here...
  };
}
```

Now whenever we need to query the Employee table in the database, we have a simple, clean interface which abstracts the data access logic:

```java
EmployeeDAO dao = new EmployeeDAOImplOracle();
List<Employee> allEmpls = dao.getAllEmployees();
allEmpls.forEach( e -> System.out.println(e));

List<Employee> NYEmpls = dao.getEmployeesByLocation("New York");
NYEmpls.forEach( e -> System.out.println(e));
```

Also, we can simply swap out the concrete class `EmployeeDAOImplOracle` for another database-specific class if we need to at some point in the future, since we rely only on the `EmployeeDAO` interface. The implementation doesn't even need to be talking to a database - it could be reading and writing to files for all we know! We don't care **how** the data is being read or written, we just care **what operations** are defined for the object. That is the benefit the DAO design pattern brings to the table.

