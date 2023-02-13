// A java program needs to be written to display the range of marks based on the grade. 

package Assignment3;

import java.util.Scanner;
 
public class SwitchCase{
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		System.out.print("Please enter the grade : ");
 
		String grade = userInput.next();
		grade = grade.toUpperCase();
		switch (grade) {
		case "A":
			System.out.println("Grade Range: 80 - 100");
			break;
			
		case "B":
			System.out.println("Grade Range: 73 - 79");
			break;
			
		case "C":
			System.out.println("Grade Range: 65 - 72");
			break;
			
		case "D":
			System.out.println("Grade Range: 55 - 64");
			break;
			
		case "E":
			System.out.println("Grade Range: 0 - 55");
			break;
		default:
            System.out.println("Grade does not exist");
		}
	}
}