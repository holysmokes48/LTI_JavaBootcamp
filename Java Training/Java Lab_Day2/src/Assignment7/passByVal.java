//Passing by Value and Reference

package Assignment7;

public class passByVal {
	
	public static void main (String args[]) {
		int sId = 15;
		passByVal val = new passByVal();
		System.out.println(sId);
		
		//prints sId as 10
		val.passTheValueMethod(sId);
		
		//prints sId as 15
		System.out.println("The sId are " + sId);
	}
	

	
	
	public void passTheValueMethod(int sId) {
		sId = 10;
		System.out.println("The sId are " + sId);
	}

}
