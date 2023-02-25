package com.junit.example;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;

public class JUnitTestExample {

	// JunitTest test = new JunitTest();
	@Test
	void testGetList() {
		// fail("Not yet implemented");
		List<String> list = JunitTest.getList();
		
	//	assertEquals(null, list);
		assertEquals(true, list.isEmpty());
		
	}

}
