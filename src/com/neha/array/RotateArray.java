package com.neha.array;

public class RotateArray {
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5};
		//23451
		//34512
		int[] t1 = rightRotateByN(arr, 2);
		for(int i=0;i<arr.length;i++){
			System.out.println(t1[i]);
		}
		System.out.println("Left rotate");
		//51234
		//451234
		
		int[] t2 = leftRotateByN(arr, 2);
		for(int i=0;i<arr.length;i++){
			System.out.println(t2[i]);
		}
	}
	
	
	public static int[] leftRotateByN(int[] arr, int k){
		int[] temp = new int[arr.length];
		int i=0;
		for(int j=k+1;j<arr.length;i++,j++){
			temp[i]=arr[j];
		}
		
		for(int j=0;j<k+1;j++,i++){
			temp[i]=arr[j];
		}
		return temp;
	}
	
	public static int[] rightRotateByN(int[] arr, int k){
		int[] temp = new int[arr.length];
		int j=0;
		for(int i =k; i<arr.length;i++,j++){
			temp[j]=arr[i];
		}
		
		for(int i=0;i<k;i++,j++){
			temp[j]=arr[i];
		}
		return temp;
	}
	
}
