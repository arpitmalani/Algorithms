package com.neha.array;

import java.util.Arrays;

public class SortInWaveForm {
	public static void main(String[] args) {
		int[] arr = {3,6,5,10,7,20};
		sortInWave(arr);
		for(int j=0;j<arr.length;j++){
			System.out.println(arr[j]);
		}
	}
	
	public static void swap(int[] arr, int i, int j){
		int temp =arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void sortInWave(int[] arr){
		Arrays.sort(arr);
		for(int i=0;i<arr.length-1;i=i+2){
			swap(arr, i,i+1);
		}
	}

}
