package lab;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class StringClassLab3 {

	static Random random = new Random();
	
	static ArrayList<Integer> makeIntegerArray(int count){
		ArrayList<Integer> l = new ArrayList<Integer>();
		for(int i=0; i<count; i++)
			l.add(new Integer(random.nextInt(count)));
		return l;
	}
	
	static <T> void printList(ArrayList<T> a){
		System.out.println();
		for(T t:a)
			System.out.print(t+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> a = makeIntegerArray(5);
		
		printList(a);
		
		// 일반 정렬 
		Collections.sort(a);
		printList(a);
		
		// Comparator
		Comparator<Integer> comp = new Comparator<Integer>(){
			@Override
			public int compare(Integer i1, Integer i2){
				// ASC sort
				return (int)i1-i2;
				// DESC sort				
				//return (int)i2-i1;
			}
		};
		
		Collections.sort(a,comp);
		printList(a);
		
		// Binary Search
		Integer search = 3;
		int index = Collections.binarySearch(a, search, comp);
		System.out.printf("\nindex : %d",index);
		if(index < 0){
			a.add((index*-1)-1, search);
		}
		printList(a);
	}
}
