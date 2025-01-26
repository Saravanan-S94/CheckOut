package com.constructors;

public class Student {
	
	// Fields
	String name;
	int age;
	boolean isMarried;
	char sex;
	
	//constructors
	public Student() {
		//no body
	}

	// Parameterized constructor
	public Student(String name, int age, boolean isMarried, char sex) {
		this.name = name;
		this.age = age;
		this.isMarried = isMarried;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", isMarried=" + isMarried + ", sex=" + sex + "]";
	}
	
	
	// methods
	
	
}
