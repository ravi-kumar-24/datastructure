package com.matrix;

import java.util.*;
import java.util.Scanner;


// Write your code here. DO NOT use an access modifier in your class declaration.
class Solution {
	
	public static void main(String[] args) {
		Parser parser = new Parser();
        
		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			System.out.println(parser.isBalanced(in.next()));
		}
        
		in.close();
	}
}
class Parser{

	public boolean isBalanced(String next) {
		if(next==null || next.length()==0) {
			return true;
		}
		Stack<Character> stack = new Stack<>();
		char[] chars = next.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if(chars[i]=='{' || chars[i]==('(')) {
				stack.push(chars[i]);
			}else if(chars[i]=='}' || chars[i]==(')')) {
				if(stack.empty()) {
					return false;
				}
				char s =stack.pop();
				if(s=='{') {
					s='}';
				}else if(s=='(') {
					s=')';
				}
				
				if(s!=chars[i]) {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}
	
}
