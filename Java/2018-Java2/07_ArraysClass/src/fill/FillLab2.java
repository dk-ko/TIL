package fill;

import java.util.Arrays;
import java.util.Random;

import lab.Product;

public class FillLab2 {
	
	static Random random = new Random();
	
	static <T> void printList(T[] t){
		for(T i:t)
			System.out.print(i);
	}
	
	static int makeRandomInt(int count){
		return random.nextInt(count);
	}
	
	static public String makeRandomString(int count){
		StringBuilder s = new StringBuilder();
		for(int i=0; i<count; i++){
			int n = random.nextInt(26)+(int)'a';
			s.append((char)n);
		}
		return s.toString();
	}
	
	static Product[] makeRandomProductList(int count){
		Product[] pList = new Product[count];
		for(int i=0; i<count; i++)
			pList[i] = new Product(makeRandomString(count),makeRandomInt(count));
		return pList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product[] pList = makeRandomProductList(5);
		printList(pList);
		
		Arrays.fill(pList, new Product(makeRandomString(3), makeRandomInt(3)));
		System.out.println();
		printList(pList);
	}

}
