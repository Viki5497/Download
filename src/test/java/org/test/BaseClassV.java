package org.test;

import java.util.Date;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassV {
	public static WebDriver driver;

	public static WebDriver driverData() {
		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\Driver's\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	public static void webPage(String url) {
		driver.get(url);
	}
	public static void txt(WebElement ele, String txt) {
		ele.sendKeys(txt);
	}
	public static void clk(WebElement ele) {
		ele.click();
	}
	public static void sleep(long a) throws InterruptedException {
		Thread.sleep(a);
	}
	public static void quit() {
		driver.quit();
	}
	public static void dateTime(Date d) {
		d = new Date(); 
		System.out.println(d);
	}
}
