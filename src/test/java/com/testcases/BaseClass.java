package com.testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseClass {
	 
	public String url="https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_input_test";
	public static WebDriver drv;
	
	
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver","‪C:\\DVN\\Code\\siva\\Assessment\\Drivers\\chromedriver.exe");
		drv=new ChromeDriver();
	}
	
	
	 @AfterClass public void close() { 
		 drv.close();
		 
	 }
	

}
