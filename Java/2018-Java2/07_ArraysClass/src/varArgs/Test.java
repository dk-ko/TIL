package varArgs;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {3,4,5};
		int[] b = new int[] {3,4,5};
		System.out.println(a.equals(b)); // false
		
		//----------------------------------
		String[] testCase = {"abc", "bbb", "ccc"};
		
		for(String t: testCase)
			System.out.printf("%s ",t);
		
		List<String> testCaseToList = Arrays.asList(testCase);
		
		for(String t: testCaseToList)
			System.out.printf("%s ", t);
	}
}
