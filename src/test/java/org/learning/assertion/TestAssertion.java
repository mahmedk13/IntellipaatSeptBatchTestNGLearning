package org.learning.assertion;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class TestAssertion {
	
	
	@Test
	public void verifyTitle() {
		String expected="abc";
		String actual="abc";
		
		Assert.assertEquals(expected, actual);
		
	}
	
	@Test
	public void verifyCheckboxisSelected() {
		boolean b = false;
		
		Assert.assertFalse(b);
		
	}
	
	@Test
	public void failTheTestCase() {
		Assert.fail();
		System.out.println("failing the test case deliberately");		
	}
	
	@Test
	public void skipTheTestCase() {
		
		throw new SkipException("skipping because this test case applicable on firefox");	
	}

}
