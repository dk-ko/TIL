package ch2_lab01;

public class Example04 {
	static String removeO(String s) {
		String t = s.replace("o", "");
		return t.replace("O", "");
	}
	public static void main(String[] args) {
		String[] a = new String[] { "One", "Two", "Three", "Four", "Five", "hello world", "yahoo" }; 
		for (String s : a) {
			String temp = removeO(s);
			System.out.println(temp); 
		}
	}
}
