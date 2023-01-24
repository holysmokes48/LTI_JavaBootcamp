package SelfReview;

public class TypeCasting {
	public static void main(String args[]) {
		int intVal = 10;
		double doubleVal = 20.0;
		//Explicit Casting is required
		
		//leads to type mismatch error
		//intVal = doubleVal; 
		
		//revised code snippet to follow explicit casting 
		intVal = (int)doubleVal; //prints 20
		
		System.out.println(intVal);
	}
}
