package fill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import lab.Product;

public class FillLab3 {
	
	static Random random = new Random();
	
	static Product makeRandomProduct(int n){
		return new Product(FillLab2.makeRandomString(n),
					FillLab2.makeRandomInt(n));
	}

	static ArrayList<Product> makeList(int count){
		ArrayList<Product> l = new ArrayList<Product>();
		for(int i=0; i<count; i++)
			l.add(makeRandomProduct(count));
		return l;
	}
	
	static void print(ArrayList<Product> l){
		for(Product p:l)
			System.out.print(p);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Product> p = makeList(5);
		print(p);
		
		Collections.fill(p, makeRandomProduct(5));
		System.out.println();
		print(p);
	}

}
