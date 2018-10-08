package lab;

public class Exam04 {
	public static void doSomething(String s) {
		// 구현할 부분
		char[] c = s.toCharArray();
		
		StringBuilder builder = new StringBuilder();
		for(int i=0; i<c.length; i++){
			if(builder.length() > 0) builder.append(" ");
			builder.append('(').append(c[i]).append(')');
		}
		System.out.println(builder.toString());
	}

	public static void main(String[] args) {
		String[] a = { "hello", "world", "hello world" };
		for (String s : a)
			doSomething(s);
	}
}
