package Assignment4Section2;

public class CourseRegistration {
	static protected int regId;
	protected String courseName;
	
	CourseRegistration(String cName) {
		courseName = cName;
		//this();
	}
	
	public void displayDetails() {
		System.out.println("Registration Id :" + regId);
		System.out.println("CourseName :" + courseName);
	}
}
