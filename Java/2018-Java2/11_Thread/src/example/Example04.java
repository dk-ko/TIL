package example;

public class Example04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
		ThreadB t1 = new ThreadB("one", 100);
		ThreadB t2 = new ThreadB("two", 100);
		ThreadB t3 = new ThreadB("three", 100);
		t1.start();
		t2.start();
		t3.start();
		System.out.printf("t1: %d\n", t1.sum);
		System.out.printf("t2: %d\n", t2.sum);
		System.out.printf("t3: %d\n", t3.sum);
		System.out.println("main stopped");
	}

}
