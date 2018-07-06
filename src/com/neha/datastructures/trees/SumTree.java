package com.neha.datastructures.trees;

public class SumTree {
	
	Node root;
	
	public static void main(String[] args) {
		SumTree bTree = new SumTree();
		bTree.root=new Node(10);
		bTree.root.left=new Node(4);
		bTree.root.right=new Node(6);
		if(isSumTree(bTree.root))
		System.out.println("SumTree true");
		
	}
	
	public static int sum(Node root){
		if(root == null){
			return 0;
		}
		return sum(root.left)+root.data+sum(root.right);
	}
	
	public static boolean isSumTree(Node node){
		if(node == null || (node.left==null && node.right==null)){
			return true;
		}
		int ls = sum(node.left);
		int rs = sum(node.right);
		if ((node.data == ls+rs) && isSumTree(node.left)&& isSumTree(node.right)){
			return true;
		}
		return false;
	}

}

class Node{
	int data;
	Node left;
	Node right;
	
	public Node(int data){
		this.data=data;
		left = right = null;
	}
}