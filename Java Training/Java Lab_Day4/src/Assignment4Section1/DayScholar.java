package Assignment4Section1;

public class DayScholar extends Student {
	private String residentialAddress;
	
	public DayScholar(int studentId, char studentType, String studentName, int semFees, int feesPerMonth, String residentialAddress) {
		super(studentId, studentType, studentName, semFees, feesPerMonth);
		this.residentialAddress = residentialAddress;
	}
	
	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	public String getResidentialAddress() {
		return residentialAddress;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("residentialAddress" + residentialAddress);
	}
}
