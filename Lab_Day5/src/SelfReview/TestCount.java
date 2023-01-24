package SelfReview;

public class TestCount implements Count {
	public static void main(String args[]) {
		TestCount test = new TestCount();
		test.countUp();
	}
	
	public void countUp() {
		for (int x = 6; x > counter; x--, ++counter) {
			System.out.println(" " + counter);
		}
		
		//Output: 0 1 2 
	}
}
