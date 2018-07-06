package com.neha.array;

import java.util.ArrayList;
import java.util.Scanner;

public class StairCase {

	public static void main (String[] args) {
		//code
		
		Scanner sc = new Scanner(System.in);
		int testCaseCount = sc.nextInt();
		
		for(int i=0;i<testCaseCount;i++){
			System.out.println(getHeight(sc.nextInt()));
		}
		
	}
	
	public static int getHeight(int blocks){
	    if(blocks<=0){
	        return 0;
	    }
	    int sum=0;
	    int i=0;
	    for(i=1;sum<=blocks;i++){
	        sum+=i;
	        //System.out.println(i + " sum " + sum);
	    }
	    i--;
	    if((blocks-sum)<=0){
	    	i--;
	    }
	    return i;
	}
}