/*
 *	Shirley Ni
 * 	Wednesday 1/25/2023
 * 	Java and Database Test
 * 
 * 	Question 19: Employee Creation System for new-hires
 */


package Employee;


import java.util.Scanner;

public class EmployeeMain {

public static void main (String[] args) {
		
	Employee emp = new Employee();
	
	//using methods from EmployeeDaoImpl
	EmployeeDao ed = new EmployeeDaoImpl();

		
		for(;;) {
			System.out.println("\n\n\nEmployee Creation System");
			System.out.println("Employee Hire Type:");
			System.out.println("\n1. Permanent Employee \n2.Contracted Employee");
			System.out.println("To get started, Select 1 or 2.");
			
			
			double salary = 0;
			double coverage = 0;
			
			
			//Utilizing Scanner class to receive user input
			Scanner sc = new Scanner(System.in);
			int option = sc.nextInt();
			switch(option) {
				case 1:
					
					//automatically sets Employee hire type based on first selection
					emp.setHireType("Permanent");
					emp.setContrWage(0);
					emp.setNumCerts(0);
					
					System.out.println("\n Enter Employee role (enter PM for Project Manager and TA for Technical Associate)): ");
					emp.setRole(sc.next());
					
					System.out.println("\n Enter Employee ID: ");
					emp.setEmpId(sc.nextInt());
					
					System.out.println("\n Enter Years of Professional Experience: ");
					emp.setYrExp(sc.nextInt());
					
					System.out.println("\n Enter number of Certifications Earned: ");
					emp.setNumCerts(sc.nextInt());
					
					System.out.println("\n Enter Hours Worked: ");
					emp.setHoursWorked(sc.nextInt());
					
					System.out.println("Processing new employee...");
					
					
					if(emp.getRole().equals("PM")) {
						
						//Calculating Project Manager Salary
						salary = ed.permPMsalaryCalc(emp.getYrExp());
						emp.setSalary(salary);
						
						//Calculating Project Manager Mediclaim Coverage
						coverage = ed.insurance(emp.getSalary());
						emp.setInsurance(coverage);
					}
					
					else {
						
						//Calculating Technical Associate Salary
						salary = ed.permTAsalaryCalc(emp.getYrExp(), emp.getNumCerts());
						emp.setSalary(salary);
						
						//Calculating Technical Mediclaim Coverage
						coverage = emp.getSalary();
						emp.setInsurance(coverage);
					}
					
						
					System.out.println("Role: " + emp.getRole());
					System.out.println("Employee ID: " + emp.getEmpId());
					System.out.println("Hire Type: " + emp.getHireType());
					System.out.println("Salary: $" + emp.getSalary());
					System.out.println("Years of Experience: " + emp.getYrExp());
					System.out.println("Mediclaim Coverage: $" + emp.getInsurance());
					System.out.println("Hours Worked: " + emp.getHoursWorked());
					System.out.println("Number of Certifications: " + emp.getNumCerts());
					
					
					break;
					
					
				case 2:
					
					//automatically sets Employee hire type based on first selection
					emp.setHireType("Contracted");
					
					System.out.println("\n Enter Employee role: ");
					emp.setRole(sc.next());
					
					System.out.println("\n Enter Employee ID: ");
					emp.setEmpId(sc.nextInt());
					
					System.out.println("\n Enter Years of Professional Experience: ");
					emp.setYrExp(sc.nextInt());
					
					System.out.println("\n Enter Hours Worked: ");
					emp.setHoursWorked(sc.nextInt());
					
					System.out.println("\n Enter Hourly Wage: ");
					emp.setContrWage(sc.nextInt());
					
					
					System.out.println("\n Enter number of Certifications Earned: ");
					emp.setNumCerts(sc.nextInt());
					
					System.out.println("Processing new employee...");
					
					//Calculating Contracted Employee Salary
					salary = ed.contrSalaryCalc(emp.getHoursWorked(), emp.getContrWage());
					emp.setSalary(salary);
				
					
					
					System.out.println("Role: " + emp.getRole());
					System.out.println("Employee ID: " + emp.getEmpId());
					System.out.println("Hire Type: " + emp.getHireType());
					System.out.println("Years of Experience " + emp.getYrExp());
					System.out.println("Wage: $" + emp.getSalary());
					System.out.println("Hours Worked: " + emp.getHoursWorked());
					
					
					break;
					
				default:
					System.out.println("Invalid Input.");
			}
		
		}
		
	}


}
