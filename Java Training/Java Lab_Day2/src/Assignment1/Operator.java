//fixing compilation error from Day 1, Assignment 8 lab 
package Assignment1;

public class Operator {
	public static void main(String args[]) {
		
		int intVal = 100;
		int max = 127;
		int min = -128;
		
		/*
		 * byte byteVal = (byte)intVal; 
		 * byte max = 127; 
		 * byte min = -128;
		 */
		
		//compilation error due to datatype mismatch
		//unable to convert int to byte
		//byte sum = max + min;
		
		int sum = max + min;
		
		System.out.println("Sum = " + sum);
	}
}
