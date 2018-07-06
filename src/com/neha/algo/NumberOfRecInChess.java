package com.neha.algo;

public class NumberOfRecInChess {
	public static void main(String[] args) {
		System.out.println(printRec(2, 3));
		
	}
	
	public static int printRec(int n, int m){
		int num = (n* (n+1)/2) * (m * (m+1)/2);
		return num;
	}

}
