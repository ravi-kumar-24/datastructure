package com.my.tree;

public  class OtherFuncationInTree<T> {
	
	public  int sum(TreeNode<T> root) {
		if(root ==null) {
			return 0;
		}
		return (int)root.getData() + sum(root.getLeft()) + sum(root.getRight());
	}

	public boolean printAllIns(TreeNode<T> root, TreeNode<T> node) {
		if(root==null) {
			return false;
		}
		
		if(root.getData()==node.getData() || root.getData()==node.getData() ||
				printAllIns(root.getLeft(), node) ||printAllIns(root.getRight(), node))
		{
			System.out.println(root.getData());
			return true;
		}
		return false;
	}
}
