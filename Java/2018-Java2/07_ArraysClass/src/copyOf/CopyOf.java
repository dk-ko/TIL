package copyOf;

import java.util.Arrays;
import java.util.Scanner;

public class CopyOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,4,5};
		
		Scanner sc = new Scanner(System.in);
		int key = sc.nextInt();
		
		// 입력한 값이 없으면 추가 후 출력 
		int index = Arrays.binarySearch(a, key);
		if( index < 0){
			int[] b = Arrays.copyOf(a, index*-1);
			b[(index*-1)-1] = key;
			a = b;
		}
		
		// 입력한 값이 있으면 그냥 출력 
		for(int i: a){
			System.out.print(i+" ");
		}
		
		int[] test = Arrays.copyOfRange(a, 0, 3);
		for(int i: test)
			System.out.print(i+" ");
		// 1,2,3 
		
	}
}
