package Assignment5;

public class DayScholar extends PostGradStudent{
	private String residentialAddress;
	private double fees = 0;

	public DayScholar(int postCourseId, String postCourseName, int postCourseFees, int studentId, char studentType, String studentName, String residentialAddress) {
		super(postCourseId, postCourseName, postCourseFees, studentId, studentType, studentName);
		this.residentialAddress = residentialAddress;
	}
	
	public void calculateFees() {
		fees = this.getPostCourseFees()/ 6;
	}
	
	public double getFees() {
		return fees;
	}
	
	public static void main(String[] args) {
		DayScholar dayscholar = new DayScholar(5, "OOP", 16000, 1001, 'D', "Manu", "NO 21/2 Vijayanagar");
		System.out.println(dayscholar.getPostCourseId());
		System.out.println(dayscholar.getPostCourseName());
		dayscholar.calculateFees();
		System.out.println(dayscholar.getFees());
	}
}
