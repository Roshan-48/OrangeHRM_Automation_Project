package com.crm.BaseClass;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.crm.FileUtility.ReadFile;
import com.crm.Pom.Dashboard;
import com.crm.Pom.Login;

public class AdminBase {

    public static WebDriver driver;

    @BeforeMethod
    public void precondition() throws IOException {
        String browser = ReadFile.propertiesFile("browser");
        String url = ReadFile.propertiesFile("url");
        String username = ReadFile.propertiesFile("username");
        String password = ReadFile.propertiesFile("password");

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("safari")) {
            driver = new SafariDriver();
        } else {
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(url);

        Login log = new Login(driver);
        log.getUsername(username);
        log.getPassword(password);
        log.getLogin_button();
        
        Dashboard dashboard = new Dashboard(driver);
        dashboard.getAdmin_tab().click();
        Assert.assertTrue(driver.getCurrentUrl().contains("admin"),"Admin failed: Admin page not loaded");
    }

    @AfterMethod
    public void postcondition() {
        driver.quit();
    }
}

