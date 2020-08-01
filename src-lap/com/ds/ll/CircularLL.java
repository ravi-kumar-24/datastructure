package com.ds.ll;

public class CircularLL<T> {

	Node<T> head;
	
	int size;
	
	public CircularLL<T> add(T t) {
		
		Node<T> insertedNode = new Node<>(t);
		Node<T> current = head;
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
		Node<T> current = head;
		Node<T> temp = head;
		while(current.getNext()!=head) {
			temp = current;
			current = current.getNext();
		}
		temp.setNext(head);
		current=null;
	}
	
	public void deleteFirst() {
		Node<T> current = head;
		while(current.getNext()!=head) {
			//temp = current;
			current = current.getNext();
		}
		current.setNext(head.getNext());
		head = head.getNext();
	}
	
	public void printList() {
		Node<T> current = head;
		while(current!=null) {
			System.out.println(current.getData());
			current= current.getNext();
			if(current==head) {
				break;
			}
		}
	}
}
