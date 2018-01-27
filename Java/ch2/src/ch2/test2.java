package ch2;
import java.io.*;

public class test2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int intnum;
		double dblnum;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("정수와 실수 입력 :");
		intnum = Integer.parseInt(inbr.readLine());
		dblnum = Double.parseDouble(inbr.readLine());
		
		System.out.println("입력한 정수는 "+intnum+"입니다");
		System.out.println("입력한 실수는 "+dblnum+"입니다.");
	}

}
