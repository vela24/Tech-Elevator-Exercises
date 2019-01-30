package com.techelevator.person;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Person {
	String firstName;
	String lastName;
	int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public String getFullName() {
		return lastName + ", " + firstName;
	}
    public boolean isAdult() {
    	if(age>=18) {
    		return true;
    	}
    	else return false;
    }
	
	
	

	
}

