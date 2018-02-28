package ch13;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileIO {
	public static void main(String[] args) throws IOException {
		byte[] data = {21,1,43,12,76,34,54,29,66,99};
		RandomAccessFile rac = new RandomAccessFile("temp.txt","rw");
		rac.write(data);
		System.out.println("파일 출력 : temp.txt.");
		System.out.println("------------------");
		for(int i=0; i<data.length; i++){
			int accpoint = (int)((Math.random() * 100) % 10);
			rac.seek(accpoint);
			System.out.print("현재 파일 포인터 : "+rac.getFilePointer());
			System.out.println(", 데이터 : " + rac.read());
		}
	}
}
