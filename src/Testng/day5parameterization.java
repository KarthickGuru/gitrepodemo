package Testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day5parameterization {

	@Parameters({ "URL", "username", "password" })
	@BeforeTest
	public void loginpage(String urlname, String User, String Pass) {

		WebDriver driver = new ChromeDriver();

		driver.get(urlname);
		driver.findElement(By.id("username1")).sendKeys(User);
		driver.findElement(By.id("password2")).sendKeys(Pass);

	}

}
