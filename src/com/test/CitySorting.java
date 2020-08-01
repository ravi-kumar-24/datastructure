package com.test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class CitySorting {

    public static void main(String[] args) {


        // New way:
        List<Integer> ages = Arrays.asList(25, 30, 45, 28, 32);
        int computedAges = ages.parallelStream().reduce(0, (a, b) -> a + b, Integer::sum);
        System.out.println(computedAges);

    }

    private static class MySort implements Comparator<String> {
        @Override
        public int compare(String o1, String o2) {
            return o2.compareTo(o1);
        }
    }
}
