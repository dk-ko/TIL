package example;

public class Example09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedObjB s = new SharedObjB();
		ThreadH t1 = new ThreadH("one", 100, s);
		ThreadH t2 = new ThreadH("two", 100, s);
		ThreadH t3 = new ThreadH("Three", 100, s);
		t1.start();
		t2.start();
		t3.start();
	}

}
