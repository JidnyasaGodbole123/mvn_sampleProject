package com.crm.Dummy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class mvn_cliTest {
	@Test
	public void createContactTest()
	{
		
	System.out.println("Contact Created Successfully");
	}
	@Test
	public void DeleteContactTest()
	{
		System.out.println("Contact Delete Successfully");
	}
	@Test
	public void launchBrowserTest()
	{
		String BROWSER= System.getProperty("browser");
		String URL= System.clearProperty("url");
		String CHROME = "chrome";
		String FIREFOX = "firefox";
		if(BROWSER.equals(CHROME))
		{
			WebDriver driver = new ChromeDriver();
			driver.get(URL);
			System.out.println("Chrome Browser launched");
		}
		else if(BROWSER.equals(FIREFOX)) {
			WebDriver driver = new FirefoxDriver();
			
				System.out.println("firefox Browser launched");
		}
		
		
				
	}
}
