package practice;

import java.io.IOException;

import org.testng.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import basepckg.BaseClass;

import testPages.HomePage;

public class Tests extends BaseClass {
	
	
	
	@BeforeMethod
	public void launchBrowser() throws IOException {
		ReadDriver();
		
		
	}
	
	@Test
	public void testABLink() {
		HomePage homePage=new HomePage(driver);
		Assert.assertTrue(homePage.IsDispaleyd());
		
		
	}
	
	@AfterMethod
	public void tearDownBrowser() throws IOException {
		
		driver.close();
		
	}
	

}
