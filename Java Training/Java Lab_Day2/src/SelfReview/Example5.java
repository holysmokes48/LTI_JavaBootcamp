package SelfReview;

public class Example5 {
	public static void main(String[] args) {
		int val1 = 9;
		int val2 = 6;
		for(int val3 = 0; val3 < 6; val3++, val2--) {
			if (val1 > 2) {
				val1--;
			}
			
			if(val1 > 5) {
				System.out.print(val1 + " ");
				--val1;
				continue;
			}
			
			val1--;
		}
	}

	// prints 8  6
}
