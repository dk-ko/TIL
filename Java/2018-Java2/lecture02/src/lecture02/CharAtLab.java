package lecture02;

public class CharAtLab {
	static int getVowelCount(String s) {
		int c = 0;
		
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) == 'a' || s.charAt(i) == 'A') c += 1;
			if(s.charAt(i) == 'e' || s.charAt(i) == 'E') c += 1;
			if(s.charAt(i) == 'i' || s.charAt(i) == 'I') c += 1;
			if(s.charAt(i) == 'o' || s.charAt(i) == 'O') c += 1;
			if(s.charAt(i) == 'u' || s.charAt(i) == 'U') c += 1;
		}
		
		return c;
    }

    public static void main(String[] args) {
        String[] a = new String[] { "One", "Two", "Three", "Four", "Five", "hello world" };
        for (String s : a) {
            int count = getVowelCount(s);
            System.out.printf("%s %d\n", s, count);
        }
    }
}
