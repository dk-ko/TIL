package ch7;

public class LambdaPnEx2 {

	public static void main(String[] args) {
		FunctionalInterE fi;
		FunctionalInterR fir;
		
		fi = (x, y) -> {
			int sum = x+y;
			System.out.println("매개 변수가 있는 람다식 사용 - 두 수의 합 : "+sum);
		};
		fi.method(10, 30);
		
		fir=(x,y)->{
			int result = x+y;
			return result;
		};
		System.out.println("매개변수가 있고 반환값이 있는 람다식 사용 - 두 수의 합 : " + fir.method(20,30));

	}
}

@FunctionalInterface
interface FunctionalInterE{
	public void method(int x, int y);
}

@FunctionalInterface
interface FunctionalInterR{
	public int method(int x, int y);
}
