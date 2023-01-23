package Assignment5;

import java.io.*;

public class StringDemo {
	
	public static void main (String[] args) {
		
		try {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			System.out.println("Enter your name: ");
			String name = br.readLine();
			System.out.format("Hi %s!%n", name);
			System.out.println("Length of name: " + name.length());
			System.out.println("Lowercase version of name: " + name.toLowerCase());
			
		}
		
		catch (IOException ioe) {
			System.out.println("IO Exception raised!");
		}
		
 
	}

}
