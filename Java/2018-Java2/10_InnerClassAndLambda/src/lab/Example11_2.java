package lab;

import java.util.Arrays;

public class Example11_2 {
	
	static void printSum(int... a){
		int sum = 0;
		for(int i : a) sum += i;
		System.out.print("배열:"+Arrays.toString(a));
		System.out.println(" 합계:"+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {21, 33, 17, 40, 5, 13 };
		
		printSum( 11, 13, 17, 20);
		printSum( a );
	}
}
