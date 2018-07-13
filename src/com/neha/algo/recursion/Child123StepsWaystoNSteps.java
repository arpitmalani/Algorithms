package com.neha.algo.recursion;

//https://www.geeksforgeeks.org/count-ways-reach-nth-stair/

public class Child123StepsWaystoNSteps {
	public static void main(String[] args) {
		System.out.println(totalWays(4,2));
	}
	
	public static int ways(int n, int m){
		if(n<=1){
			return n;
		}
		int res =0;
		for(int i=1;i<=m && i<=n;i++){
			res+=ways(n-i,m);
		}
		return res;
	}
	
	public static int totalWays(int n, int m){
		return ways(n+1, m);
	}
	
	public static int fib(int n){
		if(n==0){
			return n;
		}
		if(n==1){
			return n;
		}
		return fib(n-1)+fib(n-2);
	}
}
