package practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

import practice.PersonComparator.Compare;

public class Arrays3 {
	
	static Random random = new Random();

	static String makeRandomString() {
		StringBuilder builder = new StringBuilder();
		for(int i=0; i<3; ++i){
			int n = random.nextInt(26) + (int)'a';
			builder.append((char)n);
		}
		return builder.toString();
	}
	
	static Person[] makePersonArray(int count){
		Person[] a = new Person[count];
		for(int i=0; i<count; i++){
			String name = makeRandomString();
			int age = random.nextInt(10)+10;
			a[i] = new Person(name, age);
		}
		return a;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Comparator<Person> personComparator = new PersonComparator(Compare.BY_AGE_DESC);
		
		Person[] a = makePersonArray(10);
		System.out.println(Arrays.toString(a));
		// sort시 comparator 객체를 이용해 정렬한다. 
		Arrays.sort(a, personComparator);
		System.out.println(Arrays.toString(a));
		
		int index = Arrays.binarySearch(a, new Person("nnn", 10), personComparator);
		System.out.printf("index of \"nnn\" : %d\n", index);
		
		Person[] b = Arrays.copyOf(a, a.length);
		System.out.printf("Arrays.equals(a, b) : %b\n", Arrays.equals(a, b));
		
		System.out.printf("a.equals(b) : %b\n", a.equals(b));
		System.out.println(a.toString());
	}
}
