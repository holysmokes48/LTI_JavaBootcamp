package CaseStudy3Day2;

public class AutoGenerate {
	
	public static void main(String[] args) {
		
		//String conversion of YYYXNNNZZZ to ticket number
		//115T is first part of ticket number 
		//based on info that is not included in the chart
		
		
		StringBuilder input = new StringBuilder("115T");
		
		
		char key = input.charAt(3);
		
		//Case 1
		if(key == 'F') {
			input.append("1020001");
		}
		
		//Case 2
		else if(key == 'T') {
			input.append("2020002");
		}
		
		//Case 3
		else {
			input.append("3040003");
		}
		System.out.println(input.toString());
	}
}
