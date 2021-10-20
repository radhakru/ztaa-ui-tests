package com.instasafe.ztaa.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.instasafe.ztaa.ui.utils.TestUtils;

public class ApplicationAccessPage {

	
	@FindBy(xpath = "(//a[@class='mat-tooltip-trigger ng-star-inserted'])[8]")
	private WebElement  applicationAccess;
	


	@FindBy(id=("6077bfae0b9cdd0001dc7bf3"))
	private WebElement  mcafeeapp;




	/*
	 * This method clicks on the 'Application Access
	 */
	public void clickOnApplicationAccessTab() {
		TestUtils.click(applicationAccess);
	}
	

	/*
	 * This method clicks on the 'MCafee app' in Application Access
	 */
	public void clickOnMcafeeApplicationAccessTab() {
		TestUtils.waitForElementPresent(mcafeeapp);
		TestUtils.click(mcafeeapp);

	
	}
	
	






}
