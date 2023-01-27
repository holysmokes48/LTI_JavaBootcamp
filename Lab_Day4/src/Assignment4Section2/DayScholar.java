package Assignment4Section2;

public class DayScholar extends Student{
	private String residentialAddress;
	
	public DayScholar(int studentId, char studentType, String studentName, int semFees, int feesPerMonth, String residentialAddress, String cName) {
		super(studentId, studentType, studentName, semFees, feesPerMonth, cName);
		this.residentialAddress = residentialAddress;
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Student ID: " + this.studentId);
		System.out.println("Student Type: " + this.studentType);
		System.out.println("Student Name: " + this.studentName);
		System.out.println("Semester Fees: " + this.semFees);
		System.out.println("Fees Per Month: " + this.feesPerMonth);
		System.out.println("Residential Address: " + this.residentialAddress);
	}
}
