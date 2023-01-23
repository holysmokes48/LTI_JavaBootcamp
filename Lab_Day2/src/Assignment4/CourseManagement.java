//utilizing getters and setters to insert and retrieve data

package Assignment4;

public class CourseManagement {
	
	public static void main (String args[]) {
		Student student = new Student();
		
		student.setStudentId(10);
		student.setStudentType('F');
		
		System.out.println("Student ID: " + student.getStudentId());
		System.out.println("Student Type: " + student.getStudentType());
		
	}
}
