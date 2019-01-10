package lab;

import java.util.HashMap;
import java.util.Map;

public class Lab02 {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(101, "a");
		map.put(102, "b");
		map.put(103, "c");
		System.out.printf("%s %s %s\n", map.get(101), map.get(102), map.get(103));
		map.remove(102);
		System.out.printf("%s %s %s\n", map.get(101), map.get(102), map.get(103));
	}
}