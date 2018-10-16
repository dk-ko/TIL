package ch2;

import java.util.*;

public class ScanInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numInt;
		float numFloat, sum;
		String inString;
		
		System.out.print("이름 입력:");
		inString = sc.nextLine();
		System.out.print("정수형과 실수형 숫자 2개 입력 :");
		numInt = sc.nextInt();
		numFloat = sc.nextFloat();
		sum = numInt + numFloat;
		
		System.out.println("이름 :" + inString);
		System.out.println(numInt + "+" + numFloat +"=" +sum);
		
		sc.close();
	}

}
