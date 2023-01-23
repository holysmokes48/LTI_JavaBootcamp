// Using a default constructor 

package Assignment4;

public class Student {
	
	int studentId;
	char studentType;
	String firstName;
	String lastName;
	String StudentName;

	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String firstName, String lastName) {
		StudentName = this.firstName + this.lastName;
	}
	
	
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
