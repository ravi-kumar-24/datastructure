package com.test;

public class Constructor {
    static String str;

    public  Constructor(){
        System.out.println("heloo");
        str ="aaa";
    }

    public static void main(String[] args) {
        Constructor c = new Constructor();
        System.out.println(str);
    }
}
