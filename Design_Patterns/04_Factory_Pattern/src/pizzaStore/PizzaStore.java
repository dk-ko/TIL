package pizzaStore;

import pizza.Pizza;

public abstract class PizzaStore {
//	SimplePizzaFactory factory;
//	
//	public PizzaStore(SimplePizzaFactory factory){
//		this.factory = factory;
//	}
	
	public Pizza orderPizza(String type) {
		Pizza pizza;
		
		// SimpleFactory 클래스 이용 시 사용 
		// pizza = factory.createPizza(type);
		
		// Pactory Pattern
		pizza = createPizza(type);
		
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		
		return pizza;
	}
	
	// factory 객체 대신 사용 
	abstract Pizza createPizza(String item);
}
