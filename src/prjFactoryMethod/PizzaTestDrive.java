package prjFactoryMethod;

public class PizzaTestDrive {
	
	public static void main(String[] args) {
		
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagoStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.createPizza(PizzaType.CHEESE);
		System.out.println("Customer 1 ordered a : " + pizza.getName() + "\n");
		
		pizza = chicagoStore.createPizza(PizzaType.PEPPERONI);
		System.out.println("Customer 2 ordered a : " + pizza.getName() + "\n");	
	}

}
