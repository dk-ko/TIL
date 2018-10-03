package arrays;

import java.util.Arrays;
import java.util.List;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {3,4,5};
		int[] b = new int[] {3,4,5};
		System.out.println(a.equals(b)); // false (identity)
		System.out.println(Arrays.equals(a, b)); // true (equality)
		
	}
}
