package client;
import domain.Employee;
import domain.DAO.EmployeeDAO;
import reporting.EmployeeReportFormatter;
import reporting.FormatType;

public class ClientModule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee(1, "Dave", "tech", true);
		ClientModule.hireNewEmployee(emp1);
		printEmployeeReport(emp1,FormatType.CVS);
		ClientModule.terminateNewEmployee(emp1);

	}
	
	public static void hireNewEmployee(Employee emp){
		EmployeeDAO empDAO =   new EmployeeDAO();
		empDAO.saveEmployee(emp);
	}
	public static void terminateNewEmployee(Employee emp){
		EmployeeDAO empDAO =   new EmployeeDAO();
		empDAO.deleteEmployee(emp);
	}
	public static void printEmployeeReport(Employee emp, FormatType f){
		EmployeeReportFormatter formatter  = new EmployeeReportFormatter(emp, f);
		System.out.println(formatter.getFormattedEmployee());
	}

}
