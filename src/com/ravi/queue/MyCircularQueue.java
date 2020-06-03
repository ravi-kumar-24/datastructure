package com.ravi.queue;

import java.util.NoSuchElementException;

public class MyCircularQueue<T> {
    Object[] elements;
    int front =0;
    int back =0;

    public MyCircularQueue(int intialCapicity){
        elements = new Object[intialCapicity];
    }

    public void add(T item){
        if(size() == elements.length -1 ){
            int numItems = size();
            Object[] temp = new Object[2 * elements.length];
            System.arraycopy(elements,front, temp,0,elements.length - front);
            if(front>back) {
                System.arraycopy(elements, 0, temp, elements.length - front, back);
            }
            elements = temp;

            front =0;
            back = numItems;
        }
        elements[back] = item;
        if(back< elements.length-1) {
            back++;
        }
        else{
            back=0;
        }
    }

    public T remove(){
        if(size()==0){
            throw new NoSuchElementException();
        }
        Object obj = elements[front];
        elements[front] =null;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        }
        else if (front == elements.length) {
            front = 0;
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
        if(back>=front){
        for (int i = front; i < back ; i++) {
            System.out.println(elements[i]);
        }}
        else{
            for (int i = front; i < elements.length ; i++) {
                System.out.println(elements[i]);
            }
            for (int i = 0; i <back ; i++) {
                System.out.println(elements[i]);
            }
        }
    }

    public int size(){
      if(back>=front){
            return  back - front;
        }
        return back - front + elements.length;
    }

}
