package lab;

import java.util.Arrays;

public class StringClassLab {
	
	public static void main(String[] args){
		Integer[] a = new Integer[] {10, 3, 5, 2, 1};
		
		Arrays.sort(a);
		for(int i:a)
			System.out.printf("%d ",i);
		
		int index = Arrays.binarySearch(a, 7);
		if(index > -1)
			System.out.println(a[index]);
		else
			System.out.println(index);
	}
}
