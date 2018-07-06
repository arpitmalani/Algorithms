package com.neha.array;

import java.util.Arrays;

public class SingleNumber {
public static void main(String[] args) {
		int[] nums = {1,1,2,2,3,4,4,5,5};
		Arrays.sort(nums);
		
		for(int i=0;i<nums.length;i=i+2){
			if(nums[i]!=nums[i+1]){
				System.out.println(nums[i]);
				break;
			}
		}
		
}
}
