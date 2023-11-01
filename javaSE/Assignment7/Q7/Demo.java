/*7)
public interface PizzaIngredientFactory
{
	public Dough createDough();
	public Sauce createSauce();
	public Cheese createCheese();
	public Pepperoni createPepperoni();
	public Clams createClams();
}
define 2 implementations 
	USPizzaIngredientFactory and IndianPizzaIngredientFactory

create an array of "PizzaIngredientFactory" , store all the implemenations object inside it, traverse the array and invoke all the methods.
*/

public class Demo
{
	public static void main(String args[])
	{
		PizzaIngredientFactory pizzaIngredientFactory[] = new PizzaIngredientFactory[2];
		pizzaIngredientFactory[0] = new IndianPizzaIngredientFactory();
		pizzaIngredientFactory[1] = new USPizzaIngredientFactory();
		for(int i=0; i<pizzaIngredientFactory.length; i++)
		{
			System.out.println(pizzaIngredientFactory[i].createDough());
			System.out.println(pizzaIngredientFactory[i].createSauce());
			System.out.println(pizzaIngredientFactory[i].createCheese());
			System.out.println(pizzaIngredientFactory[i].createPepperoni());
			System.out.println(pizzaIngredientFactory[i].createClams());
			System.out.println();

		}
	}
}
