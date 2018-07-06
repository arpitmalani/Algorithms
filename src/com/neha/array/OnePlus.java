package com.neha.array;

public class OnePlus {
	public static void main(String[] args) {
		int[] arr = {9,9,9};
	
		int[] temp = plusOne(arr);
		for(int i=0;i<temp.length;i++){
			System.out.println(temp[i]);
		}
	
	}
	
	public static int[] plusOne(int[] digits){
		int carry =1;
		for(int i=digits.length-1 ; i>=0;i--){
			int sum = digits[i]+1;
			int digit = sum%10;
			carry =1;
			if(sum==10){
				carry=1;
			}else{
				carry=0;
			}
			digits[i]=digit;
		}
		if (carry>0){
			int[] temp = new int[digits.length+1];
			System.arraycopy(digits, 0, temp, 1, digits.length);
			temp[0]=1;
			return temp;
		}
		return digits;
	}
	
	public static int[] plusOneArrStr(int[] arr){
		int num=0;
		StringBuffer sb = new StringBuffer();
		for(int i=0;i<arr.length;i++){
			sb.append(arr[i]);
		}
		num=Integer.valueOf(sb.toString());
		num+=1;
		System.out.println(num);
		String plusOne = String.valueOf(num);
		System.out.println(plusOne);
		int[] temp = new int[plusOne.length()]; 
		for(int i=0;i<plusOne.length();i++){
			temp[i]=Integer.valueOf(plusOne.substring(i, i+1));
		}
		return temp;
	}

}
