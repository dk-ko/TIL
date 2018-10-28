package example;

import java.util.Collection;
import java.util.LinkedList;

public class Example02 {

	static void addData(Collection<String> c){
		c.add("one");
		c.add("two");
		c.add("three");
	}
	
	static <T> void printCollection(Collection<T> c){
		for(T s:c) System.out.printf("%s ", s);
		System.out.println();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> c1 = new LinkedList<String>();
		Collection<String> c2 = new LinkedList<String>();
		
		addData(c1);
		addData(c2);
		printCollection(c1);
		printCollection(c2);
	}

}
