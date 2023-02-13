package Assignment6;

public class DayScholar extends Student {
	private String residentialAddress;
	
	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	public void getDetails() {
		super.getDetails();
		System.out.println("Student Name: " + studentName);
		System.out.println("Residential Address:" + residentialAddress);
	}
}
