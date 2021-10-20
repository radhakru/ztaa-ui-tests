package com.instasafe.ztaa.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.instasafe.ztaa.ui.utils.TestUtils;

public class AgentReleasePage {

	
	@FindBy(xpath = "//a[text()=' Agent Release ']")
	private WebElement agentrelease ;
	
	
	@FindBy(xpath = "(//span[text()=' Edit '])")
	private WebElement agentReleaseeditbutton ;
	
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-agent-release[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[6]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]")	
	private WebElement  agentReleaseshowlistToggle;
	
	
	@FindBy(xpath = "(//span[text()='Show 10'])[2]")	
	private WebElement  show10AgentRelease;	
		
	@FindBy(xpath = "(//span[text()='Show 20'])[1]")	
	private WebElement  show20AgentRelease;	
		
	@FindBy(xpath = "(//span[text()='Show 50'])[1]")	
	private WebElement  show50AgentRelease;	
		
	@FindBy(xpath = "(//span[text()='Show 100'])[1]")	
	private WebElement  show100AgentRelease;	
		
	@FindBy(xpath = "(//button[text()='Publish'])")
	private WebElement  publishAgent;
	
	
	
	
	
	/*
	 * This method clicks on the 'Agent Release' tab in Perimeter Management
	 */
	public void clickOnAgentReleaseTab() {
		TestUtils.click(agentrelease);
	}

	
	
	
	
	/*
	 * This method clicks on the 'Agent Release' tab in Perimeter Management
	 */
	public void clickOnEditButtonofAgentReleaseTab() {
		TestUtils.click(agentReleaseeditbutton);
	}

	/*	
	 * This method clicks on the Agent Release tab(show list) in Perimeter Management 	
	 */	
	public void clickOnAgentReleaseShowlistToggle() {	
		TestUtils.click(agentReleaseshowlistToggle);	
	}	
		
	
	/*	
	 * This method clicks on the 'show 10 sign in the Agent Release Tab
	 */	
	public void clickOnshow10agentrelease() {	
		TestUtils.waitForElementPresent(show10AgentRelease);	
		TestUtils.click(show10AgentRelease);	
	}	
	
	
		
	/*	
	 * This method clicks on the 'show 50 sign in the Agent Release Tab
	 */	
	public void clickOnshow20agentrelease() {	
		TestUtils.waitForElementPresent(show20AgentRelease);	
		TestUtils.click(show20AgentRelease);	
	}	
	
	
	
	/*	
	 * This method clicks on the 'show 50' sign in the Agent Release Tab
	 */	
	public void clickOnshow50agentrelease() {	
		TestUtils.waitForElementPresent(show50AgentRelease);	
		TestUtils.click(show50AgentRelease);	
	}	
	
	
	
	/*	
	 * This method clicks on the 'show 100' sign in the Agent Release Tab
	 */	
	public void clickOnshow100agentrelease() {	
		TestUtils.waitForElementPresent(show100AgentRelease);	
		TestUtils.click(show100AgentRelease);	
	}	
		
	/*	
	 * This method clicks on the Agent Release tab(show list) in Perimeter Management 	
	 */	
	public void clickOnAgentReleasePublishButton() {	
		TestUtils.click(publishAgent);	
	}	
			
	
	
	
	
	
}
