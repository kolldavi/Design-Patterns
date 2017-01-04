package clients;

import domain.Employee;
import observer.HRDepartment;
import observer.IObserver;
import observer.PayrollDepartment;
import subjects.EmployeeManagementSystem;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IObserver hrDepartment = new HRDepartment();
		IObserver payrollDepartment = new PayrollDepartment();
		
		EmployeeManagementSystem ems = new EmployeeManagementSystem();
		
		ems.registerIObserve(hrDepartment);
		ems.registerIObserve(payrollDepartment);
		Employee bob = new Employee("Bob", null, 25000, false);
		
		ems.hireNewEmployee(bob);
		ems.modifyName(6, "Ted");
	}

}
