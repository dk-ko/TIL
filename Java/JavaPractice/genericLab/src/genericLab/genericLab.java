package genericLab;

class Person<T> {
	public T info;
}

public class genericLab {

	public static void main(String[] args) {
		Person<String> p1 = new Person<String>();
		// p1.info : String
		Person<StringBuilder> p2 = new Person<StringBuilder>();
		// p2.info : StringBuilder
	}
}
