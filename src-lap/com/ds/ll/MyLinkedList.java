package com.ds.ll;

public class MyLinkedList<T> {

	int size;
	
	private Node<T> head;
	public MyLinkedList() {
		
	}

	public MyLinkedList<T> add( T t) {
		Node<T> newNode =new Node<>(t);
		newNode.setNext(null);
		if(head==null) {
			setHead( newNode); 
		}else {
			Node<T> currentNode = head;
			while(currentNode.getNext()!=null) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(newNode);
		}
		size=size+1;
		return this;
	}
	
	public MyLinkedList<T> add(Node<T> newNode) {
		System.out.println(newNode);
		newNode.setNext(null);
		if(head==null) {
			setHead( newNode); 
		}else {
			Node<T> currentNode = head;
			while(currentNode.getNext()!=null) {
				currentNode = currentNode.getNext();
			}
			currentNode.setNext(newNode);
		}
		size=size+1;
		return this;
	}
	
	public boolean isLoopExists() {
		boolean flag = false;
		Node<T> slowPointer = head, fastPointer =head;
		
		while(slowPointer.getNext()!=null &&  fastPointer.getNext()!=null && fastPointer.getNext().getNext()!=null) {
			
			slowPointer = slowPointer.getNext();
			fastPointer= fastPointer.getNext().getNext();
			if(slowPointer==fastPointer) {
				flag = true;
				break;
			}
		}
		
		return flag;
	}
	public MyLinkedList<T> add( int index, T t) {
		if(index>size || index<0) {
			throw new IndexOutOfBoundsException("Inalid index");
		}
		
		Node<T> newNode = new Node<>(t);
		Node<T> pre =head;
		int count=1;
		if(index==0) {
			newNode.setNext(pre);
			head =newNode;
		}else {
			while(index>count) {
				pre= pre.getNext();
				count++;
			}
			
			Node<T> temp = pre.getNext();
			newNode.setNext(temp);
			pre.setNext(newNode);
		}
		size=size+1;
		
		return this;
	}
	
	public void delete(int index) {
		if(index>=size || index<0) {
			throw new IndexOutOfBoundsException("Inalid index");
		}

		Node<T> current = head;
		int count=1;
		if(index==0) {
			head = current.getNext();
			current = null;
		}else {
			while(index>count) {
				current = current.getNext();
				count++;
			}
			Node<T> deletedNode = current.getNext();
			
			current.setNext(deletedNode.getNext());
			deletedNode = null;
			
		}
		size--;
	}
	
	public int getSize() {
		return size;
	}
	
	public MyLinkedList<T> reverseList(){
		Node<T> pre=null, next=null, curr=head;
		
		while(curr!=null) {
			next= curr.getNext(); //first take next node
			curr.setNext(pre); // set previous node
			pre=curr;         // than move the pointer from pre to current 
			curr=next;      // and current to next
		}
	   head=pre;  // set back header to last node which was pre in logic
		return this;
	}
	
	public void printList() {
		System.out.println("========== Printing list ==========");
		Node<T> currentNode = head;
		
		while(currentNode!=null) {
			System.out.println(currentNode.getData());
			currentNode = currentNode.getNext();
		}
	}
	
	
	private void setHead(Node<T> head) {
		this.head = head;
	}
}

class Node<T>{
	T data;
	Node<T> next;
	
	public Node() {
	}
	
	public Node(T data) {
		this.data = data;
		this.next = null;
	}
	
	
	
	public Node(T data, Node<T> node) {
		this.data=data;
		next=node;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((next == null) ? 0 : next.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Node other = (Node) obj;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (next == null) {
			if (other.next != null)
				return false;
		} else if (!next.equals(other.next))
			return false;
		return true;
	}

	
	
}