package example;

import java.util.Random;

class ThreadA extends Thread {
	String name;
	Random random;
	
	public ThreadA (String name){
		this.name = name;
		this.random = new Random();
	}
	
	@Override
	public void run() {
		System.out.printf("%s: started\n", name);
		try{
			for(int i=0; i<100; ++i){
				System.out.printf("%s: %d\n", name, i);
				int mili_second = random.nextInt(100);
				sleep(mili_second);
			}
		}catch(InterruptedException e){
			System.out.printf("%s: stoped\n", name);
		}
	}
}

public class Example01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread t1 = new ThreadA("one");
		Thread t2 = new ThreadA("two");
		Thread t3 = new ThreadA("three");
		t1.start();
		t2.start();
		t3.start();
	}

}
