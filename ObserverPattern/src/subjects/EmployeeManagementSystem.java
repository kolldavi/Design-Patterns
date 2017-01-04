package subjects;

import java.util.ArrayList;
import java.util.List;

import domain.Employee;
import domain.EmployeeDAO;
import observer.IObserver;

public class EmployeeManagementSystem implements ISubject {

	private Employee employee;
	private String msg;
	private List<IObserver> observers;
	private List<Employee> employees;
	private EmployeeDAO employeeDao;

	public EmployeeManagementSystem(){
		observers = new ArrayList<IObserver>();
		employeeDao  = new EmployeeDAO();
		employees =  employeeDao.generateEmployee();
		
	}
	@Override
	public void registerIObserve(IObserver o) {
		observers.add(o);

	}

	@Override
	public void removeIObserve(IObserver o) {
		observers.remove(o);

	}

	@Override
	public void notiftyIObserve() {
		for (IObserver department : observers) {
			department.callMe(employee, msg);

		}

	}
	public void hireNewEmployee(Employee emp){
		employee = emp;
		msg = "New Hire: ";
		employees.add(emp);
		notiftyIObserve();
	}
	
	public void modifyName(int id, String newName){
		boolean emploeeExsists = false;
		for(Employee emp : employees){
			if(emp.employeeId == id){
				String oldName = emp.getName();
				emp.setName(newName);
				this.employee = emp;
				this.msg = oldName + " Employee Name has been modified to";
				emploeeExsists = true;
			}
		}
		if(emploeeExsists){
			notiftyIObserve();
		}
	}
}
