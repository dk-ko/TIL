package ch2;
import java.io.*;

public class test1 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int number;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("년도 입력:");
		number = Integer.parseInt(inbr.readLine());
		System.out.println("입력한 년도 "+number+"년");
	}

}
