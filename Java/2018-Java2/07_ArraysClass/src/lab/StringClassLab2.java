package lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StringClassLab2 {
	public static <T> void print(ArrayList<T> l){
		for(T p:l)
			System.out.print(p);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> products = new ArrayList<Product>();
		products.add(new Product("apple", 5000));
		products.add(new Product("mango", 3000));
		products.add(new Product("banana", 4500));
		products.add(new Product("kiwi", 7000));
		products.add(new Product("orange", 4000));
		
		Comparator<Product> comp = new Comparator<Product>(){
			@Override
			// ASC price
			public int compare(Product p1, Product p2){
				return p1.getPrice() - p2.getPrice();
				//return p2.getPrice() - p1.getPrice();
			}
		};
		
		Collections.sort(products, comp);
		/*
		Collections.sort(products, new Comparator<Product>(){
			@Override
			// ASC price
			public int compare(Product p1, Product p2){
				//return p1.getPrice() - p2.getPrice();
				return p2.getPrice() - p1.getPrice();
			}
		});*/
		
		print(products);
		
		//int index = Arrays.binarySearch(products, "banana"); // error
		Product search = new Product("koda", 6000);
		int index = Collections.binarySearch(products, search);
		
		//System.out.print(search);
		System.out.printf("\nsearch index : %d\n",index);
		
		if(index < 0){
			products.add((index*-1)-1, search);
		}
		
		print(products);
	}
}
