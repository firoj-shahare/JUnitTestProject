package com.junit.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test Class Showing @DisplayName Annotation")
public class DisplayNameTest {

	private SimpleUT systemUnitTest = new SimpleUT();

	@Test
	@DisplayName("Our system under test say hello")
	public void testHello() {
		String actual = systemUnitTest.hello();
		String expected = "Hello";

		assertEquals(expected, actual);
	}

	@Test
	@DisplayName("U+1F606")
	public void testBye() {
		String actual = systemUnitTest.bye();
		String expected = "Bye";

		assertEquals(expected, actual);
	}

	@Test
	public void testTalking() {
		String talk = systemUnitTest.talk();
		
		assertEquals("How r u?", talk);
	}
	
}
