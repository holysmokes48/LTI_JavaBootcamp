//creating multiplication tables based on user input

package Assignment6;

public class UserInput {
	public static void main (String[] args) {
		int number, iterations;
		
		//number for which multiplication table will be generated for
		//number = Integer.parseInt(args[0]);
		number = 9;
		
		//number till which multiplication table will be generated
		//iterations = Integer.parseInt(args[1]);
		iterations = 81;
		
		//Code to generate multiplication table
		int array[][] = {{}};
		for(int[] x : array) {
			for(int y : x) {
				array[y][x] = number * x;
				System.out.print(y + "\t ");
			}
			System.out.println();
		}

	}

}
