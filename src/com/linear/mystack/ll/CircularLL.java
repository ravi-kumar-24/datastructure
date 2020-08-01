package com.linear.mystack.ll;

public class CircularLL<T> {

	MyNode<T> head;
	
	int size;
	
	public CircularLL<T> add(T t) {
		
		MyNode<T> insertedNode = new MyNode<>(t);
		MyNode<T> current = head;
		insertedNode.setNext(insertedNode);
		
		if(current==null) {
			head = insertedNode;
		}else {
			while(current.getNext()!=head) {
				current = current.getNext();
			}
			insertedNode.setNext(current.getNext());
			current.setNext(insertedNode);
		}
		
		
		return this;
		
	}
	
	public void deleteLast() {
		MyNode<T> current = head;
		MyNode<T> temp = head;
		while(current.getNext()!=head) {
			temp = current;
			current = current.getNext();
		}
		temp.setNext(head);
		current=null;
	}
	
	public void deleteFirst() {
		MyNode<T> current = head;
		while(current.getNext()!=head) {
			//temp = current;
			current = current.getNext();
		}
		current.setNext(head.getNext());
		head = head.getNext();
	}
	
	public void printList() {
		MyNode<T> current = head;
		while(current!=null) {
			System.out.println(current.getData());
			current= current.getNext();
			if(current==head) {
				break;
			}
		}
	}
}
