package com.neha.array;

import java.util.ArrayList;

public class SubArrSumX {
	public static void main(String[] args) {
		int[] arr = {1, 4, 45, 6, 0, 19};
		int sum = 51;
		int minLength = arr.length+1;
		ArrayList<Integer> subArr = new ArrayList<>();
		for(int start=0;start<arr.length-1;start++){
			int calcSum = arr[start];
			if(calcSum>sum){
				ArrayList<Integer> sub = new ArrayList<>();
				sub.add(arr[start]);
				subArr=sub;
				minLength=1;
				break;
			}
			for(int j=start+1;j<arr.length;j++){
				calcSum+=arr[j];
				if(calcSum>=sum && (minLength>(j-start+1))){
					minLength=j-start+1;
					ArrayList<Integer> sub = new ArrayList<>();
					for(int jj=start;jj<=j;jj++){
						sub.add(arr[jj]);
					}
					subArr=sub;
				}
			}
		}
		
		System.out.println(minLength);
		System.out.println(subArr);
	}

}

