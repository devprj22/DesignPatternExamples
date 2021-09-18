package prjAbstractFactory;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {

	@Override
	public Dough createDough() {
		return new ChichagoStyleDough();
	}

	@Override
	public Sauce createSauce() {
		return new ShrimpSauce();
	}

	@Override
	public Cheese createCheese() {
		return new ShreddedMozzarellaCheese();
	}

	@Override
	public Veggie[] createVeggies() {
		
		Veggie veggies[] = {new Lettuce()};
		return veggies;
	}

}
