package Assignment8;

public class Student {
	private int studentId;
	private char studentType;
	private String studentName;
	private String residentialStatus;
	private double feesPerMonth = 0;
	
	
	public void calculateFees(double semesterFees) {
		feesPerMonth = semesterFees / 6.0;
	}
	
	public void calculateFees(double semesterFees, double hostelFees) {
		feesPerMonth = semesterFees / 6.0;
		feesPerMonth = feesPerMonth + hostelFees;
	}
	
	//parameterized constructor
	public Student(int id, char type, String firstName, String lastName) {
		studentId = id;
		studentType = type;
		studentName = firstName + lastName;
	}
	
	//default constructor
	public Student() {
		super();

	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public char getStudentType() {
		return studentType;
	}
	public void setStudentType(char studentType) {
		this.studentType = studentType;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getResidentialStatus() {
		return residentialStatus;
	}
	
	//Invoking setter method for residential status to be either "Day Scholar" or "Hostelite"
	public void setResidentialStatus(String residentialStatus) {
		
		if (residentialStatus.equals("DayScholar") || residentialStatus.equals("Hostelite"))
			this.residentialStatus = residentialStatus;
		
		else
			this.residentialStatus = null;
	}
	public double getFeesPerMonth() {
		return feesPerMonth;
	}
	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	
	


}
