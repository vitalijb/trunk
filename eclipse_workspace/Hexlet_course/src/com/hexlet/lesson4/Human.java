package com.hexlet.lesson4;



public class Human {
	
	private static final int MIN_AGE = 0;
	
	private static final int MAX_AGE = 120;
	
	private static final int MIN_NAME_LENGTH = 2;
	
	private String name;
	
	private int age;
	
	public void setAge(int newAge) {
		if (newAge > MIN_AGE && newAge < MAX_AGE)  {
			age = newAge;
		}
	}
	
	public int getAge() { 
		return age;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String newName) {
		if (newName != null && newName.length() >= MIN_NAME_LENGTH) {
			name = newName;
		}
	}
}
