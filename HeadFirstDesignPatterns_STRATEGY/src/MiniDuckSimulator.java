import flyBehavior.FlyRocketPowered;

public class MiniDuckSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performQuack();
		mallard.performFly();

		System.out.println();

		Duck model = new ModelDuck();
		model.display();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}

}
