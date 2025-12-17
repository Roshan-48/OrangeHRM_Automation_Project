package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Leave {
	@FindBy(xpath = "//h6[text()='Leave']")
	private WebElement admin_header;
	
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
	
	@FindBy(xpath = "//a[text()='Apply']")
	private WebElement apply_menu;

	@FindBy(xpath = "//a[text()='My Leave']")
	private WebElement myLeave_menu;

	@FindBy(xpath = "//span[text()='Entitlements ']")
	private WebElement entitlements_menu;

	@FindBy(xpath = "//span[text()='Reports ']")
	private WebElement reports_menu;

	@FindBy(xpath = "//span[text()='Configure ']")
	private WebElement configure_menu;

	@FindBy(xpath = "//a[text()='Leave List']")
	private WebElement leaveList_menu;

	@FindBy(xpath = "//a[text()='Assign Leave']")
	private WebElement assignLeave_menu;
	
	@FindBy(css = "i[class='oxd-icon bi-question-lg']")
	private WebElement help_button;
	
	@FindBy(xpath = "//label[text()='From Date']/following::input[1]")
	private WebElement from_date;

	@FindBy(xpath = "//label[text()='To Date']/following::input[1]")
	private WebElement to_date;

	@FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']")
	private WebElement status_dropdown;

	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	private WebElement leaveType_dropdown;

	@FindBy(xpath = "//label[text()='Employee Name']/following::input[1]")
	private WebElement employeeName;

	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[3]")
	private WebElement subUnit_dropdown;

	@FindBy(xpath = "//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")
	private WebElement includePast_toggle;
	
	@FindBy(xpath = "//button[text()=' Reset ']")
	private WebElement reset_button;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement search_button;
	
	@FindBy(xpath = "//div[@class='oxd-table-header']//input[@type='checkbox']")
	private WebElement table_header_checkbox;
	
	@FindBy(xpath = "//div[@class='oxd-table-header']")
	private WebElement table_header;

	@FindBy(xpath = "//div[@class='oxd-table-body']")
	private WebElement table_body;
	
	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-success oxd-table-cell-action-space']")
	private WebElement approve_button;

	@FindBy(xpath = "//button[@class='oxd-button oxd-button--medium oxd-button--label-danger oxd-table-cell-action-space']")
	private WebElement reject_button;

	@FindBy(xpath = "//i[@class='oxd-icon bi-three-dots-vertical']")
	private WebElement actions_menu;
	
	@FindBy(xpath = "//a[text()='OrangeHRM, Inc']")
	private WebElement footer_text;

    public Leave(WebDriver driver) {
        PageFactory.initElements(driver, this);	
    }
    
    public void getAdmin_header() {
		admin_header.isDisplayed();
	}
    
    public void getTab_Search(String data) {
		tab_search.sendKeys(data);
	}

    public void getAdmin_tab() {
		admin_tab.click();
	}

	public void getPim_tab() {
		pim_tab.click();
	}

	public void getLeave_tab() {
		leave_tab.click();
	}

	public void getTime_tab() {
		time_tab.click();
	}

	public void getRecruitment_tab() {
		recruitment_tab.click();
	}

	public void getMyinfo_tab()  {
		myinfo_tab.click();
	}

	public void getPerformance_tab() {
		performance_tab.click();
	}

	public void getDashboard_tab() {
		dashboard_tab.click();
	}

	public void getDirectory_tab() {
		directory_tab.click();
	}

	public void getMaintenance_tab() {
		maintenance_tab.click();
	}

	public void getClaim_tab() {
		claim_tab.click();
	}

	public void getBuzz_tab() {
		buzz_tab.click();
	}
	
	public void getSidebar_arrow() {
		sidebar_arrow.click();
	}
	
	public void getUpgrade_button() {
		upgrade_button.click();
	}
	
	public void getProfile_icon() {
		profile_icon.click();
	}

	public void getAbout_option() {
		about_option.click();
	}

	public void getSupport_option() {
		support_option.click();
	}

	public void getChange_password_option() {
		change_password_option.click();
	}

	public void getLogout_option() {
		logout_option.click();
	}
	
	public void getApply_menu() { 
		apply_menu.click(); 
	}
	
	public void getMyLeave_menu() { 
		myLeave_menu.click(); 
	}
	
	public void getEntitlements_menu() { 
		entitlements_menu.click(); 
	}
	
	public void getReports_menu() { 
		reports_menu.click(); 
	}
	
	public void getConfigure_menu() { 
		configure_menu.click(); 
	}
	
	public void getLeaveList_menu() { 
		leaveList_menu.click(); 
	}
	
	public void getAssignLeave_menu() { 
		assignLeave_menu.click(); 
	}
	
	public void getHelp_button() {	
		help_button.click();
	}
	
	public void setFrom_date(String date) { 
		from_date.sendKeys(date); 
	}
	
	public void setTo_date(String date) { 
		to_date.sendKeys(date); 
	}
	
	public void getStatus_dropdown() { 
		status_dropdown.click(); 
	}
	
	public void getLeaveType_dropdown() { 
		leaveType_dropdown.click(); 
	}
	
	public void setEmployeeName(String name) { 
		employeeName.sendKeys(name); 
	}
	
	public void getSubUnit_dropdown() { 
		subUnit_dropdown.click(); 
	}
	
	public void getIncludePast_toggle() { 
		includePast_toggle.click(); 
	}
	
	public void getReset_button() {
	    reset_button.click();
	}
	
	public void getSearch_button() {
	    search_button.click();
	}
	
	public void getTable_header_checkbox() {
	    table_header_checkbox.click();
	}
	
	public void getTable_header() {
	    table_header.isDisplayed();
	}

	public void getTable_body() {
	    table_body.isDisplayed();
	}
	
	public void getApprove_button() { 
		approve_button.click(); 
	}

	public void getReject_button() { 
		reject_button.click(); 
	}

	public void getActions_menu() { 
		actions_menu.click(); 
	}
	
	public String getFooter_text() {
		footer_text.click();
		return footer_text.getText();
	}
}
