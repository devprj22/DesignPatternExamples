package prjAbstractFactory;

// Now that the ingredients are differentiated, we do not really
// need New York and Chicago style cheese, we can create one class
// called cheese Pizza.

public class CheesePizza extends Pizza {
	
	PizzaIngredientFactory pizzaIngredientFactory;
	
	public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
		
		this.pizzaIngredientFactory = pizzaIngredientFactory;
	}
	
	@Override
	public void prepare() {
		
		System.out.println("Preparing : " + name);
		dough = pizzaIngredientFactory.createDough();
		sauce = pizzaIngredientFactory.createSauce();
		cheese = pizzaIngredientFactory.createCheese();
		veggies = pizzaIngredientFactory.createVeggies();
	}
}
