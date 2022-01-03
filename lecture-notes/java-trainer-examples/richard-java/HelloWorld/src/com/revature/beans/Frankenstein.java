package com.revature.beans;

import java.io.Serializable;

public class Frankenstein implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4114511709798008184L;
	/*
	 * Java Bean
	 * 1. Serializable
	 * 2. A no arguments constructor
	 * 3. Getter and setter for each field
	 */
	
	private transient int age;
	private String name;
	
	public Frankenstein() {
		super();
	}

	public Frankenstein(int age, String name) {
		super();
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Frankenstein other = (Frankenstein) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Frankenstein [age=");
		builder.append(age);
		builder.append(", name=");
		builder.append(name);
		builder.append("]");
		return builder.toString();
	}
}
