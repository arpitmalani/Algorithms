package com.neha.array;

import java.util.ArrayList;

public class OriginalArrFromHeight {
	public static void main(String[] args) {
		int[] arr = {0,0,0,0,0}; 
			//{6,3,0,2,2,0,0};
		int[] result = new int[arr.length];
		
		int len = arr.length;
		ArrayList<Integer>  remain = new ArrayList<Integer>();
		for(int i =0 ; i<arr.length;i++){
			remain.add(len-i);
		}
		System.out.println(remain);
		
		for(int i =0; i <arr.length;i++){
			result[i]=remain.get(arr[i]);
			remain.remove(arr[i]);
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.println(result[i]);
		}
	}

}
