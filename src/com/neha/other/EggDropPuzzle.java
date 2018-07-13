package com.neha.gs.puzzle;

public class EggDropPuzzle {
	
	public static void main(String[] args) {
		System.out.println(eggDrops(2, 10));
	}
	
	//n - no of eggs
	//k - no of floors
	public static int eggDrops(int n, int k){
		if(n==1){
			return k;
		}
		//One floor or Zero floor
		if(k==0|| k==1){
			return k;
		}
		
		//x is the trial floor
		int x=0, min = Integer.MAX_VALUE, res=0;
		
		for(x=1;x<=k;x++){
			//trial on x floor so either it breaks so try with eggs -1 and floors below x
			//trial on x if it do not break try on floors above x with same number of eggs
			res = Math.max(eggDrops(n-1,x-1), eggDrops(n,k-x));
			if(min>res){
				min=res;
			}
		}
		return min+1;
	}

}
