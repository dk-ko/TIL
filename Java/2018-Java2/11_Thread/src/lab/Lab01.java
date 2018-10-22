package lab;

public class Lab01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SharedObject sbj = new SharedObject();
		
		// true : add , false : sub
		Thread t1 = new Thread(new ThreadLab("one", sbj)
				.setNum(3)
				.setFlag(true)
				.build());
				
		Thread t2 = new Thread(new ThreadLab("two", sbj)
				.setNum(3)
				.setFlag(false)
				.build());
		
		t1.start();
		t2.start();
		
		try{
			t1.join();
			t2.join();
		} catch(InterruptedException e){
			System.out.println("interrupted");
		}
		
		System.out.printf("main: %d\n", sbj.sum);
	}

}
