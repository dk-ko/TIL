package fill;

import java.util.Arrays;
import java.util.Collections;

public class FillLab {
	static void print(int[] list){
		for(int i:list)
			System.out.printf(i+" ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1,2,3};
		Arrays.fill(list, 4);
		print(list);
	}
}
