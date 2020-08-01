package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneDic {

	 public static void main(String []argh){
	        Scanner in = new Scanner(System.in);
	        Map<String, Integer> map = new HashMap<String, Integer>();
	        int n = in.nextInt();
	        for(int i = 0; i < n; i++){
	            String name = in.next();
	            int phone = in.nextInt();
	            map.put(name, phone);
	            // Write code here
	        }
	        while(in.hasNext()){
	            String s = in.next();
	          int val = map.getOrDefault(s,0);
	          if(val!=0) {
	          System.out.println(s+"="+val);
	          }else {
	        	  System.out.println("Not found");  
	          }
	        }
	        in.close();
	    }
}
