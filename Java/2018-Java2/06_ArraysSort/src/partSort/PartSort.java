package partSort;

import java.util.Arrays;

public class PartSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {17, 14, 11, 19, 13, 15, 20, 12, 16, 18};
		
		Arrays.sort(a,0,5); // index 0,1,2,3,4
		System.out.println(Arrays.toString(a));
	}

}
