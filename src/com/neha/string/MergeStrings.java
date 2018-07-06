package com.neha.string;

public class MergeStrings {
	public static void main(String[] args) {
		String s1 = new String("ab");
		String s2 = new String("def");
		
		char[] sc1 = s1.toCharArray();
		char[] sc2 = s2.toCharArray();
		
		int i=0;
		int j=0;
		StringBuilder sb = new StringBuilder();
		while(i<s1.length() || j<s2.length()){
			if(i<s1.length()){
				sb.append(sc1[i++]);	
			}
			if(j<s2.length())
			sb.append(sc2[j++]);
		}
		System.out.println(sb.toString());
		
	}

}
