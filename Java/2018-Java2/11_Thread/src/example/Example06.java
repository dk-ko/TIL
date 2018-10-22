package example;

import java.util.Random;

class ThreadE extends Thread {
	String name;
	int count;
	static int sum = 0;
	Random random;
	
	public ThreadE(String name, int count){
		this.name = name;
		this.count = count;
		this.random = new Random();
	}
	
	@Override
	public void run() {
		System.out.printf("%s: started\n", name);
		try{
			for(int i=0; i<=count; i++){
				sum += i;
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

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadE t1 = new ThreadE("One", 100);
		ThreadE t2 = new ThreadE("Two", 100);
		ThreadE t3 = new ThreadE("Three", 100);
		t1.start();
		t2.start();
		t3.start();
	}

}
