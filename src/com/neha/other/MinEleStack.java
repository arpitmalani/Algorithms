package com.neha.gs.stack;

import java.util.Stack;

public class MinEleStack extends Stack<Integer> {
	Stack<Integer> minStack = new Stack<>();
	public static void main(String[] args) {
		MinEleStack stack = new MinEleStack();
		stack.push(30);
		stack.push(-5);
		stack.push(18);
		System.out.println(stack.getMin());
		
	}
	
	public Integer pop(){
			minStack.pop();
		return super.pop();
		
	}
	
	public void push(int i){
		if(isEmpty()){
			minStack.push(i);
			super.push(i);
			return;
		}
		super.push(i);
		int top = minStack.pop();
		minStack.push(top);
		if(i<top){
			minStack.push(i);
		}else{
			minStack.push(top);
		}
	}
	
	public Integer getMin(){
		 return minStack.peek();
	}

}
