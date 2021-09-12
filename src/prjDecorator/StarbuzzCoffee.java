package prjDecorator;

public class StarbuzzCoffee {
	
	public static void main(String[] args) {
		Beverage baseEspressoBeverage = new Espresso();
		Beverage baseHouseBlendBeverage = new HouseBlend();
		
		System.out.println(baseEspressoBeverage.getDescription() + " $" + baseEspressoBeverage.cost());
		
		baseHouseBlendBeverage = new Mocha(baseHouseBlendBeverage);
		baseHouseBlendBeverage = new Mocha(baseHouseBlendBeverage);
		baseHouseBlendBeverage = new Soy(baseHouseBlendBeverage);
		
		System.out.println(baseHouseBlendBeverage.getDescription() + " $" + baseHouseBlendBeverage.cost());
	}
}
