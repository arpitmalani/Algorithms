package com.neha.datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;

public class BFSBinaryTree {
	
	public static void main(String[] args) {
		
		NodeBST root = new NodeBST(1);
		root.left = new NodeBST(2);
		root.right = new NodeBST(3);
		root.left.left= new NodeBST(4);
		root.right.right=new NodeBST(5);
		
		printLevelOrder(root);
		
	}
	
	public static void printLevelOrder(NodeBST root){
		Queue<NodeBST> q = new LinkedList<NodeBST>();
		q.add(root);
		
		while(!q.isEmpty()){
			NodeBST t = q.poll();
			System.out.println(t.data);
			
			if(t.left!=null){
				q.add(t.left);
			}
			
			if(t.right!=null){
				q.add(t.right);
			}
		}
		
	}

}

class NodeBST{
	int data;
	NodeBST left;
	NodeBST right;
	
	public NodeBST(int item){
		data=item;
	}
}
