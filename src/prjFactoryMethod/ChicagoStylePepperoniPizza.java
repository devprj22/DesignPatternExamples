package prjFactoryMethod;

public class ChicagoStylePepperoniPizza extends Pizza {

	public ChicagoStylePepperoniPizza() {
		
		name = "Chicago Style Pepperoni Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Shrimp Sauce";
		
		toppings.add("Grated Parmesan Cheese");
	}
	
	void cut() {
		System.out.println("Cutting the pizza into square slices");
	}
}
