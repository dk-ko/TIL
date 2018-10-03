package equals;

import java.util.Arrays;
import java.util.Random;

public class EqualsLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"123","234","345"};
		String[] b = Arrays.copyOf(a, a.length);
		
		System.out.println(a.equals(b)); // false
		System.out.println(Arrays.equals(a, b)); // true
		
		System.out.println(Arrays.deepEquals(a, b));
		
		// 2차원 배열 
		int[][] list = new int[3][5];
		Random random = new Random();
		for(int i=0; i<list.length; i++){
			for(int j=0; j<list[i].length;j++){
				list[i][j] = random.nextInt();
			}
		}
		
		int[][] list2 = Arrays.copyOf(list, list.length);
		System.out.println("equals : " + list.equals(list2));
		System.out.println("ArrayEquals : " + Arrays.equals(list, list2)); // why true?
		System.out.println("deepEquals : " + Arrays.deepEquals(list, list2));
	}

}
