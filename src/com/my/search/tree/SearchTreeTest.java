package com.my.search.tree;

public class SearchTreeTest {
	
	public static void main(String[] args) {
		SearchTree searchTree =new SearchTree();
		SearchTreeNode searchTreeNode =searchTree.insert(4);
		SearchTreeNode searchTreeNode1 =searchTree.insert(1);
		searchTree.insert(7);
		searchTree.insert(3);
		searchTree.insert(6);
		searchTree.insert(2);
		SearchTreeNode root =searchTree.insert(5);
		searchTree.inOrderSearchTreeTravarsal(root);
	}

}
