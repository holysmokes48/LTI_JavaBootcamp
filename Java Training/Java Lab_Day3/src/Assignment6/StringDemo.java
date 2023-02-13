//part 2 of Assignment 6


package Assignment6;

public class StringDemo {
	public static void main (String[] args) {
		String username = "sammy123";
		
		
		//converts username to uppercase
		System.out.println("Uppercase version of " + username + ": " +  username.toUpperCase());
		
		//checks if username starts with an 'a'
		System.out.println("Does " + username + " start with an 'a'? " + username.startsWith("a"));   
		
		//replaces username as seed
		username = "SEED";
		System.out.println("Username is now: " + username);
	}

}
