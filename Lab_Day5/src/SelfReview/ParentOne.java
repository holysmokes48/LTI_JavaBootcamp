package SelfReview;

public interface ParentOne {
	int pOne=1;
	void printParentOne();

}

interface ParentTwo {
	int pTwo=2;
	void printParentTwo();
}

interface Child extends ParentOne, ParentTwo {
	int child = 3;
	void printChild();
}

class InheritClass implements Child {
	public void printParentOne() {
		System.out.println(pOne);
	}
	public void printParentTwo() {
		System.out.println(pTwo);
	}
	public void printChild() {
		System.out.println(child);
	}
}

class TestInterface {
	public static void main(String args[]) {
		InheritClass inclass = new InheritClass();
		inclass.printParentOne();
		inclass.printParentTwo();
		inclass.printChild();
	}
	
	//Output:
	//1
	//2
	//3
}