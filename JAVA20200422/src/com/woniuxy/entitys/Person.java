package com.woniuxy.entitys;

public class Person {

	private String personName;
	private final char personSex;
	
	public Person() {
		// TODO Auto-generated constructor stub
		personSex=' ';
	}

	public Person(String personName, char personSex) {
		super();
		this.personName = personName;
		this.personSex = personSex;
	}
	public Person(char personSex) {
		super();
		
		this.personSex = personSex;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}
    
	
	public char getPersonSex() {
		return personSex;
	}
	
	
	
}
