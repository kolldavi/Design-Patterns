package subjects;
import observer.IObserver;

public interface ISubject {

	public  void registerIObserve(IObserver o);
	public void removeIObserve(IObserver o);
	public void notiftyIObserve();
}
