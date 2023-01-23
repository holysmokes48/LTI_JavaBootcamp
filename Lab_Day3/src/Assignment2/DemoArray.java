//Displaying the sum of matrices of 2D arrays

package Assignment2;

import java.util.Arrays;

public class DemoArray {
	
	public static void main (String args[]) {
		
		int firstArrayMatrix[][] = {{1, 1, 1}, {1, 1, 1}};
		int secondArrayMatrix[][] = {{2, 2, 2}, {2, 2, 2}};
		
		System.out.println("Matrix 1:");
		displayMatrix(firstArrayMatrix);
		
		System.out.println();
		
		System.out.println("Matrix 2:");
		displayMatrix(secondArrayMatrix);
		
		System.out.println("Sum of the Matrices");
		int sum[][] = sumMatrix(firstArrayMatrix, secondArrayMatrix);
		displayMatrix(sum);
		
		
	}

	public static void displayMatrix (int [][] array) {
		
		for(int[] x : array) {
			for(int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}

	}
	
	public static int[][] sumMatrix (int [][] array1, int [][] array2) {
		
		int [][] sumArray = {{}}; 
		
		for(int x = 0; x < 3; x++) {
			for(int y = 0; y < 3; y++) {
				sumArray[x][y] = array1[x][y] + array2[x][y];
			}
			
		}
		
		return sumArray;

	}
}