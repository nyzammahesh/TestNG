package org.parallelmethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassA {
	
	static WebDriver driver;
	

	
	@Test
	private void tc01() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
    driver.get("https://en-gb.facebook.com/");

	}@Test
	private void tc02() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.oracle.com/java/technologies/downloads/#jdk17-windows");
	}

	

}
