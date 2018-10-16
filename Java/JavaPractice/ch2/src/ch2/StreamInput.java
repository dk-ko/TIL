package ch2;

import java.io.*; 

public class StreamInput {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String name;
		BufferedReader inbr = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이름 입력 : ");
		name = inbr.readLine();
		System.out.println("당신의 이름은 " +name+"입니다.");
	}

}
