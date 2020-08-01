package com.my.tree;

import java.util.TreeSet;

public class TestMyTree1 {

    public static void main(String[] args) {
        MyTree<Integer> tree = new MyTree<Integer>();
        tree.add(4);
        tree.add(2);
        tree.add(6);
        tree.add(1);
        tree.add(3);
        tree.add(5);
        tree.add(8);
        tree.add(7);
        tree.add(9);


        TreeSet<Integer> tree1 = new TreeSet<>();
        tree1.add(4);
        tree1.add(2);
        tree1.add(6);
        tree1.add(1);
        tree1.add(3);
        tree1.add(5);
        tree1.add(8);
        tree1.add(7);
        tree1.add(9);

        tree1.stream().forEach(e -> System.out.print(e +" "));
      /*  tree.printPreOrderNonRec1();
        System.out.println();
        tree.preOrder();*/
        System.out.println();
        tree.inOrder();

    }
}
