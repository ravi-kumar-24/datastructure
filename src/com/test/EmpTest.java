package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class EmpTest {

    public static void main(String[] args) {
        Map<Emp, String> map = new HashMap<>();
        Emp e1 = new Emp(1,"ravi", 34.9);
        Emp e2 = new Emp(1,"ravi", 34.9);
        Emp e3 = new Emp(1,"ravi", 34.9);

//        System.out.println(e1.equals(e2));
//        System.out.println(e1==e2);

        map.put(e1, "ravi");
        map.put(e2, "ravi");
        map.put(e3, "ravi");
        System.out.println(map.size());

    }
}
