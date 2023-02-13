package CaseStudy2Day2;

public class Demo {
	public static void main(String[] args) {
		Travel tv = new Travel();
		tv.setModeOfTravel('T');
		tv.setNoOfTickets(3);
		
		if(tv.getModeOfTravel() == 'F') {
			tv.setAmount(tv.getNoOfTickets() * 500);
			System.out.println("Flight Cost: " + tv.getAmount());
		}
		else if(tv.getModeOfTravel() == 'T') {
			tv.setAmount(tv.getNoOfTickets() * 100);
			System.out.println("Train Cost: " + tv.getAmount());
		}
		else {
			tv.setAmount(tv.getNoOfTickets() * 50);
			System.out.println("Bus Cost: " + tv.getAmount());
		}
	}
}
