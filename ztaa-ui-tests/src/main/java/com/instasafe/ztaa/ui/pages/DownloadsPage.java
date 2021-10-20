package com.instasafe.ztaa.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.instasafe.ztaa.ui.utils.TestUtils;

public class DownloadsPage {
	@FindBy(xpath = "(//a[@class='mat-tooltip-trigger ng-star-inserted'])[7]")
	private WebElement  downloads;
	
	@FindBy(xpath = "//span[text()='Download']")
	private WebElement  downloadagent;
	
	@FindBy(xpath = "//p[text()='Not Your OS?']")
	private WebElement  NotyourOSDownload;
	
	
	@FindBy(xpath = "//p[text()=' Windows']")
	private WebElement  NotyourOSselectWindowsDownload;
	
	@FindBy(xpath = "//p[text()=' Linux']")
	private WebElement  NotyourOSselectLinuxDownload;
	
	@FindBy(xpath = "//p[text()=' macOS']")
	private WebElement  NotyourOSselectmacOSDownload;
	
	
	
	
	/*
	 * This method clicks on the 'Downloads
	 */
	public void clickOnDownloadsTab() {
		TestUtils.click(downloads);
	}
	
	

	/*
	 * This method clicks on the 'Downloads agent  button 
	 */
	public void clickOnDownloadsAgent() {
		TestUtils.click(downloadagent);
	}
	
	/*
	 * This method clicks on the 'not your OS" Downloads tab  
	 */
	public void clickOnNotYourOsDownloadsTab() {
		TestUtils.click(NotyourOSDownload);
	}
	
	
	
	/*
	 * This method clicks on the 'Not your OS and select windows
	 */
	public void clickOnNotYourOSWindowsDownloadsTab() {
		TestUtils.click(NotyourOSselectWindowsDownload);
	}
	
	/*
	 * This method clicks on the 'Not your OS and select linux
	 */
	public void clickOnNotYourOSLinuxDownloadsTab() {
		TestUtils.click(NotyourOSselectLinuxDownload);
	}
	
	/*
	 * This method clicks on the 'Not your OS and select macOS
	 */
	public void clickOnNotYourOSmacOSDownloadsTab() {
		TestUtils.click(NotyourOSselectmacOSDownload);
	}
	
	
	
}
