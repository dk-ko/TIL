package ch8;

public class Producer extends Thread{
	private Buffer b;
	public Producer(String name, Buffer b){
		super(name);
		this.b = b;
	}
	public void run(){
		for(int i=0; i<5; i++){
			b.produce(i);
			System.out.println(getName() + " : 생산 = " + i);
			try{
				sleep(500);
			}catch(InterruptedException e){ }
		}
	}
}
