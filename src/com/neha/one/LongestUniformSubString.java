package com.neha.gs.one;
////Longest uniform sub string  -input string = 10000111 - 1 0000 111 - start 1 end 4
public class LongestUniformSubString {
	public static void main(String[] args) {
		String s = "aaabbbacc"; 
				//"111000011";
		longestUniformSub(s);
	}
	
	public static void longestUniformSub(String s){
		int maxFreq=0;
		int start=0;
		int end=0;
		char c='$';
		
		int currFreq=0;
		for(int i=0;i<s.length();i++){
			currFreq=1;
			while(i+1<s.length() && s.charAt(i)==s.charAt(i+1)){
				currFreq++;
				i++;
			}
			if(maxFreq<currFreq){
				maxFreq=currFreq;
				c=s.charAt(i);
				start=i-maxFreq+1;
				end=i;
			}
		}
		System.out.println(maxFreq + " " + c);
		System.out.println(start);
		System.out.println(end);
	}

}
