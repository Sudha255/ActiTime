package com_DemoActiTime_Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo1 {
	
	@Test
	public void TestA() throws InterruptedException
	{
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver=new FirefoxDriver();
		driver.get("https://google.com");
		String title=driver.getTitle();
		Reporter.log("Page title"+title,true);
		Thread.sleep(5000);
		driver.close();
	}

	}


