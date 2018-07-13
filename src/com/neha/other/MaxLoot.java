package com.neha.gs.other;

public class MaxLoot {
	public static void main(String[] args) {
		int hval[] = {6,7,1,3,8,2,4};
		int n = hval.length;
		System.out.println(maxLoot(hval, n));
	}
	
	public static int maxLoot(int hval[], int n){
		if(n==0){
			return 0;
		}
		if(n==1){
			return hval[0];
		}
		if (n==2){
			return Math.max(hval[0], hval[1]);
		}
		int[] maxLoot = new int[n]; 
		maxLoot[0]=	hval[0];
		maxLoot[1]=Math.max(hval[0],hval[1]);
		for(int i=2;i<hval.length;i++){
			maxLoot[i]=Math.max(maxLoot[i-1],hval[i]+maxLoot[i-2]);
			}
		return maxLoot[n-1];
		}
		
	}
