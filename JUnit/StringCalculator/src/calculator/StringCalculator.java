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

public class StringCalculator {
	
	public int add(String text) {
		if(text == null || text.isEmpty()){
			return 0;
		}
		
		if(text.contains(",")){
			String[] values = text.split(",");
			int sum = 0;
			for(String value : values){
				sum += Integer.parseInt(value);
			}
			return sum;
		}
		
		return Integer.parseInt(text);
	}
}
