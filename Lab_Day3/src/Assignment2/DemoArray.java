//Displaying the sum of matrices of 2D arrays

package Assignment2;

public class DemoArray {
	
	public static void main (String args[]) {
		
		int firstArrayMatrix[][] = {{1, 1, 1}, {1, 1, 1}};
		int secondArrayMatrix[][] = {{2, 2, 2}, {2, 2, 2}};
		
		System.out.println("Matrix 1:");
		displayMatrix(firstArrayMatrix);
		
		System.out.println();
		
		System.out.println("Matrix 2:");
		displayMatrix(secondArrayMatrix);
		
		System.out.println("\nSum of the Matrices:");
		int sumArrayMatrix[][] = new int[2][3];
		for(int i = 0; i < 2; i++){    
			for(int j = 0; j<3; j++){    
				sumArrayMatrix[i][j] = firstArrayMatrix[i][j] + secondArrayMatrix[i][j];     
			}    
		}   
		displayMatrix(sumArrayMatrix);
		
	}

	public static void displayMatrix (int [][] array) {
		
		for(int[] x : array) {
			for(int y : x) {
				System.out.print(y + " ");
			}
			System.out.println();
		}

	}
}