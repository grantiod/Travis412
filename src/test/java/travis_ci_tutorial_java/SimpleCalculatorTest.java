package travis_ci_tutorial_java;

import java.util.*;

import static org.junit.Assert.*;
import org.junit.*;

public class SimpleCalculatorTest {
	@Test
	public void testAdd() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.add(1, 1), 2);
		assertEquals(calc.add(2, 0), 2);
	}
	
	@Test
	public void testMinus() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.minus(5, 3), 2);
	}
	
	@Test
	public void testMultiply() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.multiply(5, 3), 15);
		assertEquals(calc.multiply(5, 0), 0);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testDivide() {
		SimpleCalculator calc = new SimpleCalculator();
		assertEquals(calc.divide(5, 2), 1.5);
	}
}
