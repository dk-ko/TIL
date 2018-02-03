// 다형성

package ch4;

public class AnimalTalk { // public 으로 정의, 여러개의 자바 클래스를 한 개의 파일에 넣으려면 한 개의 클래스만
							// public으로
	// 지정하고 다른 클래스는 public으로 지정하면 안된다.
	public static void main(String[] args) {
		Dog aDog = new Dog();
		Pig aPig = new Pig();
		Snake aSnake = new Snake();
		Animals animal; // Animals의 객체 변수 선언
		animal = aDog; // animal 객체 변수에 Dog의 객체인 aDog 할당
		animal.talk(); // animal이 Dog의 객체이기 때문에 Dog의 talk가 실행된다.
		animal = aPig;
		animal.talk();
		animal = aSnake;
		animal.talk(); // Snake에 talk() 메소드가 정의되어 있지 않아 상위 클래스에 있는 메소드 talk가
						// 수행된다.
	}
}

class Animals {
	private int legs = 4;

	public void talk() {
		System.out.println("Some animals don’t talk!");
	}
}

class Dog extends Animals {
	public void talk() {
		System.out.println("Dog : bowwow");
	}
}

class Pig extends Animals {
	public void talk() {
		System.out.println("Pig : oinkoink");
	}
}

class Snake extends Animals {
	private int legs = 0;
}
