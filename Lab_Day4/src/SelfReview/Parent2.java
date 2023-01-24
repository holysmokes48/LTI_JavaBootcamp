package SelfReview;

public class Parent2 {
	private int num;
	
	public void setNum(int val) {
		num = val;
	}
	
	public int getNum() {
		return num;
	}
	
	public void display() {
		System.out.println("Number :" + num);
	}
}

class Child2 extends Parent2 {
	private int val;
	public void setVal(int num) {
		val = num;
	}
	
	public int getVal() {
		return val;
	}
	
	public void display() {
		super.display();
		System.out.println("Value :" + val);
	}
}

class CourseMgmt2 {
	public static void main(String[] args) {
		Child2 child;
		
		child = new Child2();
		child.setNum(100);
		child.setVal(200);
		child.display();
	}
	
	//prints 
	//Number : 100
	//Value : 200
}
