package com.ravi.queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyQueue<T> {
	Object[] elements;
	int front;
	int back;

	public MyQueue(int intialCapicity){
		elements = new Object[intialCapicity];
	}

	public void add(T item){
		if(size() == elements.length ){
			Object[] temp = new Object[2 * elements.length];
			System.arraycopy(elements,0, temp,0,back);
			elements = temp;
		}
		elements[back] = item;
		back++;
	}

	public T remove(){
		if(size()==0){
			throw new NoSuchElementException();
		}
		Object obj = elements[front];
		elements[front] =null;
		front++;
		if(size()==0){
			front=0;
			back=0;
		}
		return (T)obj;
	}

	public T peek(){
		if(size() ==0){
			throw new NoSuchElementException();
		}
		return (T) elements[front];
	}

	public void printQueue(){
		for (int i = front; i < back ; i++) {
			System.out.println(elements[i]);
		}
	}

	public int size(){
     /*   if(back>=front){
            return  back - front;
        }*/
		return back - front;
	}
}

