package pizzaStore;

import pizza.Pizza;
import pizza.chicago.ChicagoStyleCheesePizza;
import pizza.chicago.ChicagoStyleClamPizza;
import pizza.chicago.ChicagoStylePepperoniPizza;
import pizza.chicago.ChicagoStyleVeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	@Override
	Pizza createPizza(String item) {
		if(item.equals("cheese")){
			return new ChicagoStyleCheesePizza();
		}else if(item.equals("pepperoni")){
			return new ChicagoStyleVeggiePizza();
		}else if (item.equals("clam")){
			return new ChicagoStyleClamPizza();
		}else if (item.equals("veggie")){
			return new ChicagoStylePepperoniPizza();
		}else return null;
	}

}
