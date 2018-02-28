package ch13;
import java.util.*;

public class PrintFormatEx {

	public static void main(String[] args) {
		int num = 10;
		double log = Math.log(num);
		System.out.format("log(%d) : %+10.6f %n", num, log);
		
		Date today = new Date();
		System.out.printf("오늘 날짜 : %tY 년 %tm 월 %td 일 \n",  today, today, today);
		System.out.printf("오늘 날짜 : %1$tY 년 %1$tm 월 %1$td 일 \n",  today);
		System.out.printf("현재 시간 ; %1$tH 시 %1$tM 분 %1$tS 초 \n", today);
		System.out.format("오늘 날짜 : %tY 년 %tm 월 %td 일", today, today, today);
	}

}
