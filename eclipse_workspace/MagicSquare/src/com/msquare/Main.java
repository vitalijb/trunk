package com.msquare;

public class Main {

	public static void main(String[] args) {
		ReadFromInput readPrint = new ReadFromInput();
//		int a = readPrint.readPrintInput();
		CreateTable table = new CreateTable(readPrint.readPrintInput());
		table.eraseFields();
		table.showTable();
	}

}
