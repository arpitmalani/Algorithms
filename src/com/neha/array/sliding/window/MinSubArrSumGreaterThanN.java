package com.neha.array.sliding.window;

public class MinSubArrSumGreaterThanN {
	public static void main(String[] args) {
		int[] arr = {1, 4, 45, 6, 0, 19};
		int sum  =  51;
		int begin=0;
		int end =0;
		int countSum=0;
		int minLen = arr.length+1;
		Interval1 in= new Interval1();
		System.out.println("start");;
		while(end<arr.length){
			while(end<arr.length && countSum<=sum){
				countSum+=arr[end++];
			}
			while(begin<arr.length && countSum>sum){
				if(minLen>(end-begin)){
					minLen=(end-begin);
					in.start=begin;
					in.end=end;
				}
				countSum-=arr[begin++];
			}
		}
		
		System.out.println(minLen);
		for(int k=in.start;k<in.end;k++){
			System.out.println(arr[k]);
		}
	}

}

class Interval1{
	int start;
	int end;
	
}