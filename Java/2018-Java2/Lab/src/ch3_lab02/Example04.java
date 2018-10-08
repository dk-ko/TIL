package ch3_lab02;

class Person { 
	String name;
	int age;
	
	public Person(String name, int age) { 
		this.name = name;
		this.age = age;
	} 
}

public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[] a = new Object[3];
		Object[] b = a;
		
		a[0] = new double[] {1.1,2.2,3.3};
		a[1] = new String[] {"a", "b", "c"};
		Person[] p = new Person[2];
		a[2] = p;
		
		p[0] = new Person("홍길동", 22);
		p[1] = p[0];
		
		System.out.println(a.toString());
		System.out.println(b.toString());
	}
}
