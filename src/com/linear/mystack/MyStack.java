package com.linear.mystack;

import java.util.NoSuchElementException;

public class MyStack<T> {
    Object [] elements;
    int top;

    public MyStack(int initailCapicity){
        elements = new Object[initailCapicity];
    }

    public  void push(T t){
        if(top == elements.length){
            Object[] temp = new Object[2*elements.length];
            System.arraycopy(elements,0,temp,0 ,elements.length);
            elements = temp;
        }
        elements[top++] = t;
    }

    public T pop(){
        if(top  == 0){
            throw new NoSuchElementException();
        }
        T obj = (T)elements[--top];

        elements[top] =null;
        return obj;
    }

    public T peak(){
        if(top  == 0){
            throw new NoSuchElementException();
        }

        T obj = (T)elements[top-1];
        return obj;
    }

    public int size(){
        return top;
    }

    public void printStack() {
        for (int i = 0; i < top ; i++) {
            System.out.println(elements[i]);
        }
    }
}
