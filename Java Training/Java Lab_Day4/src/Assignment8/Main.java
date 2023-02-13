package Assignment8;

public class Main {
	public static void main(String[] args) {
		Student student;
		if(args[0].equals("H")) {
			student = new Hostelite(200, 'C', "Cally", 870, "Motel 11", 415);
		}
		else {
			student = new DayScholar(90, 'K', "Sam", 100, "696 Sweet Rd");
		}
		student.calculateFees(1200.0);
		student.displayStudentDetails();
	}

}
