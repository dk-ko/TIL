package arrays;

import java.util.Arrays;
import java.util.List;

public class AsList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] testCase = {"abc", "bbb", "ccc"};
		
		for(String t: testCase)
			System.out.printf("%s ",t);
		System.out.println("\n"+testCase);
		
		// asList -> return List<T>
		// [abc, bbb, ccc]
		List<String> testCaseToList = Arrays.asList(testCase);
		
		for(String t: testCaseToList)
			System.out.printf("%s ", t);
		System.out.println("\n"+testCaseToList);
		
		// [one, two, three]
		List<String> stringList = Arrays.asList("one", "two", "three");
		System.out.println(stringList);
	}
}
