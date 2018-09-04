package equals;

public class equlasLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s0 = "hello world";
		String s1 = "HELLO WORLD";
		String s2 = s0;
		String s3 = s1.toLowerCase();
		
		boolean b0 = (s0 == s2); // 객체 비교 
		boolean b1 = (s0 == s3); 
		boolean b2 = s0.equals(s2); // 내용 비교 
		boolean b3 = s0.equals(s3);
		System.out.printf("%b %b %b %b\n", b0, b1, b2, b3);
		
		boolean b4 = s0.equals(s1);
		boolean b5 = s0.equalsIgnoreCase(s1);
		System.out.printf("%b %b\n", b4, b5);
	}

}
