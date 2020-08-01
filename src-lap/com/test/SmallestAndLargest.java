package com.test;

public class SmallestAndLargest {
	
	public static void main(String[] args) {
		int a[] = {5,3,6,1,2,9,8,4,7};
		int small=a[0];
		int large=a[0];
		int temp=a[0];
		for (int i = 1; i < a.length; i++) {
		   temp = a[i];
			if(temp<small) {
				small = temp;
			}else if(temp>large) {
				large= temp;
			}
		}
		System.out.println(small+ " "+ large);
	}

}
