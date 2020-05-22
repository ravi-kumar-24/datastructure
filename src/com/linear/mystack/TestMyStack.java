package com.linear.mystack;

public class TestMyStack {

    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>(5);
        /*stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);*/
        stack.printStack();
        System.out.println(stack.peak());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println("size  "+stack.size());
    }
}
