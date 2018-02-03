package ch6;

public class ThrowExam {
	static int pnum = 70;
	static int inum = 40;
	public static void calc(int num) throws Exception {
		if( num < pnum){
			throw new Exception("num값"+inum+"이"+pnum+"보다 작다.");
		}
	}

	public static void main(String[] args) {
		System.out.println("[예외 던지기]");
		try{
			calc(inum);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			System.out.println("예외 던지기 프로그램 종료 !! ");
		}
	}

}
