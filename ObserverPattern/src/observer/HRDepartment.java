package observer;

import domain.Employee;

public class HRDepartment implements IObserver{

	

	@Override
	public void callMe(Employee emp, String msg) {
		// TODO Auto-generated method stub
		System.out.println("HR Department Notified...");
		System.out.println(msg +" " + emp.getName());
	}

}
