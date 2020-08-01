package com.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import java.util.stream.Collectors;

public class Test {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {
    	int totalMoves = 0;
    	boolean flag =false;
    	for (int i = 0; i < q.length-1; i++) {
    		
			if(q[i]>q[i+1]) {
				int pos =Math.abs(q[i]-q[i+1]);
				if(pos>2) {
					System.out.println("Too Choas");flag=true;
					break;
				}
				totalMoves=totalMoves+pos;
			}
		}
    	if(!flag)
    	System.out.println(totalMoves);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }}
