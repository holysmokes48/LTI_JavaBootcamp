/*
 *	Shirley Ni
 * 	Wednesday 1/25/2023
 * 	Java and Database Test
 * 
 * 	Question 19: Employee Creation System for new-hires
 */
package Employee;

public class EmployeeDaoImpl implements EmployeeDao {
	
	//Calculates Project Manager Salary
	@Override
	public int permPMsalaryCalc(int years) {
		return (10000 * years);
	}
	
	
	
	//Calculates Permanent Technical Associate Salary
	@Override
	public int permTAsalaryCalc(int years, int certs) {
		return ((5000 * years) + (1000 * certs)) ;
	}
	
	
	
	//Calculates Contracted Technical Associate Salary
	@Override
	public double contrSalaryCalc(int hours, double wage) {
		double salary = 0;
		
		//working regular hours
		if(hours <= 40) {
			salary = wage * hours;
		}
		
		//working overtime hours
		else {
			salary = (40 * wage) + (hours - 40) * wage * 2;
		}
		return salary;
	}
	
	

	@Override
	public double insurance(double salary) {
		
		return (salary * 2);
	}
	
}
