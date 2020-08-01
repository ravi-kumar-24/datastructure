package com.ds.tree;

public class TestBinTree {

	
	public static void main(String[] args) {
		MyBinTree<Integer> myBinTree = new MyBinTree<Integer>();
		myBinTree.add(10);
		myBinTree.add(20);
		myBinTree.add(30);
		myBinTree.add(40);
		myBinTree.add(50);
		myBinTree.add(60);
		myBinTree.add(70);
		int x =myBinTree.sizeOfBinaryTree();
		System.out.println(x);
		myBinTree.leveltravelsalInReverse();
	}
}
