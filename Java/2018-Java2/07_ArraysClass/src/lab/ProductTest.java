package lab;

import java.util.Arrays;
import java.util.Comparator;

public class ProductTest {
	static void productPrint(Product[] list){
		System.out.println();
		for(Product p:list)
			System.out.print(p);
	}
	
	public static void main(String[] args){
		Product[] pList = new Product[3];
		pList[0] = new Product("apple", 3000);
		pList[1] = new Product("banana", 2000);
		pList[2] = new Product("orange", 1500);
		
		// ASC price
		Arrays.sort(pList);
		productPrint(pList);
		
		// ASC name
		Arrays.sort(pList,new Comparator<Product>(){
			@Override
			public int compare(Product p1, Product p2){
				String name1 = p1.getName().toUpperCase();
				String name2 = p2.getName().toUpperCase();
				
				return name1.compareTo(name2);
			}
		});
		productPrint(pList);
	}
}
