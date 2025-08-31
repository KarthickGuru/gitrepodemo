package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day1automationwithoutmain {

	@Test
	public void method1day() {

		String name = "Java";

		String val = name.concat("Greeks");

		System.out.println(val);
	}

	@BeforeTest
	public void method2day() {

		System.out.println("It will execute the first");

	}

	@AfterSuite
	public void method6() {

		System.out.println("i will execute the last suite");
	}

	@Test(groups = { "Smoke Testing" })
	public void jeep() {
		System.out.println("Framework");
	}

	@Test(groups = { "Smoke Testing" })
	public void jeepd() {
		System.out.println("Framework");
	}

}