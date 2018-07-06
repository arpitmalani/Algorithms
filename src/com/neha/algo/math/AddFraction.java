package com.neha.algo.math;

public class AddFraction {
	
	public static void main(String[] args) {
		
		//System.out.println(gctIte(3,3));
		fraSum(1, 500, 2, 1500);
	}
	
	public static void fraSum(int num1, int den1, int num2, int den2){
		int comDen = den1* den2;
		int num3 = num1*den2+ num2*den1;
		int gcd = gcd(num3, comDen);
		num3/=gcd;
		comDen/=gcd;
		System.out.println("new fraction "+ num3+"/"+comDen);
	}
	
	public static int gcd(int a, int b){
		if(a==0){
			return b;
		}
		return gcd(b%a, a);
	}
	
	public static int gctIte(int a, int b){
		int gcd =1;
		
		for(int i = 1 ; i<=a && i<=b;i++){
			if (a%i==0 && b%i==0)
				gcd=i;
		}
		
		return gcd;
	}

}
