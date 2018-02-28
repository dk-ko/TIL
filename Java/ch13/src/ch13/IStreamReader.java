package ch13;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class IStreamReader {
	static String fname;
	public static void main(String[] args) {
		int idata = -1;
		Reader isr = new InputStreamReader(System.in);
		System.out.println("키보드에서 문자 입력[마지막에 엔터]");
		System.out.println("--------------------------");
		
		try{
			while(true){
				idata = isr.read();
				if(idata == -1)
					break;
				System.out.print((char)idata);
			}
		}catch(IOException e){
			System.out.println(e.toString());
		}
	}
}
