package com.my.search.tree;


public class SearchTreeNode {

	SearchTreeNode left;
	SearchTreeNode right;
	int data;
	
	public SearchTreeNode() {
		
	}
	
	public SearchTreeNode(int data) {
		this.data =data;
		this.left = null;
		this.right = null;
	}
	
	public SearchTreeNode(SearchTreeNode left, SearchTreeNode right, int data) {
		super();
		this.left = left;
		this.right = right;
		this.data = data;
	}
	public SearchTreeNode getLeft() {
		return left;
	}
	public void setLeft(SearchTreeNode left) {
		this.left = left;
	}
	public SearchTreeNode getRight() {
		return right;
	}
	public void setRight(SearchTreeNode right) {
		this.right = right;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
}
