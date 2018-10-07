package defaultSort;

import java.util.Arrays;
import java.util.Random;

public class DefaultSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		int[] a = new int[10];
		
		for(int i=0; i<10; i++)
			a[i] = random.nextInt(10);
		
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		double[] b = new double[10];
		for(int i=0; i<10; i++)
			b[i] = random.nextDouble();
		Arrays.sort(b);
		System.out.println(Arrays.toString(b));
	}

}
