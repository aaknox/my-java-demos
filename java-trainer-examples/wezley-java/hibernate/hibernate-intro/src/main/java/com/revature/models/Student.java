package com.revature.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/*
 * Named Queries
 * 
 * 	- Can be configured using XML or annotations
 * 
 * For further research/info on how it works in a Hibernate mapping file, check out:
 * http://www.mkyong.com/hibernate/hibernate-named-query-examples/
 
//In HQL
@NamedQueries({
	@NamedQuery(
			name="findStudentByIdHQL",
			query="from Student s where s.id = :id"
			),
	@NamedQuery(
			name="findStudentByNameHQL",
			query="from Student s where name like :name"
			)
})
//In native SQL
@NamedNativeQueries({
	@NamedNativeQuery(
			name="findStudentByIdSQL",
			query="select * from students where id = :id"
			),
	@NamedNativeQuery(
			name="findStudentByNameSQL",
			query="select * from students where name like :name"
			)
})*/

@Entity 				// lets Hibernate know that this class is an entity that will be mapped to a table
@Table(name="Students")	// maps the class to a specified table
@SequenceGenerator(name="student_seq", sequenceName="student_seq", allocationSize=1) // designates the sequence that should be used to generate PKs
public class Student {

	@Id		// designates this field as mapping to the primary key of the table
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="student_seq") // chooses a generation strategy using the given sequence generator
	@Column(name="id") // maps the class to a specified column
	private int id;
	
	@Column(name="first_name")
	private String firstName; // name of the field does NOT have to match the column name 
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	public Student() { }

	public Student(String firstName, String lastName, String email) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}
	
	public Student(int id, String firstName, String lastName, String email) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "]";
	}

}
