package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import calculator.StringCalculator;

public class StringCalculatorTest {
	private StringCalculator cal;
	
	@Before
	public void setup(){
		cal = new StringCalculator();
	}
	
	@Test
	public void add_null_or_empty() {
		assertEquals(0, cal.add(null));
		assertEquals(0, cal.add(""));
	}
	
	@Test 
	public void add_one() throws Exception {
		assertEquals(1, cal.add("1"));
	}
	
	@Test
	public void add_delimiter() throws Exception {
		assertEquals(3, cal.add("1,2"));
	}
}
