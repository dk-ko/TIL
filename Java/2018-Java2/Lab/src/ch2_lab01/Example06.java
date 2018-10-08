package ch2_lab01;

public class Example06 {
	static String[] split1(String s) { 
		String[] t = s.split(",");
		for(int i=0; i<t.length; i++)
			t[i] = t[i].replaceAll(" ", "");
		return t;
	}
	static String[] split2(String s) { 
		String[] t = s.split(",");
		for(int i=0; i<t.length; i++)
			t[i] = t[i].trim();
		return t;
	}
	public static void main(String[] args) { 
		String s = "One, Two ,Three , Four,Five"; 
		String[] a1 = split1(s);
		for (String t : a1)
			System.out.printf("[%s]\n", t); 
		String[] a2 = split2(s);
		for (String t : a2)
			System.out.printf("[%s]\n", t);
	} 
}
	