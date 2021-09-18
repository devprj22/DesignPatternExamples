package prjAbstractFactory;

public abstract class Pizza {
	
	String name;
	Dough dough;
	Sauce sauce;
	Veggie veggies[];
	Cheese cheese;
	
	// Here the preparation is abstract. In case of factory method,
	// this was defined in the Pizza class itself
	abstract void prepare();
	
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
	
	public void setName(String name) {
		this.name = name;
	}

}
