package com.neha.gs.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrangeArrayToFormLargestNumber {
	public static void main(String[] args) {
		String[] arr = {"54","546","548","60"};
		List<String> lis = Arrays.asList(arr);
		Collections.sort(lis, new Comparator<String>(){
			public int compare(String s1, String s2){
				String x = s1+s2;
				String y = s2+s1;
				if(x.compareTo(y)>0){
					return -1;
				}else{
					return 1;
				}
			}
		});
		System.out.println(lis);
		for(String s : lis){
			System.out.print(s);
		}
	}

}
