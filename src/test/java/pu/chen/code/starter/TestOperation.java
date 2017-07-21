package pu.chen.code.starter;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestOperation {
	@Test 
	public void testPlus() {
		int a = 10;
		int b = 20;
		assertEquals(a+b, Operation.plus(a, b));
	}
}
