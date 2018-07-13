package com.neha.algo.recursion;

//https://practice.geeksforgeeks.org/problems/total-decoding-messages/0

public class TotalDecodingMessages {
	
	public static void main(String[] args) {
		String message = "121";
		char[] dig = message.toCharArray();
		System.out.println(totalDecoding(dig, dig.length));
	}
	
	public static int totalDecoding(char[] in, int n){
		
		if(n==0){
			return 1;
		}
		if(n==1){
			return 1;
		}
		int count=0;
		if(in[n-1]>'0')
		count = totalDecoding(in,n-1);
		
		if(in[n-2]=='1' || (in[n-2]=='2' && in[n-1]<'7')){
			count+=totalDecoding(in,n-2);	
		}
		
		
		return count;
	}

}
