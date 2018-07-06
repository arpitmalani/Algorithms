package com.neha.datastructures.queue;

public class QueueViaArray {
	
	public static void main(String[] args) {
		Queue q = new Queue(5);
		q.enqueue(5);
		q.enqueue(4);
		q.enqueue(3);
		q.enqueue(2);
		q.enqueue(1);
			
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		
	}
}
	
	class Queue{
		int [] queue;
		int rear;
		int front;
		int capacity;
		public Queue( int capacity){
			queue = new int[capacity];
			rear=0;
			front = 0;
			this.capacity=capacity-1;
		}
		
		public boolean isFUll(){
			if(rear == capacity ){
				return true;
			}
			return false;
		}
		
		public boolean isEmpty(){
			return (rear==0) && (front==0)?true:false;
		}
		
		public void enqueue(int element) {
			if(isFUll()){
return;				
			}
			queue[rear++]=element;
			System.out.println("Enqueued ele: "+element+"at index: "+ rear);
		}
		
		public int deQueue() {
			if(isEmpty()){
			return -1;
			}
			System.out.println("return ele at index: " + rear);
			return queue[front++];
		}
	}

