package org.crossbrowsertesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Crissbrowserdataprovider {
	WebDriver driver;
	
	@Test(dataProvider = "parameters")
	private void tc01(String browser) {
	if(browser.equalsIgnoreCase("chrome"))
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.oracle.com/java/technologies/downloads/#jdk17-windows");
	}else if (browser.equalsIgnoreCase("Firefox")) {
		WebDriverManager.firefoxdriver().setup();
		 driver=new FirefoxDriver();
		driver.get("https://www.oracle.com/java/technologies/downloads/#jdk17-windows");
	
	}else if (browser.equalsIgnoreCase("edge")) {
		WebDriverManager.edgedriver().setup();
	    driver=new EdgeDriver();
		driver.get("https://www.oracle.com/java/technologies/downloads/#jdk17-windows");
			
	}
   driver.close();
     
} public static Object  Object[][]={{"chrome"},{"Firefox"}};
	@DataProvider()
	public static Object parameters(){
		return Object;
		
	
	

		
		
	}


}
