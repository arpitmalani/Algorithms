package com.neha.datastructures.trees;

public class BalancedTree {
	

	Node1 root;
	
	public static void main(String[] args) {
		BalancedTree bTree = new BalancedTree();
		bTree.root=new Node1(10);
		bTree.root.left=new Node1(4);
		bTree.root.right=new Node1(6);
		if(isBalancedTree(bTree.root))
		System.out.println("Balanced true");
		
	}
	
	public static boolean isBalancedTree(Node1 root){
		if(root==null){
			return true;
		}
		
		int lh = height(root.left);
		int rh = height(root.right);
		
		if(Math.abs(lh-rh)<=1 && isBalancedTree(root.left) && isBalancedTree(root.right))
			return true;
		else
			return false;
		
		
	}
	
	public static int height(Node1 n){
		if(n==null){
			return 0;
		}
		int lh = 1+ Math.max(height(n.left), height(n.right));
		return lh;
	}
	
}

 class Node1 {
	int data;
	Node1 left;
	Node1 right;
		
	public Node1(int data){
		this.data=data;
		left = right = null;
	}
	
}