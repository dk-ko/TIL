package genericLab;

abstract class Info{
	public abstract int getLevel();
}

class EmployeeInfo extends Info{
	public int rank;
	EmployeeInfo(int rank){
		this.rank = rank;
	}
	
	public int getLevel() {
		return this.rank;
	}
}

// generic class
class Person2<T, S>{
	public T info;
	public S id;
	
	Person2(T info, S id){
		this.info = info;
		this.id = id;
	}
	
	// generic method
	public <U> U printInfo(U info){
		//System.out.println(info); // return void
		return info;
	}
}

class Person3<T extends Info>{
	// info class나 info의 자식클래스만이 제네릭으로 올 수 있다. 
	public T info;
	Person3(T info){
		this.info = info;
	}
}

public class GenericDemo {
	public static void main(String[] args) { 
		Person2<EmployeeInfo, Integer> p1 = 
				new Person2<EmployeeInfo, Integer>(new EmployeeInfo(1),1);
		
		EmployeeInfo e = new EmployeeInfo(1);
		Integer i = new Integer(10);
		Person2 p2 = new Person2(e, i); // 생략 가능 
		
		p1.<EmployeeInfo>printInfo(e);
		p1.printInfo(e); // 생략 가능 
		
		Person3<EmployeeInfo> p3 = new Person3<EmployeeInfo>(new EmployeeInfo(1));
		// Person3<String> p4 = new Person3<String>("koda");
		// Info 클래스나 자식 클래스가 아니기 때문에 error
	}

}
