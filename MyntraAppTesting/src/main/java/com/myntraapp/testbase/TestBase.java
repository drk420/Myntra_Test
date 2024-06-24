package com.myntraapp.testbase;

import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase {

	public static WebDriver driver;
	public static Logger logger;
	
	@BeforeTest
	public void strt() {
		logger = Logger.getLogger("Myntraapp Framework");
		PropertyConfigurator.configure("Log4Jfile.properties");
		logger.info("MyntraApp Framework Strted");
	}
	
	@AfterTest
	public void end() {
		logger.info("Framework End");
		
	}
	
	@BeforeMethod
	public void SetUp() {
		
		String br = "Chrome";
		
		if(br.equalsIgnoreCase("chrome")) {
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
			
		}
		else if(br.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
			
			
		}
		else if(br.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
			
			
		}
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().deleteAllCookies();
		logger.info("Browser,Url Launched");
	}
	@AfterMethod
	public void TesrDown() {
		
		driver.quit();
		logger.info("Browser closed");
		
	}}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

