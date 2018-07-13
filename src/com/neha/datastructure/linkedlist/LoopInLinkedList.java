package com.neha.gs.linkedlist;

public class LoopInLinkedList {
	public static void main(String[] args) {
		LNode root= new LNode(1);
		root.next=new LNode(2);
		root.next.next=new LNode(3);
		
		root.next.next.next=new LNode(4);
		root.next.next.next.next=new LNode(5);
		root.next.next.next.next.next=new LNode(6);
		root.next.next.next.next.next.next=root.next.next;
		
		LNode fast=root;
		LNode slow = root;
		
		while(fast!=null && fast.next!=null){
			fast = fast.next.next;
			slow=slow.next;
			if(fast == slow){
				break;
			}
		}
		
		if(fast== null || fast.next == null){
			System.out.println("No loop");
		}else{
			System.out.println("Collision: "+ fast.data);
			slow = root;
			while(slow!=fast){
				slow=slow.next;
				fast=fast.next;
			}
			System.out.println("Loop start: "+ fast.data);
		}

	}

}

class LNode {
	int data;
	LNode next;

	public LNode(int data) {
		this.data = data;
		next = null;
	}
}
