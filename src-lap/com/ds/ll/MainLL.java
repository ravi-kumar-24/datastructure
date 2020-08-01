package com.ds.ll;

import java.util.Stack;

public class MainLL {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		stack.add(10);
		stack.push(20);
		stack.push(30);
		stack.add(40);
		stack.push(50);
		stack.forEach(System.out::println);
		System.out.println(stack.get(0));
	}
}
