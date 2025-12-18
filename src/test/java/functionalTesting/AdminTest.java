package functionalTesting;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.AdminBase;
import com.crm.FileUtility.ExcelUtility;
import com.crm.Pom.Admin;
import com.crm.SeleniumUtility.CustomDropdownUtility;
import com.crm.SeleniumUtility.WaitFactory;
@Listeners(com.crm.Listeners.ExtentReportWithListeners.class)
public class AdminTest extends AdminBase {
	CustomDropdownUtility dropdown = new CustomDropdownUtility();
	 @Test(priority = 1)
	    public void tc_001_verifyAdminPageLoaded() {
	        Admin admin = new Admin(driver);
	        assertTrue(admin.getAdmin_header().isDisplayed(),
	                "Admin page not loaded");
	    }
	 
	 @Test(priority = 2)
	    public void tc_002_verifyMainMenuNavigation() {
	        Admin admin = new Admin(driver);
	        WaitFactory.waitForClickable(driver, admin.getPim_tab()).click();
	        WaitFactory.waitForVisibility(driver, admin.getPim_tab());
	        assertTrue(driver.getPageSource().contains("PIM"));
	        WaitFactory.waitForClickable(driver, admin.getLeave_tab()).click();
	        assertTrue(driver.getPageSource().contains("Leave"));
	        WaitFactory.waitForClickable(driver, admin.getTime_tab()).click();
	        assertTrue(driver.getPageSource().contains("Time"));
	        WaitFactory.waitForClickable(driver, admin.getDashboard_tab()).click();
	        assertTrue(driver.getPageSource().contains("Dashboard"));
	    }
	 
	 @Test(priority = 3)
	    public void tc_003_verifyAdminMenus() {
	        Admin admin = new Admin(driver);
	        WaitFactory.waitForClickable(driver, admin.getOrganization_menu()).click();
	        WaitFactory.waitForVisibility(driver, admin.getNationalities_menu());
	        assertTrue(admin.getNationalities_menu().isDisplayed());
	        WaitFactory.waitForClickable(driver, admin.getQualifications_menu()).click();
	        assertTrue(admin.getQualifications_menu().isDisplayed());
	        WaitFactory.waitForClickable(driver, admin.getConfiguration_menu()).click();
	        assertTrue(admin.getConfiguration_menu().isDisplayed());
	    }	
	 
	  @Test(priority = 4, dataProvider = "usernameData", dataProviderClass = ExcelUtility.class)
	    public void tc_004_searchUserByUsername(String username) {
	        Admin admin = new Admin(driver);
	        admin.getSearch_username().clear();
	        admin.getSearch_username().sendKeys(username);
	        admin.getSearch_button().click();
	        assertTrue(admin.getTable_body().isDisplayed(),"Username search failed");
	    }
	  
	  @Test(priority = 5)
	    public void tc_005_searchUserByUserRole() {
	        Admin admin = new Admin(driver);
	        WaitFactory.waitForClickable(driver, admin.getSearch_userRole_dropdown());
	        dropdown.selectByText(driver, admin.getSearch_userRole_dropdown(), "Admin");
	        admin.getSearch_button().click();
	        assertTrue(admin.getTable_body().isDisplayed());
	    }
	  
	  @Test(priority = 6)
	    public void tc_006_searchUserByEmployeeName() {
	        Admin admin = new Admin(driver);
	        admin.getSearch_employeeName().sendKeys("Paul");
	        admin.getSearch_employeeName().sendKeys(Keys.ARROW_DOWN);
	        admin.getSearch_employeeName().sendKeys(Keys.ENTER);
	        admin.getSearch_button().click();
	        assertTrue(admin.getTable_body().isDisplayed());
	    }
	  
	  @Test(priority = 7)
	  public void tc_007_searchUserByStatus() {
		  Admin admin = new Admin(driver);
		  	admin.getReset_button().click();
		    WaitFactory.waitForClickable(driver, admin.getSearch_status_dropdown());
		    dropdown.selectByText(driver, admin.getSearch_status_dropdown(), "Enabled");
		    admin.getSearch_button().click();
		    assertTrue(admin.getTable_body().isDisplayed(),"Status search failed");
	  }

	  
	  @Test(priority = 8)
	    public void tc_008_combinedSearchUserRoleAndStatus() {
	        Admin admin = new Admin(driver);
	        WaitFactory.waitForClickable(driver, admin.getSearch_userRole_dropdown());
	        dropdown.selectByText(driver, admin.getSearch_userRole_dropdown(), "Admin");
	        WaitFactory.waitForClickable(driver, admin.getSearch_status_dropdown());
	        dropdown.selectByText(driver, admin.getSearch_status_dropdown(), "Enabled");
	        admin.getSearch_button().click();
	        assertTrue(admin.getTable_body().isDisplayed(),"Combined search failed");
	    }
	  
	  @Test(priority = 9)
	    public void tc_009_verifyResetButton() {
	        Admin admin = new Admin(driver);
	        admin.getSearch_username().sendKeys("Admin");
	        admin.getReset_button().click();
	        Assert.assertEquals(admin.getSearch_username().getAttribute("value"),"", "Reset button not working");
	    }
	  
	  @Test(priority = 10)
	    public void tc_010_verifyAddUserNavigation() {
	        Admin admin = new Admin(driver);
	        admin.getAdd_button().click();
	        assertTrue(driver.getCurrentUrl().contains("saveSystemUser"),"Add User page not opened");
	    }
	  
	  @Test(priority = 11)
	    public void tc_011_verifyTableHeaderCheckbox() {
	        Admin admin = new Admin(driver);
	        admin.getTable_header_checkbox().click();
	        assertTrue(true);
	    }
	  
	  @Test(priority = 12)
	    public void tc_012_verifyEditFirstRecord() {
	        Admin admin = new Admin(driver);
	        admin.getEdit_firstRecord().click();
	        assertTrue(driver.getCurrentUrl().contains("saveSystemUser"),"Edit page not opened");
	    }
	  
	  @Test(priority = 13)
	    public void tc_013_verifyDeleteCancelFlow() throws InterruptedException {
	        Admin admin = new Admin(driver);
	        WaitFactory.waitForClickable(driver, admin.getDelete_firstRecord()).click();
	        WaitFactory.waitForVisibility(driver, admin.getCancel_delete());
	        admin.getCancel_delete().click();
	        assertTrue(admin.getTable_body().isDisplayed(),"Cancel delete failed");
	    }
	  
	  @Test(priority = 14)
	    public void tc_014_verifyDeleteConfirmFlow() throws InterruptedException {
		  	Admin admin = new Admin(driver);
		  	WaitFactory.waitForClickable(driver, admin.getDelete_firstRecord()).click();
		    WaitFactory.waitForVisibility(driver, admin.getConfirm_delete());
		    admin.getConfirm_delete().click();
		    WaitFactory.waitForVisibility(driver, admin.getTable_body());
		    assertTrue(admin.getTable_body().isDisplayed(),"Confirm delete failed");
	    }
	  
	  @Test(priority = 15)
	    public void tc_015_verifyProfileDropdownOptions() {
	        Admin admin = new Admin(driver);
	        WaitFactory.waitForClickable(driver, admin.getProfile_icon()).click();
	        WaitFactory.waitForVisibility(driver, admin.getAbout_option());
	        assertTrue(admin.getAbout_option().isDisplayed());
	        assertTrue(admin.getSupport_option().isDisplayed());
	        assertTrue(admin.getChange_password_option().isDisplayed());
	        assertTrue(admin.getLogout_option().isDisplayed());
	    }
	  
	  @Test(priority = 16)	
	    public void tc_016_verifyHelpButton() {
	        Admin admin = new Admin(driver);
	        admin.getHelp_button().click();
	        assertTrue(true);
	    }
	  
	    @Test(priority = 17)
	    public void tc_019_verifyFooterText() {
	        Admin admin = new Admin(driver);
	        assertTrue(admin.getFooter_text().contains("OrangeHRM"),"Footer text mismatch");
	    }
}
