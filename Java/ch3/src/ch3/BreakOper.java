package ch3;

public class BreakOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 0;
		int sum = 0;
		System.out.println("무한반복");

		bklabel: while (true) {
			while (true) {
				if (x >= 500)
					break bklabel;
				x++;
				sum += x;
			}
		}

		System.out.println("합:" + sum);
	}
}
