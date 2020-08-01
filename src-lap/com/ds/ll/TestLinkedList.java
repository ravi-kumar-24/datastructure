package com.ds.ll;

import com.ravi.Person;

public class TestLinkedList {
	
	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		Node<Integer> node = new Node<>(40);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		System.out.println(list.getSize());
		list.printList();
		
		System.out.println(list.isLoopExists());
		list.reverseList();
		list.printList();
	}

}
