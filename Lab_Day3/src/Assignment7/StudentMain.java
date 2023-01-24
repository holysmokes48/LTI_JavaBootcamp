package Assignment7;

public class StudentMain {
	public static void main (String[] args) {
		Student student = new Student();
		int hostelFees = 0;
		int semesterFees = 0;
		int totalFees = 0;
		String hostelStatus = "Hostelite";
		
		student.setStudentId(Integer.parseInt(args[0]));
		student.setStudentName(args[1]);
		student.setResidentialStatus(args[2]);
		
		semesterFees = Integer.parseInt(args[3]);
		//Testing purposes: checking for input of semesterFees
		//System.out.println("Semester fees: " + semesterFees);
		
		hostelFees = Integer.parseInt(args[4]);
		//Testing purposes: checking for input of hostelFees
		//System.out.println("Hostel fees: " + hostelFees);
		
		//only adds Hostel fees to Total fees if student is of "Hostelite" residential status
		if (hostelStatus.equals(student.getResidentialStatus())) {
			totalFees = semesterFees + hostelFees;
			student.setFeesPerMonth(totalFees);
			
			//Testing purposes: checking if right values are being added
			//System.out.println("total fees: " + totalFees);
		}
		
		else {
			totalFees = semesterFees;
			student.setFeesPerMonth(totalFees);
			

			//Testing purposes: checking if right values are being added
			//System.out.println("total fees: " + totalFees);
			
			
		}
			
		System.out.println("Student Info:");
		System.out.println("Student id: " + student.getStudentId());
		System.out.println("Student Name: " + student.getStudentName());
		System.out.println("Residential Status: " + student.getResidentialStatus());
		System.out.println("Total Fees: " + student.getFeesPerMonth());
		
	}

}
