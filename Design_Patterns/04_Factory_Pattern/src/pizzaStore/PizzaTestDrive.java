package pizzaStore;

import pizza.Pizza;

public class PizzaTestDrive {
	public static void main(String[] args){
		PizzaStore nyStore = new NYPizzaStore();
		PizzaStore chicagostore = new ChicagoPizzaStore();
		
		Pizza pizza = nyStore.orderPizza("cheese");
		System.out.println("A ordered a "+pizza.getName() +"\n");
		
		Pizza pizza2 = chicagostore.orderPizza("cheese");
		System.out.println("B ordered a "+pizza2.getName() + "\n");
	}
}
