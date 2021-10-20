package com.instasafe.ztaa.ui.stepdefinitions;

import com.instasafe.ztaa.ui.core.TestBase;
import com.instasafe.ztaa.ui.pages.DownloadsPage;
import io.cucumber.java.en.Then;

public class ConsoleDownloadsSteps extends TestBase {

    DownloadsPage downloadsPage = getPageInstance(DownloadsPage.class);

	@Then("^User clicks on Downloads$")
    public void user_clicks_on_downloads() throws Throwable {
        
		downloadsPage.clickOnDownloadsTab();
		Thread.sleep(2000);
		
    }
	
	@Then("^User clicks on download agent for windows$")
    public void user_clicks_on_download_agent_for_windows() throws Throwable {
        downloadsPage.clickOnDownloadsAgent();
        Thread.sleep(2000);
    }
	 @Then("^User clicks on not your OS$")
	    public void user_clicks_on_not_your_os() throws Throwable {
	       downloadsPage.clickOnNotYourOsDownloadsTab();
	       Thread.sleep(2000);
	       
	    }
	 
	  @Then("^User clicks on windows$")
	    public void user_clicks_on_windows() throws Throwable {
	       downloadsPage.clickOnNotYourOSWindowsDownloadsTab();
	       Thread.sleep(20000);
	    }

	  @Then("^User clicks on Linux$")
	    public void user_clicks_on_linux() throws Throwable {
		  downloadsPage.clickOnNotYourOSLinuxDownloadsTab();
	       Thread.sleep(2000);
	    }

	    @Then("^User clicks on MacOS$")
	    public void user_clicks_on_macos() throws Throwable {
	    	downloadsPage.clickOnNotYourOSmacOSDownloadsTab();
		       Thread.sleep(25000);
		       
	    }
	
}
