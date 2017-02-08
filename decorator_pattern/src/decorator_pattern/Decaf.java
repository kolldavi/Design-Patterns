package decorator_pattern;


public class Decaf extends Beverage {

	 public Decaf() {
		description ="Decaf Coffee";
	}
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 1.05;
	}

}
