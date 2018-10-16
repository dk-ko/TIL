package ch8;

public class RunnableThread implements Runnable{
	String word;
	RunnableThread(String word){
		this.word = word;
	}
	
	public void run(){
		try {
			for(int i=0; i<5; i++){
				System.out.println(i+" "+word);
				Thread.sleep(500);
			}
			System.out.println("쓰레드 종료"+" "+word);
		}catch(InterruptedException e){}
	}
	
	public static void main(String[] args) {
		RunnableThread r1 = new RunnableThread("Thread 1");
		RunnableThread r2 = new RunnableThread("Thread 2");
		new Thread(r1).start();
		new Thread(r2).start();
	}

}
