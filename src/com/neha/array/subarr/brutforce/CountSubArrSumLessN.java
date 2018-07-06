package com.neha.array.subarr.brutforce;

import java.util.ArrayList;

public class CountSubArrSumLessN {
	public static void main(String[] args) {
		int[] arr = {2,5,6};
		int sum = 10;
		int subArrCount = 0;
		ArrayList<Interval> subArr = new ArrayList<>();
		
		for(int i =0;i<arr.length;i++){
			int countSum=0;
			for(int j=i;j<arr.length;j++){
				 if(countSum+arr[j]<sum ){
					 countSum = countSum + arr[j];
					 subArrCount++;
					 Interval in = new Interval();
					 in.start=i;
					 in.end=j;
					 subArr.add(in);
				 }else{
					 break;
				 }
			}
		}
		
		System.out.println("Count "+subArrCount);
		for(Interval i : subArr){
			StringBuilder sub = new StringBuilder();
			for(int k=i.start;k<=i.end;k++){
				sub.append(arr[k] + ",");
			}
			System.out.println(sub.toString());
		}
	}

}

class Interval{
	int start;
	int end;
	
}
