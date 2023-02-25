package com.junit.example;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LifeCycleMethodsTest {

	// LifeCycle Methods : ==> @BeforeAll, @AfterAll, @BeforeEach, @AfterEach
	
	@BeforeAll
	// This method Should be static
	static void beforeAllMethod() {                          
		System.out.println(" Before All Method Executed ");
	}

	@AfterAll
	// This method Should be static
	static void afterAllMethod() {
		System.out.println(" After All Method Executed ");
	}

	@BeforeEach
	public void beforeEachMethod() {
		System.out.println(" Before Each Method Executed");
	}

	@AfterEach
	public void afterEachMethod() {
		System.out.println(" After Each Method Executed");
	}

	// Regular Methods
	@Test
	public void regularMethod1() {
		System.out.println(" Regular Method 1 Executed");
	}

	@Test
	public void regularMethod2() {
		System.out.println(" Regular Method 2 Executed");
	}

}
