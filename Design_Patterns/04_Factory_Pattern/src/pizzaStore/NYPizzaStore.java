package pizzaStore;

import pizza.Pizza;
import pizza.newyork.NYStyleCheesePizza;
import pizza.newyork.NYStyleClamPizza;
import pizza.newyork.NYStylePepperoniPizza;
import pizza.newyork.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore{
	@Override
	public Pizza createPizza(String item) {
		if(item.equals("cheese")){
			return new NYStyleCheesePizza();
		}else if(item.equals("pepperoni")){
			return new NYStyleVeggiePizza();
		}else if (item.equals("clam")){
			return new NYStyleClamPizza();
		}else if (item.equals("veggie")){
			return new NYStylePepperoniPizza();
		}else return null;
	}
}
