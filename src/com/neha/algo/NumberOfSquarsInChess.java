package com.neha.algo;

public class NumberOfSquarsInChess {
	public static void main(String[] args) {
		int n = 3;
		System.out.println(squareCount(n));
	}
	
	public static int squareCount(int n){
		int num = (n * (n+1)/2) * (2*n+1)/3;
		return num;
	}

}
