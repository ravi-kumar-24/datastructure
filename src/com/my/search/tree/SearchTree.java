package com.my.search.tree;

public class SearchTree {

    SearchTreeNode root;

    public SearchTreeNode insert(int data) {
        return root = insert(root, data);
    }

    private SearchTreeNode insert(SearchTreeNode root, int data) {

        if (root == null) {
            SearchTreeNode newNode = new SearchTreeNode(data);
            newNode.setLeft(null);
            newNode.setRight(null);
            return newNode;
        } else {
            if (root.getData() > data) {

                    root.setLeft(insert(root.getLeft(), data));


            } else if (root.getData() < data) {

                    root.setRight(insert(root.getRight(), data));

            }
        }
        return root;
    }

    public void inOrderSearchTreeTravarsal(SearchTreeNode root) {
        if (root == null) {
            return;
        }

        inOrderSearchTreeTravarsal(root.getLeft());
        System.out.print(root.getData()+" ");
        inOrderSearchTreeTravarsal(root.getRight());
    }

    public void preOrderSearchTreeTravarsal(SearchTreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getData()+" ");
        inOrderSearchTreeTravarsal(root.getLeft());

        inOrderSearchTreeTravarsal(root.getRight());
    }
    public void reverseInOrder(SearchTreeNode root){
        if(root == null ){
            return;
        }
        inOrderSearchTreeTravarsal(root.getRight());
        System.out.print(root.getData()+" ");
        inOrderSearchTreeTravarsal(root.getLeft());
    }


}
