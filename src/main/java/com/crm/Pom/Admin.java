package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Admin {
	@FindBy(xpath = "//h6[text()='Admin']")
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
	
	@FindBy(xpath = "//span[text()='User Management ']")
	private WebElement userManagement_menu;

	@FindBy(xpath = "//span[text()='Job ']")
	private WebElement job_menu;

	@FindBy(xpath = "//span[text()='Organization ']")
	private WebElement organization_menu;

	@FindBy(xpath = "//span[text()='Qualifications ']")
	private WebElement qualifications_menu;

	@FindBy(xpath = "//span[text()='Nationalities']")
	private WebElement nationalities_menu;

	@FindBy(xpath = "//span[text()='Corporate Branding']")
	private WebElement corporateBranding_menu;

	@FindBy(xpath = "//span[text()='Configuration ']")
	private WebElement configuration_menu;
	
	@FindBy(css = "i[class='oxd-icon bi-question-lg']")
	private WebElement help_button;

	@FindBy(xpath = "(//div[@class='oxd-input-group__label-wrapper'])[4]")
	private WebElement search_username;

	@FindBy(xpath = "//div[@class='oxd-select-text oxd-select-text--active']")
	private WebElement search_userRole_dropdown;

	@FindBy(xpath = "//label[text()='Employee Name']/following::input[1]")
	private WebElement search_employeeName;

	@FindBy(xpath = "(//div[@class='oxd-select-text oxd-select-text--active'])[2]")
	private WebElement search_status_dropdown;
	
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

	@FindBy(xpath = "(//i[@class='oxd-icon bi-trash'])[1]")
	private WebElement delete_firstRecord;

	@FindBy(xpath = "(//i[@class='oxd-icon bi-pencil-fill'])[1]")
	private WebElement edit_firstRecord;
	
	@FindBy(xpath = "//i[@class='oxd-icon bi-trash oxd-button-icon']")
	private WebElement confirm_delete;

	@FindBy(xpath = "//button[text()=' No, Cancel ']")
	private WebElement cancel_delete;
	
	@FindBy(xpath = "//a[text()='OrangeHRM, Inc']")
	private WebElement footer_text;
	
    public Admin(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    
    public WebElement getAdmin_header() {
        return admin_header;
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

    public WebElement getUserManagement_menu() {
        return userManagement_menu;
    }

    public WebElement getJob_menu() {
        return job_menu;
    }

    public WebElement getOrganization_menu() {
        return organization_menu;
    }

    public WebElement getQualifications_menu() {
        return qualifications_menu;
    }

    public WebElement getNationalities_menu() {
        return nationalities_menu;
    }

    public WebElement getCorporateBranding_menu() {
        return corporateBranding_menu;
    }

    public WebElement getConfiguration_menu() {
        return configuration_menu;
    }

    public WebElement getHelp_button() {
        return help_button;
    }

    public WebElement getSearch_username() {
        return search_username;
    }

    public WebElement getSearch_userRole_dropdown() {
        return search_userRole_dropdown;
    }

    public WebElement getSearch_employeeName() {
        return search_employeeName;
    }

    public WebElement getSearch_status_dropdown() {
        return search_status_dropdown;
    }

    public WebElement getReset_button() {
        return reset_button;
    }

    public WebElement getSearch_button() {
        return search_button;
    }

    public WebElement getAdd_button() {
        return add_button;
    }

    public WebElement getTable_header_checkbox() {
        return table_header_checkbox;
    }

    public WebElement getTable_header() {
        return table_header;
    }

    public WebElement getTable_body() {
        return table_body;
    }

    public WebElement getEdit_firstRecord() {
        return edit_firstRecord;
    }

    public WebElement getDelete_firstRecord() {
        return delete_firstRecord;
    }

    public WebElement getConfirm_delete() {
        return confirm_delete;
    }

    public WebElement getCancel_delete() {
        return cancel_delete;
    }
    
	public String getFooter_text() {
		return footer_text.getText();
	}
}
