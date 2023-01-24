package SelfReview;

public class Example {
	public static void main(String[] args) {
		int intValOne = 0;
		int intValTwo = 0;
		for (short index = 0; index < 5; index++) {
			if((++intValOne > 2) || (++intValTwo > 2)) {
				intValOne++;
			}
		}
		
		System.out.println(intValOne + " " + intValTwo);
	}
	//prints 8 2 
}
