package com.instasafe.ztaa.ui.utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.instasafe.ztaa.ui.core.TestBase;

public class TestUtils extends TestBase {

	static long PAGE_LOAD_TIME = 1000;
	public static long IMPLICTI_WAIT = 30;
	public static WebDriverWait wait;

	/**
	 * This method inserts text to a particular element
	 * 
	 */
	public static void type(WebElement webElement, String value) throws InterruptedException {
		
		WebElement element = waitForElementPresent(webElement);
		element.sendKeys(value);
		
	}

	/**
	 * This method clicks on a particular element
	 */
	public static void click(WebElement webElement) {
		WebElement element = null;
		element = waitForElementPresent(webElement);
		element.click();
		
	}

	/**
	 * This method clears text in a filed
	 */
	public static void clear(WebElement webElement) {

		WebElement element = waitForElementPresent(webElement);

		element.clear();
	}

	/**
	 * This method waits until element is visible
	 */
	public static WebElement waitForElementPresent(WebElement element) {
		wait = new WebDriverWait(driver, PAGE_LOAD_TIME);
		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method selects a value from drop down by visible text
	 */
	public static void selectDropDown(WebElement element, String value) throws InterruptedException {
        Select sel = new Select(element);
		sel.selectByVisibleText(value);
	}

	
    public static void waitForAWhile() throws InterruptedException {
    	Thread.sleep(600);
    }



}
