package example;

import java.util.Random;

class ThreadB extends Thread {
	String name;
	int count;
	int sum;
	Random random;
	
	public ThreadB (String name, int count){
		this.name = name;
		this.count = count;
		this.sum = 0;
		this.random = new Random();
	}
	
	@Override
	public void run() {
		System.out.printf("%s: started\n", name);
		try{
			for(int i=1; i<=count; i++){
				sum = sum+i;
				int mili_second = random.nextInt(10);
				sleep(mili_second);
			}
		} catch(InterruptedException e){
			System.out.printf("%s: interrupted\n", name);
		}
		System.out.printf("%s: %d\n", name, sum);
		System.out.printf("%s: stopped\n", name);
	}
}
public class Example03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main started");
		Thread threadOne = new ThreadB("one", 100);
		Thread threadTwo = new ThreadB("Two", 100);
		Thread threadThree = new ThreadB("Three",100);
		threadOne.start();
		threadTwo.start();
		threadThree.start();
		System.out.println("main stoped");
	}

}
