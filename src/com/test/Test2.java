package com.test;

public class Test2 {

    public static void main(String[] args) {
        minimization();
    }

    private static void minimization() {
        String s = "aabcccabba";

        int mid = s.length() / 2; //get the middle of the String

        String part1 =s.substring(0, mid);
        String part2 = s.substring(mid);

        while (part1.length() > 0 && part2.length() > 0 &&
                part2.charAt(part2.length() - 1) == part1.charAt(0)) {

            char toRemove = part2.charAt(part2.length() - 1);
            while (part2.length() > 0 && part2.charAt(part2.length() - 1) == toRemove) {
                part2 = part2.substring(0, (part2.length() - 1));
            }
            while (part1.length() > 0 && part1.charAt(0) == toRemove) {
                part1 = part1.substring(1);
            }
        }

        String sa =part2 + part1;
        System.out.println(sa.length());
    }
}


