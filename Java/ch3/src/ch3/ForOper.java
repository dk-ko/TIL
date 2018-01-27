package ch3;
import java.io.*;

public class ForOper {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int number;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("그릴 삼각형 높이 입력:");
		number = Integer.parseInt(inbr.readLine());
		
		for(int x=1;x<=number;x++){
			for(int y=1; y<=x; y++){
				System.out.print("x");
			}
			System.out.println();
		}
	}

}
