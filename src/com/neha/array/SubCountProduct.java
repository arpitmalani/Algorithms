package com.neha.array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class SubCountProduct {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		int arrSize = arr.length;
		int product = 10;

		HashSet<ArrayList<Integer>> sets = new HashSet<ArrayList<Integer>>();
		
		for(int i=0;i<arrSize-1;i++){
			ArrayList<Integer> l = new ArrayList<Integer>();
			l.add(arr[i]);
			sets.add(l);
			for(int j=i+1;j<arrSize-1;j++){
				HashSet<ArrayList<Integer>> setIn = new HashSet<ArrayList<Integer>>();
				for(Iterator<ArrayList<Integer>> it= sets.iterator() ; it.hasNext() ;){
					ArrayList<Integer> pre = new ArrayList<Integer>();
					pre = it.next();
					ArrayList<Integer> p2 = new ArrayList<Integer>();
					p2.addAll(pre);
					p2.add(arr[j]);
					setIn.add(p2);
				}
				sets.addAll(setIn);
			}
			
		}
		
		for(ArrayList<Integer> q: sets){
			System.out.println(q);
		}
	}

}
