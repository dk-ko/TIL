package objectArraySort;

import java.util.Arrays;

public class ObjectArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"zero", "one", "two", "three", "four", "five", "six", "seven"};
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		Integer[] b = { 17, 14, 11, 19, 13, 15, 20, 12, 16, 18};
		
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
	}

}
