package prjDecorator;

public class Mocha extends CondimentsDecorator {
	
	Beverage baseBeverage;
	
	public Mocha(Beverage beverage) {
		this.baseBeverage = beverage;
	}
	
	@Override 
	public String getDescription() {
		return baseBeverage.getDescription() + ", Mocha";
	}
	
	@Override
	public double cost() {
		return baseBeverage.cost() + .20;
	}

}
