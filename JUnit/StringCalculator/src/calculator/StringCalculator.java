/*
 * 주제 : 문자열 계산기
 * 요구사항 :
 * 1) 전달하는 문자를 구분자로 분리한 후 각 숫자의 합을 구해 반환해야 한다.
 * 2) 쉼표 또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환한다.
 * 3) 앞의 기본 구분자 외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분의 "//"와 "\n" 사이에
 * 위치하는 문자를 커스텀 구분자로 사용한다. 
 * 4) 문자열 계산기에 음수를 전달하는 경우 RuntimeException으로 예외 처리해야한다.
 */

package calculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringCalculator {
	
	// (1)
	// 리팩토링 후 주의 깊게 봐야할 부분은
	// public으로 공개한 메소드가 얼마나 읽기 쉽고 좋은가. 
	// 세부 구현에 집중하도록 하지 않고 논리적인 로직을 쉽게 파악할 수 있도록 구현하는 것.
	public int add(String text) {
		// text 값이 비어 있으면 0을 반환
		if(isBlank(text)){
			return 0;
		}
		
		// 비어 있지 않으면 구분자로 분리 
		// 숫자로 변환한 디 이 숫자의 합을 구한다. 
		return sum(toInts(split(text))); 
	}
	
	// (2)
	// 전체 흐름을 쉽게 파악할 수 있도록 하기 위해서 
	// 세부 구현은 private 메소드로 분리해 관심사에서 제외한다.
	private boolean isBlank(String text){
		return text == null || text.isEmpty();
	}
	
	private String[] split(String text) {
		Matcher m = Pattern.compile("//(.)\n(.*)").matcher(text);
		if(m.find()){
			String customDelimeter = m.group(1);
			return m.group(2).split(customDelimeter);
		}
		
		return text.split(",|:");
	}
	
	private int[] toInts(String[] values) {
		int[] numbers = new int[values.length];
		for(int i=0; i<values.length; i++){
			//numbers[i] = Integer.parseInt(values[i]);
			numbers[i] = toPositive(values[i]);
		}
		return numbers;
	}
	
	private int toPositive(String value){
		int number = Integer.parseInt(value);
		if(number < 0){
			throw new RuntimeException();
		}
		return number;
	}
	
	private int sum(int[] values){
		int sum = 0;
		for(int value : values) {
			sum += value;
		}
		return sum;
	}
	
}
