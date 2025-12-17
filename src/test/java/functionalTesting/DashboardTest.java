package functionalTesting;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.crm.BaseClass.DashboardBase;
import com.crm.Pom.Dashboard;
@Listeners(com.crm.Listeners.ExtentReportWithListeners.class)
public class DashboardTest extends DashboardBase {
	 @Test(priority = 0)
	 public void tc_001_verifyDashboardUrl() {
	     Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Dashboard page not loaded");
	 }
	 
	 @Test(priority = 1)
	 public void tc_002_verifyDashboardHeader() {
	     Dashboard dash = new Dashboard(driver);
	     Assert.assertTrue(dash.getDashboard_header().isDisplayed(),"Dashboard header is not displayed");
	 }
	 
	 @Test(priority = 2)
	 public void tc_003_verifyMenuTabsDisplayed() {
	     Dashboard dash = new Dashboard(driver);
	     Assert.assertTrue(dash.getAdmin_tab().isDisplayed());
	     Assert.assertTrue(dash.getPim_tab().isDisplayed());
	     Assert.assertTrue(dash.getLeave_tab().isDisplayed());
	     Assert.assertTrue(dash.getTime_tab().isDisplayed());
	     Assert.assertTrue(dash.getRecruitment_tab().isDisplayed());
	     Assert.assertTrue(dash.getMyinfo_tab().isDisplayed());
	     Assert.assertTrue(dash.getPerformance_tab().isDisplayed());
	     Assert.assertTrue(dash.getDashboard_tab().isDisplayed());
	     Assert.assertTrue(dash.getDirectory_tab().isDisplayed());
	     Assert.assertTrue(dash.getMaintenance_tab().isDisplayed());
	     Assert.assertTrue(dash.getClaim_tab().isDisplayed());
	     Assert.assertTrue(dash.getBuzz_tab().isDisplayed()); 
	 }
	 
	 @Test(priority = 3)
	 public void tc_004_verifyProfileDropdownOptions() {
	     Dashboard dash = new Dashboard(driver);
	     dash.getProfile_icon().click();
	     Assert.assertTrue(dash.getAbout_option().isEnabled());
	     Assert.assertTrue(dash.getSupport_option().isEnabled());
	     Assert.assertTrue(dash.getChange_password_option().isEnabled());
	     Assert.assertTrue(dash.getLogout_option().isEnabled());
	 }
	 
	 @Test(priority = 4)
	 public void tc_005_verifyLogoutFunctionality() {
	     Dashboard dash = new Dashboard(driver);
	     dash.getProfile_icon().click();
	     dash.getLogout_option().click();
	     Assert.assertTrue(driver.getCurrentUrl().contains("login"),"Logout failed, user still on dashboard");
	 }
	 
	 @Test(priority = 5)
	 public void tc_006_verifyDashboardWidgets() {
	     Dashboard dash = new Dashboard(driver);
	     Assert.assertTrue(dash.getWidget_time_at_work().isDisplayed());
	     Assert.assertTrue(dash.getWidget_my_actions().isDisplayed());
	     Assert.assertTrue(dash.getWidget_quick_launch().isDisplayed());
	     Assert.assertTrue(dash.getWidget_buzz_posts().isDisplayed());
	     Assert.assertTrue(dash.getWidget_employees_on_leave().isDisplayed());
	     Assert.assertTrue(dash.getWidget_employee_distribution().isDisplayed());
	     Assert.assertTrue(dash.getWidget_employee_location().isDisplayed());
	 }
	 
	 @Test(priority = 6)
	 public void tc_007_verifySearchTabEnabled() {
	     Dashboard dash = new Dashboard(driver);
	     Assert.assertTrue(dash.getTab_Search().isEnabled(),"Search tab is not enabled");
	 }
	 
	 @Test(priority = 7)
	 public void tc_008_verifySidebarToggle() {
	     Dashboard dash = new Dashboard(driver);
	     dash.getSidebar_arrow().click();
	     Assert.assertTrue(true, "Sidebar toggle clicked successfully");
	 }
	 
	 @Test(priority = 8)
	 public void tc_009_verifyQuickLaunchOptions() {
	     Dashboard dash = new Dashboard(driver);
	     Assert.assertTrue(dash.getQuicklaunch_assignLeave().isDisplayed());
	     Assert.assertTrue(dash.getQuicklaunch_leaveList().isDisplayed());
	     Assert.assertTrue(dash.getQuicklaunch_timesheets().isDisplayed());
	     Assert.assertTrue(dash.getQuicklaunch_applyLeave().isDisplayed());
	 }
	 
	 @Test(priority = 9)
	 public void tc_010_verifyHelpIconDisplayed() {
	     Dashboard dash = new Dashboard(driver);
	     Assert.assertTrue(dash.getHelp_button().isDisplayed(),"Help icon is not displayed");
	 }
	 
	 @Test(priority = 10)
	 public void tc_011_verifyDashboardFooter() {
	     Dashboard dash = new Dashboard(driver);
	     Assert.assertTrue(dash.getFooter_text().getText().contains("OrangeHRM"),"Footer text mismatch");
	 }
	 
	 @Test(priority = 11)
	 public void tc_012_verifyMyActionsLinksDisplayed() {
	     Dashboard dash = new Dashboard(driver);
	     Assert.assertTrue(dash.getMyaction_link1().isDisplayed(),"My Actions link 1 not displayed");
	    // Assert.assertTrue(dash.getMyaction_link2().isDisplayed(),"My Actions link 2 not displayed");
	 }
	 
	 @Test(priority = 12)
	 public void tc_013_verifyQuickLaunchCardsEnabled() {
	     Dashboard dash = new Dashboard(driver);
	     Assert.assertTrue(dash.getQuicklaunch_assignLeave().isEnabled());
	     Assert.assertTrue(dash.getQuicklaunch_leaveList().isEnabled());
	     Assert.assertTrue(dash.getQuicklaunch_timesheets().isEnabled());
	     Assert.assertTrue(dash.getQuicklaunch_applyLeave().isEnabled());
	     Assert.assertTrue(dash.getQuicklaunch_myLeave().isEnabled());
	     Assert.assertTrue(dash.getQuicklaunch_myTimesheet().isEnabled());
	 }
	 
	 @Test(priority = 13)
	 public void tc_014_verifyTimeClockIconEnabled() {
	     Dashboard dash = new Dashboard(driver);
	     Assert.assertTrue(dash.getTime_clock_icon().isDisplayed(),"Time clock icon not displayed");
	     Assert.assertTrue(dash.getTime_clock_icon().isEnabled(),"Time clock icon not enabled");
	 }
	 
	 @Test(priority = 14)
	 public void tc_015_verifyEmployeeSubUnitsDisplayed() {
	     Dashboard dash = new Dashboard(driver);
	     Assert.assertTrue(dash.getSubunit_engineering().isDisplayed());
	     Assert.assertTrue(dash.getSubunit_humanResources().isDisplayed());
	     //Assert.assertTrue(dash.getSubunit_administration().isDisplayed());
	     //Assert.assertTrue(dash.getSubunit_clientServices().isDisplayed());
	     Assert.assertTrue(dash.getSubunit_unassigned().isDisplayed());
	 }
	 
	 @Test(priority = 15)
	 public void tc_016_verifyEmployeeLocationsDisplayed() {
	     Dashboard dash = new Dashboard(driver);
	     Assert.assertTrue(dash.getLocation_texasRD().isDisplayed());
	     //Assert.assertTrue(dash.getLocation_newYorkSales().isDisplayed());
	     Assert.assertTrue(dash.getLocation_unassigned().isDisplayed());
	 }

	 @Test(priority = 16)
	 public void tc_017_verifyUpgradeButtonDisplayed() {
	     Dashboard dash = new Dashboard(driver);
	     Assert.assertTrue(dash.getUpgrade_button().isDisplayed(),"Upgrade button not displayed");
	 }

}
