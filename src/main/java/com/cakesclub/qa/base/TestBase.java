package com.cakesclub.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import qa.cakesclub.qa.util.TestUtil;

public class TestBase {
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase(){
	
	try{
		prop = new Properties();
<<<<<<< HEAD
		FileInputStream ip = new FileInputStream("C:/Users/Sanjib-pc/git/cakesClub/cakesClub/src/main/java/com/cakesclub/qa/config/config.properties");
=======
		FileInputStream ip = new FileInputStream("C:/workspace_sanjib/cakesClub/src/main/java/com/cakesclub/qa/config/config.properties");
>>>>>>> e5aeffe1f2e5e61c306399a8a2dcf92c593db33e
		prop.load(ip);			
	}
	catch(FileNotFoundException e){
		e.printStackTrace();
		}
	catch(IOException e){
		e.printStackTrace();			
	}
	}
	public static void initialization(){
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome")){
			System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equals("FF")){
			System.setProperty("webdriver.gecko.driver", "D:/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equals("IE")){
			System.setProperty("webdriver.ie.driver", "D:/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		
		
	}

}
