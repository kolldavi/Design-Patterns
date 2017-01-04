package observer;

import domain.Employee;

public class PayrollDepartment implements IObserver{


	@Override
	public void callMe(Employee emp, String msg) {
		// TODO Auto-generated method stub
		System.out.println("Payroll Notified...");
		System.out.println(msg +" " + emp.getName());
	}

}
