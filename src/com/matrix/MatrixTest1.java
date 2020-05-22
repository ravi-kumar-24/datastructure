package com.matrix;

public class MatrixTest1 {

	
	public static void main(String[] args) {
		int n = 2;
		int m = 2;
		int[][] mat = {
					   {1,2,3},
				       {4,5,6},
				       {7,8,9}
				      };
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println("");
		}
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				if(j+1< mat[0].length) {
				int temp =mat[i][j+1];
				mat[i][j+1] = mat[i][j];
				}
			}
			System.out.println("");
		}
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[0].length; j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println("");
		}
	}
}
