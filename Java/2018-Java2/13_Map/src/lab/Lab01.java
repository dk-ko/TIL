package lab;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab01 {

	public static void main(String[] args) throws IOException {
		String filePath = "test.txt";
		Scanner scanner = new Scanner(Paths.get(filePath));
		scanner.useDelimiter("[^a-zA-Z]+");
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		while (scanner.hasNext()) {
			String s = scanner.next();
			Integer count = map.get(s);
			if(count == null) count = 0;
			map.put(s, count+1);
		}
		for(String key:map.keySet())
			System.out.printf("%s %d\n", key, map.get(key));
		scanner.close();
	}

}
