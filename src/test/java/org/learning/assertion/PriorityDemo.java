package org.learning.assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PriorityDemo {
	
	@Test(priority =1) // the test case with lowest number will be given high priority
	public void doRegister() {
		System.out.println("I am registration test case");
	}
	
	@Test(priority=-2)
	public void doLogin() {
		System.out.println("I am login test case");
	}
	
	@Test (priority=3, enabled=true)
	public void bookATicket() {
		String actual="booked";
		String expected="booked1";
		
		boolean flag = false;
		
//		SoftAssert sa = new SoftAssert();
		Assert.assertEquals(actual, expected);
		Assert.assertTrue(flag);
		
		//sa.assertAll();
		
		System.out.println("I am booking test case");
	}
	
	@Test(priority=4, dependsOnMethods="doLogin")
	public void doLogout() {
		System.out.println("I am logout case");
	}

}
