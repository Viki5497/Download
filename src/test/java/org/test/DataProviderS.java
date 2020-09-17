package org.test;

import java.io.IOException;
import java.sql.Driver;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderS extends BaseClassV{
	public WebDriver driver;
	@BeforeClass
	private void launchBrowser() {
		driver=driverData();
	}
	@BeforeMethod
	private void startTime() {
		Date d = new Date();
		System.out.println(d);
	}
	@AfterMethod
	private void endTime() {
		Date d = new Date();
		System.out.println(d);
	}
	@AfterClass
	private void closeBrowser() {
		quit();
	}
	
	@Test(dataProvider="Search products")
	public void search(String i, String p) throws InterruptedException{
		webPage("https://www.amazon.in/");
		WebElement s = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		txt(s, p);
		WebElement sec = driver.findElement(By.xpath("//input[@value='Go']"));
		clk(sec);
		
		sleep(3000);
	}
@DataProvider(name="Search products")
public Object[][] products() {
	return new Object[][] {
		{"1","OnePlus"},
		{"2","iPhone"},
		{"3","Redmi"},
		{"4","Oppo"},
		{"5","Vivo"},
		{"6","Samsung"},
		{"7","Nokia"},
		{"8","Huawei"},
		{"9","Lenovo"},
		{"10","Moto"}
	};
}
}
