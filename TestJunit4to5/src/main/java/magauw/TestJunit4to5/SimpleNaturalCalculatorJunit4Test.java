package magauw.TestJunit4to5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SimpleNaturalCalculatorJunit4Test {

	@Test
	public void shouldAdd() {
		SimpleNaturalCalculator calculator = new SimpleNaturalCalculator();

		int result = calculator.addition(1, 2);

		assertEquals(3, result);
	}

	@Test
	public void shouldSubstract() {
		SimpleNaturalCalculator calculator = new SimpleNaturalCalculator();

		int result = calculator.substraction(1, 2);

		assertEquals(-1, result);
	}

	@Test
	public void shouldMultiply() {
		SimpleNaturalCalculator calculator = new SimpleNaturalCalculator();

		int result = calculator.multiplication(1, 2);

		assertEquals(2, result);
	}

	@Test
	public void shouldDivide() {
		SimpleNaturalCalculator calculator = new SimpleNaturalCalculator();

		int result = calculator.division(1, 2);

		assertEquals(0, result);
	}
}
