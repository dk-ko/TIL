package lab;

public class Exam02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구현할 부분
		Person[] a = new Person[2];
		a[0] = new Person(new String("홍길동"), new String("2011132050"), 2, 4.1);
		a[1] = new Person(new String("홍길동"), new String("2011132050"), 2, 4.1);
		
		System.out.println(a[0] == a[1]);
		System.out.println(a[0].equals(a[1]));
	}
}
