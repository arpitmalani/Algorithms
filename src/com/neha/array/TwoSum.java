package com.neha.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public static void main(String[] args) {
		int[] arr = { 2, 7, 11, 15 };
		int target = 9;
		index(arr, target);
		
	}
	
	public static int[] index(int[] arr, int target){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		int[] index = {0,0};
		int[] values = {0,0};
		for(int i=0;i<arr.length;i++){
			if(map.containsKey(arr[i])){
				index[0]=map.get(arr[i]);
				index[1]=i;
				values[0]=target-arr[i];
				values[1]=arr[i];
			}else{
					map.put(target - arr[i], i);
				}
			}
		
			
		for(int i=0;i<values.length;i++){
			System.out.println(values[i]);
			System.out.println(index[i]);
		}
		return index;
	}
	
	public static int countOfPAirs(int[] arr, int target){
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			map.put(arr[i], 0);
		}
		int count = 0;
		for (Map.Entry<Integer, Integer> en : map.entrySet()) {
			if (map.get(Math.abs(en.getKey() - target)) != null) {
				count++;
			}
		}
		return (count / 2);
		
	}
}
