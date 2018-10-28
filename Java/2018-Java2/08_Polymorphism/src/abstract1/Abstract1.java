package abstract1;

abstract class Parent {
	public void method1(){
		System.out.println("Parent method1()");
	}
	public abstract void method2();
}

class ChildOne extends Parent {
	@Override
	public void method1() {
		System.out.println("ChildOne method1()");
	}
	@Override
	public void method2(){	// abstract method override()는 필수 
		System.out.println("ChildOne method2()");
	}
}

class ChildTwo extends Parent {
	@Override
	public void method1(){
		System.out.println("ChildTwo method1()");
	}
	
	@Override
	public void method2() {
		System.out.println("ChildTwo method2()");
	}
}

class ChildThree extends Parent {
	@Override
	public void method2(){
		System.out.println("ChildThree method2()");
	}
}

public class Abstract1 {
	static void callMdoSomething(Parent parent){
		parent.method1(); // 다형성 호출 
		parent.method2(); // 다형성 호출 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildOne c1 = new ChildOne();
		ChildTwo c2 = new ChildTwo();
		ChildThree c3 = new ChildThree();
		
		callMdoSomething(c1);
		callMdoSomething(c2);
		callMdoSomething(c3);
	}

}
