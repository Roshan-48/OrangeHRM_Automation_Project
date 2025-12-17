package com.crm.BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.crm.FileUtility.ReadFile;

public class BaseClass {
	public static WebDriver driver = null;
	@BeforeClass
	public void preCondition() throws IOException {
		
		String browser = ReadFile.propertiesFile("browser");
		String url = ReadFile.propertiesFile("url");
		
		if(browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("edge")) {
			driver = new EdgeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("safari")) {
			driver = new SafariDriver();
		}
		else if(browser.equalsIgnoreCase("internetExplorer")) {
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get(url);
	}
	
	@BeforeMethod
	public void login() throws IOException {
		String username = ReadFile.propertiesFile("username");
		String password = ReadFile.propertiesFile("password");
		WebElement usernameTextField = driver.findElement(By.name("username"));
		usernameTextField.sendKeys(username);
		WebElement passwordTextField = driver.findElement(By.name("password"));
		passwordTextField.sendKeys(password);
		driver.findElement(By.cssSelector("button[type='submit']")).click();
	}
	
	@AfterMethod
	public void logOut() {
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("//ul[@class='oxd-dropdown-menu']/li[4]/a")).click();
	}
	
	@AfterClass
	public void postCondition() {
		driver.quit();
	}
}
