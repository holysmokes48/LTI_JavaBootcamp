package Assignment7;

public class DynamicEx {
	public static void main(String[] args) {
		
		DayScholar dayScholar = new DayScholar();
		dayScholar.setStudentId(1001);
		dayScholar.setStudentType('D');
		dayScholar.setStudentName("Thomas");
		dayScholar.setResidentialAddress("No 32/3 Vijayanagar");
		dayScholar.calculateFees();
		//dayScholar.displayDetail();
		System.out.println();
		dayScholar.displayDaysDetails();
	}
}
