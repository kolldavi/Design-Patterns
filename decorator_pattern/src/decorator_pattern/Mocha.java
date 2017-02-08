package decorator_pattern;

public class Mocha extends CondimentDecorator{
	Beverage beverage;
	
	public Mocha(Beverage beverage){
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Mocha";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double cost = beverage.cost(); 
		if (getSize() == Size.TALL) {
			cost += .1;
			} else if (getSize() == Size.GRANDEE) {
			cost += .15;
			} else if (getSize() == Size.VENTIE) {
			cost += .2; }
			return cost;
	}
	@Override
	public Size getSize() {
		// TODO Auto-generated method stub
		return beverage.getSize();
	}

}
