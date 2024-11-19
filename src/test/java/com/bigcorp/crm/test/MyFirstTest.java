package com.bigcorp.crm.test;


import org.junit.Assert;
import org.junit.Test;

public class MyFirstTest {

@Test
public void testSuccess() {
	int expectedValue = 4;
	int computedValue = 2 + 2;
	Assert.assertEquals(expectedValue, computedValue);
}

	@Test
	public void testFailure() {
		Assert.assertEquals(3, 2);
	}

}