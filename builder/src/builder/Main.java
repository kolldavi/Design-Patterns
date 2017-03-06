package builder;

public class Main {

	public static void main(String[] args) {
		// create care using builder
		Vehicle car = new Vehicle.Builder()
				.doors(4)
				.color("red")
				.make("Ford")
				.model("Focus")
				.price(20000)
				.type("car")
				.horsepower(350)
				.build();
		
		System.out.println(car.toString());
	}

}
