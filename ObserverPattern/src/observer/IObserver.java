package observer;

import domain.Employee;

public interface IObserver {
	public void callMe(Employee emp, String msg);

}
