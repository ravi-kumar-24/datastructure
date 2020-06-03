package com.ravi.mylinkedlist;

import java.util.LinkedList;

public class JavaLL {

    public static void main(String[] args) {
        LinkedList<Integer> list  = new LinkedList<>();
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(3);
        list.remove(-2);
        list.stream().forEach(System.out::println);
    }
}
