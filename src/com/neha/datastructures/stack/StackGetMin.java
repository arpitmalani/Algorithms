package com.neha.datastructures.stack;

import java.util.Stack;

public class StackGetMin extends Stack<Integer> {
	Stack<Integer> min = new Stack<Integer>();
	public static void main(String[] args) {
		StackGetMin s = new StackGetMin();
		s.push(30);
		s.push(-5);
		s.push(18);
	System.out.println(s.getMin());	
	
	
	}
	
	public  int getMin(){
		int x =min.pop(); 
		min.push(x);
		return x;
	}
	
	public void push(int x){
		if(isEmpty()){
			super.push(x);
			min.push(x);
			return;
		}
		super.push(x);
		int y = min.pop();
		min.push(y);
		if(x<y){
			min.push(x);
		}else {
			min.push(y);
		}
	}
	
	public Integer pop(){
		min.pop();
		return super.pop();
	}
}
