package magauw.TestJunit4to5;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.Test;

public class SimpleNaturalCalculatorJunit5Test {

	@Test
	  void shouldAdd() {
	    SimpleNaturalCalculator calculator = new SimpleNaturalCalculator();

	    int result = calculator.addition(1, 2);

	    assertEquals(3, result);
	  }

	  @Test
	  void shouldSubstract() {
	    SimpleNaturalCalculator calculator = new SimpleNaturalCalculator();

	    int result = calculator.substraction(1, 2);

	    assertEquals(-1, result);
	  }

	  @Test
	  void shouldMultiply() {
	    SimpleNaturalCalculator calculator = new SimpleNaturalCalculator();

	    int result = calculator.multiplication(1, 2);

	    assertEquals(2, result);
	  }

	  @Test
	  void shouldDivide() {
	    SimpleNaturalCalculator calculator = new SimpleNaturalCalculator();

	    int result = calculator.division(1, 2);

	    assertEquals(0, result);
	  }
}
