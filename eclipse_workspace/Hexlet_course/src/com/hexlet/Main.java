package com.hexlet;

import java.io.IOException;

import com.hexlet.lesson5.Field;

public class Main {

	public static void main(String[] args) throws IOException {
	
		Field field = new Field();
		field.eraseField();
//		field.setFieldSize(10);
		field.showField();
		
		field = new Field(12);
		field.eraseField();
//		field.setFieldSize(10);
		field.showField();
		
	}

}
