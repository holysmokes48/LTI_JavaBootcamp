package Assignment4Section2;

public class Student extends CourseRegistration{
	protected int studentId;
	protected char studentType;
	protected String studentName;
	protected int semFees;
	protected int feesPerMonth;
	
	public Student(int studentId, String cName) {
		super(cName);
		this.studentId = studentId;
	}

	public Student(int studentId, char studentType, String studentName, int semFees, int feesPerMonth, String cName) {
		super(cName);
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
	
	public int getSemFees() {
		return semFees;
	}
	
	public void setSemFees(int semFees) {
		this.semFees = semFees;
	}
}
