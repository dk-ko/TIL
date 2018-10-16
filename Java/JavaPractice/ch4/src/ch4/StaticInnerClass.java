// static nested class

package ch4;

class Outer {
	static int x=10;
	int y = 20;
	
	public static class Inner { // static nested class
		String innerMethod(){
			Outer out = new Outer();
			return x + (", " + out.y + " StaticInnerClass"); // x는 외부클래스의 클래스 변수라 직접 접근 가능 
			//인스턴스 변수 y 접근 하려면 객체 생성 후 접근할 수 있다.
		}
	}
}

public class StaticInnerClass {
	public static void main(String[] args) {
		Outer.Inner in = new Outer.Inner(); //외부 클래스 Outer의 static nested class 객체 in을 생
		System.out.println("클래스 내재 클래스의 메소드 접근 : "+ in.innerMethod());
	}	// 다른 클래스에서 static nested classs 메소드에 접근 시 in.innerMethod() 형식으로 접근.
}
