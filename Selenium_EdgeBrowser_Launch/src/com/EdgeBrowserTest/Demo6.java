package com.EdgeBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Demo6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.edge.driver","C:\\Users\\Sreenithi K\\Testing\\Selenium_EdgeBrowser_Launch\\EdgeBrowserJars\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("  http://www.half.ebay.com");
		driver.manage().window().minimize();

	}
}
