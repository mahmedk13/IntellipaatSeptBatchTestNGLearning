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

public class DemoB {
	
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("I am inside before class of demoB class");
	}
	
	
	
	
	@Test
	public void bookingHotel() {
		System.out.println("I am booking the Hotel");
	}
	
	@Test
	public void bookingCar() {
		System.out.println("I am booking the Car");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("I am inside after class of demoB class");
	}
	
	

}
