package Assignment7;

public class Student {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected final int semesterFees = 12000;
	protected int feesPerMonth;
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void calculateFees() {
		feesPerMonth = semesterFees / 6;
	}
	
	public void displayDetail() {
		System.out.println("Student ID: " + studentId);
		System.out.println("Student Type: " + studentType);
		System.out.println("Student Name: " + studentName);
		System.out.println("Student Fees/Month: " + feesPerMonth);
	}
}
