package practice;

import java.util.Arrays;
import java.util.Random;

public class Arrays2 {
	static Random random = new Random();
	
	static String makeRandomString() {
		StringBuilder builder = new StringBuilder();
		for (int i=0; i<3; i++){
			int n = random.nextInt(26)+(int)'a';
			builder.append((char)n);
		}
		return builder.toString();
	}
	
	static String[] makeStringArray(int count){
		String[] a = new String[count];
		for(int i=0; i<count; ++i)
			a[i] = makeRandomString();
		return a;
	}
	
	public static void main(String[] args){
		String[] a = makeStringArray(20);
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		int index = Arrays.binarySearch(a, "nnn");
		System.out.printf("index if \"nnn\" : %d\n", index);
		
		String[] b = Arrays.copyOf(a, a.length);
		System.out.printf("Arrays.equals(a, b) : %b\n", Arrays.equals(a, b));
		
		System.out.printf("a.equals(b) : %b\n", a.equals(b));
		System.out.println(a.toString());
	}
}
