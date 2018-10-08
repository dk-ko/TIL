package ch5_lab03;

public class Example01 {
	
	static String reverse(String s) {
		char[] c = s.toCharArray();
		for(int i=0; i<s.length(); i++){
			c[i] = s.charAt(s.length()-1-i);
			c[s.length()-1-i] = s.charAt(i);
		}
		
		return String.valueOf(c);
	}
	public static void main(String[] args) { 
		String s = "hello world";
		s = reverse(s); 
		System.out.println(s);
	}
}
