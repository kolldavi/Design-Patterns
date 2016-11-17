package processes;

public class Laptop extends Factory {
	public Laptop(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	protected void assembly() {
		System.out.println("ASSEMBLED - LAPTOP");
	}

	protected void testing() {
		System.out.println("TESTING - LAPTOP");
	}

	protected void packaging() {
		System.out.println("PACKAGING - LAPTOP");
	}

	protected void storage() {
		System.out.println("STORING - LAPTOP");
	}
}