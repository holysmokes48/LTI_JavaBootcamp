package CaseStudy1;

public class MinAccountBalValidation {
	public static void main(String[] args) {
		
		
		Account act = new Account();
		act.setAccAmount(5000);
		
		if(act.getAccAmount() < 500) {
			System.out.println("The balance is below minimum value");
		}
		else {
			System.out.println(act.getAccAmount());
		}
	}
}
