package ch3;
import java.io.*;

public class WhileOper {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int x=1;
		int y=1;
		int number;
		
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("그릴 삼각형 높이 입력 :");
		number = Integer.parseInt(inbr.readLine());
		
		while(x<=number){
			while(y<=x){
				System.out.print("x");
				y++;
			}
			System.out.println();
			x++;
			y=1;
		}
	}

}
