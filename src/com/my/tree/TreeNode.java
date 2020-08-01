package com.my.tree;

public class TreeNode<T> {
	TreeNode<T> left;
	TreeNode<T> right;
	T data;
	
	public TreeNode() {
		
	}
	
	public TreeNode(T data) {
		this.data =data;
		this.left = null;
		this.right = null;
	}
	
	public TreeNode(TreeNode<T> left, TreeNode<T> right, T data) {
		super();
		this.left = left;
		this.right = right;
		this.data = data;
	}

	public TreeNode<T> getLeft() {
		return left;
	}

	public void setLeft(TreeNode<T> left) {
		this.left = left;
	}

	public TreeNode<T> getRight() {
		return right;
	}

	public void setRight(TreeNode<T> right) {
		this.right = right;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return data.toString();
	}
	

}
