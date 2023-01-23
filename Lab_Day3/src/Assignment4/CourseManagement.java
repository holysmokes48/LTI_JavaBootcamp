//initializing instance variables using default constructors

package Assignment4;

public class CourseManagement {
	
	public static void main (String args[]) {
		Student student = new Student();
		
		student.setFirstName("Sally");
		student.setLastName("Hansen");

		
		System.out.println("Student ID: " + student.getStudentId());
		System.out.println("Student Type: " + student.getStudentType());
		System.out.println("Student Name: " + student.getStudentName());
		
	}
}
