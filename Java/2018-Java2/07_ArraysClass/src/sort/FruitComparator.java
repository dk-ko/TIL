package sort;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit>{
	
	int n;
	
	public FruitComparator(int n){
		this.n = n;
	}
	
	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		switch(n){
			case 1: return o1.price - o2.price; // ASC Price
			case 2: return o2.price - o1.price; // DESC Price
			case 3: return o1.getName().compareTo(o2.getName()); // ASC Name 
			case 4: return o2.getName().compareTo(o1.getName()); // DESC Name
		}
		return 0;
	}
	
}
