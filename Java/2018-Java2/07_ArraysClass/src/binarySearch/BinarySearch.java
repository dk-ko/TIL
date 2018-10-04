package binarySearch;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		String[] list = {"aaa", "bbb", "ccc"};
		
		int index = Arrays.binarySearch(list, "eee");
		System.out.println(index);
		// 배열에 key 값이 없는 경우에 key값을 끼워 넣을 위치를 (index*-1)-1 값으로 리턴
		
	}
}
