package courseregistration;

public class PackageEx {
	public static void main(String args[]) {
		Student student = new Student();
		student.setStudentId(1001);
		student.setStudentType('D');
		student.setStudentName("Thomas");
		student.getDetails();
	}
}
