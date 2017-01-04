package domain;

import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {
	Employee emp1 = new Employee("Dave", null, 100000, false);
	Employee emp2 = new Employee("Tom", null, 7000, false);
	Employee emp3 = new Employee("Eric", null, 2000, false);
	Employee emp4 = new Employee("Jason", null, 5500, false);
	Employee emp5 = new Employee("Ken", null, 25000, false);
	List<Employee> employees;

	public List<Employee> generateEmployee() {
		employees = new ArrayList<Employee>();

		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);

		return employees;
	}

	public void addEmployee(Employee emp) {
		employees.add(emp);
	}
}
