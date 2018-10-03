package varArgs;

public class VarArgs2 {

	static void print(String a, int... b){
		System.out.printf("\na=%s, b.length=%d : ", a, b.length);
		for(int i : b)
			System.out.printf("%d ", i);
	}
	public static void main(String[] args) {
		print("A", 11,2,31,44);
		print("B", 51,35);
		print("C", 64);
		print("D");
		
		int[] a = new int[]{11,2,31,44};
		print("E", a);
	}
}
