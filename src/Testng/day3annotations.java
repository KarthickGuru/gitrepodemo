package Testng;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class day3annotations {

	@Test
	public void method3() {

		System.out.println("Skoda Octavia VRS");
	}

	@BeforeClass
	public void Train() {

		System.out.println("It will execute before on particular Class level");
	}

	@Test(groups = { "Smoke Testing" })
	public void method4() {
		System.out.println("skoda superb");
	}

	@BeforeSuite
	public void method5() {

		System.out.println("I will execute the first suite");
	}

}
