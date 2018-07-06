package com.neha.string;

import java.util.HashSet;

public class AllPermutations {
	
	public static void main(String[] args) {
		String str = "ABCD";
		System.out.println(getPerm(str));
		
	}
	
	public static HashSet<String> getPerm(String str){
		HashSet<String> perm = new HashSet<String>();
		if(str==null){
			return null;
		}else{
			if(str.length()==0){
				perm.add("");
			return perm;}
		}
		char initial = str.charAt(0);
		String rem = str.substring(1);
		HashSet<String> words = getPerm(rem);
		for(String newWord: words){
			for(int i=0;i<=newWord.length();i++){
				perm.add(charInsert(newWord, initial, i));
			}
		}
		return perm;
	}
	
	public static String charInsert(String str, char c, int j){
		String begin = str.substring(0,j);
		String end = str.substring(j);
		return begin + c + end;
	}

}
