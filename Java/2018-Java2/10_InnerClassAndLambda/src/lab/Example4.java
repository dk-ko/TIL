package lab;

public class Example4 {
	
	int a = 3, b = 4;

	class InnerClass {
		void swap(){
			int swap = a;
			a = b;
			b = swap;
		}
	}
	
	void doSomething() {
		new InnerClass().swap();
		System.out.printf("%d %d\n", a, b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Example4().doSomething();
	}

}
