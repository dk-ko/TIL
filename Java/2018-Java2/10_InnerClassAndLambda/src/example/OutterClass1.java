package example;

public class OutterClass1 {
	int a;
	
	class InnerClass{
		int b;
		
		void innerMethod() {
			b = 5;
			this.b = 6;
			a = 7;
			OutterClass1.this.a = 8;
			instanceMethod();
			OutterClass1.this.instanceMethod();
			// this.instancemethod(); // error
			// > this가 innerClass의 this이기 때문 
			main(null);
		}
	}

	public void instanceMethod() {
		InnerClass obj = new InnerClass();
		a = 1;
		this.a = 2;
		obj.innerMethod();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OutterClass1 o = new OutterClass1();
		o.instanceMethod();
//		InnerClass obj = new InnerClass(); 
//		a = 3;
//		this.a = 4;
		// > static method 이기 때문에 outterclass의 this를 가질 수 없다.
	}

}
