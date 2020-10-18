package demo.before;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DemoA {
	
	@BeforeSuite
	public void initializeTheDriver() {
		System.out.println("I am initializing the driver");
	}
	
	@BeforeTest
	public void openTheExcel() {
		System.out.println("I am setting up the excel");
	}
	
	@AfterTest
	public void closeTheExcel() {
		System.out.println("closing the excel");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am inside before class of demoa class");
	}
	
	@BeforeMethod
	public void login() {
		System.out.println("login");
	}
	
	@Test
	public void bookingFlightTicket() {
		System.out.println("I am booking the flight ticket");
	}
	
	@Test
	public void bookingTrainTicket() {
		System.out.println("I am booking the train ticket");
	}
	
	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("I am inside after class of demoa class");
	}
	
	@AfterSuite
	public void closeTheDriver() {
		System.out.println("I am closing the driver");
	}
	
	

}
