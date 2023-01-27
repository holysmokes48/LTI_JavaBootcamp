package Assignment4Section1;

public class Student {
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected int semFees;
	protected int feesPerMonth;
	
	public Student(int studentId) {
		this.studentId = studentId;
	}

	public Student(int studentId, char studentType, String studentName, int semFees, int feesPerMonth) {
		this(studentId);
		this.studentType = studentType;
		this.studentName = studentName;
		this.semFees = semFees;
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

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(int feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}
	
	public void displayDetails() {
		System.out.println("studentId=" + studentId);
		System.out.println("studentType=" + studentType);
		System.out.println("studentName=" + studentName);
		System.out.println("semFees=" + semFees);
		System.out.println("feesPerMonth=" + feesPerMonth);
	}
}
