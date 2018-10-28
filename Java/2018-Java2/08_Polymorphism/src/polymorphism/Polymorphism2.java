package polymorphism;

public class Polymorphism2 {
	static void doSomething(Parent parent){
		parent.method1(); // 다형성 호출 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildOne c1 = new ChildOne();
		ChildTwo c2 = new ChildTwo();
		ChildThree c3 = new ChildThree();
		
		c1.method1(); // 다형성 호출 아님 
		
		doSomething(c1); // 다형성 호출 
		doSomething(c2);
		doSomething(c3);
	}

}
