
class USPizzaIngredientFactory implements PizzaIngredientFactory
{
	public Dough createDough()
	{
		return new Dough();
	}
	public Sauce createSauce()
	{
		return new Sauce();
	}
	public Cheese createCheese()
	{
		return new Cheese();
	}
	public Pepperoni createPepperoni()
	{
		return new Pepperoni();
	}
	public Clams createClams()
	{
		return new Clams();
	}
}


