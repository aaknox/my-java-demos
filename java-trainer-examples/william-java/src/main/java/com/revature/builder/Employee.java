package com.revature.builder;

import java.time.LocalDate;

public class Employee {
	
	/**
	 * 
	 * @author William Gentry
	 * 
	 * I know it is not explicitly in the curriculum, but I chose to show this design pattern to the associates simply because this is 
	 * such a commonly used pattern in frameworks. I made sure to explain how useful it can be as well for POJO's that have a lot of fields
	 * and has a need for many constructors containing permutations of these fields 
	 * 
	 */

	private int id;
	private String firstName;
	private String lastName;
	private String email;
	private LocalDate DOB;
	private int SSN;
	private String occupation;
	private LocalDate startDate;
	private int salary;
	private String department;
	private String address;
	private String phoneNumber;
	private boolean eligibleForPTO;
	
	public Employee(EmployeeBuilder builder) {
		this.id = builder.id;
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.email = builder.email;
		this.DOB = builder.DOB;
		this.occupation = builder.occupation;
		this.startDate = builder.startDate;
		this.SSN = builder.SSN;
		this.department = builder.department;
		this.salary = builder.salary;
		this.address = builder.address;
		this.phoneNumber = builder.phoneNumber;
		this.eligibleForPTO = builder.eligibleForPTO;
	}
	
	static class EmployeeBuilder {
		private int id;
		private String firstName;
		private String lastName;
		private String email;
		private LocalDate DOB;
		private int SSN;
		private String occupation;
		private LocalDate startDate;
		private int salary;
		private String department;
		private String address;
		private String phoneNumber;
		private boolean eligibleForPTO;
		
		public EmployeeBuilder id(int id) {
			this.id = id;
			return this;
		}
		
		public EmployeeBuilder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}
		
		public EmployeeBuilder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}
		
		public EmployeeBuilder email(String email) {
			this.email = email;
			return this;
		}
		
		public EmployeeBuilder DOB(LocalDate DOB) {
			this.DOB = DOB;
			return this;
		}
		
		public EmployeeBuilder SSN(int SSN) {
			this.SSN = SSN;
			return this;
		}
		
		public EmployeeBuilder occupation(String occupation) {
			this.occupation = occupation;
			return this;
		}
		
		public EmployeeBuilder startDate(LocalDate startDate) {
			this.startDate = startDate;
			return this;
		}
		
		public EmployeeBuilder salary(int salary) {
			this.salary = salary;
			return this;
		}
		
		public EmployeeBuilder department(String department) {
			this.department = department;
			return this;
		}
		
		public EmployeeBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		public EmployeeBuilder phoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}
		
		public EmployeeBuilder eligibleForPTO(boolean eligibleForPTO) {
			this.eligibleForPTO = eligibleForPTO;
			return this;
		}
		
		public Employee build() {
			return new Employee(this);
		}
	}
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + "\n, firstName=" + firstName + "\n, lastName=" + lastName + "\n, email=" + email
				+ ", DOB=" + DOB + ", SSN=" + SSN + "\n, occupation=" + occupation + "\n, startDate=" + startDate
				+ ", salary=" + salary + "\n, department=" + department + "\n, address=" + address + ", phoneNumber="
				+ phoneNumber + "\n, eligibleForPTO=" + eligibleForPTO + "]";
	}



	public static void main(String[] args) {
		Employee e1 = new Employee.EmployeeBuilder()
								  .id(13)
								  .firstName("Tom")
								  .lastName("Jones")
								  .startDate(LocalDate.now())
								  .address("1234 Main Street")
								  .phoneNumber("888-888-8858")
								  .eligibleForPTO(false)
								  .occupation("Software Developer")
								  .department("Technology")
								  .email("test@test.com")
								  .SSN(123456789)
								  .salary(1000000)
								  .DOB(LocalDate.of(1993, 1, 14))
								  .build();
		
		// LocalDate.of(year, month, dayOfMonth)
		// LocalDate, month index starts at 1
		System.out.println(e1);
	}
}
