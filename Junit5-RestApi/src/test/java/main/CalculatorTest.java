package main;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	Calculator calculator;
	@BeforeEach
	public void setup()
	{
		calculator=new Calculator();
	}
	@Test
	public void Testmultiply()
	{
		assertEquals(20, calculator.multiply(4, 5));
		assertEquals(25, calculator.multiply(5, 5));
	}
}
