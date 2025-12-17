package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PIM {
	@FindBy(xpath = "//h6[text()='PIM']")
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
	
	@FindBy(xpath = "//span[text()='Configuration ']")
	private WebElement configuration_menu;

	@FindBy(xpath = "//a[text()='Employee List']")
	private WebElement employeeList_menu;

	@FindBy(xpath = "//a[text()='Add Employee']")
	private WebElement addEmployee_menu;

	@FindBy(xpath = "//a[text()='Reports']")
	private WebElement reports_menu;
	
	@FindBy(css = "i[class='oxd-icon bi-question-lg']")
	private WebElement help_button;

	@FindBy(xpath = "//label[text()='Employee Name']/following::input[1]")
	private WebElement employeeName;

	@FindBy(xpath = "//label[text()='Employee Id']/following::input[1]")
	private WebElement employeeId;

	@FindBy(xpath = "//label[text()='Employment Status']/following::div[contains(@class,'oxd-select-text')]")
	private WebElement employmentStatus_dropdown;

	@FindBy(xpath = "//label[text()='Include']/following::div[contains(@class,'oxd-select-text')]")
	private WebElement include_dropdown;

	@FindBy(xpath = "//label[text()='Supervisor Name']/following::input[1]")
	private WebElement supervisorName;

	@FindBy(xpath = "//label[text()='Job Title']/following::div[contains(@class,'oxd-select-text')]")
	private WebElement jobTitle_dropdown;

	@FindBy(xpath = "//label[text()='Sub Unit']/following::div[contains(@class,'oxd-select-text')]")
	private WebElement subUnit_dropdown;
	
	@FindBy(xpath = "//button[text()=' Reset ']")
	private WebElement reset_button;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement search_button;

	@FindBy(xpath = "(//button[contains(@class,'oxd-button--secondary')])[2]")
	private WebElement add_button;
	
	@FindBy(xpath = "//div[@class='oxd-table-header']//input[@type='checkbox']")
	private WebElement table_header_checkbox;
	
	@FindBy(xpath = "//div[@class='oxd-table-header']")
	private WebElement table_header;

	@FindBy(xpath = "//div[@class='oxd-table-body']")
	private WebElement table_body;
	
	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
	private WebElement edit_firstRecord;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	private WebElement delete_firstRecord;
	
	@FindBy(xpath = "//button[text()='1']")
	private WebElement page_1;

	@FindBy(xpath = "//button[text()='2']")
	private WebElement page_2;

	@FindBy(xpath = "//button[text()='3']")
	private WebElement page_3;

	@FindBy(xpath = "//button[@class='oxd-pagination-page-item oxd-pagination-page-item--previous-next']")
	private WebElement next_page;
	
	@FindBy(xpath = "//a[text()='OrangeHRM, Inc']")
	private WebElement footer_text;

    public PIM(WebDriver driver) {
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
	
	public void getConfiguration_menu() { 
		configuration_menu.click(); 
	}
	
	public void getEmployeeList_menu() { 
		employeeList_menu.click(); 
	}
	
	public void getAddEmployee_menu() { 
		addEmployee_menu.click(); 
	}
	
	public void getReports_menu() { 
		reports_menu.click(); 
	}

	public void getHelp_button() {
		help_button.click();
	}
	
	public void getEmployeeName(String name) { 
		employeeName.sendKeys(name); 
	}
	
	public void getEmployeeId(String id) { 
		employeeId.sendKeys(id); 
	}
	
	public void getEmploymentStatus_dropdown() { 
		employmentStatus_dropdown.click(); 
	}
	public void getInclude_dropdown() { 
		include_dropdown.click(); 
	}
	
	public void getSupervisorName(String name) { 
		supervisorName.sendKeys(name); 
	}
	
	public void getJobTitle_dropdown() { 
		jobTitle_dropdown.click(); 
	}
	
	public void getSubUnit_dropdown() { 
		subUnit_dropdown.click(); 
	}
	
	public void getReset_button() {
	    reset_button.click();
	}
	
	public void getSearch_button() {
	    search_button.click();
	}

	public void getAdd_button() {
	    add_button.click();
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
	
	public void getEdit_firstRecord() {
	    edit_firstRecord.click();
	}

	public void getDelete_firstRecord() {
	    delete_firstRecord.click();
	}
	
	public void getPage_1() {
	    page_1.click();
	}

	public void getPage_2() {
	    page_2.click();
	}

	public void getPage_3() {
	    page_3.click();
	}

	public void getNext_page() {
	    next_page.click();
	}
	
	public String getFooter_text() {
		footer_text.click();
		return footer_text.getText();
	}
}
