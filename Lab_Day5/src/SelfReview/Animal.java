package SelfReview;

abstract class Animal {
	
	abstract static void testClassMethod();
	
	public void testInstanceMethod() {
		System.out.println("The instance method in Animal.");
	}
}

class cat extends Animal {
	public static void testClassMethod() {
		System.out.println("The class method in Cat.");
	}
	
	public void testInstanceMethod() {
		System.out.println("The instance method in Cat.");
	}

	public static void main(String[] args) {
		Cat myCat = new Cat();
		Animal myAnimal = myCat;
		Animal.testClassMethod();
		myAnimal.testInstanceMethod();
	}
	
	//Output:
	//The class method in Cat.
	//The instance method in Cat.s
	
}
