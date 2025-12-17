package com.crm.Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	@FindBy(xpath = "//div[@class='orangehrm-login-branding']")
	private WebElement orangeHrm_logo;

	@FindBy(xpath = "//h5[text()='Login']")
	private WebElement login_header;
	
	@FindBy(name = "username")
	private WebElement username;
	
	@FindBy(css = "input[type='password']")
	private WebElement password;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login_button;
	
	@FindBy(xpath = "//div[contains(@class,'orangehrm-login-forgot')]//p")
	private WebElement forgot_password;
	
	@FindBy(xpath = "(//div[contains(@class,'orangehrm-login-footer-sm')]//a)[1]")
	private WebElement linkedin_icon;

	@FindBy(xpath = "(//div[contains(@class,'orangehrm-login-footer-sm')]//a)[2]")
	private WebElement facebook_icon;

	@FindBy(xpath = "(//div[contains(@class,'orangehrm-login-footer-sm')]//a)[3]")
	private WebElement twitter_icon;

	@FindBy(xpath = "(//div[contains(@class,'orangehrm-login-footer-sm')]//a)[4]")
	private WebElement youtube_icon;
	
	@FindBy(xpath = "//a[text()='OrangeHRM, Inc']")
	private WebElement footer_text;
	
	@FindBy(xpath = "//p[contains(@class,'oxd-alert-content-text')]")
	private WebElement errorMsg;
	
	@FindBy(xpath = "//span[text()='Required']")
	private WebElement requiredError;
	
	@FindBy(xpath = "(//span[text()='Required'])[1]")
	private WebElement usernameRequiredError;

	@FindBy(xpath = "(//span[text()='Required'])[2]")
	private WebElement passwordRequiredError;

	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void getOrangeHrm_logo() {
	    orangeHrm_logo.isDisplayed();
	}

	public void getLogin_header() {
	    login_header.getText();
	}

	public void getUsername(String data) {
		username.sendKeys(data);
	}
	public WebElement getUsername() {
		return username;
	}

	public void getPassword(String data) {
		password.sendKeys(data);
	}
	public WebElement getPassword() {
		return password;
	}

	public void getLogin_button() {
		login_button.click();
	}
	public WebElement getLoginButton() {
	    return login_button;
	}

	public void getForgot_password() {
		forgot_password.click();
	}
	public WebElement gerForgot_password() {
		return forgot_password;
	}
	
	public void clickLinkedin_icon() { 
		linkedin_icon.click(); 
	}
	public WebElement getLinkedinicon() {
		return linkedin_icon;
	}
	
	public void clickFacebook_icon() { 
		facebook_icon.click(); 
	}
	public WebElement getFacebook_icon() {
		return facebook_icon;
	}
	
	public void clickTwitter_icon() { 
		twitter_icon.click();
	}
	public WebElement getTwitter_icon() {
		return twitter_icon;
	}
	
	public void clickYoutube_icon() { 
		youtube_icon.click(); 
	}
	public WebElement getYoutube_icon() {
		return youtube_icon;
	}
	
	public void clickFooter_text() {
		footer_text.click();
	}	
	
	public String getFooter_text() {
		return footer_text.getText();
	}

	public WebElement getErrorMsg() {
	    return errorMsg;
	}
	
	public WebElement getRequiredError() {
	    return requiredError;
	}

	public WebElement getUsernameRequiredError() {
	    return usernameRequiredError;
	}

	public WebElement getPasswordRequiredError() {
	    return passwordRequiredError;
	}
}

