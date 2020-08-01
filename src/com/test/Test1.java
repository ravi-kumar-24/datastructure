package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test1 {

    public static void main(String[] args) {
        List<String> pointList = new ArrayList<>();
        pointList.add("1");
        pointList.add("2");
        Test1 t = new Test1();
        /*t.printValies(pointList);
        Collections.sort(pointList, t.com);*/

        int i = 036;
        int j = 007;
        System.out.println(i + " "+ j);
    }

    Comparator<String> com = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            System.out.println("from anominius "+super.toString());
            return 0;
        }
    };
    private  void printValies(List<String> pointList) {
        pointList.forEach(p ->  {
                System.out.println("from lambda "+super.toString());
                    System.out.println(p);
                    //Do more work
                }
        );
    }
}
