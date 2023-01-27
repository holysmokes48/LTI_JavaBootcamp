package Assignment7;

public class DayScholar extends Student {
	private String residentialAddress;
	
	public DayScholar() {
		super();
	}
	
	public DayScholar(int studentId, char studentType, String studentName, int semesterFees, String residentialAddress) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = studentName;
		this.residentialAddress = residentialAddress;
	}



	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	
	public void displayDaysDetails() {
		System.out.println("Student ID: " + studentId);
		System.out.println("Student Type: " + studentType);
		System.out.println("Student Name: " + studentName);
		System.out.println("Student Fees/Month: " + feesPerMonth);
		System.out.println("Residential Address:" + residentialAddress);
	}
}
