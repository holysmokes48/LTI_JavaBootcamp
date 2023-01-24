//creating multiplication tables based on user input

package Assignment6;

//import java.util.Scanner;
public class UserInput {

    public static void main(String[] args) 
    {
        int number, iterations;
        
        number = Integer.parseInt(args[0]);
        iterations = Integer.parseInt(args[1]);
		
        //for loop stops iterating through each multiple of "number" once (iterations divided number) of times
        for(int i=0; i <= iterations/number; i++)
        {
            System.out.println(number + "*" + i + " = " + number*i );
        }
    }
}
