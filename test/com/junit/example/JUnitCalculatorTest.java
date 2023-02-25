package com.junit.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JUnitCalculatorTest {

	@Test
	public void testAdd() {
		Calculator calculator = new Calculator();

		double result = calculator.add(10, 50);

		assertEquals(60, result, 0);
	}

}
