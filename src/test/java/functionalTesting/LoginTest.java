package functionalTesting;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.io.IOException;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.LoginBase;
import com.crm.FileUtility.ExcelUtility;
import com.crm.FileUtility.ReadFile;
import com.crm.Pom.Login;
import com.crm.SeleniumUtility.WaitFactory;
@Listeners(com.crm.Listeners.ExtentReportWithListeners.class)
public class LoginTest extends LoginBase {
	@Test(priority = 0)
	public void tc_001_verifyLoginPage() throws IOException {
		assertEquals(driver.getCurrentUrl(), ReadFile.propertiesFile("url"));
		Login log = new Login(driver);
		log.getLogin_header();
		log.getOrangeHrm_logo();
	}
	
	@Test(priority = 1)
	public void tc_002_verifyUsernamePlaceholder() { 
		Login log = new Login(driver);
		assertTrue(log.getUsername().isEnabled(), "Username textfield is not enabled");
	}
	
	@Test(priority = 2)
	public void tc_003_verifyPasswordPlaceholder() {
		Login log = new Login(driver);
		assertTrue(log.getPassword().isEnabled(), "Password textfield is not enabled");
	}
	
	@Test(priority = 3)
	public void tc_004_verifyUsernamePlaceholder() {
	    Login log = new Login(driver);
	    String placeholder = log.getUsername().getAttribute("placeholder");
	    Assert.assertTrue(placeholder.equalsIgnoreCase("username"), "Username placeholder mismatch");
	}

	@Test(priority = 4)
	public void tc_005_verifyPasswordPlaceholder() {
	    Login log = new Login(driver);
	    String placeholder = log.getPassword().getAttribute("placeholder");
	    Assert.assertTrue(placeholder.equalsIgnoreCase("Password"), "Password placeholder mismatch");
	}
	
	@Test(priority = 5)
	public void tc_006_verifyLoginButtonEnabled() {
	    Login log = new Login(driver);
	    assertTrue(log.getLoginButton().isEnabled(), "Login button is not enabled");
	}
	
	@Test(priority = 6)
	public void tc_007_verifyForgotPasswordLink() {
	    Login log = new Login(driver);
	    assertTrue(log.gerForgot_password().isDisplayed(), "Forgot password link not displayed");
	}
	
	@Test(priority = 7, dataProvider = "loginData", dataProviderClass = ExcelUtility.class)
	public void tc_008_validateLoginBehavior(String username, String password, String expectedResult) {
	    Login log = new Login(driver);
	    log.getUsername(username);
	    log.getPassword(password);
	    log.getLogin_button();
	    if (expectedResult.equalsIgnoreCase("valid")) {
	        WaitFactory.waitForUrlContains(driver, "dashboard");
	        Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"BUG: Valid credentials did NOT login successfully");
	    } else {
	    		WaitFactory.waitForVisibility(driver, log.getErrorMsg());
	        Assert.assertTrue(log.getErrorMsg().isDisplayed(),"BUG: Invalid credentials logged in successfully");
	    }
	}

	@Test(priority = 8, dataProvider = "loginData", dataProviderClass = ExcelUtility.class)
	public void tc_009_verifyErrorMessageText(String username, String password, String expectedResult) throws Exception {
		 if (expectedResult.equalsIgnoreCase("valid")) {
		    throw new SkipException("Skipping valid login case");
		 }
		 Login log = new Login(driver);
	     log.getUsername(username);
		 log.getPassword(password);
		 log.getLogin_button();
		 String actualError = log.getErrorMsg().getText();
		 Assert.assertEquals(actualError, "Invalid credentials", "Error message text mismatch");
	}
	
	@Test(priority = 9)
	public void tc_010_verifyErrorForEmptyCredentials() {
	    Login log = new Login(driver);
	    log.getLogin_button();
	    WaitFactory.waitForVisibility(driver, log.getUsernameRequiredError());
	    WaitFactory.waitForVisibility(driver, log.getPasswordRequiredError());
	    Assert.assertTrue(log.getRequiredError().isDisplayed(), "Required message not shown for empty credentials");
	}
	
	@Test(priority = 10)
	public void tc_011_verifySocialIconsDisplayed() {
	    Login log = new Login(driver);
	    Assert.assertTrue(log.getLinkedinicon().isDisplayed());
	    Assert.assertTrue(log.getFacebook_icon().isDisplayed());
	    Assert.assertTrue(log.getTwitter_icon().isDisplayed());
	    Assert.assertTrue(log.getYoutube_icon().isDisplayed());
	}
	
	@Test(priority = 11)
	public void tc_012_verifyFooterText() {
	    Login log = new Login(driver);
	    Assert.assertTrue(log.getFooter_text().contains("OrangeHRM"), "Footer text mismatch");
	}
}
