package com.neha.array;

import java.util.Arrays;

public class RemoveDup {
	public static void main(String[] args) {
		int[] arr = { 1, 1, 2, 3, 3, 4 };
		
		Arrays.sort(arr);;
		
		//Index of next unique element
		int j=0;
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]!=arr[i+1]){
				arr[j++]=arr[i];
			}
		}
		arr[j]=arr[arr.length-1];
				
		//Arrays.asList(arr).forEach(System.out::println);
		
		for(int ele: arr){
			System.out.println(ele);
		}
	}
}
