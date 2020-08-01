package com.ds.tree;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class MyBinTree<T> {
	public MyBinTree() {
	}

	TreeNode<T> root;
	
	public MyBinTree<T> add(T t){
		TreeNode<T> newNode = new TreeNode<>(t);
		if(newNode==null) {
			System.out.println("error while allocating the memory");
			return null;
		}
		
		if(root==null) {
			root = newNode;
			return this;
		}
			
		Queue<TreeNode<T>> queue = new LinkedList();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			TreeNode<T> temp = queue.poll();
			if(temp.getLeft()!=null) {
				queue.add(temp.getLeft());
			}else {
				temp.setLeft(newNode);
				return this;
			}
			
			if(temp.getRight()!=null) {
				queue.add(temp.getRight());
			}else {
				temp.setRight(newNode);
				return this;
			}
			
		}
		
		return this;
	}
	
	public void preOrder() {
		System.out.println("========= Printing Binary Tree ==========");
		preOrder(root);
	}
	
	private void preOrder(TreeNode<T> temproot) {
		if(temproot!=null) {
			System.out.println(temproot.getData());
			preOrder(temproot.getLeft());
			preOrder(temproot.getRight());
		}
		
	}
	
	public void inOrder() {
		System.out.println("========= Printing inOrder Binary Tree ==========");
		inOrder(root);
	}
	
	private void inOrder(TreeNode<T> temproot) {
		if(temproot!=null) {
			
			inOrder(temproot.getLeft());
			System.out.println(temproot.getData());
			inOrder(temproot.getRight());
		}
		
	}
	public void postOrder() {
		System.out.println("========= Printing postOrder Binary Tree ==========");
		postOrder(root);
	}
	
	private void postOrder(TreeNode<T> temproot) {
		if(temproot!=null) {
			
			postOrder(temproot.getLeft());
			
			postOrder(temproot.getRight());
			System.out.println(temproot.getData());
		}
		
	}
	public void deleteTree() {
		deleteTree(root);
	}
	public void deleteTree(TreeNode root) {
		if(root==null) {
			return ;
		}
		
		deleteTree(root.getLeft());
		deleteTree(root.getRight());
		root=null;
	}
	
	public int sizeOfBinaryTree() {
		return sizeOfBinaryTree(root);
	}
	private int sizeOfBinaryTree(TreeNode root) {
		if(root==null) {
			return 0;
		}
		
		return sizeOfBinaryTree(root.getLeft()) + 1+ sizeOfBinaryTree(root.getRight());
	}
	
	public void leveltravelsalInReverse() {
		leveltravelsalInReverse(root);
	}

    private void leveltravelsalInReverse(TreeNode root) {
    	
    	Queue<TreeNode<T>> q = new LinkedList<TreeNode<T>>();
    	Stack<TreeNode<T>> s = new Stack<TreeNode<T>>();
    	
    	if(root==null) {
    		return;
    	}
		
    	q.add(root);
    	
    	while( !q.isEmpty()) {
    		TreeNode<T> temp = q.poll();
    		if(temp.getLeft()!=null) {
    			q.add(temp.getLeft());
    		}
    		if(temp.getRight()!=null) {
    			q.add(temp.getRight());
    		}
    		s.add(temp);
    	}
    	
    	while(!s.isEmpty()) {
    		System.out.println(s.pop().getData());
    	}
	}

	public void levelOrder() {
		System.out.println("========= Printing levelOrder Binary Tree ==========");
		levelOrder(root);	
	}
	
	private void levelOrder(TreeNode<T> root) {
		
		if(root==null) {
			return;
		}
		
		Queue<TreeNode<T>> queue = new LinkedList();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode<T> temp = queue.poll();
			System.out.println(temp.getData());
			if(temp.getLeft()!=null) {
			queue.add(temp.getLeft());
			}
			if(temp.getRight()!=null) {
				queue.add(temp.getRight());
			}
			
		}
		
	}
}
