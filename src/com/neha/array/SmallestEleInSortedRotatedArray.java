package com.neha.array;

public class SmallestEleInSortedRotatedArray {
	
	public static void main(String[] args) {
		int[] arr = {5, 6, 1, 2, 3, 4};
		int minEle = Integer.MAX_VALUE;
		for(int j=0;j<arr.length;j++){
			if(arr[j]<minEle){
				minEle=arr[j];
			}
		}
		System.out.println(minEle);
	}

}
