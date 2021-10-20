package com.instasafe.ztaa.ui.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import com.instasafe.ztaa.ui.core.TestBase;
import com.instasafe.ztaa.ui.pages.AuditPage;
import com.instasafe.ztaa.ui.pages.EventsPage;

import io.cucumber.java.en.Then;

public class ConsoleAuditEvents  extends TestBase{
	
	EventsPage eventPage= getPageInstance(EventsPage.class);
	
	 
	 
	  @Then("^User clicks on Events$")
	    public void user_clicks_on_events() throws Throwable {
		  eventPage.clickOnEventsAuditTab();
		  Thread.sleep(2000);
	    }
	  
	  
	  @Then("^User select AD sync Update in events$")
	    public void user_select_ad_sync_update_in_events() throws Throwable {
		  eventPage.clickOnselectarrowEvents();
	        Thread.sleep(2000);
		    eventPage.clickOnselectAdsysnupdateEventsAuditTab();
	        Thread.sleep(3000);
	        eventPage.clickOnsearchbarEvents();
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



	  @Then("^User clicks on sorted in descending order of events$")
	    public void user_clicks_on_sorted_in_descending_order_of_events() throws Throwable {
	        eventPage.clickOnsortingindesendingEvents();
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

	    @Then("^User clicks on sorted in ascending order of events$")
	    public void user_clicks_on_sorted_in_ascending_order_of_events() throws Throwable {
	       eventPage.clickOnsortinginAscendingEvents();
	       Thread.sleep(2000);
	      
	    }

	    @Then("^User clicks on Export to CSV button of events$")
	    public void user_clicks_on_export_to_csv_button_of_events() throws Throwable {
	        eventPage.clickOnCSVDownloadEvents();
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
	    
	    @Then("^User clicks on show 10 in events$")
	    public void user_clicks_on_show_10_in_events() throws Throwable {
	    	Thread.sleep(3000);
	        eventPage.clickOnShowdropdowntoggleofEvents();
	        Thread.sleep(3000);
	        eventPage.clickOnShow10Events();
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

	    @Then("^User clicks on show 20 in events$")
	    public void user_clicks_on_show_20_in_events() throws Throwable {
	    	 eventPage.clickOnShowdropdowntoggleofEvents();
		        Thread.sleep(3000);
		        eventPage.clickOnShow20Events();
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

	    @Then("^User clicks on show 50 in events$")
	    public void user_clicks_on_show_50_in_events() throws Throwable {
	    	 eventPage.clickOnShowdropdowntoggleofEvents();
		        Thread.sleep(3000);
		        eventPage.clickOnShow50Events();
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

	    @Then("^User clicks on show 100 in events$")
	    public void user_clicks_on_show_100_in_events() throws Throwable {
	    	 eventPage.clickOnShowdropdowntoggleofEvents();
		        Thread.sleep(3000);
		        eventPage.clickOnShow100Events();
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

	    
	 
	    
	    
	    
	    //**USer Create**///
	    @Then("^User select User Create in events$")
	    public void user_select_user_create_in_events() throws Throwable {
	        eventPage.clickOnselectarrowEvents();
	       Thread.sleep(2000);
	        eventPage.clickOnselectuserCreateEvents();  
	        Thread.sleep(3000);
	        eventPage.clickOnsearchbarEvents();
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

	    
	    //** User Update**///
	    @Then("^User select User Update in events$")
	    public void user_select_user_update_in_events() throws Throwable {
	    	  eventPage.clickOnselectarrowEvents();
		       Thread.sleep(2000);
		        eventPage.clickOnselectuserUpdateEvents();
		        Thread.sleep(3000);
		        eventPage.clickOnsearchbarEvents();
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


	    
	    //** User Delete**///
	    @Then("^User select User Delete in events$")
	    public void user_select_user_delete_in_events() throws Throwable {
	    	 eventPage.clickOnselectarrowEvents();
		       Thread.sleep(2000);
		        eventPage.clickOnselectuserDeleteEvents(); 
		        Thread.sleep(3000);
		        eventPage.clickOnsearchbarEvents();
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

	    //**User Bulk Action***//
	    @Then("^User select User Bulk Action in events$")
	    public void user_select_user_bulk_action_in_events() throws Throwable {    	
	    	 eventPage.clickOnselectarrowEvents();
		       Thread.sleep(2000);
		        eventPage.clickOnselectuserBulkActionEvents();
		        Thread.sleep(3000);
		        eventPage.clickOnsearchbarEvents();
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

	    //**User Enable/Disable state**//
	    @Then("^User select User Enable Disable state in events$")
	    public void user_select_user_enable_disable_state_in_events() throws Throwable {
	    	 eventPage.clickOnselectarrowEvents();
		       Thread.sleep(2000);
		        eventPage.clickOnselectuserEnabledisableStateEvents();
		        Thread.sleep(3000);
		        eventPage.clickOnsearchbarEvents();
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
	    
	    //**User Profile Pic Update **//
	    
	    @Then("^User select User Profile Pic Update in events$")
	    public void user_select_user_profile_pic_update_in_events() throws Throwable {
	    	 eventPage.clickOnselectarrowEvents();
		       Thread.sleep(2000);
		        eventPage.SearchEventnameUserprofilePicUpdate(getSearchEventnameinselectEventBar());
		        Thread.sleep(3000);
	            driver.findElement(By.xpath("(//li[@class='pure-checkbox ng-star-inserted'])[1]")).click();
		       Thread.sleep(3000);
		        eventPage.clickOnsearchbarEvents();
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

	    
	    ///***User Bind/UnBind Device**//
	    
	    @Then("^User select User Bind Unbind Device in events$")
	    public void user_select_user_bind_unbind_device_in_events() throws Throwable {
	    	 eventPage.clickOnselectarrowEvents();
		       Thread.sleep(2000);
		     eventPage.SearchEventnameUserBindUnbindDevice(getSearchEventnameUserBindUnbindDeviceinselectEventBar());
		        Thread.sleep(3000);
	            driver.findElement(By.xpath("(//li[@class='pure-checkbox ng-star-inserted'])[1]")).click();
		       Thread.sleep(3000);
		        eventPage.clickOnsearchbarEvents();
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
	    
	  ///***User Device Block Unblock**//
	    @Then("^User select User Device Block Unblock in events$")
	    public void user_select_user_device_block_unblock_in_events() throws Throwable {
	    	eventPage.clickOnselectarrowEvents();
		       Thread.sleep(2000);
		     eventPage.SearchEventnameUserDeviceBlockUnblock(getSearchEventnameUserDeviceBlockUnblockinselectEventBar());
		        Thread.sleep(3000);
	            driver.findElement(By.xpath("(//li[@class='pure-checkbox ng-star-inserted'])[1]")).click();
		       Thread.sleep(3000);
		        eventPage.clickOnsearchbarEvents();
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

	    
	    
	    ///***User Device Delete**//
	    @Then("^User select User Device Delete in events$")
	    public void user_select_user_device_delete_in_events() throws Throwable {
	    	eventPage.clickOnselectarrowEvents();
		       Thread.sleep(2000);
		     eventPage.SearchEventnameUserDeviceDelete(getSearchEventnameUserDeviceDeleteinselectEventBar());
		        Thread.sleep(3000);
	            driver.findElement(By.xpath("(//li[@class='pure-checkbox ng-star-inserted'])[1]")).click();
		       Thread.sleep(3000);
		        eventPage.clickOnsearchbarEvents();
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

	    
	    ///***User Group Create**//
	    
	    @Then("^User select User Group Create in events$")
	    public void user_select_user_device_group_create_in_events() throws Throwable {
	    	  eventPage.clickOnselectarrowEvents();
		       Thread.sleep(2000);
		       eventPage.SearchEventnameUserGroupCreate(getSearchEventnameUserGroupCreateinselectEventBar());
		        Thread.sleep(3000);
	            driver.findElement(By.xpath("(//li[@class='pure-checkbox ng-star-inserted'])[1]")).click();
		       Thread.sleep(3000);
		        eventPage.clickOnsearchbarEvents();
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
	    
	    @Then("^User clicks on Clear the data button$")
	    public void user_clicks_on_clear_the_data_button() throws Throwable {
	    	  Thread.sleep(3000);
	    	 eventPage.clickOnClearthedatainEvents();
		       Thread.sleep(3000);
	    }
	    
	    //**User Role Update**//
	    
	    @Then("^User select User Role Update in events$")
	    public void user_select_user_role_update_in_events() throws Throwable {
	    	    eventPage.clickOnselectarrowEvents();
		       Thread.sleep(2000);
		        eventPage.SearchEventnameUserRoleUpdate(getSearchEventnameUserRoleUpdateinselectEventBar());
		        Thread.sleep(3000);
	            driver.findElement(By.xpath("(//li[@class='pure-checkbox ng-star-inserted'])[1]")).click();
		       Thread.sleep(3000);
		        eventPage.clickOnsearchbarEvents();
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
	    
	    //**User Group Create with member**//
	    
	    	@Then("^User select User Group Create with Members in events$")
	        public void user_select_user_group_create_with_members_in_events() throws Throwable {
	    		 eventPage.clickOnselectarrowEvents();
			       Thread.sleep(2000);
			       eventPage.searcheventnameuserGroupCraetewithMembers(getSearchEventnameUserGroupCreateWithMembersEventBar());
			        Thread.sleep(3000);
		            driver.findElement(By.xpath("(//li[@class='pure-checkbox ng-star-inserted'])[1]")).click();
			       Thread.sleep(3000);
			        eventPage.clickOnsearchbarEvents();
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
	    
	    
	    //**User Group Add Members**//
	    	 @Then("^User select User Group Add Members in events$")
	    	    public void user_select_user_group_add_members_in_events() throws Throwable {
	    		 eventPage.clickOnselectarrowEvents();
			       Thread.sleep(2000);
			       eventPage.searcheventnameuserGroupAddMembers(getSearchEventnameUserGroupAddMembersEventBar());
			        Thread.sleep(3000);
		            driver.findElement(By.xpath("(//li[@class='pure-checkbox ng-star-inserted'])[1]")).click();
			       Thread.sleep(3000);
			        eventPage.clickOnsearchbarEvents();
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

	    	 //**  User Group Delete**//
	    	 
	    	 @Then("^User select User Group Delete in events$")
	    	    public void user_select_user_group_delete_in_events() throws Throwable {
	    		 eventPage.clickOnselectarrowEvents();
			       Thread.sleep(2000);
			       eventPage.searcheventnameuserGroupDelete(getSearchEventnameUserGroupDeleteEventBar());
			        Thread.sleep(3000);
		            driver.findElement(By.xpath("(//li[@class='pure-checkbox ng-star-inserted'])[1]")).click();
			       Thread.sleep(3000);
			        eventPage.clickOnsearchbarEvents();
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
	    	 
	    	 
	    	 //**  User Group Update**//
	    	 
	    	 @Then("^User select User Group Update in events$")
	    	    public void user_select_user_group_update_in_events() throws Throwable {
	    		 eventPage.clickOnselectarrowEvents();
			       Thread.sleep(2000);
			       eventPage.searcheventnameuserGroupUpdate(getSearchEventnameUserGroupUpdateEventBar());
			        Thread.sleep(3000);
		            driver.findElement(By.xpath("(//li[@class='pure-checkbox ng-star-inserted'])[1]")).click();
			       Thread.sleep(3000);
			        eventPage.clickOnsearchbarEvents();
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
	    	 
	    	 //**User Group Member Delete**//
	    	 @Then("^User select User Group Member Delete in events$")
	    	    public void user_select_user_group_member_delete_in_events() throws Throwable {
	    		 eventPage.clickOnselectarrowEvents();
			       Thread.sleep(2000);
			       eventPage.searcheventnameuserGroupMemberDelete(getSearchEventnameUserGroupDeleteMemberEventBar());
			        Thread.sleep(3000);
		            driver.findElement(By.xpath("(//li[@class='pure-checkbox ng-star-inserted'])[1]")).click();
			       Thread.sleep(3000);
			        eventPage.clickOnsearchbarEvents();
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
	    	//**User Auth Profile Update**//
	    	 
	    	 
	    	 @Then("^User select User Auth Profile Update in events$")
	    	    public void user_select_user_auth_profile_update_in_events() throws Throwable {
	    		 eventPage.clickOnselectarrowEvents();
			       Thread.sleep(2000);
			       eventPage.searcheventnameuserAuthProfileUpdate(getSearchEventnameUserAuthProfileUpdateEventBar());
			        Thread.sleep(3000);
		            driver.findElement(By.xpath("(//li[@class='pure-checkbox ng-star-inserted'])[1]")).click();
			       Thread.sleep(3000);
			        eventPage.clickOnsearchbarEvents();
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
	    	 
	    	 
	    	//**User Auth Profile Delete**//
	    	 
	    	 @Then("^User select User Auth Profile Delete in events$")
	    	    public void user_select_user_auth_profile_delete_in_events() throws Throwable {
	    		 eventPage.clickOnselectarrowEvents();
			       Thread.sleep(2000);
			       eventPage.searcheventnameuserAuthProfileDelete(getSearchEventnameUserAuthProfileDeleteEventBar());
			        Thread.sleep(3000);
		            driver.findElement(By.xpath("(//li[@class='pure-checkbox ng-star-inserted'])[1]")).click();
			       Thread.sleep(3000);
			        eventPage.clickOnsearchbarEvents();
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
	    	 
	    	 //**User Profile Enable Disable**//
	    	 @Then("^User select User Auth Profile Enable Disable in events$")
	    	    public void user_select_user_auth_profile_enable_disable_in_events() throws Throwable {
	    		 eventPage.clickOnselectarrowEvents();
			       Thread.sleep(2000);
			       eventPage.searcheventnameuserProfileEnableDisable(getSearchEventnameUserProfileEnableDisableEventBar());
			        Thread.sleep(3000);
		            driver.findElement(By.xpath("(//li[@class='pure-checkbox ng-star-inserted'])[1]")).click();
			       Thread.sleep(3000);
			        eventPage.clickOnsearchbarEvents();
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
 //**User Logout***//
	    	 
	    	 @Then("^User select User Logout in events$")
	    	    public void user_select_user_logout_in_events() throws Throwable {
	    		 eventPage.clickOnselectarrowEvents();
			       Thread.sleep(2000);
			       eventPage.searcheventnameuserLogout(getSearchEventnameUserLogoutEventBar());
			        Thread.sleep(3000);
		            driver.findElement(By.xpath("(//li[@class='pure-checkbox ng-star-inserted'])[1]")).click();
			       Thread.sleep(3000);
			        eventPage.clickOnsearchbarEvents();
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

	    	 //**User Set Password Link create**//
	    	 
	    	    @Then("^User select User Set Password Link Create in events$")
	    	    public void user_select_user_set_password_link_create_in_events() throws Throwable {
	    	    	 eventPage.clickOnselectarrowEvents();
				       Thread.sleep(2000);
				       eventPage.searcheventnameuserSetPswrdLinkCreate(getSearchEventnameUsersetPswrdLinkCreateEventBar());
				        Thread.sleep(3000);
			            driver.findElement(By.xpath("(//li[@class='pure-checkbox ng-star-inserted'])[1]")).click();
				       Thread.sleep(3000);
				        eventPage.clickOnsearchbarEvents();
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

         //** User Reset Password**//
	    	    
	    	    @Then("^User select User ReSet Password in events$")
	    	    public void user_select_user_reset_password_in_events() throws Throwable {
	    	    	 eventPage.clickOnselectarrowEvents();
				       Thread.sleep(2000);
				       eventPage.searcheventnameuserRestPswrd(getSearchEventnameUserResetPswrdEventBar());
				        Thread.sleep(3000);
			            driver.findElement(By.xpath("(//li[@class='pure-checkbox ng-star-inserted'])[1]")).click();
				       Thread.sleep(3000);
				        eventPage.clickOnsearchbarEvents();
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
	    	    //** User Token Refresh**//
	    	    @Then("^User select User Token Refresh in events$")
	    	    public void user_select_user_token_refresh_in_events() throws Throwable {
	    	    	 eventPage.clickOnselectarrowEvents();
				       Thread.sleep(2000);
				       eventPage.searcheventnameuserTokenRefresh(getSearchEventnameUserTokenRefreshEventBar());
				        Thread.sleep(3000);
			            driver.findElement(By.xpath("(//li[@class='pure-checkbox ng-star-inserted'])[1]")).click();
				       Thread.sleep(3000);
				        eventPage.clickOnsearchbarEvents();
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
	    	 
}
