package com.hexlet;

import java.io.IOException;

import com.hexlet.lesson4.*;

public class Main {

	public static void main(String[] args) throws IOException {
		Human human = new Human();
		human.setName("FG");
		System.out.println(human.getName());
		human.setAge(12);
		System.out.println(human.getAge());
	}

}
