//using this keyword 

package Assignment9;

public class Student {
	
	//student Id starts from 550
	int studentId = 550;
	char studentType;
	String studentName;
	
	//default constructor
	Student () {
		this.studentId++;
	}
	
	//parameterized constructor
	Student(char StudentType, String firstName, String lastName) {
		this.studentType = StudentType;
		this.studentName = firstName + lastName;
	}

	public void displayDetails (Student stu) {
		System.out.println("Student ID: " + studentId);
		System.out.println("Student Type: " + studentType);
		System.out.println("Student Name: " + studentName);
	}
	
	public static void main (String args[]) {
		Student studentOne = new Student('D', "Bony", "Thomas");
		
		studentOne.displayDetails(studentOne);
		
		
	}
	
}
