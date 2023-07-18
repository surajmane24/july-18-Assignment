package com.aurionpro.model;

public class MatrixMultiplicationApp {

	public static void main(String[] args) {
		int A[][] = {{1,1,1},
					{2,2,2},
					{3,3,3},
					{4,4,4}};
		
		int B[][] = {{1,1,1,1},
					{2,2,2,2},
					{3,3,3,3}};
		int rowCountOfA = A.length;
		int colCountOfA = A[0].length;
		int rowCountofB = B.length;
		int colCountOfB = B[0].length;
		matrixMultiply( rowCountOfA,colCountOfA, A, rowCountofB,  colCountOfB,  B);
	}
	
	public static void matrixMultiply(int row1,int col1, int A[][], 
									int row2, int col2, int B[][]) {
		System.out.println("\nMatrix A ==> ");
        printMatrix(A, row1, col1);
        System.out.println("\nMatrix B ==> ");
        printMatrix(B, row2, col2);
		
		if(row1!=col2) {
			System.out.println("Matrix ultiplecation of not possible");
			return;
		}
		int C[][] = new int[row1][col2];
		
		for(int i=0; i<row1; i++) {
			for(int j=0; j<col2; j++) {
				for(int k=0; k<row2; k++) {
					C[i][j] += A[i][k] * B[k][j];
				}
			}
		}
		System.out.println("Multiply Matrix==> ");
		printMatrix(C, C.length, C[0].length);
		
	}
	
	private static void printMatrix(int[][] c, int rowSize, int colSize) {
		for(int i =0; i<rowSize; i++) {
			for(int j=0; j<colSize; j++) {
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
