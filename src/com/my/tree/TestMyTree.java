package com.my.tree;

public class TestMyTree {

	public static void main(String[] args) {

		MyTree<Integer> tree = new MyTree<Integer>();
		tree.add(1);
		tree.add(2);
		tree.add(3);
		tree.add(4);
		tree.add(5);
		tree.add(6);
		TreeNode<Integer> root = tree.add(3);
	    TreeNode<Integer> node = new TreeNode<Integer>(7);
	    OtherFuncationInTree<Integer> otherFuncationInTree = new OtherFuncationInTree<Integer>();
	   //System.out.println(otherFuncationInTree.sum(root));
	    otherFuncationInTree.printAllIns(root, node);
	   
	}	
	

}
