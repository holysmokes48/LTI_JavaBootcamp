// Program to understand local variables and literals

package Assignment5;

public class Variable {
	public static void main (String args[]) {
		
		//previously local variable intVal was not initialized, so it lead to compilation error
		int intVal = 1000; 
		float floatVal = 250.5f;
		double doubleVal = 2500.5;
		boolean boolVal = true;
		
		System.out.println("Integer\t:" + intVal + "\nFloat\t:" + floatVal + "\nDouble\t:" + doubleVal + "\nBoolean\t:" + boolVal);
	}

}
