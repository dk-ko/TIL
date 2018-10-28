package lab;

public class Example11 {
	static void printSum(int... a){
		int sum = 0;
		System.out.print("배열:[");
		for(int i=0; i<a.length; i++){
			sum += a[i];
			System.out.print(a[i]);
			if(i != a.length-1) System.out.print(", ");
		}
		System.out.println("] 합계:"+sum);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[] {21, 33, 17, 40, 5, 13 };
		
		printSum( 11, 13, 17, 20);
		printSum( a );
	}

}
