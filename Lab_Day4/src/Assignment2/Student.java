package Assignment2;

public class Student {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected double feesPerMonth;
	
	//default constructor
	public Student() {
		this.studentName = studentName;
	}
	
	//parameterized constructor
	public Student(int id, char type, String firstName, String lastName, double feesPerMonth) {
		super();
		this.studentId = id;
		this.studentType = type;
		this.studentName = firstName + lastName;
		this.feesPerMonth = feesPerMonth;
		
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
	public void setStudentName(String firstName, String lastName) {
		this.studentName = firstName + lastName;
	}
	public double getFeesPerMonth() {
		return feesPerMonth;
	}
	public void setFeesPerMonth(double feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	
	

}
