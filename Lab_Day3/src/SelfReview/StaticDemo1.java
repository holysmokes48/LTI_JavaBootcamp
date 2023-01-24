package SelfReview;

public class StaticDemo1 {

	private int num;
	static void display() {
		System.out.println(num);
	}
	
	public static void main(String[] args) {
		StaticDemo.display();
	}
	
	//compilation error because num does not have a initialized value
}

