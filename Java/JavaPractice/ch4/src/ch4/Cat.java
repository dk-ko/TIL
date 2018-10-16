package ch4;

public class Cat extends Animal{
	public static void testClassMethod(){
		System.out.println("The class method in Cat"); // method hiding
	}
	public void testInstanceMethod() {
		System.out.println("The instance method in Cat"); // method overriden
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat myCat = new Cat();
		Animal myAnimal = myCat;
		//Animal myAnimal = new Animal();
		
		System.out.println("메소드 치환과 은닉 ");
		
		Animal.testClassMethod(); // Object Animal의 class Method(hiding은 object 중심)
		Cat.testClassMethod(); // Object Cat의 class Method / 객체가 무엇이냐에 따라 
		testClassMethod();
		System.out.println();
		myAnimal.testInstanceMethod(); // 가리키고 있는 인스턴스에 따라 다름
		myCat.testInstanceMethod();
	}

}

