package prjAbstractFactory;

public class NYPPizzaIngredientFactory implements PizzaIngredientFactory {
	
	@Override
	public Dough createDough() {
		return new NYStyleDough();
	}
	
	@Override
	public Sauce createSauce() {
		return new PlumTomatoSauce();
	}
	
	@Override
	public Cheese createCheese() {
		return new GratedReggianoCheese();
	}

	@Override
	public Veggie[] createVeggies() {
		Veggie veggies[] = {new Lettuce(), new Onion()}; 
		return veggies;
	}

}
