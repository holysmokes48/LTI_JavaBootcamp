package SelfReview;

public class Parent3 {
	
	private int num;
	
	Parent3(int num) {
		this.num = num;
	}
	
	public int getNum() {
		return num;
	}
}

class Child3 extends Parent3 {
	private int val;

	Child3 (int num, int val) {
		//to invoke superclass constructor
		super(num);
		this.val = val;
	}
	
	public int getVal() {
		return val;
	}
}

class CourseMgmt3 {
	public static void main(String[] args) {
		Child3 child;
		
		child = new Child3(100, 200);
		System.out.println("Parent: Num:" + child.getNum());
		System.out.println("Child: Val:" + child.getVal());
	}
	
	//prints 
	//Parent: Num: 100	
	//Child: Val: 200
}
