package com.neha.string;

import java.util.LinkedHashMap;
import java.util.Map;

public class NonRepeatChar {
	public static void main(String[] args) {
		String str = new String("geeksofgeeks");
		char[] data = str.toCharArray();
		LinkedHashMap<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for(int i =0; i < data.length;i++){
			if(map.containsKey(data[i])){
				map.put(data[i], map.get(data[i])+1);
			}else{
				map.put(data[i], 1);
			}
		}
		
		for(Map.Entry<Character, Integer> ent : map.entrySet()){
			if(ent.getValue()==1){
				System.out.println(ent.getKey());
				break;
			}
		}
	}

}
