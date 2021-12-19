package com.sqa.selenium1.test;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestingWeb {

	@Test
	public void test() {
		System.setProperty("webdriver.chrome.driver", "/home/luffy/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com");
		driver.manage().window().maximize();
	}

}
