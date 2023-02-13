/*
 *	Shirley Ni
 * 	Wednesday 1/25/2023
 * 	Java and Database Test
 * 
 * 	Question 19: Employee Creation System for new-hires
 */

package Employee;

public interface EmployeeDao {

	public int permPMsalaryCalc(int years); 				//Permanent Project Manager Salary
	public int permTAsalaryCalc(int years, int certs);  	//Permanent Technical Associate Salary
	
	public double contrSalaryCalc(int hours, double wage);	//Contracted Technical Associate Salary

	public double insurance (double salary);


}
