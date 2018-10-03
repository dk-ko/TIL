package practice;

import java.util.Arrays;
import java.util.List;

public class Arrays4 {
	
	static void printList(List<String> list){
		for(String s:list)
			System.out.printf("%s ", s);
		System.out.println();
	}
	
	public static void main(String[] args) {
		String[] a = {"one", "two", "three"};
		List<String> list1 = Arrays.asList("one", "two", "three"); // List 타입은 길이가 고정 
		List<String> list2 = Arrays.asList(a);
		
		printList(list1);
		printList(list2);
		
		System.out.println(list1.toString());
		System.out.println(list2.toString());
		
		Object[] b = list1.toArray();
		String[] c = (String[])list1.toArray();
		System.out.printf("Arrays.equals(a,b) : %b\n", Arrays.equals(a, b)); // true
		System.out.printf("Arrays.equals(a,c) : %b\n", Arrays.equals(a, c)); // true
		
		System.out.printf("a == b: %b\n", a==b); // String[] vs Array // f
		System.out.printf("a == c: %b\n", a==c); // String[] vs String[] // f
		System.out.printf("b == c: %b\n", b==c); // Object[] vs String[] // f
		
	}

}
