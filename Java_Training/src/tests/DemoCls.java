package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class DemoCls {
	@Test
	public void testcase1() {
		System.out.println("5.Test Case 1");
	}
	@Test
	public void testcase2() {
		System.out.println("6.Test Case 2");
	}
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("4.Before Method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("6.After Method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("3.Before Class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("7.After Class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("2.Before Test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("8.After Test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("1.Before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("9.After Suite");
	}

}
