package domain.DAO;
import domain.Employee;

public class EmployeeDAO {
	public void saveEmployee(Employee emp){
		System.out.println("Save "+ emp.getName());
	
	}
	public void deleteEmployee(Employee emp){
		System.out.println("Delete "+ emp.getName());
	}

}
