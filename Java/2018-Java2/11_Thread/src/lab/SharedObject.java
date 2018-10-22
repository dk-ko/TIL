package lab;

public class SharedObject {
	int sum;
	
	public SharedObject(){
		this.sum = 0;
	}
	
	synchronized void add(int num) {
		sum += num;
	}
	
	synchronized void sub(int num) {
		sum -= num;
	}
}
