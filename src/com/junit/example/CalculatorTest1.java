package com.junit.example;

public class CalculatorTest1 {

	private int nbErrors = 0;

	public void testData() {
		Calculator calculator = new Calculator();
		double result = calculator.add(10, 50);

		if (result != 60) {
			throw new IllegalStateException("Bad Result :" + result);
		}
	}

	public static void main(String[] args) {
		// Slightly better Test Program

		CalculatorTest1 test = new CalculatorTest1();
		try {
			test.testData();

		} catch (Throwable e) {
			// TODO: handle exception
			test.nbErrors++;
			e.printStackTrace();
		}

		if (test.nbErrors > 0) {
			throw new IllegalStateException(" There were " + test.nbErrors + " error (s). ");
		}

	}

}
