package Testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class day2 {

	@AfterMethod
	public void method7() {
		System.out.println("I will execute after every test methods");

	}

	@AfterTest
	public void metHod2() {

		System.out.println("It will execute the last");
	}

	@Test(groups= {"Smoke Testing"})
	public void bus() {
		System.out.println("KMS");
	}

	@Test
	public void bus1() {
		System.out.println("RKG");
	}

	@BeforeMethod
	public void method9() {

		System.out.println("I will execute before the Every Test Methods");
	}
	
	@Test
	public void method60() {
		System.out.println("TYUI");
	}
	
	@Test
	public void method70() {
		System.out.println("rtyuio");
	}

}
