package com.my.search.tree;

import java.util.HashSet;
import java.util.TreeSet;

public class SearchTreeTest {
	
	public static void main(String[] args) {
		SearchTree searchTree =new SearchTree();
//		SearchTreeNode searchTreeNode =searchTree.insert(4);
//		SearchTreeNode searchTreeNode1 =searchTree.insert(1);

		searchTree.insert(4);
		searchTree.insert(3);
		searchTree.insert(5);
		searchTree.insert(1);
		searchTree.insert(2);
		searchTree.insert(6);
		SearchTreeNode root =searchTree.insert(7);
		searchTree.inOrderSearchTreeTravarsal(root);
		System.out.println();
		TreeSet<Integer> set = new TreeSet<>();
		set.add(7);
		set.add(3);
		set.add(6);
		set.add(2);
		set.add(1);
		set.add(4);
		set.add(5);
		set.descendingSet().stream().forEach(
				e -> System.out.print(e +" ")
		);
	}

}
