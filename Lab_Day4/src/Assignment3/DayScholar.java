package Assignment3;

public class DayScholar extends Student {
	private String residentialAddress;
	
	public DayScholar(int studentId, char studentType, String studentName, double feesPerMonth, String residentialAddress) {
		super(studentId, studentType, studentName, feesPerMonth);
		this.residentialAddress = residentialAddress;
	}
	
	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	public String getResidentialAddress() {
		return residentialAddress;
	}
	
	public void displayStudentDetails() {
		super.displayStudentDetails();
		System.out.println("residentialAddress=" + residentialAddress);
	}
}
