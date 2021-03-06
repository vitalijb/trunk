package com.msquare;


public class CreateTable {
	
	
	private static final int DEFAULT_CELL_VALUE = 0;	
	private static final int DEFAULT_TABLE_SIZE = 3;	
	private final int tableSize;	
	private final int[][] table;	
	
	
	public int getFieldSize() {
		return tableSize;
	}
	
	
	public CreateTable() {
		this(DEFAULT_TABLE_SIZE);
	}
	
	
	public CreateTable(int size) {
		tableSize = size;
		table = new int[tableSize][tableSize];
	}
	

	public void eraseFields() {
		for (int i = 0; i < tableSize; i++) {
			eraseLine(i);
		}
	}
	
	
	public void eraseLine(int lineNumber) {
		for (int i = 0; i < tableSize; i++) {
			table[i][lineNumber] = DEFAULT_CELL_VALUE;
		}
	}
	
	
	public void showTable() {
		System.out.println();
		for (int i = 0; i < tableSize; i++) {
			showLine(i);
			System.out.println();
		}
		System.out.println();
	}
	
	
	
	private void showCell(int x, int y) {
		System.out.print("[" + table[x][y] + "]");
	}
	
	
	private void showLine(int lineNumber) {
		for  (int i = 0; i < tableSize; i++) {
			showCell(i,lineNumber);
		}
	}
}
