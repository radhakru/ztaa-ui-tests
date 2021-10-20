package com.instasafe.ztaa.ui.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.instasafe.ztaa.ui.core.TestBase;
import com.instasafe.ztaa.ui.pages.ApplicationAccessPage;
import com.instasafe.ztaa.ui.pages.HomePage;

import io.cucumber.java.en.When;

public class ConsoleApplicationnAccessSteps extends TestBase {
	HomePage homePage = getPageInstance(HomePage.class);

	ApplicationAccessPage applicationaccessPage= getPageInstance(ApplicationAccessPage.class);

	
	
	@When("^User clicks on Application access$")
	public void user_clicks_on_application_access() throws Throwable {
		Thread.sleep(3000);

		// for app access
		applicationaccessPage.clickOnApplicationAccessTab();
		Thread.sleep(3000);
	}

	@When("^User clicks on Mcafee application$")
	public void user_clicks_on_mcafee_application() throws Throwable {
		
		applicationaccessPage.clickOnMcafeeApplicationAccessTab();
		Thread.sleep(18000);
		driver.quit();
	}

	
	 @When("^User enters app name for search in application access$")
	    public void user_enters_app_name_for_search_in_application_access() throws Throwable {
	 
		// for enter search application name in application access
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys("mcafee");
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.RETURN);
			Thread.sleep(3000);
		 
	 }
	
	
	
}
