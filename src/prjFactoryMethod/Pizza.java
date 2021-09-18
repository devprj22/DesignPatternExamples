package prjFactoryMethod;

import java.util.ArrayList;

// This is the interface (super type) on which both the high and low level
// components will depend.

public abstract class Pizza {
	
	String name;
	String dough;
	String sauce;
	
	ArrayList<String> toppings = new ArrayList<String>();
	
	void prepare()
	{
		System.out.println("Preparing :" + name);
		System.out.println("Tossing dough... ");
		System.out.println("Adding Sauce... ");
		System.out.println("Adding Toppings: ");
		
		for (String topping : toppings) {
			System.out.println("  " + topping);
		}
	}
	
	void bake() {
		System.out.println("Bake for 25 minutes at 350");
	}
	
	void cut() {
		System.out.println("Cutting the pizza in diagonal slices");
	}
	
	void box() {
		System.out.println("Place pizza in official Pizzastore box");
	}
	
	public String getName() {
		return name;
	}
	
}
