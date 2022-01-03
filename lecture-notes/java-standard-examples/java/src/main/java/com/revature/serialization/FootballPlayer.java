/**
 * @author Andrew Crenwelge
 */

package com.revature.serialization;

import java.io.Serializable;

public class FootballPlayer implements Serializable {

	/**
	 * a class representing a football player - to be used for serialization
	 */
	private static final long serialVersionUID = 1077775069000576009L;
	
	private int id;
	public String firstName;
	public String lastName;
	protected String teamName;
	String position;
	transient private int salary; // making this transient means it won't get serialized!
	
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
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		result = prime * result + salary;
		result = prime * result + ((teamName == null) ? 0 : teamName.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FootballPlayer other = (FootballPlayer) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (salary != other.salary)
			return false;
		if (teamName == null) {
			if (other.teamName != null)
				return false;
		} else if (!teamName.equals(other.teamName))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "FootballPlayer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", teamName="
				+ teamName + ", position=" + position + ", salary=" + salary + "]";
	}
	
	public FootballPlayer(int id, String firstName, String lastName, String teamName, String position, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.teamName = teamName;
		this.position = position;
		this.salary = salary;
	}
	
}
