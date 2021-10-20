package com.instasafe.ztaa.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.instasafe.ztaa.ui.utils.TestUtils;

public class LogoutPage {
	
	@FindBy(xpath = "/html/body/app-root/app-tenant-layout/div/div[2]/app-header/nav/div/div[2]/ul/li[2]/a")
	private WebElement profileName;
	
	@FindBy(xpath = "//*[text()='Logout']")
	private WebElement btnLogout;
	
	@FindBy(xpath = "//*[text()='Yes, Logout']")
	private WebElement alertLogout;
	
	/*
	 * This method performs the Logout operation
	 */
	public void logout() throws InterruptedException {
		
		TestUtils.waitForElementPresent(profileName);
		TestUtils.click(profileName);
		Thread.sleep(2000);
		TestUtils.waitForElementPresent(btnLogout);
		TestUtils.click(btnLogout);
		Thread.sleep(2000);
		TestUtils.waitForElementPresent(alertLogout);
		TestUtils.click(alertLogout);
		Thread.sleep(2000);
	}

}
