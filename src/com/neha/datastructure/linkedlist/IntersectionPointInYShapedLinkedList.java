package com.neha.gs.linkedlist;

public class IntersectionPointInYShapedLinkedList {

	public static void main(String[] args) {
		YNode root = new YNode(3);
		root.next = new YNode(6);
		root.next.next = new YNode(9);
		root.next.next.next = new YNode(15);
		root.next.next.next.next = new YNode(30);

		YNode root2 = new YNode(10);
		root2.next = root.next.next.next;
		root2.next.next = root.next.next.next.next;

		Result s1 = getSizeAndEnd(root);
		Result s2 = getSizeAndEnd(root2);

		if (s1.end != s2.end) {
			System.out.println("Non intersecting linked list");
		}

		int sizeDiff = Math.abs(s1.size - s2.size);

		YNode large = s1.size > s2.size ? root : root2;
		YNode small = s1.size < s2.size ? root : root2;

		for (int k = sizeDiff; k > 0; k--) {
			large = large.next;
		}

		while (large != small) {
			large = large.next;
			small = small.next;
		}

		System.out.println(large.data);
	}

	public static Result getSizeAndEnd(YNode root) {
		YNode run = root;
		int size = 1;
		while (run.next != null) {
			run = run.next;
			size++;
		}
		YNode end = run;
		return new Result(size, end);
	}

}

class YNode {
	int data;
	YNode next;

	public YNode(int data) {
		this.data = data;
	}
}

class Result {
	int size;
	YNode end;

	public Result(int size, YNode end) {
		this.size = size;
		this.end = end;
	}
}
