package example;

import java.util.Random;

class ThreadH extends Thread {
	String name;
	int count;
	SharedObjA sharedObj;
	Random random;
	
	public ThreadH(String name, int count, SharedObjA sharedObj){
		this.name = name;
		this.count = count;
		this.sharedObj = sharedObj;
		this.random = new Random();
	}
	
	@Override
	public void run() {
		System.out.printf("%s: started\n", name);
		try{
			for(int i=0; i<=count; i++){
				sharedObj.add(i);
				int mili_second = random.nextInt(10);
				sleep(mili_second);
			}
		} catch (InterruptedException e){
			System.out.printf("%s: interrupted\n", name);
		}
		System.out.printf("%s: stoped\n", name);
		System.out.printf("%s: %d\n", name, sharedObj.sum);
	}
}

public class Example08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedObjA s = new SharedObjA();
		ThreadH t1 = new ThreadH("one", 100, s);
		ThreadH t2 = new ThreadH("two", 100, s);
		ThreadH t3 = new ThreadH("three", 100, s);
		t1.start();
		t2.start();
		t3.start();
	}

}
