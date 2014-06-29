package com.hexlet.lesson4;



public class Human {
	
	private final int minAge = 0;
	
	private final int maxAge = 120;
	
	private final int minNameLenght = 2;
	
	private String name;
	
	private int age;
	
	public void setAge(int newAge) {
		if (newAge > minAge && newAge < maxAge)  {
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
		if (newName != null && newName.length() >= minNameLenght) {
			name = newName;
		}
	}
}
