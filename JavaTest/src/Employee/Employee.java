package Employee;

/*
 *	Shirley Ni
 * 	Wednesday 1/25/2023
 * 	Java and Database Test
 * 
 * 	Question 19: Employee Creation System for new-hires
 */

public class Employee {
	//variables created based on information inputed into the system for new hire employees
	
	private int EmpId = 0;
	private double insurance = 0;		//mediclaim coverage for Permanent Employees

	private String HireType = null;
	private int hoursWorked = 0;
	private int yrExp = 0;
	private int numCerts = 0;
	private double contrWage = 0;  // hourly wage for Contracted Employees
	private double salary = 0;
	private String role;
	
	

	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public double getInsurance() {
		return insurance;
	}
	public void setInsurance(double insurance) {
		this.insurance = insurance;
	}
	public String getHireType() {
		return HireType;
	}
	public void setHireType(String hireType) {
		HireType = hireType;
	}
	public int getHoursWorked() {
		return hoursWorked;
	}
	public void setHoursWorked(int hoursWorked) {
		this.hoursWorked = hoursWorked;
	}
	public int getYrExp() {
		return yrExp;
	}
	public void setYrExp(int yrExp) {
		this.yrExp = yrExp;
	}
	public int getNumCerts() {
		return numCerts;
	}
	public void setNumCerts(int numCerts) {
		this.numCerts = numCerts;
	}
	public double getContrWage() {
		return contrWage;
	}
	public void setContrWage(double contrWage) {
		this.contrWage = contrWage;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public Employee(int empId, int insurance, String hireType, int hoursWorked, int yrExp, int numCerts,
			double contrWage, int salary, String role) {
		super();
		EmpId = empId;
		this.insurance = insurance;
		HireType = hireType;
		this.hoursWorked = hoursWorked;
		this.yrExp = yrExp;
		this.numCerts = numCerts;
		this.contrWage = contrWage;
		this.salary = salary;
		this.role = role;
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", insurance=" + insurance + ", HireType=" + HireType + ", hoursWorked="
				+ hoursWorked + ", yrExp=" + yrExp + ", numCerts=" + numCerts + ", contrWage=" + contrWage + ", salary="
				+ salary + ", role=" + role + "]";
	}
	
	
	//default constructor
	public Employee() {

		
	}

	
}
