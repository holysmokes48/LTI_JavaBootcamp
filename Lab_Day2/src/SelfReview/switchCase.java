package SelfReview;

public class switchCase {
	public static void main(String args[]) {
		
		String comment;
		int val = (int)(4 * 3);
		
			switch(val) {
			case 0: comment = "Case 0";
				break;
			
			case 1: comment = "Case 1";
			break;
			
			case 2: comment = "Case 2";
			break;
			
			default: comment = "Oops --- something is wrong";
			
		}
		
		System.out.print(comment);
	}
	//prints "Oops --- something is wrong"
}
