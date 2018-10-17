package example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class Example03 {

	static void addData(Collection<String> c) {
		c.add("one");
		c.add("two");
		c.add("three");
	}
	
	static void printCollection(Collection<String> c){
		String s = c.toString();
		System.out.println(s);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<String> c1 = new LinkedList<String>();
		Collection<String> c2 = new ArrayList<String>();
		
		addData(c1);
		addData(c2);
		printCollection(c1);
		printCollection(c2);
	}

}
