package com.linear.mystack.ll;

public class TestCC {

	public static void main(String[] args) {
		CircularLL<Integer> cList = new CircularLL<Integer>();
		cList.add(1);
		cList.add(2);
		cList.add(3);
		cList.add(4);
		cList.add(5);
		//cList.printList();
//		cList.deleteLast();
//		cList.printList();
		cList.deleteFirst();
		cList.printList();
	}
	
}
