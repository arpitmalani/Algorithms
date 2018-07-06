package com.neha.datastructure.linkedlist;

public class ReverseLinkList {
	
	public static void main(String[] args) {
		NodeR head = new NodeR(1);
		head.next=new NodeR(2);
		head.next.next= new NodeR(3);
		head.next.next.next = new NodeR(4);
		
		NodeR newHead = reverse(head);
		NodeR runner = newHead;
		while(runner != null){
			System.out.println(runner.data);
			runner = runner.next;
		}
		
	}
	
	public static NodeR reverse(NodeR head){
		NodeR newHead = null;
		NodeR runner = head;
		while(runner != null){
			NodeR ele = new NodeR(runner.data);
			ele.next=newHead;
			newHead=ele;
			runner = runner.next;
		}
		
		return newHead;
	}

}

class NodeR{
	int data;
	NodeR next;
	
	public NodeR(int data){
		this.data = data;
		this.next=null;
	}
}
