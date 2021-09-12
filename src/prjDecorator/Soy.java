package prjDecorator;

public class Soy extends CondimentsDecorator {
	
	Beverage baseBeverage;
	
	public Soy(Beverage beverage) {
		this.baseBeverage = beverage;
	}
	
	@Override 
	public String getDescription() {
		return baseBeverage.getDescription() + ", Soy";
	}
	
	@Override
	public double cost() {
		return baseBeverage.cost() + .36;
	}

}
