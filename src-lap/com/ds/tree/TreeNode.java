package com.ds.tree;

public class TreeNode<T> {
	private T data;
	public TreeNode() {
	}
	
	public TreeNode(T t) {
	 this.data = t;
	 this.left =null;
	 this.right = null;
	}
	
	private TreeNode<T> left;
	private TreeNode<T> right;
	public T getData() {
		return data;
	}
	public void setData(T data) {
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
	

}
