package prjFactoryMethod;

public class ChicagoPizzaStore extends PizzaStore {
	
	@Override
	public Pizza createPizza(PizzaType type) {
		if (type == PizzaType.CHEESE)
			return new ChicagoStyleCheesePizza();
		else if (type == PizzaType.PEPPERONI)
			return new ChicagoStylePepperoniPizza();
		else
			return null;
	}
	
}
