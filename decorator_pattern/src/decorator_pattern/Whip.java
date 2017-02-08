package decorator_pattern;


public class Whip extends CondimentDecorator{
	Beverage beverage;
	
	public Whip(Beverage beverage){
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Whip";
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
