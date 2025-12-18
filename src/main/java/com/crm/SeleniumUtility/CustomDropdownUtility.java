package com.crm.SeleniumUtility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CustomDropdownUtility {
	 public void selectByText( WebDriver driver, WebElement dropdown, String value) {
		 dropdown.click();
	     driver.findElement(By.xpath("//div[@role='listbox']//span[text()='" + value + "']")).click();
	 }
}
