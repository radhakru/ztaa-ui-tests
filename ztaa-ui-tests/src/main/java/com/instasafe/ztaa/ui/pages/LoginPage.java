package com.instasafe.ztaa.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.instasafe.ztaa.ui.utils.TestUtils;

/*
 * This class has locators and methods to perform actions in ZTAA Console login page
 */

public class LoginPage {
	
	@FindBy(id = "focususername")
	private WebElement username;
	
	@FindBy(id = "focuspassword")
	private WebElement password;
	
	@FindBy(xpath = "//*[text()='CONTINUE']")
	private WebElement btnContinue;
	
	/*
	 * This method enter user name in the login page
	 */
	public void enterUserName(String user) throws InterruptedException {
		TestUtils.waitForElementPresent(username);
		TestUtils.type(username, user);
		
	}
     
	 /*
	  * This method enters password in the login page
	  */
	public void enterPassword(String pwd) throws InterruptedException {
		TestUtils.waitForElementPresent(password);
		TestUtils.type(password, pwd);
		
	}
	
	/*
	 * This method clicks on the CONTINUE button in the login page
	 */
	public void clickOnContinueButton() {
		TestUtils.click(btnContinue);
	}
}
