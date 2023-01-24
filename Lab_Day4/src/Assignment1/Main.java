package Assignment1;

public class Main {
	public static void main (String[] args) {
		
		Student stud = new Student();
		stud.setStudentId(100);
		stud.setStudentType('B');
		stud.setStudentName("Becky", "Lang");
		stud.setFeesPerMonth(20000.00);
		
		Hostelite hostel = new Hostelite(stud.getStudentId(), stud.getStudentType(), stud.getStudentName(), stud.getFeesPerMonth(), "Draken", 265);
		
				

		System.out.println(hostel.getHostelName());
		System.out.println(hostel.getRoomNumber());
	}
}
