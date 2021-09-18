package prjFactoryMethod;

public abstract class PizzaStore {
	
	public Pizza orderPizza(PizzaType type) {
		
		Pizza pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	// This is the FACTORY METHOD that all the deriving
	// classes MUST implement.
	protected abstract Pizza createPizza(PizzaType type);
}
