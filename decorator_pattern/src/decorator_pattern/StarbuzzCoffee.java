package decorator_pattern;

import decorator_pattern.Beverage.Size;

public class StarbuzzCoffee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost()); 
		Beverage beverage2 = new DarkRoast();
		beverage2.setSize(Size.GRANDEE);
		System.out.printf(beverage2.getDescription() +"$%.2f\n", + beverage2.cost());
		beverage2 = new Mocha(beverage2); 
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.printf(beverage2.getDescription() +"$%.2f\n", + beverage2.cost());
		Beverage beverage3 = new HouseBlend();
		beverage3.setSize(Size.GRANDEE);
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.printf(beverage3.getDescription() +"$%.2f\n", + beverage3.cost());
	}

}
