package ch6;

import java.io.*;
import java.util.Vector;

public class VectorOfIntegers {
	private Vector vec;
	private static final int initSize = 20;

	public VectorOfIntegers() {
		vec = new Vector(initSize);
		for (int i = 0; i < initSize; i++) {
			vec.addElement(new Integer(i));
		}
	}

	public void printVector() {
		PrintWriter out = null;
		try {
			out = new PrintWriter(new FileWriter("Vector.txt"));
			for (int i = 0; i < initSize; i++) {
				out.println(i + "번째 원소값은 " + vec.elementAt(i));
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 잡기 : " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException 잡기 : " + e.getMessage());
		} finally {
			if (out != null) {
				System.out.println("PrintWriter를 닫음 ");
				out.close();
			} else {
				System.out.println("PrintWriter가 열려 있지 않음 ");
			}
		}
	}

	public static void main(String[] args) {
		VectorOfIntegers vc = new VectorOfIntegers();
		vc.printVector();

	}

}
