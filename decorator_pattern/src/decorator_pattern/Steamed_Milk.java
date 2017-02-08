package decorator_pattern;

public class Steamed_Milk extends CondimentDecorator{

	Beverage beverage;
	
	public Steamed_Milk(Beverage beverage){
		this.beverage = beverage;
	}
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return beverage.getDescription() + ", Steamed Milk";
	}

	@Override
	public double cost() {
		// TODO Auto-generated method stub
		double cost = beverage.cost(); 
		if (getSize() == Size.TALL) {
			cost += .10;
			} else if (getSize() == Size.GRANDEE) {
			cost += .15;
			} else if (getSize() == Size.VENTIE) {
			cost += .20; 
			}
			return cost;
	}
	@Override
	public Size getSize() {
		// TODO Auto-generated method stub
		return beverage.getSize();
	}

}