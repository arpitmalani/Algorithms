package com.neha.array.subarr.brutforce;

import java.util.ArrayList;

public class CountSubArrProductLessThanN {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		int product = 10;
		int proCount = 0;
		ArrayList<Interval> list = new ArrayList<>();
		
		
		for(int start=0; start<arr.length;start++){
			int calcProduct = 1;
			for(int end = start; end<arr.length;end++){
				if(calcProduct*arr[end]<=product){
					calcProduct*=arr[end];
					proCount++;
					Interval in = new Interval();
					in.start=start;
					in.end=end;
					list.add(in);
				}
				else{
					break;
				}
			}
		}
		
		System.out.println(proCount);
		
		for(Interval in : list){
			StringBuilder sb = new StringBuilder();
			for(int k=in.start;k<=in.end;k++){
				sb.append(arr[k]+" ,");
			}
			System.out.println("sub arr " + sb.toString());
		}
	}

}
