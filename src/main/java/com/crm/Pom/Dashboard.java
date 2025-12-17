package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard {
	@FindBy(xpath = "//h6[text()='Dashboard']")
	private WebElement dashboard_header;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement tab_search;
	
	@FindBy(xpath = "//span[text()='Admin']")
	private WebElement admin_tab;

	@FindBy(xpath = "//span[text()='PIM']")
	private WebElement pim_tab;

	@FindBy(xpath = "//span[text()='Leave']")
	private WebElement leave_tab;

	@FindBy(xpath = "//span[text()='Time']")
	private WebElement time_tab;

	@FindBy(xpath = "//span[text()='Recruitment']")
	private WebElement recruitment_tab;

	@FindBy(xpath = "//span[text()='My Info']")
	private WebElement myinfo_tab;

	@FindBy(xpath = "//span[text()='Performance']")
	private WebElement performance_tab;

	@FindBy(xpath = "//span[text()='Dashboard']")
	private WebElement dashboard_tab;

	@FindBy(xpath = "//span[text()='Directory']")
	private WebElement directory_tab;

	@FindBy(xpath = "//span[text()='Maintenance']")
	private WebElement maintenance_tab;

	@FindBy(xpath = "//span[text()='Claim']")
	private WebElement claim_tab;

	@FindBy(xpath = "//span[text()='Buzz']")
	private WebElement buzz_tab;
	
	@FindBy(css = "i[class='oxd-icon bi-chevron-left']")
	private WebElement sidebar_arrow;
	
	@FindBy(xpath = "//button[contains(@class,'oxd-glass-button')]")
	private WebElement upgrade_button;

	@FindBy(xpath = "//img[@class='oxd-userdropdown-img']")
	private WebElement profile_icon;

	@FindBy(xpath = "//a[text()='About']")
	private WebElement about_option;

	@FindBy(xpath = "//a[text()='Support']")
	private WebElement support_option;

	@FindBy(xpath = "//a[text()='Change Password']")
	private WebElement change_password_option;

	@FindBy(xpath = "//a[text()='Logout']")
	private WebElement logout_option;
	
	@FindBy(css = "i[class='oxd-icon bi-question-lg']")
	private WebElement help_button;

	@FindBy(xpath = "//p[text()='Time at Work']")
	private WebElement widget_time_at_work;

	@FindBy(xpath = "//p[text()='My Actions']")
	private WebElement widget_my_actions;

	@FindBy(xpath = "//p[text()='Quick Launch']")
	private WebElement widget_quick_launch;

	@FindBy(xpath = "//p[text()='Buzz Latest Posts']")
	private WebElement widget_buzz_posts;

	@FindBy(xpath = "//p[text()='Employees on Leave Today']")
	private WebElement widget_employees_on_leave;

	@FindBy(xpath = "//p[text()='Employee Distribution by Sub Unit']")
	private WebElement widget_employee_distribution;

	@FindBy(xpath = "//p[text()='Employee Distribution by Location']")
	private WebElement widget_employee_location;
	
	@FindBy(css = "i[class='oxd-icon bi-stopwatch']")
	private WebElement time_clock_icon;

	@FindBy(xpath = "//p[text()='(1) Pending Self Review']")
	private WebElement myaction_link1;

//	@FindBy(xpath = "//p[contains(text(),'Candidate to Interview')]")
//	private WebElement myaction_link2;
	
	@FindBy(xpath = "//p[text()='Assign Leave']")
	private WebElement quicklaunch_assignLeave;

	@FindBy(xpath = "//p[text()='Leave List']")
	private WebElement quicklaunch_leaveList;

	@FindBy(xpath = "//p[text()='Timesheets']")
	private WebElement quicklaunch_timesheets;

	@FindBy(xpath = "//p[text()='Apply Leave']")
	private WebElement quicklaunch_applyLeave;

	@FindBy(xpath = "//p[text()='My Leave']")
	private WebElement quicklaunch_myLeave;

	@FindBy(xpath = "//p[text()='My Timesheet']")
	private WebElement quicklaunch_myTimesheet;
	
	@FindBy(css = "i[class='oxd-icon bi-gear-fill orangehrm-leave-card-icon']")
	private WebElement leave_today_settings;
	
	@FindBy(xpath = "//span[@title='Engineering']")
	private WebElement subunit_engineering;

	@FindBy(xpath = "//span[@title='Human Resources']")
	private WebElement subunit_humanResources;

//	@FindBy(xpath = "//span[@title='Administration']")
//	private WebElement subunit_administration;

//	@FindBy(xpath = "//span[@title='Client Services']")
//	private WebElement subunit_clientServices;

	@FindBy(xpath = "//span[@title='Unassigned']")
	private WebElement subunit_unassigned;
	
	@FindBy(xpath = "//span[@title='Texas R&D']")
	private WebElement location_texasRD;

//	@FindBy(xpath = "//span[@title='New York Sales Office']")
//	private WebElement location_newYorkSales;

	@FindBy(xpath = "(//span[@title='Unassigned'])[2]")
	private WebElement location_unassigned;
	
	@FindBy(xpath = "//a[text()='OrangeHRM, Inc']")
	private WebElement footer_text;

	public Dashboard(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public WebElement getDashboard_header() {
		return dashboard_header;
	}
	public WebElement getTab_Search() {
		return tab_search;
	}
	
	public WebElement getAdmin_tab() {
	    return admin_tab;
	}

	public WebElement getPim_tab() {
	    return pim_tab;
	}

	public WebElement getLeave_tab() {
	    return leave_tab;
	}

	public WebElement getTime_tab() {
	    return time_tab;
	}

	public WebElement getRecruitment_tab() {
	    return recruitment_tab;
	}

	public WebElement getMyinfo_tab() {
	    return myinfo_tab;
	}

	public WebElement getPerformance_tab() {
	    return performance_tab;
	}

	public WebElement getDashboard_tab() {
	    return dashboard_tab;
	}

	public WebElement getDirectory_tab() {
	    return directory_tab;
	}

	public WebElement getMaintenance_tab() {
	    return maintenance_tab;
	}

	public WebElement getClaim_tab() {
	    return claim_tab;
	}

	public WebElement getBuzz_tab() {
	    return buzz_tab;
	}
	
	public WebElement getSidebar_arrow() {
		return sidebar_arrow;
	}
	
	public WebElement getUpgrade_button() {
		return upgrade_button;
	}
	
	public WebElement getProfile_icon() {
	    return profile_icon;
	}

	public WebElement getAbout_option() {
	    return about_option;
	}

	public WebElement getSupport_option() {
	    return support_option;
	}

	public WebElement getChange_password_option() {
	    return change_password_option;
	}

	public WebElement getLogout_option() {
	    return logout_option;
	}

	public WebElement getHelp_button() {
		return help_button;
	}

	public WebElement getWidget_time_at_work() {
		return widget_time_at_work;
	}

	public WebElement getWidget_my_actions() {
		return widget_my_actions;
	}

	public WebElement getWidget_quick_launch() {
		return widget_quick_launch;
	}

	public WebElement getWidget_buzz_posts() {
		return widget_buzz_posts; 
	}

	public WebElement getWidget_employees_on_leave() {
		return widget_employees_on_leave;
	}

	public WebElement getWidget_employee_distribution() {
		return widget_employee_distribution;
	}

	public WebElement getWidget_employee_location() {
		return widget_employee_location;
	}
	
	public WebElement getTime_clock_icon() {
		return time_clock_icon;
	}
	
	public WebElement getMyaction_link1() {
		return myaction_link1;
	}

//	public WebElement getMyaction_link2() {
//		return myaction_link2;
//	}
	
	public WebElement getQuicklaunch_assignLeave() { 
		return quicklaunch_assignLeave; 
	}

	public WebElement getQuicklaunch_leaveList() { 
		return quicklaunch_leaveList; 
	}

	public WebElement getQuicklaunch_timesheets() { 
		 return quicklaunch_timesheets; 
	}

	public WebElement getQuicklaunch_applyLeave() { 
		return quicklaunch_applyLeave; 
	}

	public WebElement getQuicklaunch_myLeave() { 
		return quicklaunch_myLeave; 
	}

	public WebElement getQuicklaunch_myTimesheet() { 
		return quicklaunch_myTimesheet; 
	}
	
	public void getLeave_today_settings() {
		leave_today_settings.click();
	}
	
	public WebElement getSubunit_engineering() {
	    return subunit_engineering;
	}

	public WebElement getSubunit_humanResources() {
	    return subunit_humanResources;
	}

//	public WebElement getSubunit_administration() {
//	    return subunit_administration;
//	}

//	public WebElement getSubunit_clientServices() {
//	    return subunit_clientServices;
//	}

	public WebElement getSubunit_unassigned() {
	    return subunit_unassigned;
	}

	public WebElement getLocation_texasRD() {
	    return location_texasRD;
	}

//	public WebElement getLocation_newYorkSales() {
//	    return location_newYorkSales;
//	}

	public WebElement getLocation_unassigned() {
	    return location_unassigned;
	}
	
	public WebElement getFooter_text() {
		return footer_text;
	}
}
