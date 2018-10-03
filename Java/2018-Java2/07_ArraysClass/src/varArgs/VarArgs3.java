package varArgs;

public class VarArgs3 {

	static void print(int a, String... b){
		System.out.printf("\na=%d, b.length=%d : ", a, b.length);
		for(String s : b)
			System.out.printf("%s ", s);
	}
	public static void main(String[] args) {
		print(1, "a", "bb", "c", "ddd", "ee");
		print(2, "bb", "c");
		print(3, "ddd");
		print(4);
		
		String[] a = new String[] {"a", "bb", "c", "ddd", "ee" };
		print(5, a);
	}

}
