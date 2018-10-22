package lab;

public class ThreadLab implements Runnable{
	private String name;
	private SharedObject sbj;
	private int num = 100;
	private boolean flag = true;

	protected ThreadLab(String name, SharedObject sbj){
		this.name = name;
		this.sbj = sbj;
	}
	
	protected ThreadLab setNum(int num){
		this.num = num;
		return this;
	}
	
	protected ThreadLab setFlag(boolean flag){
		this.flag = flag;
		return this;
	}
	
	protected ThreadLab build() {
		return new ThreadLab(this);
	}
	
	private ThreadLab(ThreadLab builder){
		name = builder.name;
		sbj = builder.sbj;
		num = builder.num;
		flag = builder.flag;
	}
	
	@Override
	public void run() {
		try{
			if(flag){
				for(int i=1; i<=this.num; i++) sbj.add(i);
			}else{
				for(int i=1; i<=this.num; i++) sbj.sub(i);
			}
			System.out.printf("%s: %d\n", this.name, this.sbj.sum);
		} catch(Exception e){
			System.out.printf("%s : interrupted\n", name);
		}
		System.out.printf("%s: stop\n", this.name);
	}
}
