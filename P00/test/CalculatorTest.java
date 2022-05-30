import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b); 
	
		int expected = 9999;
		assertEquals (expected, actual);
			

	}
	public void testSubtract() {
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		int expected = 5555;
		assertEquals (expected, actual);
	}
	
	public void testMultiple() {
		int a = 5;
		int b = 5;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a,b);
		int expected = 25;
		assertEquals(expected, actual);
	}
	
	public void testDivide() {
		int a = 6;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a,b);
		int expected = 3;
		assertEquals(expected, actual);
		
	}

}
