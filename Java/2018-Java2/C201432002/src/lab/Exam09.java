package lab;

public class Exam09 {

    static String reverse(String path) {
        // 구현할 부분
    	char[] c = path.toCharArray();
    	for(int i=0; i<c.length; i++){
    		c[i] = path.charAt(path.length()-1-i);
    		c[path.length()-1-i] = path.charAt(i);
    	}
    	return String.valueOf(c);
   
   }

    public static void main(String[] args) {
        String[] a = { "hello", "world", "hello world" };
        for (String s : a)
            System.out.println(reverse(s));
    }

}
