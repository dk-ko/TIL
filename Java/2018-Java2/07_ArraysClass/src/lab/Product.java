package lab;

public class Product implements Comparable<Product>{
	private String name;
	private int price;
	
	Product(){
		this.name = null;
		this.price = 0;
	}
	
	Product (int price){
		this.name = null;
		this.price = price;
	}
	
	Product (String name){
		this.name = name;
		this.price = 0;
	}
	
	Product (String name, int price){
		this.name = name;
		this.price = price;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setPrice(int price){
		this.price = price;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	@Override
	public int compareTo(Product p){
		// ASC price
		return this.price - ((Product) p).getPrice();
	}
	
	@Override
	public String toString(){
		return String.format("name: %s | price: %d\n", this.name, this.price);
	}
}
