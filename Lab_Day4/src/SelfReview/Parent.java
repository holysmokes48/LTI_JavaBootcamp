package SelfReview;

public class Parent {
	
	//changed num variable to protected to be able to allow child class to access parent variable
	//private int num;
	protected int num;
	
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

class Child extends Parent {
	private int val;
	public void setVal(int num) {
		val = num;
	}
	
	public int getVal() {
		return val;
	}
	
	public void display() {
		System.out.println("Number :" + num);
		System.out.println("Value :" + val);
	}
}

class CourseMgmt {
	public static void main(String[] args) {
		Child child;
		
		child = new Child();
		child.setNum(100);
		child.setVal(200);
		child.display();
	}
	
	//prints 
	//Number : 100
	//Value : 200
}
