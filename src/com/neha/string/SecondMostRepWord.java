package com.neha.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class SecondMostRepWord {
	public static void main(String[] args) {
		//String in = new String ("aaa bbb ccc bbb aaa  aaa");
		String in = "geeks for geeks for geeks aaa";
		
		String[] arr = in.split("\\s");
		LinkedHashMap<String, Integer> words = new LinkedHashMap<String, Integer>();
		
		for(String inp : arr){
			if(words.containsKey(inp)){
				words.put(inp, words.get(inp)+1);
			}else{
				words.put(inp, 1);
			}
		}
		
		int maxRepeat = 0;
		int secondMax = 0;
		String secondRepWord="";
		String maxRepWord="";
		for(Map.Entry<String, Integer> ent : words.entrySet()){
			if(ent.getValue()>maxRepeat){
				secondMax=maxRepeat;
				secondRepWord=maxRepWord;
				maxRepeat=ent.getValue();
				maxRepWord=ent.getKey();
			}
			if(ent.getValue()>secondMax && ent.getValue()!=maxRepeat){
				secondMax=ent.getValue();
				secondRepWord=ent.getKey();
			}
		}
		
		System.out.println("Second Rep word is: "+secondRepWord);
		
	}

}
