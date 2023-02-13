package Assignment1;


public class Hostelite extends Student {
	private String hostelName;
	private int roomNumber;
	
	
	
	public Hostelite(int studentId, char studentType, String studentName, double feesPerMonth, String hostelName, int roomNumber) {
		//accessing parent class members
		super(studentId, studentType, studentName, hostelName, feesPerMonth);
		this.hostelName = hostelName;
		this.roomNumber = roomNumber;
		
	}
	public Hostelite() {
		super();
		
	}
	public String getHostelName() {
		return hostelName;
	}
	
	public int getRoomNumber() {
		return roomNumber;
	}

}
