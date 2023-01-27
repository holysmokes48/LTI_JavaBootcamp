package Assignment2;

public class Main {
	public static void main (String[] args) {
		
		
		Hostelite hostel = new Hostelite(101, 'A', "Kobe", 910, "Holiday Inn", 312);
		
				
					
		System.out.println(hostel.getHostelName());
		System.out.println(hostel.getRoomNumber());
		System.out.println(hostel.getStudentId());
		System.out.println(hostel.getStudentType());
		System.out.println(hostel.getStudentName());
		System.out.println(hostel.getFeesPerMonth());
	}
}
