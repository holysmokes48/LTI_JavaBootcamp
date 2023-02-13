package Assignment8;

public class StudentMain {
	public static void main (String[] args) {
		Student student = new Student();
		int hostelFees = 0;
		int semesterFees = 0;
		String hostelStatus = "Hostelite";
		String scholarStatus = "DayScholar";
		
		student.setStudentId(Integer.parseInt(args[0]));
		student.setStudentName(args[1]);
		student.setResidentialStatus(args[2]);
		
		//Testing if setResidentialStatus is being properly invoked
		//System.out.println(student.getResidentialStatus());
		
		semesterFees = Integer.parseInt(args[3]);
		//Testing purposes: checking for input of semesterFees
		//System.out.println("Semester fees: " + semesterFees);
		
		hostelFees = Integer.parseInt(args[4]);
		//Testing purposes: checking for input of hostelFees
		//System.out.println("Hostel fees: " + hostelFees);
		
		System.out.println("Student Info:");
		System.out.println("Student id: " + student.getStudentId());
		System.out.println("Student Name: " + student.getStudentName());
		System.out.println("Residential Status: " + student.getResidentialStatus());
		
		//compare command argument residential status is Hostelite
		if (hostelStatus.equals(student.getResidentialStatus())) {
			student.calculateFees(semesterFees, hostelFees);
			System.out.println("Total Fees: " + student.getFeesPerMonth());

		}
		
		//compare command argument residential status is DayScholar
		else if (scholarStatus.equals(student.getResidentialStatus())) {
			student.calculateFees(semesterFees);
			System.out.println("Total Fees: " + student.getFeesPerMonth());
		}
		
		//if neither, perform no calculations
		else {
			System.out.println("Total Fees: " + student.getFeesPerMonth());
		}
			
	}

}
