package Testng;

import org.testng.annotations.Test;

public class day4helperattribute {

	// we can priortize the test case which one need to first execute before that
	// the test case

	@Test
	public void signup() {
		System.out.println("successfully signup the whatsapp");
	}

	@Test(dependsOnMethods = { "signup" })
	public void account() {
		System.out.println("My Account Page");
	}

	@Test
	public void bankbalance() {
		System.out.println("My statment Balance");
		
		
	}

	// It will not execute.
	@Test(enabled = false)
	public void history() {
		System.out.println("My History");
	}

	@Test(dependsOnMethods = { "signup" })
	public void logout() {
		System.out.println("logout");
	}
	
	
	@Test(timeOut=5000)
	public void banana() {
		System.out.println("TestNG");
	}
	
	@Test(groups= {"run"})
	public void cat() {
		System.out.println("Cucumber");
	}
	
	@Test(enabled=false)
	public void cars() {
		System.out.println("Yogcut");
	}
	
	

}
