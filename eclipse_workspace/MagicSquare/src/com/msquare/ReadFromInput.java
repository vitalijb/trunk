package com.msquare;

import java.util.Scanner;

public class ReadFromInput {
	
	public static boolean isInteger(String s) {
	    try { 
	        Integer.parseInt(s); 
	    } catch(NumberFormatException e) { 
	        return false; 
	    }
	    // only got here if we didn't return false
	    return true;
	}
	
	
	public int readPrintInput() {
	
	    Scanner scan = new Scanner(System.in);
	    int number;
	    do {
	        System.out.print("Please enter a positive number!" + "\r" + "=>");
	        while (!scan.hasNextInt()) {
	            System.out.print("That's not a number!" + "\r" + "=>");
	            scan.next(); // this is important!
	        }
	        number = scan.nextInt();
	    } while (number <= 0);
	    System.out.println("Thank you! Got " + number);
		return number;
	}
}