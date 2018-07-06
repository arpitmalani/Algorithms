package com.neha.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class AllSubSets {
	
	
	
	public static void main(String[] args) {
		String in = new String("abc");
		char[] inArr = in.toCharArray();
		HashSet<String> subSet = new HashSet<String>();
		for(int i =0;i<inArr.length;i++){
			String nextCahr = Character.toString(inArr[i]);
			addTOAllSets(subSet, nextCahr);
			subSet.add(nextCahr);
		}
		
		for(String inStr: subSet){
			System.out.println(inStr);
		}
		
	}
	
	public static void addTOAllSets(HashSet<String> subSet ,String next){
		ArrayList<String> newStrs = new ArrayList<>();
			for(String inStr: subSet){
				String newStr = inStr + next;
				newStrs.add(newStr);
			}
			subSet.addAll(newStrs);
	}

}
