package courseregistration;

public class Student {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public void setStudentType(char sType) {
		this.studentType = sType; 
	}
	public void setStudentName(String sName) {
		this.studentName = sName;
	}
	public void getDetails() {
		System.out.println("Student ID: " + studentId);
		System.out.println("Student Type: " + studentType);
		System.out.println("Student Name: " + studentName);
	}
}
