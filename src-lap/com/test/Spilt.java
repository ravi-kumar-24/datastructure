package com.test;

import java.util.Scanner;

public class Spilt {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		if (s.trim().isEmpty()) {
			System.out.println(0);
		} else {
			String delims = "[  !, ?._'@ ]+";
			String[] arr = s.trim().split(delims);
			System.out.println(arr.length);
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
		scan.close();
	}
}
