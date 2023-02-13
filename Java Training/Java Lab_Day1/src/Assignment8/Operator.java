package Assignment8;

public class Operator {
	public static void main(String args[]) {
		
		int intVal = 100;
		byte byteVal = (byte)intVal;
		byte max = 127;
		byte min = -128;
		
		//compilation error due to datatype mismatch
		//unable to convert int to byte
		byte sum = max + min;
		
		
		System.out.println("Sum = " + sum);
	}
}
