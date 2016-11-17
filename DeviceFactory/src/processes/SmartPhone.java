package processes;

public class SmartPhone extends Factory{
	public SmartPhone(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}


	protected void assembly() {
		System.out.println("ASSEMBLED - SmartPhone");
	}

	protected void testing() {
		System.out.println("TESTING - SmartPhone");
	}

	protected void packaging() {
		System.out.println("PACKAGING - SmartPhone");
	}

	protected void storage() {
		System.out.println("STORING - SmartPhone");
	}
}
