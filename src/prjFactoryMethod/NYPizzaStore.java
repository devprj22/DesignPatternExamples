package prjFactoryMethod;

public class NYPizzaStore extends PizzaStore {
	
	@Override
	public Pizza createPizza(PizzaType type) {
		if (type == PizzaType.CHEESE)
			return new NYStyleCheesePizza();
		else if (type == PizzaType.PEPPERONI)
			return new NYStylePepperoniPizza();
		else
			return null;
	}

}
