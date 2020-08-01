package com.test;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);
   static int[] arr = new int[2];

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

       
        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int temp=arr[0];
        int length =arr.length -1;
        for (int i = 0; i < arr.length/2; ) {
			arr[i]=arr[length];
			arr[length] =temp;
			length = length-1;
			i++;
			temp = arr[i];
		}
        Arrays.stream(arr).mapToObj(result -> result + " ").forEach(System.out::print);
        Arrays.stream(arr).sum();
        
        scanner.close();
    }
    public String calculate(){
        int total=  Arrays.stream(arr).sum();
       
        if(total>=90 && total<=100) {
        	return "O";
        }else if(total>=80 && total<90) {
        	return "E";
        }else if(total>=70 && total<80) {
        	return "A";
        }else if(total>=55 && total<70) {
        	return "P";
        }else if(total>=40 && total<55) {
        	return "D";
        }else {
        	return "T";
        }
        

    }
}
