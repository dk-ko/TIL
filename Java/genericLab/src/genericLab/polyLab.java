package genericLab;

import java.util.ArrayList;

class Product{
	String name="Product";
	
	public String getName(){
		return this.name;
	}
}
class Tv extends Product{
	String name="Tv";
	int channel;
	
	@Override
	public String getName(){
		return this.name;
	}
}
class Audio extends Product{
	String name="Audio";
	int sound;
	
	@Override
	public String getName(){
		return this.name;
	}
}

public class polyLab {
	
	public static void printAll(ArrayList<? extends Product> list){
		for(Product u:list){
			System.out.println(u.getName());
		}
	}
	
	public static void main(String[] args){
		ArrayList<Product> list = new ArrayList<Product>();
		
		list.add(new Product());
		list.add(new Tv());
		list.add(new Audio());
	
		//Product p = list.get(0);
		//Tv t = (Tv)list.get(0);
		
		for(Product p1 : list){
			System.out.println(p1.getName()+" ");
		}
		
		printAll(list);
	
	}
}
