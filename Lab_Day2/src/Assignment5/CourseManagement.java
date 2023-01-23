//initializing instance variables using default constructors

package Assignment5;

public class CourseManagement {
	
	public static void main (String args[]) {
		Student student = new Student();
		
		System.out.println("Student ID: " + student.getStudentId());
		System.out.println("Student Type: " + student.getStudentType());
		
	}
}
