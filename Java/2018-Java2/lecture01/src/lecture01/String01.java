package lecture01;

public class String01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "hello world\n";
		String t = "Hello World\n";
		
		for(int i = 0; i< s.length(); ++i)
			System.out.printf("%c", s.charAt(i));
		
		System.out.println(s.compareTo(t)>0); // f -> t
		System.out.println(s.compareToIgnoreCase(t)==0); // t
		System.out.println(s.contains("hello")); // t
		System.out.println(s.endsWith("rld\n")); // t
		System.out.println(s.equals(t)==false); // t
		System.out.println(s.equalsIgnoreCase(t)); // t
		System.out.println(s.isEmpty() == false); // t
		System.out.println(s.indexOf("o") == 4); // t
		System.out.println(s.lastIndexOf("o")== 7); // ? -> t
		System.out.println(s.length() == 12); // t
		System.out.println(s.startsWith("hell")); // t
		
		String[] a = s.split(" ");
		System.out.println(a.length == 2); // t
		System.out.println(a[0].equals("hello")); // t
		
		System.out.println(s.substring(0, 5).equals("hello")); // t
		System.out.println(t.toLowerCase().equals(s)); // t
	}

}
