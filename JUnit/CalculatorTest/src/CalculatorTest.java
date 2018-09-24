import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	private Calculator cal;
	
	@Before
	public void setup(){
		cal = new Calculator();
		System.out.println("Before");
	}
	
	@Test
	public void divide() {
		assertEquals(2, cal.divide(6, 3));
		System.out.println("divide");
	}
	
	@Test
	public void multiply(){
		assertEquals(18, cal.multiply(6, 3));
		System.out.println("multiply");
	}
	
	@Test
	public void subtract(){
		assertEquals(9, cal.add(6, 3));
		System.out.println("subtract");
	}
	
	@Test
	public void add(){
		assertEquals(3, cal.subtract(6, 3));
		System.out.println("add");
	}

	@After
	public void teardown(){
		System.out.println("teardown");
	}
}
