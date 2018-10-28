package polymorphism;

class Parent{
	public void method1() {
		System.out.println("Parent method1()");
	}
}

class ChildOne extends Parent {
	@Override
	public void method1() {
		System.out.println("ChildOne method1()");
	}
}

class ChildTwo extends Parent {
	@Override
	public void method1() {
		System.out.println("ChildTwo method1()");
	}
}

class ChildThree extends Parent {
	
}

public class Polymorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent parent;
		ChildOne c1 = new ChildOne();
		ChildTwo c2 = new ChildTwo();
		ChildThree c3 = new ChildThree();
		
		c1.method1(); // 다형성 호출 아님
		
		parent = c1;
		parent.method1(); // 다형성 호출, c1.method1()
		
		parent = c2;
		parent.method1(); // 다형성 호출, c2.method1()
		
		parent = c3;
		parent.method1(); // 다형성 호출, parent.method1() 
	}

}
