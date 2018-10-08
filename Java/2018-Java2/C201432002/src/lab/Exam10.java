package lab;

public class Exam10 {

    static String removeSubstring(String s, int fromIndex, int toIndex) {
        // 구현할 부분
    	StringBuilder builder = new StringBuilder();
    	builder.append(s);
    	
    	return builder.delete(fromIndex, toIndex).toString();
    }

    public static void main(String[] args) {
        String[] a = { "hello", "world", "hello hello" };
        System.out.println(removeSubstring(a[0], 1, 4));
        System.out.println(removeSubstring(a[1], 2, 4));
        System.out.println(removeSubstring(a[2], 2, 5));
    }
}
