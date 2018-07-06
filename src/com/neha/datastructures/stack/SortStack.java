package com.neha.datastructures.stack;

import java.util.Stack;

public class SortStack {
	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<Integer>();
		s.push(30);
		s.push(-5);
		s.push(18);
	System.out.println(s);	
	sortStack(s);
	System.out.println(s);
	System.out.println(s.peek());
	}
	
	public static void sortStack(Stack<Integer> ss){
		if(!ss.isEmpty()){
			int x = ss.pop();
			sortStack(ss);
			sortedInsert(ss, x);
		}
	}
	
	public static void sortedInsert(Stack<Integer> ss, int x){
		if(ss.isEmpty() || x< ss.peek()){
			ss.push(x);
			return;
		}
		
		int temp = ss.pop();
		sortedInsert(ss, x);;
		ss.push(temp);
	}
	
}
