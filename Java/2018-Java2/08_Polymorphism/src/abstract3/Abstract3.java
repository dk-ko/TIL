package abstract3;

abstract class Parent {
	public static final double PI = 3.141592;
	
	public abstract void method1();
	public abstract void method2(); 
}

abstract class Child extends Parent { 
	@Override
	public void method1() { 
		System.out.println("Child method1()");
	} 
}

class GrandChild extends Child { 
	@Override
	public void method2() { 
		System.out.println("GrandChild method2()");
	} 
}

public class Abstract3 {
	static void doSomething(Parent parent) { 
		parent.method1();
		parent.method2();
	}
	public static void main(String[] args) { 
		doSomething(new GrandChild());
	} 
}
