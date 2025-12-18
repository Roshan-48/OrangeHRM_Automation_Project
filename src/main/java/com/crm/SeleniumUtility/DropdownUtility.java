package com.crm.SeleniumUtility;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownUtility {
	 public void selectByVisibleText(WebElement element, String text) {
	        Select select = new Select(element);
	        select.selectByVisibleText(text);
	    }

	    public void selectByValue(WebElement element, String value) {
	        Select select = new Select(element);
	        select.selectByValue(value);
	    }

	    public void selectByIndex(WebElement element, int index) {
	        Select select = new Select(element);
	        select.selectByIndex(index);
	    }

	    public List<WebElement> getAllOptions(WebElement element) {
	        Select select = new Select(element);
	        return select.getOptions();
	    }

	    public WebElement getFirstSelectedOption(WebElement element) {
	        Select select = new Select(element);
	        return select.getFirstSelectedOption();
	    }

	    public void deselectAll(WebElement element) {
	        Select select = new Select(element);
	        select.deselectAll();
	    }

	    public void deselectByVisibleText(WebElement element, String text) {
	        Select select = new Select(element);
	        select.deselectByVisibleText(text);
	    }
}
