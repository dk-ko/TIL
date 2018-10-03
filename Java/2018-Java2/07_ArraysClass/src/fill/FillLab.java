package fill;

import java.util.Arrays;
import java.util.Iterator;

class Fill{
	<T> void print(T[] list){	
		for(T i : list)
			System.out.print(i+" ");
	}
}

public class FillLab {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = {1,2,3};
		Fill f = new Fill();
		/*
		f.<Fill>print(list);
		
		Arrays.fill(list, 4);
		f.print(list);*/
	}

}
