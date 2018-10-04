package sort;

import java.util.Comparator;

public class Fruit implements Comparable<Fruit>{
	String name;
	int price;
	
	Fruit(String name, int price){
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public int compareTo(Fruit f) {
		// TODO Auto-generated method stub
		// ASC price
		return this.price - f.price;
		// DESC price
		// return f.price - this.price;
	}
	
	@Override
	public String toString(){
		return String.format("name: %s | price: %d ", this.getName(), this.getPrice());
	}
	
	
}
