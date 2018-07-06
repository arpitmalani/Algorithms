package com.neha.array;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayIntersection {
	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 2, 1 };
		int[] arr2 = { 2, 2 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i = 0;
		int j = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] < arr2[j]) {
				i++;
			} else {
				if (arr1[i] > arr2[j]) {
					j++;
				}else{
					list.add(arr1[i]);
					i++;
					j++;
				}
			}
		}
		
		for(int  ele : list){
			System.out.println(ele);
		}
	}

}
