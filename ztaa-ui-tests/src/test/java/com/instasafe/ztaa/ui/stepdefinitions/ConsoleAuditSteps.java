package com.instasafe.ztaa.ui.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.instasafe.ztaa.ui.core.TestBase;
import com.instasafe.ztaa.ui.pages.AuditPage;

import io.cucumber.java.en.Then;

public class ConsoleAuditSteps extends TestBase {
	AuditPage auditPage =getPageInstance(AuditPage.class);
	
	 @Then("^User clicks on Audit$")
	    public void user_clicks_on_audit() throws Throwable {
	        auditPage.clickOnAuditTab();
	        Thread.sleep(2000);
	    }

	 
	 @Then("^User clicks on Recent active users and see list of live user$")
	    public void user_clicks_on_recent_active_users_and_see_list_of_live_user() throws Throwable {
	        auditPage.clickOnRecentActiveUsersofAuditTab();
		 
		 Thread.sleep(2000);
	    }

	 
	  @Then("^User clicks on Gateway Status of audits$")
	    public void user_clicks_on_gateway_status_of_audits() throws Throwable {
	        auditPage.clickOnGatewayStatusofAuditTab();
	        Thread.sleep(2000);
	    }
	  
	  
	  @Then("^User clicks on sorted in descending order of gateway status$")
	    public void user_clicks_on_sorted_in_descending_order_of_gateway_status() throws Throwable {
	       auditPage.clickOnsortedDesincGatewayStatusofAuditTab();
	       Thread.sleep(3000);
	    }

	    @Then("^User clicks on sorted in ascending order of gateway status$")
	    public void user_clicks_on_sorted_in_ascending_order_of_gateway_status() throws Throwable {
	    	auditPage.clickOnsortedAscinGatewayStatusofAuditTab(); 
	    	Thread.sleep(3000);
	    }
	
	    
	    @Then("^User clicks on Export to CSV of audits$")
	    public void user_clicks_on_export_to_csv_of_audits() throws Throwable {
	        auditPage.clickOnexporttoCSVAuditTab();
	        Thread.sleep(3000);
	    }

	    
	    
	    @Then("^User clicks on show 10 of Audit$")
	    public void user_clicks_on_show_10_of_audit() throws Throwable {
	        auditPage.clickOnShowDropToggleAuditTab();
	        Thread.sleep(3000);
	        auditPage.clickOnShow10AuditTab();
	        Thread.sleep(3000);
	    }

	    @Then("^User clicks on show 20 of Audit$")
	    public void user_clicks_on_show_20_of_audit() throws Throwable {
	    	auditPage.clickOnShowDropToggleAuditTab();
	        Thread.sleep(3000);
	        auditPage.clickOnShow20AuditTab();
	        Thread.sleep(3000);
	    }

	    @Then("^User clicks on show 50 of Audit$")
	    public void user_clicks_on_show_50_of_audit() throws Throwable {
	    	auditPage.clickOnShowDropToggleAuditTab();
	        Thread.sleep(3000);
	        auditPage.clickOnShow50AuditTab();
	        Thread.sleep(3000);
	    }

	    @Then("^User clicks on show 100 of Audit$")
	    public void user_clicks_on_show_100_of_audit() throws Throwable {
	    	auditPage.clickOnShowDropToggleAuditTab();
	        Thread.sleep(3000);
	        auditPage.clickOnShow100AuditTab();
	        Thread.sleep(3000);
	    }

	    @Then("^User enter gateway name for search in gateway status audits$")
	    public void user_enter_gateway_name_for_search_in_gateway_status_audits() throws Throwable {
	    	auditPage.entergatewaystatusnminAuditforSearch(getSearchgtwaynmAudits());
	    	Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.RETURN);
			Thread.sleep(2000);
	    }

	    @Then("^User enter no charcter of gateway name for search in gateway status audits$")
	    public void user_enter_no_charcter_of_gateway_name_for_search_in_gateway_status_audits() throws Throwable {
	       
	    	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.RETURN);
			Thread.sleep(2000);
	    }
	    
	    
	    
	    //*** Authentication Logs Audit setion test method start here***//
	    
	    @Then("^User clicks on Authentication Logs of audits$")
	    public void user_clicks_on_authentication_logs_of_audits() throws Throwable {
	       auditPage.clickOnAuthenticationLogsofAuditTab();
	    	//driver.findElement(By.xpath("(//i[@class='fa fa-long-arrow-alt-up ng-star-inserted'])[1]")).click();
	    	Thread.sleep(2000);
	    }

	    @Then("^User clicks on sorted in descending order of audits$")
	    public void user_clicks_on_sorted_in_descending_order_of_audits() throws Throwable {
	      
	    	auditPage.clickOnsortedDescAuditsTab();
	    	Thread.sleep(3000);
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0, -500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
			Thread.sleep(3000);
	    	
	    }

	    @Then("^User clicks on sorted in ascending order of audits$")
	    public void user_clicks_on_sorted_in_ascending_order_of_audits() throws Throwable {
	    	auditPage.clickOnsortedAscinAuditsTab();
	    	Thread.sleep(3000);
	    	 JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0, 500)");
				Thread.sleep(3000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0, -500)");
				Thread.sleep(3000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
				Thread.sleep(3000);
	    }

	    @Then("^User enter username for search in authentication logs audits$")
	    public void user_enter_username_for_search_in_authentication_logs_audits() throws Throwable {
	    	auditPage.enterauthlogsunameforsearchAudits(getSearchunameAuthLogsAudits());
	    	Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.RETURN);
			Thread.sleep(3000);
			 
	    }

	    
	    @Then("^User enter no charcter of username for search in authentication logs audits$")
	    public void user_enter_no_charcter_of_username_for_search_in_authentication_logs_audits() throws Throwable {
	    	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.RETURN);
			Thread.sleep(2000);
	    }

	    
	    
	    
	    @Then("^User clicks on show 10 of authentication logs in audits$")
	    public void user_clicks_on_show_10_of_authentication_logs_in_audits() throws Throwable {
	        auditPage.clickOnShowDropToggleAuthLogsAuditTab();
	        Thread.sleep(2000);
	        auditPage.clickOnShow10AuthLogsAuditTab();
	        Thread.sleep(2000);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0, -500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
			Thread.sleep(3000);
	        
	    }

	    @Then("^User clicks on show 20 of authentication logs in audits$")
	    public void user_clicks_on_show_20_of_authentication_logs_in_audits() throws Throwable {
	    	 auditPage.clickOnShowDropToggleAuthLogsAuditTab();
		        Thread.sleep(2000);
		        auditPage.clickOnShow20AuthLogsAuditTab();
		        Thread.sleep(2000);
		        JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0, 500)");
				Thread.sleep(3000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0, -500)");
				Thread.sleep(3000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
				Thread.sleep(3000);
		        
		        
	    }
	    

	    @Then("^User clicks on show 50 of authentication logs in audits$")
	    public void user_clicks_on_show_50_of_authentication_logs_in_audits() throws Throwable {
	    	 auditPage.clickOnShowDropToggleAuthLogsAuditTab();
		        Thread.sleep(2000);
		        auditPage.clickOnShow50AuthLogsAuditTab();
		        Thread.sleep(2000);
		        JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0, 500)");
				Thread.sleep(3000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0, -500)");
				Thread.sleep(3000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
				Thread.sleep(3000);
	    }

	    @Then("^User clicks on show 100 of authentication logs in audits$")
	    public void user_clicks_on_show_100_of_authentication_logs_in_audits() throws Throwable {
	    	 auditPage.clickOnShowDropToggleAuthLogsAuditTab();
		        Thread.sleep(2000);
		        auditPage.clickOnShow100AuthLogsAuditTab();
		        Thread.sleep(2000);
		        JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0, 500)");
				Thread.sleep(3000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0, -500)");
				Thread.sleep(3000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
				Thread.sleep(3000);
	    
	    }
	    
//*** User Logins Audits Steps start from here***//
	    
	    @Then("^User clicks on User Logins in Audits$")
	    public void user_clicks_on_user_logins_in_audits() throws Throwable {
	       auditPage.clickOnUserLoginsofAuditTab();
	       Thread.sleep(2000);
	    }
	   
	    
	    @Then("^User clicks on export to cvs in audits$")
	    public void user_clicks_on_export_to_cvs_in_audits() throws Throwable {
	        auditPage.clickOnexporttoCSVAuditTab();
	        Thread.sleep(3000);
	    }
	    
	    @Then("^User enter user name for search in User Logins audits$")
	    public void user_enter_user_name_for_search_in_user_logins_audits() throws Throwable {
	    	   auditPage.enterUserNameLoginsunameforsearchinAudits(getSearchunameUserNameLoginsAudits());
	    	  Thread.sleep(3000);
			  driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.RETURN);
			   Thread.sleep(3000);
			   JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0, 500)");
				Thread.sleep(3000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0, -500)");
				Thread.sleep(3000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
				Thread.sleep(3000);
	    
	    }
	    
	    
	    @Then("^User clicks on show 10 of user logins in audits$")
	    public void user_clicks_on_show_10_of_user_logins_in_audits() throws Throwable {
	        auditPage.clickOnShowDropToggleUserloginsAuditTab();
	        Thread.sleep(3000);
	        auditPage.clickOnShow10UserLoginsAuditTab();
	        Thread.sleep(3000);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0, -500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
			Thread.sleep(3000);
	    }

	    @Then("^User clicks on show 20 of user logins in audits$")
	    public void user_clicks_on_show_20_of_user_logins_in_audits() throws Throwable {
	    	 auditPage.clickOnShowDropToggleUserloginsAuditTab();
		        Thread.sleep(3000);
		        auditPage.clickOnShow20UserLoginsAuditTab();
		        Thread.sleep(3000);
		        JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0, 500)");
				Thread.sleep(3000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0, -500)");
				Thread.sleep(3000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
				Thread.sleep(3000);
	    }

	    @Then("^User clicks on show 50 of user logins in audits$")
	    public void user_clicks_on_show_50_of_user_logins_in_audits() throws Throwable {
	    	 auditPage.clickOnShowDropToggleUserloginsAuditTab();
		        Thread.sleep(3000);
		        auditPage.clickOnShow50UserLoginsAuditTab();
		        Thread.sleep(3000);
		        JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0, 500)");
				Thread.sleep(3000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0, -500)");
				Thread.sleep(3000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
				Thread.sleep(3000);
	    }

	    @Then("^User clicks on show 100 of user logins in audits$")
	    public void user_clicks_on_show_100_of_user_logins_in_audits() throws Throwable {
	    	 auditPage.clickOnShowDropToggleUserloginsAuditTab();
		        Thread.sleep(3000);
		        auditPage.clickOnShow100UserLoginsAuditTab();
		        Thread.sleep(3000);
		        JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0, 500)");
				Thread.sleep(3000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0, -500)");
				Thread.sleep(3000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
				Thread.sleep(3000);
	    }

	    @Then("^User enter username for search in Username Logins audits$")
	    public void user_enter_username_for_search_in_username_logins_audits() throws Throwable {
	        auditPage.enterUserNameLoginsunameforsearchinAudits(getSearchunameUserNameLoginsAudits());
	        Thread.sleep(3000);
	    	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.RETURN);
	    	 JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0, 500)");
				Thread.sleep(3000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0, -500)");
				Thread.sleep(3000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
				Thread.sleep(3000);
	    }

	    @Then("^User clicks on select date range$")
	    public void user_clicks_on_select_date_range() throws Throwable {
	        auditPage.clickOnselectdateRangeUserLoginsAuditTab();
	        Thread.sleep(2000);
	    }
	    
	    @Then("^User clicks on yesterday$")
	    public void user_clicks_on_yesterday() throws Throwable {
	    	Thread.sleep(3000);
	    	auditPage.clickOnsubmityesterdayAuditsTab();
	        Thread.sleep(4000);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0, -500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
			Thread.sleep(3000);
	    }
	    
	    
	    @Then("^User clicks on Last 7 days$")
	    public void user_clicks_on_last_7_days() throws Throwable {
	    	Thread.sleep(3000);
	    	auditPage.clickOnlast7daysAuditsTab();
	    	Thread.sleep(2000);
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0, -500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
			Thread.sleep(3000);
	    }

	    @Then("^User clicks on Last 30 days$")
	    public void user_clicks_on_last_30_days() throws Throwable {
	    	Thread.sleep(3000);
	    	auditPage.clickOnlast30daysAuditsTab();
	    	Thread.sleep(4000);
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0, -500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
			Thread.sleep(3000);
	    }

	    @Then("^User clicks on This Month$")
	    public void user_clicks_on_this_month() throws Throwable {
	    	Thread.sleep(3000);
	    	auditPage.clickOnThisMonthAuditsTab();
	    	Thread.sleep(4000);
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0, -500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
			Thread.sleep(3000);
	    	
	    }

	    @Then("^User clicks on Last Month$")
	    public void user_clicks_on_last_month() throws Throwable {
           Thread.sleep(3000);
	    	
	    	auditPage.clickOnLastMonthAuditsTab();
	    	Thread.sleep(4000);
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0, -500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
			Thread.sleep(3000);
	    }

	    
	    @Then("^User clicks on Custom range and select range and click on apply$")
	    public void user_clicks_on_custom_range_and_select_range_and_click_on_apply() throws Throwable {
	    	Thread.sleep(3000);
	    	auditPage.clickOnCustomRangeAuditsTab();
	    	Thread.sleep(3000);
	    	auditPage.clickOnCustomRangeselectdateAuditsTab();
	    	Thread.sleep(3000);
	    	auditPage.clickOnApplybtnTab();
	    	Thread.sleep(3000);
	    }
	    
	    
	    
	    ///*Export Test steps start from here**//
	    
	    @Then("^User clicks on Exports in Audits$")
	    public void user_clicks_on_exports_in_audits() throws Throwable {
	        auditPage.clickOnExportsofAuditTab();
	        Thread.sleep(2000);
	    }
	    
	    @Then("^User clicks on show 10 of exports in audits$")
	    public void user_clicks_on_show_10_of_exports_in_audits() throws Throwable {
	        auditPage.clickOnShowDropExportsAuditTab();
	        Thread.sleep(2000);
	        auditPage.clickOnShow10ExportsAuditTab();
	        Thread.sleep(2000);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0, -500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
			Thread.sleep(3000);
	    }
	    
	    @Then("^User clicks on show 20 of exports in audits$")
	    public void user_clicks_on_show_20_of_exports_in_audits() throws Throwable {
	    	 auditPage.clickOnShowDropExportsAuditTab();
		        Thread.sleep(2000);
		        auditPage.clickOnShow20ExportsAuditTab();
		        Thread.sleep(2000);
		        JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0, 500)");
				Thread.sleep(3000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0, -500)");
				Thread.sleep(3000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
				Thread.sleep(3000);
	    	
	    }

	    @Then("^User clicks on show 50 of exports in audits$")
	    public void user_clicks_on_show_50_of_exports_in_audits() throws Throwable {
	    	 auditPage.clickOnShowDropExportsAuditTab();
		        Thread.sleep(2000);
		        auditPage.clickOnShow50ExportAuditTab();
		        Thread.sleep(2000);
		        JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0, 500)");
				Thread.sleep(3000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0, -500)");
				Thread.sleep(3000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
				Thread.sleep(3000);
	    }

	    @Then("^User clicks on show 100 of exports in audits$")
	    public void user_clicks_on_show_100_of_exports_in_audits() throws Throwable {
	    	 auditPage.clickOnShowDropExportsAuditTab();
		        Thread.sleep(2000);
		        auditPage.clickOnShow100ExportsAuditTab();
		        Thread.sleep(2000);
		        JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0, 500)");
				Thread.sleep(3000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
				Thread.sleep(3000);
				js.executeScript("window.scrollBy(0, -500)");
				Thread.sleep(3000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
				Thread.sleep(3000);
	    }
	    
	    
	    
	    @Then("^User clicks on csv download of exports in audits$")
	    public void user_clicks_on_csv_download_of_exports_in_audits() throws Throwable {
	       auditPage.clickOnCSVdwnldExportsAuditTab();
	       Thread.sleep(3000);
	    }

	   
	    @Then("^User clicks on add new export plus sign and select exports type$")
	    public void user_clicks_on_add_new_export_plus_sign_and_select_exports_type() throws Throwable {
	    	   auditPage.clickOnaddExportsofAuditTab();
	    	    Thread.sleep(2000);
	    	    auditPage.clickOnselectExportsTypedropdownofAuditTab();
		        Thread.sleep(3000);
		        auditPage.clickOnselectexportTypeDeviceExportsAuditTab();
		        Thread.sleep(5000);
	    }

	    @Then("^User clicks on add new export plus sign and select exports type gateway status$")
	    public void user_clicks_on_add_new_export_plus_sign_and_select_exports_type_gateway_status() throws Throwable {
	    	  Thread.sleep(5000);
	    	auditPage.clickOnaddExportsofAuditTab();
	    	    Thread.sleep(2000);
	    	    auditPage.clickOnselectExportsTypedropdownofAuditTab();
		        Thread.sleep(3000);
		        auditPage.clickOnselectexportTypegatewaystatusExportsAuditTab();
		        Thread.sleep(3000);
	    }

	    
	    @Then("^User clicks on add new export plus sign and select exports type policy status$")
	    public void user_clicks_on_add_new_export_plus_sign_and_select_exports_type_policy_status() throws Throwable {
	    	 Thread.sleep(5000);
	    	auditPage.clickOnaddExportsofAuditTab();
    	    Thread.sleep(2000);
    	    auditPage.clickOnselectExportsTypedropdownofAuditTab();
	        Thread.sleep(3000);
	        auditPage.clickOnselectexportTypepolicyupdateExportsAuditTab();
	        Thread.sleep(3000);
	    }

	    @Then("^User clicks on add new export plus sign and select exports type tenant app$")
	    public void user_clicks_on_add_new_export_plus_sign_and_select_exports_type_tenant_app() throws Throwable {
	    	 Thread.sleep(3000);
	    	auditPage.clickOnaddExportsofAuditTab();
    	    Thread.sleep(2000);
    	    auditPage.clickOnselectExportsTypedropdownofAuditTab();
	        Thread.sleep(3000);
	        auditPage.clickOnselectexporttenantappsinExportsAuditTab();
	        Thread.sleep(3000);
	    }

	    @Then("^User clicks on add new export plus sign and select exports type users$")
	    public void user_clicks_on_add_new_export_plus_sign_and_select_exports_type_users() throws Throwable {
	    	 Thread.sleep(5000);
	    	auditPage.clickOnaddExportsofAuditTab();
    	    Thread.sleep(2000);
    	    auditPage.clickOnselectExportsTypedropdownofAuditTab();
	        Thread.sleep(3000);
	        auditPage.clickOnselectUsersexportAuditsTab();
	        Thread.sleep(3000);
	    }

	    @Then("^User clicks on add new export plus sign and select exports type user groups$")
	    public void user_clicks_on_add_new_export_plus_sign_and_select_exports_type_user_groups() throws Throwable {
	    	 Thread.sleep(5000);
	    	auditPage.clickOnaddExportsofAuditTab();
    	    Thread.sleep(2000);
    	    auditPage.clickOnselectExportsTypedropdownofAuditTab();
	        Thread.sleep(3000);
	        auditPage.clickOnselectugroupexportAuditsTab();
	        Thread.sleep(3000);
	    }

	    @Then("^User clicks on add new export plus sign and select exports type user last login$")
	    public void user_clicks_on_add_new_export_plus_sign_and_select_exports_type_user_last_login() throws Throwable {
	    	 Thread.sleep(5000);
	    	auditPage.clickOnaddExportsofAuditTab();
    	    Thread.sleep(2000);
    	    auditPage.clickOnselectExportsTypedropdownofAuditTab();
	        Thread.sleep(3000);
	        auditPage.clickOnselectUserlastloginexportAuditsTab();
	        Thread.sleep(3000);
	    }

	    @Then("^User clicks on add new export plus sign and select exports type user logins$")
	    public void user_clicks_on_add_new_export_plus_sign_and_select_exports_type_user_logins() throws Throwable {
	    	 Thread.sleep(3000);
	    	auditPage.clickOnaddExportsofAuditTab();
    	    Thread.sleep(2000);
    	    auditPage.clickOnselectExportsTypedropdownofAuditTab();
	        Thread.sleep(3000);
	        auditPage.clickOnselectUserloginsexportAuditsTab();
	        Thread.sleep(3000);
	    }

	    @Then("^User clicks on add new export plus sign and select exports type user lookups$")
	    public void user_clicks_on_add_new_export_plus_sign_and_select_exports_type_user_lookups() throws Throwable {
	    	
	    	 Thread.sleep(3000);
	    	 auditPage.clickOnaddExportsofAuditTab();
    	    Thread.sleep(2000);
    	    auditPage.clickOnselectExportsTypedropdownofAuditTab();
	        Thread.sleep(3000);
	        auditPage.clickOnselectuserLookupsExportAuditsTab();
	        Thread.sleep(3000);
	    }
	    
	    @Then("^User clicks on select date range of userlookups and select$")
	    public void user_clicks_on_select_date_range_of_userlookups_and_select() throws Throwable {
	       auditPage.clickOnselectdaterangeuserLookupsExportAuditsTab();
	       Thread.sleep(3000);
	       
	       auditPage.clickOnselectdaterangeyesterdayuserLookupsExportAuditsTab();
	       Thread.sleep(3000);
	    }

	    
	    
	    

	    @Then("^User clicks on add new export plus sign and select exports type TOTP veified user$")
	    public void user_clicks_on_add_new_export_plus_sign_and_select_exports_type_totp_veified_user() throws Throwable {
	    	 Thread.sleep(3000);
	    	auditPage.clickOnaddExportsofAuditTab();
    	    Thread.sleep(2000);
    	    auditPage.clickOnselectExportsTypedropdownofAuditTab();
	        Thread.sleep(3000);
	        auditPage.clickOnselectTOTPexportAuditsTab();
	        Thread.sleep(3000);
	    }

	    
	    @Then("^User clicks on submit button in exports tab$")
	    public void user_clicks_on_submit_button_in_exports_tab() throws Throwable {
	       auditPage.clickOnSubmitButtonExportsofAuditTab();
	       Thread.sleep(2000);
	    }
	    
	    //*** Username Lookups method strat from here ***//
	    
	    
	    @Then("^User clicks on Username Lookups in Audits$")
	    public void user_clicks_on_username_lookups_in_audits() throws Throwable {
	        auditPage.clickOnUsernameLookupsAuditTab();
	        Thread.sleep(2000);
	    }
	    
	    @Then("^User clicks on failed username lookups tab in audits$")
	    public void user_clicks_on_failed_username_lookups_tab_in_audits() throws Throwable {
	       auditPage.clickOnfailedUsernameLookupsAuditTab();
	       Thread.sleep(2000);
	       JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0, -500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
			Thread.sleep(3000);
	    }
	    
	    
	    @Then("^User clicks on show 10 of username lookups in audits$")
	    public void user_clicks_on_show_10_of_username_lookups_in_audits() throws Throwable {
	    	auditPage.clickOnShowDropusernamelookupsAuditTab();
	    	Thread.sleep(3000);
	    	auditPage.clickOnShow10AuditTab();
	    	Thread.sleep(3000);
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0, -500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
			Thread.sleep(3000);
	    }

	    @Then("^User clicks on show 20 of username lookups in audits$")
	    public void user_clicks_on_show_20_of_username_lookups_in_audits() throws Throwable {
	    	auditPage.clickOnShowDropusernamelookupsAuditTab();
	    	Thread.sleep(3000);
	    	auditPage.clickOnShow20AuditTab();
	    	Thread.sleep(3000);
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0, -500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
			Thread.sleep(3000);
	    	
	    }

	    @Then("^User clicks on show 50 of username lookups in audits$")
	    public void user_clicks_on_show_50_of_username_lookups_in_audits() throws Throwable {
	    	auditPage.clickOnShowDropusernamelookupsAuditTab();
	    	Thread.sleep(3000);
	    	auditPage.clickOnShow50AuditTab();
	    	Thread.sleep(3000);
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0, -500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
			Thread.sleep(3000);
	    	
	    }

	    @Then("^User clicks on show 100 of username lookups in audits$")
	    public void user_clicks_on_show_100_of_username_lookups_in_audits() throws Throwable {
	    	auditPage.clickOnShowDropusernamelookupsAuditTab();
	    	Thread.sleep(3000);
	    	auditPage.clickOnShow100AuditTab();
	    	Thread.sleep(3000);
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0, 500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0, -500)");
			Thread.sleep(3000);
			js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
			Thread.sleep(3000);
	    }

	    @Then("^User enter user name for search in Username Lookups audits$")
	    public void user_enter_user_name_for_search_in_username_lookups_audits() throws Throwable {
	    	  auditPage.enterUserNameLookupsforsearchinAudits(getSearchunameUserNamELookupsAudits());
		        Thread.sleep(3000);
		    	driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.RETURN);
		    	 JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy(0, 500)");
					Thread.sleep(3000);
					js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
					Thread.sleep(3000);
					js.executeScript("window.scrollBy(0, -500)");
					Thread.sleep(3000);
					js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
					Thread.sleep(3000);
	    }
	
}
