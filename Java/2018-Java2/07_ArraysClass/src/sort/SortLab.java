package sort;

import fill.FillLab2;
import sort.FruitComparator2.Compare;

import java.util.Arrays;
import java.util.Random;

public class SortLab {
	
	static Random random = new Random();
	
	static void print(int[] l){
		for(int i:l) System.out.printf(i+" ");
		System.out.println();
	}
	
	static <T> void print(T[] l){
		for(T i: l) System.out.printf(i+" ");
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// (1) 기본 자료형 정렬 
		int[] n = {2,4,7,5,-1,9,0};
		Arrays.sort(n);
		print(n);
		
		System.out.println();
		// (2) 기본적으로 Comparable Interface를 implements 한 클래스
		// String, Date 등
		int count = 5;
		String[] s = new String[count] ;
		
		for(int i=0; i<count; i++) s[i] = FillLab2.makeRandomString(count);
		print(s);
		Arrays.sort(s);
		print(s);
		
		System.out.println();
		// (3)Comparable Interface를 implements 하지 않은 경우
		// (3)-1 Comparable Interface 이용 
		Fruit[] fruits = new Fruit[count];
		for(int i=0; i<count; i++)
			fruits[i] = new Fruit(FillLab2.makeRandomString(count), random.nextInt(count));
		print(fruits);
		Arrays.sort(fruits);
		print(fruits);
		
		System.out.println();
		// (3)-2-1 Comparator Class 이용 
		FruitComparator cp = new FruitComparator(4); // DESC Name
		print(fruits);
		Arrays.sort(fruits, cp);
		print(fruits);
		
		System.out.println();
		// (3)-2-2 Comparator Class & enum 이용 
		FruitComparator2 cp2 = new FruitComparator2(Compare.BY_NAME_DESC);
		print(fruits);
		Arrays.sort(fruits, cp2);
		print(fruits);
	}
}
