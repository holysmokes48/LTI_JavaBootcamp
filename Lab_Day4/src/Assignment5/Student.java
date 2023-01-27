package Assignment5;

public class Student {
	
	private int studentId;
	private char studentType;
	private String studentName;
	
	Student() {
		studentId++;
	}

	public Student(int studentId, char studentType, String studentName) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = studentName;
	}
}
