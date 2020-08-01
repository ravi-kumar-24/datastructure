package com.my.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class MyTree<T> {

    public MyTree() {

    }

    TreeNode<T> root;


    public TreeNode<T> add(T t) {
        TreeNode<T> newNode = new TreeNode<>();
        newNode.setData(t);
        newNode.setLeft(null);
        newNode.setRight(null);
        if (root == null) {
            root = newNode;
        } else {
            Queue<TreeNode<T>> queue = new LinkedList<TreeNode<T>>();
            queue.add(root);

            while (!queue.isEmpty()) {
                TreeNode<T> node = queue.poll();
                if (node.getLeft() != null) {
                    queue.add(node.getLeft());
                } else {
                    node.setLeft(newNode);
                    break;
                }

                if (node.getRight() != null) {
                    queue.add(node.getRight());
                } else {
                    node.setRight(newNode);
                    break;
                }
            }
        }
        return root;
    }

    public void preOrder() {
        printPreOrde(root);
    }

    public void printPreOrde(TreeNode<T> root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getData()+" ");
        printPreOrde(root.getLeft());
        printPreOrde(root.getRight());

    }

    public void inOrder() {
        printInOrde(root);
    }

    private void printInOrde(TreeNode<T> root) {
        if (root == null) {
            return;
        }
        printInOrde(root.getLeft());
        System.out.print(root.getData()+" ");
        printInOrde(root.getRight());
    }

    public void postOrder() {
        printPostOrde(root);
    }

    private void printPostOrde(TreeNode<T> root) {
        if (root == null) {
            return;
        }
        printPostOrde(root.getLeft());
        printPostOrde(root.getRight());
        System.out.println(root.getData());
    }

    public void preOrderNonRec() {
        printPreOrderNonRec(root);
    }

    public void printPreOrderNonRec1(){
    	this.printPreOrderNonRec1(root);
	}
    private void printPreOrderNonRec1(TreeNode root){

    	if(root ==null){
    		return;
		}
    	Stack<TreeNode<T>> stack = new Stack<>();
    	stack.push(root);
    	while (!stack.isEmpty()){
    		TreeNode<T> popNode = stack.pop();
			System.out.print(popNode.getData()+" ");
			if(popNode.getRight()!=null){
				stack.push(popNode.getRight());
			}
			if(popNode.getLeft()!=null) {
				stack.push(popNode.getLeft());
			}
		}

	}

    private void printPreOrderNonRec(TreeNode<T> root2) {
        if (root == null) {

            return;
        }
        Stack<TreeNode<T>> stack = new Stack<TreeNode<T>>();
        while (true) {

            while (root != null) {
                System.out.println(root.getData());
                stack.push(root);
                root = root.getLeft();
            }

            if (stack.isEmpty()) {
                break;
            }
            root = stack.pop();
            root = root.getRight();
        }
    }

    public void inOrderNonRec() {
        printInOrderNonRec(root);
    }

    private void printInOrderNonRec(TreeNode<T> root2) {
        if (root == null) {

            return;
        }

        Stack<TreeNode<T>> stack = new Stack<TreeNode<T>>();
        while (true) {
            while (root != null) {
                stack.push(root);
                root = root.getLeft();
            }

            if (stack.isEmpty()) {
                break;
            }

            root = stack.pop();
            System.out.println(root.getData());
            root = root.getRight();
        }
    }
}
