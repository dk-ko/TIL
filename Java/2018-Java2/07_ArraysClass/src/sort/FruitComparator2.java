package sort;

import java.util.Comparator;

public class FruitComparator2 implements Comparator<Fruit>{
	
	public enum Compare {BY_NAME_ASC, BY_NAME_DESC, BY_PRICE_ASC, BY_PRICE_DESC};
	
	private Compare cp;
	
	public FruitComparator2(Compare cp){
		this.cp = cp;
	}
	
	@Override
	public int compare(Fruit o1, Fruit o2) {
		// TODO Auto-generated method stub
		switch(cp){
			case BY_PRICE_ASC: return o1.price - o2.price; // ASC Price
			case BY_PRICE_DESC: return o2.price - o1.price; // DESC Price
			case BY_NAME_ASC: return o1.getName().compareTo(o2.getName()); // ASC Name 
			case BY_NAME_DESC: return o2.getName().compareTo(o1.getName()); // DESC Name
		}
		return 0;
	}
	
}
