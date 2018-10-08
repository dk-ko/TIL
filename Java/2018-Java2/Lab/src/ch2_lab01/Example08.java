package ch2_lab01;

public class Example08 {

	public static boolean isNullEmptyBlank(String s) {
		if(s == null) return true;
		
		String t = s;
		for(int i=0; i<s.length()/2; i++)
			t = t.trim();
		
		if(t.equals("") || t.equals(" ") || t.equals("\t") || t.equals("n")) return true;
		else return false;
	}
	public static void main(String[] args) { 
		String[]a={null,""," ","  "," \t "," \t\n"," . "};
		for (String s : a) 
			System.out.println(isNullEmptyBlank(s));
	}
}
