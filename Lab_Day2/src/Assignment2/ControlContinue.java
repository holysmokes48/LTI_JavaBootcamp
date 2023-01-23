//Program to understand loop and continue

package Assignment2;

public class ControlContinue {
	public static void main(String args[]) {
		
		boolean bool = true;
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print(j + "\t");
				if(j > 5) {
					System.out.println();
					continue;
				}
			}
			
		System.out.println("Outer Loop");
		}
		
		System.out.println("End");
	}

}
