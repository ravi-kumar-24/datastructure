package com.linear.mystack.ll;


public class TestLinkedList {
	
	public static void main(String[] args) {
		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		MyNode<Integer> node = new MyNode<>( 1);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);

		MyLinkedList<Integer> list1 = new MyLinkedList<Integer>();
		list1.add(5);
		list1.add(15);
		list1.add(25);
		list1.add(35);
		list1.add(45);
		list1.add(61);
		list1.add(68);
		/*System.out.println(list.getSize());
		list.printList();
		
		System.out.println(list.isLoopExists());
		list.reverseList();
		list.printList();*/

		//MyNode<Integer> nodeInter = list.merge(list.getHead(), list1.getHead());
		//System.out.println(nodeInter);
		MyLinkedList<Integer> n =list1.reverseList();
		n.printList();
	}

}
