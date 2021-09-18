package prjAbstractFactory;

public class ChicagoPizzaStore extends PizzaStore {
	
	@Override
	public Pizza createPizza(PizzaType type) {
		
		Pizza pizza = null;
		
		 if (type == PizzaType.CHEESE) {
			 pizza = new CheesePizza(new ChicagoPizzaIngredientFactory());
		 }
		 
		 // Similarly for other types
		
		 return  pizza;
	}

}
