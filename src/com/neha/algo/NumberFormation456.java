package com.neha.algo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class NumberFormation456 {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String freq = in.nextLine();
		String[] freqArrStr = freq.split("\\s");
		int[] freqArr = {Integer.parseInt(freqArrStr[0]),Integer.parseInt(freqArrStr[1]),Integer.parseInt(freqArrStr[2])};
		
		
		ArrayList<String> word = new ArrayList<>();
		for(int i=0;i<freqArr[0];i++){
			word.add("4");
			}
		for(int i=0;i<freqArr[1];i++){
			word.add("5");
			}
		for(int i=0;i<freqArr[2];i++){
			word.add("6");
			}
		
		HashSet<String> set = getPer(word);
		System.out.println(word);
		System.out.println(set);
		int sum = 0;
		for(String ele : set){
			sum+=Integer.parseInt(ele);
		}
		
		System.out.println(sum);
		
		}
		
		
		
		
	
	public static HashSet<String> getPer(ArrayList<String> in){
		HashSet<String> set = new HashSet<>();
		for(String next :  in){
			addTOAllSet(set, next);
			set.add(next);
		}	
		return set;
	}
	
	public static void addTOAllSet(HashSet<String> set, String next){
		ArrayList<String> newEle = new ArrayList<>();
		for(String ele : set){
			newEle.add(ele+next);
		}
		set.addAll(newEle);
	}
		

}