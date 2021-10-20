package com.instasafe.ztaa.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.instasafe.ztaa.ui.utils.TestUtils;

public class EventsPage {
	@FindBy(xpath = "//a[text()=' Events ']")
	private WebElement  EventsAudit;

	@FindBy(xpath = "(//li[@class='pure-checkbox ng-star-inserted'])[1]")
	private WebElement selectADsysnUpdateAudit;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement SearchEvents;
	
	
	@FindBy(xpath = "(//button[@title='clear the date'])")
	private WebElement cleardaterangeEvents;
	
	
	@FindBy(xpath = "//div[@class='c-btn']")
	private WebElement selectarrowEvents;
	
	@FindBy(xpath = "//i[@class='fa fa-download']")
	private WebElement exporttoCSVEvent;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-audit-layout[1]/div[1]/div[1]/div[2]/div[2]/app-identity-audit-events[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[5]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]")
	private WebElement ShowlistdropdowntoggleEvent;
	
	@FindBy(xpath = "(//span[text()='Show 10'])[2]")
	private WebElement show10Events;
	
	
	@FindBy(xpath = "(//span[text()='Show 20'])[1]")
	private WebElement show20Events;
	
	@FindBy(xpath = "(//span[text()='Show 50'])[1]")
	private WebElement show50Events;
	
	@FindBy(xpath = "(//span[text()='Show 100'])[1]")
	private WebElement show100Events;
	
	
	@FindBy(xpath = "(//i[@class='fa fa-long-arrow-alt-up ng-star-inserted'])[1]")
	private WebElement sortedinAscendingorderEvents;
	
	@FindBy(xpath = "(//i[@class='fa fa-long-arrow-alt-down ng-star-inserted'])[1]")
	private WebElement sortedinDescendingorderEvents;
	
	@FindBy(xpath = "(//li[@class='pure-checkbox ng-star-inserted'])[2]")
	private WebElement selectUserCreateAudit;
	
	@FindBy(xpath = "(//li[@class='pure-checkbox ng-star-inserted'])[3]")
	private WebElement selectUserUpdateEvent;
	
	@FindBy(xpath = "(//li[@class='pure-checkbox ng-star-inserted'])[4]")
	private WebElement selectUserDeleteEvent;
	
	
	@FindBy(xpath = "(//li[@class='pure-checkbox ng-star-inserted'])[5]")
	private WebElement selectUserBulkActionEvent;
	
	@FindBy(xpath = "(//li[@class='pure-checkbox ng-star-inserted'])[6]")
	private WebElement selectUserEnableDisablestateEvent;
	
	@FindBy(xpath = "(//input[@placeholder='Search'])[2]")
	private WebElement searchbarforeventnameEvents;
			
			
	@FindBy(xpath = "(//li[@class='pure-checkbox ng-star-inserted'])[8]")
	private WebElement selectUserProfilePicUpdateEvent;
	
	//**This method clicks on Events in Audit**//
	public void clickOnEventsAuditTab() {
		TestUtils.click(EventsAudit);

     }
	
	
	
	//**This method clicks on AD syn updates in  Audit>EVENT**//
	public void clickOnselectAdsysnupdateEventsAuditTab() {
		TestUtils.click(selectADsysnUpdateAudit);
         }
	
	
		
		//**This method clicks on search in  Audit>EVENT**//
				public void clickOnselectarrowEvents() {
					TestUtils.click(selectarrowEvents);
			         }
				
				//**This method clicks on Clear the data button in  Audit>EVENT**//
				public void clickOnClearthedatainEvents() {
					TestUtils.click(cleardaterangeEvents);
			         }
				
		
				//**This method clicks on sorting  in descending  Audit>EVENT**//
			public void clickOnsortingindesendingEvents() {
					TestUtils.click(sortedinDescendingorderEvents);
			         }
			
			//**This method clicks on sorting  in Ascending  Audit>EVENT**//
			public void clickOnsortinginAscendingEvents() {
					TestUtils.click(sortedinDescendingorderEvents);
			         }
			//**This method clicks on csv download Audit>EVENT**//
			public void clickOnCSVDownloadEvents() {
					TestUtils.click(exporttoCSVEvent);
			         }

			//** This method click on show drop down toggle of Events**//
			
			public void clickOnShowdropdowntoggleofEvents() {
				TestUtils.click(ShowlistdropdowntoggleEvent);
		         }
           //** This method click on show 10 of Events**//
			
			public void clickOnShow10Events() {
				TestUtils.click(show10Events);
		         }
			
			
         //** This method click on show 10 of Events**//
			
			public void clickOnShow20Events() {
				TestUtils.click(show20Events);
		         }
			
    //** This method click on show 50 of Events**//
			
			public void clickOnShow50Events() {
				TestUtils.click(show50Events);
		         }
			
         //** This method click on show 10 of Events**//
			
			public void clickOnShow100Events() {
				TestUtils.click(show100Events);
		         }
			
			
			
  //** This method click on select user create of Events**//
			
			public void clickOnselectuserCreateEvents() {
				TestUtils.click(selectUserCreateAudit);
		         }
			
			
 //** This method click on select user Update of Events**//
			
			public void clickOnselectuserUpdateEvents() {
				TestUtils.click(selectUserUpdateEvent);
		         }
			
			
//** This method click on select user Delete of Events**//
			
			public void clickOnselectuserDeleteEvents() {
				TestUtils.click(selectUserDeleteEvent);
		         }
			
//** This method click on select user Bulk Action  of Events**//
			
			public void clickOnselectuserBulkActionEvents() {
				TestUtils.click(selectUserBulkActionEvent);
		         }
			
			
			
//** This method click on select user enable disable state  of Events**//
			
			public void clickOnselectuserEnabledisableStateEvents() {
				TestUtils.click(selectUserEnableDisablestateEvent);
		         }
			
			
			
//** This method click on select user Profile Pic Update  of Events**//
			
			public void clickOnselectuserProfilePicUpdateEvents() {
				TestUtils.click(selectUserProfilePicUpdateEvent);
		         }
			
			
//** This method click on search bar of Events**//
			
			public void clickOnsearchbarEvents() {
				TestUtils.click(SearchEvents);
		         }
	 /*** This method search event name in select event name field in Events  Tab***/
			public void SearchEventnameUserprofilePicUpdate(String  searcheventnameineventbarselecteventTab) throws InterruptedException {
				TestUtils.waitForElementPresent(searchbarforeventnameEvents);
				TestUtils.type(searchbarforeventnameEvents,searcheventnameineventbarselecteventTab);
			}
			
			
			/*** This method search User bind /unbind device event name in select event name field in Events  Tab***/
			public void SearchEventnameUserBindUnbindDevice(String  searcheventnameUserbindUnbinddeviceineventbarselecteventTab) throws InterruptedException {
				TestUtils.waitForElementPresent(searchbarforeventnameEvents);
				TestUtils.type(searchbarforeventnameEvents,searcheventnameUserbindUnbinddeviceineventbarselecteventTab);
			}
			
			
			
			/*** This method search User  device block/unblock event name in select event name field in Events  Tab***/
			public void SearchEventnameUserDeviceBlockUnblock(String searcheventnameuserDeviceblockunblockineventbarselecteventTab ) throws InterruptedException {
				TestUtils.waitForElementPresent(searchbarforeventnameEvents);
				TestUtils.type(searchbarforeventnameEvents,searcheventnameuserDeviceblockunblockineventbarselecteventTab);
			}
		
			/*** This method search User  device delete event name in select event name field in Events  Tab***/
		public void SearchEventnameUserDeviceDelete(String searcheventnameuserDeviceDeleteineventbarselecteventTab ) throws InterruptedException {
			TestUtils.waitForElementPresent(searchbarforeventnameEvents);
			TestUtils.type(searchbarforeventnameEvents,searcheventnameuserDeviceDeleteineventbarselecteventTab);
		}
		
		
		/*** This method search User  group  create event name in select event name field in Events  Tab***/
		public void SearchEventnameUserGroupCreate(String searcheventnameuserGroupCraeteineventbarselecteventTab ) throws InterruptedException {
			TestUtils.waitForElementPresent(searchbarforeventnameEvents);
			TestUtils.type(searchbarforeventnameEvents,searcheventnameuserGroupCraeteineventbarselecteventTab);
		}
		
		/*** This method search User  Role Update  event name in select event name field in Events  Tab***/
		public void SearchEventnameUserRoleUpdate(String searcheventnameuserRoleUpdateineventbarselecteventTab ) throws InterruptedException {
			TestUtils.waitForElementPresent(searchbarforeventnameEvents);
			TestUtils.type(searchbarforeventnameEvents,searcheventnameuserRoleUpdateineventbarselecteventTab);
		}
		
		
		
		/*** This method search User  Group Create with members event name in select event name field in Events  Tab***/
		public void searcheventnameuserGroupCraetewithMembers(String searcheventnameuserGroupCraetewithMembersineventbarselecteventTab ) throws InterruptedException {
			TestUtils.waitForElementPresent(searchbarforeventnameEvents);
			TestUtils.type(searchbarforeventnameEvents,searcheventnameuserGroupCraetewithMembersineventbarselecteventTab);
		}
		
		/*** This method search User  Group Add members event name in select event name field in Events  Tab***/
		public void searcheventnameuserGroupAddMembers(String searcheventnameuserGroupAddMembersineventbarselecteventTab ) throws InterruptedException {
			TestUtils.waitForElementPresent(searchbarforeventnameEvents);
			TestUtils.type(searchbarforeventnameEvents,searcheventnameuserGroupAddMembersineventbarselecteventTab);
		}
		
		
		/*** This method search User  Group Delete event name in select event name field in Events  Tab***/
		public void searcheventnameuserGroupDelete(String searcheventnameuserGroupDeleteineventbarselecteventTab ) throws InterruptedException {
			TestUtils.waitForElementPresent(searchbarforeventnameEvents);
			TestUtils.type(searchbarforeventnameEvents,searcheventnameuserGroupDeleteineventbarselecteventTab);
		}

		/*** This method search User  Group Update event name in select event name field in Events  Tab***/
		public void searcheventnameuserGroupUpdate(String  searcheventnameuserGroupUpdateineventbarselecteventTab) throws InterruptedException {
			TestUtils.waitForElementPresent(searchbarforeventnameEvents);
			TestUtils.type(searchbarforeventnameEvents,searcheventnameuserGroupUpdateineventbarselecteventTab);
		}

		/*** This method search User  Group Member Delete event name in select event name field in Events  Tab***/
		public void searcheventnameuserGroupMemberDelete(String searcheventnameuserGroupMemberdeleteineventbarselecteventTab) throws InterruptedException {
			TestUtils.waitForElementPresent(searchbarforeventnameEvents);
			TestUtils.type(searchbarforeventnameEvents,searcheventnameuserGroupMemberdeleteineventbarselecteventTab);
		}  

		/*** This method search User Auth Profile Update event name in select event name field in Events  Tab***/
		public void searcheventnameuserAuthProfileUpdate(String searcheventnameuserAuthProfileUpdateineventbarselecteventTab) throws InterruptedException {
			TestUtils.waitForElementPresent(searchbarforeventnameEvents);
			TestUtils.type(searchbarforeventnameEvents,searcheventnameuserAuthProfileUpdateineventbarselecteventTab);
		}  
			
		/*** This method search User Auth Profile Delete event name in select event name field in Events  Tab***/
		public void searcheventnameuserAuthProfileDelete(String searcheventnameuserAuthProfileDeleteineventbarselecteventTab) throws InterruptedException {
			TestUtils.waitForElementPresent(searchbarforeventnameEvents);
			TestUtils.type(searchbarforeventnameEvents,searcheventnameuserAuthProfileDeleteineventbarselecteventTab);
		}  
			
		/*** This method search User Profile Enable Disable event name in select event name field in Events  Tab***/
		public void searcheventnameuserProfileEnableDisable(String searcheventnameuserProfileEnableDisable) throws InterruptedException {
			TestUtils.waitForElementPresent(searchbarforeventnameEvents);
			TestUtils.type(searchbarforeventnameEvents,searcheventnameuserProfileEnableDisable);
		}  
			
		/*** This method search User Logout event name in select event name field in Events  Tab***/
		public void searcheventnameuserLogout(String searcheventnameuserLogoutineventbarselecteventTab) throws InterruptedException {
			TestUtils.waitForElementPresent(searchbarforeventnameEvents);
			TestUtils.type(searchbarforeventnameEvents,searcheventnameuserLogoutineventbarselecteventTab);
		}
		
		/*** This method search User Set Password Link Create event name in select event name field in Events  Tab***/
		public void searcheventnameuserSetPswrdLinkCreate(String searcheventnameusersetPswrdlinkCreateineventbarselecteventTab) throws InterruptedException {
			TestUtils.waitForElementPresent(searchbarforeventnameEvents);
			TestUtils.type(searchbarforeventnameEvents,searcheventnameusersetPswrdlinkCreateineventbarselecteventTab);
		}
		
		
		/*** This method search User Reset Password event name in select event name field in Events  Tab***/
		public void searcheventnameuserRestPswrd(String searcheventnameuserResetPswrdineventbarselecteventTab) throws InterruptedException {
			TestUtils.waitForElementPresent(searchbarforeventnameEvents);
			TestUtils.type(searchbarforeventnameEvents,searcheventnameuserResetPswrdineventbarselecteventTab);
		}  
		/*** This method search User Token Refresh event name in select event name field in Events  Tab***/
		public void searcheventnameuserTokenRefresh(String searcheventnameuserTokenRefereshineventbarselecteventTab) throws InterruptedException {
			TestUtils.waitForElementPresent(searchbarforeventnameEvents);
			TestUtils.type(searchbarforeventnameEvents,searcheventnameuserTokenRefereshineventbarselecteventTab);
		}
}



