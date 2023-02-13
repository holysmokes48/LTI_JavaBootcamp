// creating a multi-dimensional array


package Assignment3;

public class JaggedArray {
	
	public static void main(String args[]) {

		String multiArray[][] = { {"Tony", "JAVA", "C", "C++"},
								{"Thomas", "JAVA", "UNIX", " "},
								{"Dinil", "Linux", "Oracle", " "},
								{"Delvin", "RDBMS", "C#", "Oracle"}};
		
		System.out.println("Printed Multi-Dimensional Array");
		System.out.println();
		displayMatrix(multiArray);
	}
	
	public static void displayMatrix (String [][] array) {
		
		for(String[] x : array) {
			for(String y : x) {
				System.out.print(y + "\t ");
			}
			System.out.println();
		}

	}

}
