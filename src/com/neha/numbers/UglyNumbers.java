package com.neha.numbers;

public class UglyNumbers {

	
	public static void main(String[] args) {
		int number = 300;
		System.out.println(isUgly(number));
		
	}
	
	public static int maxDivide(int a, int b){
		while(a%b==0){
			a= a/b;
		}
		return a;
	}
	
	public static boolean isUgly(int n){
		int two = maxDivide(n,2);
		int three = maxDivide(two, 3);
		int five = maxDivide(three, 5);
		if(five == 1){
			return true;
		}
		return false;
	}
	
	public static int getNthUgly(int n){
		int i=0;
		int count=0;
		while(n>count){
			i++;
			if(isUgly(i)){
				count++;
			}
		}
		return i;
	}
}
