/**
 * @author Richard Orr
 */

package com.revature.reflections.intro;

import java.io.Serializable;
import java.util.Objects;

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
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (!(o instanceof Frankenstein)) {
			return false;
		}
		Frankenstein frankenstein = (Frankenstein) o;
		return Objects.equals(name, frankenstein.name);
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(name);
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
