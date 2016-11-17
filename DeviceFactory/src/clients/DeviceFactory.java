package clients;
import processes.Factory;
import processes.Laptop;
import processes.SmartPhone;

public class DeviceFactory {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
Factory Iphonefactory  = new SmartPhone("Iphone");
Iphonefactory.launchProcess();
Factory Dellfactory  = new Laptop("Dell");
Dellfactory.launchProcess();
	}
}