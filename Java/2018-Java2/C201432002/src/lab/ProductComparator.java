package lab;

import java.util.Comparator;

public class ProductComparator implements Comparator<Product>{
	
	@Override
	public int compare(Product p1, Product p2){
		return p1.name.compareTo(p2.name);
	}
}
