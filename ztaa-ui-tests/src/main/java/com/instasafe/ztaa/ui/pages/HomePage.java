package com.instasafe.ztaa.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.instasafe.ztaa.ui.utils.TestUtils;

public class HomePage {
	
	
	@FindBy(xpath = "/html/body/app-root/app-tenant-layout/div/div[1]/app-sidebar/div/ul/li[2]/a")
	private WebElement identitymngmnt;
	
	@FindBy(xpath = "/html/body/app-root/app-tenant-layout/div/div[1]/app-sidebar/div/ul/li[3]/a")
	private WebElement perimetermngmnt;
	
	@FindBy(xpath = "/html/body/app-root/app-tenant-layout/div/div[1]/app-sidebar/div/ul/li[4]/a")
	private WebElement accesspolicies;
	
	@FindBy(xpath = "(//*[@class='ng-star-inserted'])[17]")
	private WebElement applnaccess;
	
	
	
	/*
	 * This method clicks on the Identity Management icon in the home screen
	 */
	public void clickOnIdentityMngmntButton() {
		TestUtils.click(identitymngmnt);
	}
	
	/*
	 * This method clicks on the Perimeter Management icon in the home screen
	 */
	public void clickOnPerimeterMngmntButton() {
		TestUtils.click(perimetermngmnt);
	}
	
	/*
	 * This method clicks on the Access Policies icon in the home screen
	 */
	public void clickOnAccessPoliciesButton() {
		TestUtils.click(accesspolicies);
	}
	
	
	/*
	 * This method clicks on the Access Policies icon in the home screen
	 */
	public void clickOnApplnAccessButton() {
		TestUtils.click(applnaccess);
	}

}
