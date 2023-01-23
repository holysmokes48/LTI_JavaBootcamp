// Using a default constructor 

package Assignment5;

public class Student {
	
	public int studentId;
	public char studentType;

	
	// default constructor
	public Student() {
		studentId = 10;
		studentType = 'F';
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

}
