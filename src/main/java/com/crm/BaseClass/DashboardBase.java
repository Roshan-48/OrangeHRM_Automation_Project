package com.crm.BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.crm.FileUtility.ReadFile;
import com.crm.Pom.Login;
import com.crm.SeleniumUtility.WaitFactory;

public class DashboardBase {
	 public static WebDriver driver;

	 @BeforeMethod
	 public void precondition() throws IOException {
		 String browser = ReadFile.propertiesFile("browser");
	
	        if (browser.equalsIgnoreCase("chrome")) {
	            driver = new ChromeDriver();
	        } else if (browser.equalsIgnoreCase("edge")) {
	            driver = new EdgeDriver();
	        } else if (browser.equalsIgnoreCase("firefox")) {
	            driver = new FirefoxDriver();
	        }else if(browser.equalsIgnoreCase("safari")) {
				driver = new SafariDriver();
			}
			else {
				driver = new ChromeDriver();
			}
	        DriverManager.setDriver(driver);
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	     driver.get(ReadFile.propertiesFile("url"));
	     
	     Login log = new Login(driver);
	     log.getUsername(ReadFile.propertiesFile("username"));
	     log.getPassword(ReadFile.propertiesFile("password"));
	     log.getLogin_button();
	     WaitFactory.waitForUrlContains(driver, "dashboard");
	}

	@AfterMethod
	public void postcondition() {
	    driver.quit();
	    DriverManager.unload();
	}
}
