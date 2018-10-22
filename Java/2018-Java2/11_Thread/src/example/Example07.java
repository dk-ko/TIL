package example;

import java.util.Random;

class ThreadF extends Thread {
	String name;
	int count;
	static int sum = 0;
	Random random;
	
	public ThreadF(String name, int count){
		this.name = name;
		this.count = count;
		this.random = new Random();
	}
	
	@Override
	public void run() {
		System.out.printf("%s: started\n", name);
		try{
			for(int i=0; i<=count; i++){
				synchronized(ThreadF.class) {
					sum += i;
				}
				int mili_second = random.nextInt(10);
				sleep(mili_second);
			}
		} catch (InterruptedException e){
			System.out.printf("%s: interrupted\n", name);
		}
		System.out.printf("%s: stoped\n", name);
		System.out.printf("%s: %d\n", name, sum);
	}
}

public class Example07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadF t1 = new ThreadF("One", 100);
		ThreadF t2 = new ThreadF("Two", 100);
		ThreadF t3 = new ThreadF("Three", 100);
		t1.start();
		t2.start();
		t3.start();
	}

}
