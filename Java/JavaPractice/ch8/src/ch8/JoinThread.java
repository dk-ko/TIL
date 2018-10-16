package ch8;

public class JoinThread {
	public static void main(String[] args) {
		try{
			ImplThread j = new ImplThread();
			Thread t = new Thread(j);
			t.start();
			t.join(); // 주석 처리 하면 0이 출력됨, main이 실행된 후 rum이 실행되기 때문 
			System.out.println("변수 sum 출력 : "+j.sum);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
}

class ImplThread implements Runnable{
	int sum = 0;
	public void run(){
		try{
			Thread.sleep(500);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		for(int x=1;x<500;x++){
			sum=sum+x;
		}
	}
}