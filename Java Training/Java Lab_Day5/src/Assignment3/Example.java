package Assignment3;

public class Example implements InterOne {

	@Override
	public void methodOne() {
		
		//cannot make varTwo variable assignment
		//java interface variables are static because java interfaces cannot be instantiated
		//varTwo = varTwo + 10;
		System.out.println("Value of varTwo: " + varTwo);
		System.out.println("Good Morning");
	}

	@Override
	public void methodTwo() {
		System.out.println("Good Afternoon");
	}
	
}
