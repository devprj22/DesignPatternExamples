package prjAbstractFactory;

public class NYPizzaStore extends PizzaStore {
	
	@Override
	public Pizza createPizza(PizzaType type) {
		
		Pizza pizza = null;
		
		 if (type == PizzaType.CHEESE) {
			 pizza = new CheesePizza(new NYPPizzaIngredientFactory());
		 }
		 
		 // Similarly for other types
		
		 return  pizza;
	}

}
