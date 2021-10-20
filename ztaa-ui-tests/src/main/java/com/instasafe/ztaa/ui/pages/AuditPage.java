package com.instasafe.ztaa.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.instasafe.ztaa.ui.utils.TestUtils;

public class AuditPage {

	@FindBy(xpath = "(//a[@class='mat-tooltip-trigger ng-star-inserted'])[5]")
	private WebElement  Audit;
	
	@FindBy(xpath = "//a[text()=' Gateway Status ']")
	private WebElement  gatewayStatusofAuditsTab;
	
	
	@FindBy(xpath = "//a[text()='  Recent Active Users  ']")
	private WebElement  recentActiveusersofAuditsTab;
	
	
	@FindBy(xpath = "//a[text()=' User Logins ']")
	private WebElement  UserLogins;
	
	@FindBy(xpath = "//a[text()=' Username Lookups ']")
	private WebElement  UsernameLookups;
	
	@FindBy(xpath = "//div[text()='Failed: Username Lookup']")
	private WebElement  failedUsernameLookups;
	
	
	@FindBy(xpath = "//a[text()=' Exports ']")
	private WebElement  ExportsAudits;
	
	@FindBy(xpath = "(//i[@class='fa fa-plus'])")
	private WebElement  addExportsAudits;
	
	@FindBy(xpath = "(//i[@class='fa fa-long-arrow-alt-up ng-star-inserted'])[1]")
	private WebElement sortedinAscendingorderAudit;
	
	@FindBy(xpath = "(//i[@class='fa fa-long-arrow-alt-down ng-star-inserted'])[1]")
	private WebElement sortedinDescendingorderAudit;
	
	@FindBy(xpath = "//i[@class='fa fa-download']")
	private WebElement exporttoCSVAudit;
	
	@FindBy(xpath = "(//i[@class='fa fa-file-csv'])[1]")
	private WebElement dwnloadCSVExportsAudit;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-audit-layout[1]/div[1]/div[1]/div[2]/div[2]/app-gateway-status[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[5]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]")
	private WebElement showdropdwnToggleAudit;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-audit-layout[1]/div[1]/div[1]/div[2]/div[2]/app-auth-logs[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[5]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]")
	private WebElement showdropdwnToggleAuthLogsAudit;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-audit-layout[1]/div[1]/div[1]/div[2]/div[2]/app-identity-audit-user-login[1]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]")
	private WebElement showdropdwnToggleuserloginsAudit;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-audit-layout[1]/div[1]/div[1]/div[2]/div[2]/app-audit-exports[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]")
	private WebElement showdropdwnExportsAudit;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-audit-layout[1]/div[1]/div[1]/div[2]/div[2]/app-identity-audit-username-lookup[1]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]")
	private WebElement showdropdwnusernamelookupsAudit;
	
	@FindBy(xpath = "(//span[text()='Show 10'])[2]")
	private WebElement show10Audit;
	
	
	@FindBy(xpath = "(//span[text()='Show 20'])[1]")
	private WebElement show20Audit;
	
	@FindBy(xpath = "(//span[text()='Show 50'])[1]")
	private WebElement show50Audit;
	
	@FindBy(xpath = "(//span[text()='Show 100'])[1]")
	private WebElement show100Audit;
	
	@FindBy(xpath = "(//span[text()='Show 10'])[2]")
	private WebElement show10AuthLogsAudit;
	
	@FindBy(xpath = "(//span[text()='Show 20'])[1]")
	private WebElement show20AuthLogsAudit;
	
	@FindBy(xpath = "(//span[text()='Show 50'])[1]")
	private WebElement show50AuthLogsAudit;
	
	@FindBy(xpath = "(//span[text()='Show 100'])[1]")
	private WebElement show100AuthLogsAudit;
	
	
	@FindBy(xpath = "(//span[text()='Show 10'])[2]")
	private WebElement show10UsernameLoginsAudit;
	
	@FindBy(xpath = "(//span[text()='Show 20'])[1]")
	private WebElement show20UsernameLoginsAudit;
	
	@FindBy(xpath = "(//span[text()='Show 50'])[1]")
	private WebElement show50UsernameLoginsAudit;
	
	@FindBy(xpath = "(//span[text()='Show 100'])[1]")
	private WebElement show100UsernameLoginsAudit;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement searchgatewayststusAudit;
	
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement searchauthlogsAudit;
	
	
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement searchUserLoginsAudit;
	
	@FindBy(xpath = "//a[text()=' Authentication Logs ']")
	private WebElement AuthenticationLogsAudit;
	
	
	@FindBy(xpath = "(//i[@class='fa fa-long-arrow-alt-up ng-star-inserted'])[1]")
	private WebElement sortedinAscendingorderAudits;
	
	@FindBy(xpath = "(//i[@class='fa fa-long-arrow-alt-down ng-star-inserted'])[1]")
	private WebElement sortedinDescendingorderAudits;
	
	@FindBy(xpath = "//input[@placeholder='Select Date Range']")
	private WebElement selectdaterangeAudits;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-audit-layout[1]/div[1]/div[1]/div[2]/div[2]/app-audit-exports[1]/div[2]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]")
	private WebElement selectexporttypedropdownAudits;
	
	@FindBy(xpath = "//span[text()='Devices']")
	private WebElement selectexporttypedeviceAudit;
	
	@FindBy(xpath = "//span[text()='Gateway Status']")
	private WebElement selectexporttypegatewaystatusAudit;
	
	@FindBy(xpath = "//span[text()='Policy Status']")
	private WebElement selectPolicyupdatesexportAudits ;

	
	@FindBy(xpath = "//span[text()='Tenant Apps']")
	private WebElement selecttenantappsexportAudits;
	
	@FindBy(xpath = "//span[text()='Users']")
	private WebElement selectUsersexportAudits;
	
	
	@FindBy(xpath = "//span[text()='Users Groups']")
	private WebElement selectugroupexportAdits;
	
	@FindBy(xpath = "//span[text()='User Last Login']")
	private WebElement selectuserlastloginexport;
	
	@FindBy(xpath = "//span[text()='User Login']")
	private WebElement selectuserloginexport;
	
	@FindBy(xpath = "//span[text()='User Lookups']")
	private WebElement selectuserlookupsexport;
	
	
	@FindBy(xpath = "//input[@data-placeholder='Select Date Range']")
	private WebElement selectdaterangeforuserlookupsexport;
	
	@FindBy(xpath = "//button[text()='Yesterday']")
	private WebElement selectdaterangeyesterdayofuserlookupsexport;
	
	@FindBy(xpath = "//span[text()='T-OTP Verified User']")
	private WebElement selecttOTPverfieduserExports;
	
	@FindBy(xpath = "//button[text()='Yesterday']")
	private WebElement submitYesterdayAudit;
	
	@FindBy(xpath = "//button[text()='Last 7 Days']")
	private WebElement last7dayAudit;
	
	@FindBy(xpath = "//button[text()='Last 30 Days']")
	private WebElement last30dayAudit;
	
	@FindBy(xpath = "//button[text()='This Month']")
	private WebElement thisMonthAudit;
	
	@FindBy(xpath = "//button[text()='Last Month']")
	private WebElement LastMonthAudit;
	
	@FindBy(xpath = "//button[text()='Custom range']")
	private WebElement CustomRangeAudits;
	
	@FindBy(xpath = "(//td[@class='available ng-star-inserted'])[3]")
	private WebElement CustomRangeselectdateAudits;
	
	@FindBy(xpath = "//button[@class='btn']")
	private WebElement applybtnAudits;
	
	@FindBy(xpath = "//button[text()='Submit']")
	private WebElement submitExportsAudit;
	
	/*
	 * This method clicks on the 'Audit'
	 */
	public void clickOnAuditTab() {
		TestUtils.click(Audit);
	}
	
	
	/*
	 * This method clicks on the Gateway status of 'Audit Tab'
	 */
	public void clickOnGatewayStatusofAuditTab() {
		TestUtils.click(gatewayStatusofAuditsTab);
	}
	
	
	/*
	 * This method clicks on the Recent Active Users of 'Audit Tab'
	 */
	public void clickOnRecentActiveUsersofAuditTab() {
		TestUtils.click(recentActiveusersofAuditsTab);
	}
	
	
	
	/*
	 * This method clicks on the Authentication Logs of 'Audit Tab'
	 */
	public void clickOnAuthenticationLogsofAuditTab() {
		TestUtils.click(AuthenticationLogsAudit);
	}
	/*
	 * This method clicks on the User Logins in 'Audit Tab'
	 */
	public void clickOnUserLoginsofAuditTab() {
		TestUtils.click(UserLogins);
	}
	
	/*
	 * This method clicks on the Username Lookups in 'Audit Tab'
	 */
	public void clickOnUsernameLookupsAuditTab() {
		TestUtils.click(UsernameLookups);
	}
	
	/*
	 * This method clicks on the failed Username Lookups in 'Audit Tab'
	 */
	public void clickOnfailedUsernameLookupsAuditTab() {
		TestUtils.click(failedUsernameLookups);
	}
	
	/*
	 * This method clicks on the Exports in 'Audit Tab'
	 */
	
	public void clickOnExportsofAuditTab() {
		TestUtils.click(ExportsAudits);
	}
	
	/*
	 * This method clicks on add to export button(+)  Exports in 'Audit Tab'
	 */
	public void clickOnaddExportsofAuditTab() {
		TestUtils.click(addExportsAudits);
	}
	
	
	
	
	/*
	 * This method clicks on Submit button(+)   in  Exports 'Audit Tab'
	 */
	public void clickOnSubmitButtonExportsofAuditTab() {
		TestUtils.click(submitExportsAudit);
	}
	
	/*
	 * This method clicks on select drop down toggle of  export button(+)  in 'Audit Tab'
	 */
	public void clickOnselectExportsTypedropdownofAuditTab() {
		TestUtils.click(selectexporttypedropdownAudits);
	}
	
	/*
	 * This method clicks on add button select export type devices in 'Audit Tab'
	 */
	public void clickOnselectexportTypeDeviceExportsAuditTab() {
		TestUtils.click(selectexporttypedeviceAudit);
	}
	
	/*
	 * This method clicks on add button select export type gateway status in 'Audit Tab'
	 */
	public void clickOnselectexportTypegatewaystatusExportsAuditTab() {
		TestUtils.click(selectexporttypegatewaystatusAudit);
	}
	
	/*
	 * This method clicks on add button select export type policy update in 'Audit Tab'
	 */
	public void clickOnselectexportTypepolicyupdateExportsAuditTab() {
		TestUtils.click(selectPolicyupdatesexportAudits);
	}
	
	
	/*
	 * This method clicks on add button select export type tenant apps in 'Audit Tab'
	 */
	
	public void clickOnselectexporttenantappsinExportsAuditTab() {
		TestUtils.click(selecttenantappsexportAudits);
	}
	
	/*
	 * This method clicks on add button select export type users in 'Audit Tab'
	 */
		
		public void clickOnselectUsersexportAuditsTab() {
			TestUtils.click(selectUsersexportAudits);
	
		}
	/*
	 * This method clicks on add button select export type user groups in 'Audit Tab'
	 */
	
	 public void clickOnselectugroupexportAuditsTab() {
			TestUtils.click(selectugroupexportAdits);
	
	 }
	
	/*
	 * This method clicks on add button select export type user last login in 'Audit Tab'
	 */
	
	 public void clickOnselectUserlastloginexportAuditsTab() {
			TestUtils.click(selectuserlastloginexport);
	 }
	 
	/*
	 * This method clicks on add button select export type user logins in 'Audit Tab'
	 */
	
	 public void clickOnselectUserloginsexportAuditsTab() {
			TestUtils.click(selectuserloginexport);
	 }
	
	/*
	 * This method clicks on add button select export type  user lookups in 'Audit Tab'
	 */
	 
	 public void clickOnselectuserLookupsExportAuditsTab() {
		 
			TestUtils.click(selectuserlookupsexport);
	 }
	 
	 
	    /*
		 * This method clicks on select date range of   user lookups in 'Audit Tab'
		 */
		 
		 public void clickOnselectdaterangeuserLookupsExportAuditsTab() {
			 
				TestUtils.click(selectdaterangeforuserlookupsexport);
		 }

		     /*
			 * This method clicks on select date range  yesterday of   user lookups in 'Audit Tab'
			 */
			 
			 public void clickOnselectdaterangeyesterdayuserLookupsExportAuditsTab() {
				 
					TestUtils.click(selectdaterangeyesterdayofuserlookupsexport);
			 }
		 
			 /*
				 * This method clicks on select date range  yesterday  in 'Audit Tab'
				 */
				 
				 public void clickOnsubmityesterdayAuditsTab() {
					 
						TestUtils.click(submitYesterdayAudit);
				 }
			 
//***  This method clicks on select date range  Last 7 days   in 'Audit Tab'**//
				 
				 
				 public void clickOnlast7daysAuditsTab() {
					 
						TestUtils.click(last7dayAudit);
				 }
			 
				 
				 
				//***  This method clicks on select date range  Last 30 days   in 'Audit Tab'**//
				 public void clickOnlast30daysAuditsTab() {
					 
						TestUtils.click(last7dayAudit);
				 }
			 
				 
				 
				//***  This method clicks on select date range  This month   in 'Audit Tab'**//
				 public void clickOnThisMonthAuditsTab() {
						TestUtils.click(thisMonthAudit);
				 }
				 
				 
				 
				 
				//***  This method clicks on select date range  last month   in 'Audit Tab'**//
				 public void clickOnLastMonthAuditsTab() {
						TestUtils.click(LastMonthAudit);
				 }
				//***  This method clicks on select date range  Custom raage  in 'Audit Tab'**//
				 public void clickOnCustomRangeAuditsTab() {
						TestUtils.click(CustomRangeAudits);
				 }
				 
				 
				//***  This method clicks on select date range  Custom raage  in 'Audit Tab'**//
				 public void clickOnCustomRangeselectdateAuditsTab() {
						TestUtils.click(CustomRangeselectdateAudits);
				 }
				 
				//***  This method clicks on select date range  apply btn  in 'Audit Tab'**//
				 public void clickOnApplybtnTab() {
						TestUtils.click(applybtnAudits);
				 }
				 
		 
		/*
		 * This method clicks on add button select export type T-OTP verified users in 'Audit Tab'
		 */ 
		
	 
		 public void clickOnselectTOTPexportAuditsTab() {
				TestUtils.click(selecttOTPverfieduserExports);
	
		 }
	

	
	
	/*
	 * This method clicks on the download csv button of  Exports in 'Audit Tab'
	 */
	public void clickOnCSVdwnldExportsAuditTab() {
		TestUtils.click(dwnloadCSVExportsAudit);
	}
	/*
	 * This method clicks on the select date range of user logins in  'Audit'
	 */
	public void clickOnselectdateRangeUserLoginsAuditTab() {
		TestUtils.click(selectdaterangeAudits);
	}
	
	/*
	 * This method clicks on the sorted in ascending order of Gateway status in 'Audit'
	 */
	public void clickOnsortedAscinGatewayStatusofAuditTab() {
		TestUtils.click(sortedinAscendingorderAudit);
	}
	
	
	/*
	 * This method clicks on the sorted in Descending order of Gateway status in 'Audit'
	 */
	public void clickOnsortedDesincGatewayStatusofAuditTab() {
		TestUtils.click(sortedinDescendingorderAudit);
	}
	
	
	/*
	 * This method clicks on the sorted in ascending order  in 'Audit'
	 */
	public void clickOnsortedAscinAuditsTab() {
		TestUtils.click(sortedinAscendingorderAudits);
	}
	
	/*
	 * This method clicks on the sorted in ascending order in 'Audit'
	 */
	public void clickOnsortedDescAuditsTab() {
		TestUtils.click(sortedinDescendingorderAudits);
	}
	
	/*
	 * This method clicks on the Export to CSV of gateway status 'Audit'
	 */
	public void clickOnexporttoCSVAuditTab() {
		TestUtils.click(exporttoCSVAudit);
	}
	

	/*
	 * This method clicks on the Show drop toggle in 'Audit'
	 */
	public void clickOnShowDropToggleAuditTab() {
		TestUtils.click(showdropdwnToggleAudit);
		
	}
	/*
	 * This method clicks on the Show drop toggle in username logins tab of   'Audit'
	 */
	public void clickOnShowDropToggleUserloginsAuditTab() {
		TestUtils.click(showdropdwnToggleuserloginsAudit);
		
	}
	/*
	 * This method clicks on the Show drop toggle in Exports tab of  'Audit'
	 */
	public void clickOnShowDropExportsAuditTab() {
		TestUtils.click(showdropdwnExportsAudit);
		
	}
	
	
	/*
	 * This method clicks on the Show drop toggle in username lookups tab of  'Audit'
	 */
	public void clickOnShowDropusernamelookupsAuditTab() {
		TestUtils.click(showdropdwnusernamelookupsAudit);
		
	}
	
	
	
	
	
	
	/*
	 * This method clicks on the Show 10  in 'Audit'
	 */
	public void clickOnShow10AuditTab() {
		TestUtils.click(show10Audit);
		
	}
	
	/*
	 * This method clicks on the Show 20 in 'Audit'
	 */
	public void clickOnShow20AuditTab() {
		TestUtils.click(show20Audit);
		
	}
	
	
	/*
	 * This method clicks on the Show 50 in 'Audit'
	 */
	public void clickOnShow50AuditTab() {
		TestUtils.click(show50Audit);
		
	}
	
	/*
	 * This method clicks on the Show 100 in 'Audit'
	 */
	public void clickOnShow100AuditTab() {
		TestUtils.click(show100Audit);
		
	}
	
	
	/*
	 * This method clicks on the Show drop toggle in Authentication logs 'Audit'
	 */
	public void clickOnShowDropToggleAuthLogsAuditTab() {
		TestUtils.click(showdropdwnToggleAuthLogsAudit);
		
	}
	
	
	/*
	 * This method clicks on the Show 10  in  Authentication Logs 'Audit'
	 */
	public void clickOnShow10AuthLogsAuditTab() {
		TestUtils.click(show10AuthLogsAudit);
		
	}
	
	/*
	 * This method clicks on the Show 20 in Authentication Logs  'Audit'
	 */
	public void clickOnShow20AuthLogsAuditTab() {
		TestUtils.click(show20AuthLogsAudit);
		
	}
	
	
	/*
	 * This method clicks on the Show 50 in Authentication Logs 'Audit'
	 */
	public void clickOnShow50AuthLogsAuditTab() {
		TestUtils.click(show50AuthLogsAudit);
		
	}
	
	
	/*
	 * This method clicks on the Show 100 in   Authentication Logs 'Audit'
	 */
	public void clickOnShow100AuthLogsAuditTab() {
		TestUtils.click(show100AuthLogsAudit);
		
	}
	
	
	/*
	 * This method clicks on the Show 10  in  Authentication Logs 'Audit'
	 */
	public void clickOnShow10UserLoginsAuditTab() {
		TestUtils.click(show10UsernameLoginsAudit);
		
	}
	
	/*
	 * This method clicks on the Show 20 in Authentication Logs  'Audit'
	 */
	public void clickOnShow20UserLoginsAuditTab() {
		TestUtils.click(show20UsernameLoginsAudit);
		
	}
	
	
	/*
	 * This method clicks on the Show 50 in Authentication Logs 'Audit'
	 */
	public void clickOnShow50UserLoginsAuditTab() {
		TestUtils.click(show50UsernameLoginsAudit);
		
	}
	
	
	/*
	 * This method clicks on the Show 100 in   Authentication Logs 'Audit'
	 */
	public void clickOnShow100UserLoginsAuditTab() {
		TestUtils.click(show100AuthLogsAudit);
	
	}
	/*
	 * This method clicks on the Show 10  in  Exports 'Audit'
	 */
	public void clickOnShow10ExportsAuditTab() {
		TestUtils.click(show10Audit);
		
	}
	
	/*
	 * This method clicks on the Show 20 in Exports  'Audit'
	 */
	public void clickOnShow20ExportsAuditTab() {
		TestUtils.click(show20Audit);
		
	}
	
	
	/*
	 * This method clicks on the Show 50 in Exports 'Audit'
	 */
	public void clickOnShow50ExportAuditTab() {
		TestUtils.click(show50Audit);
		
	}
	
	
	/*
	 * This method clicks on the Show 100 in  Exports 'Audit'
	 */
	public void clickOnShow100ExportsAuditTab() {
		TestUtils.click(show100Audit);
		
	}
	
	
	
	 /*** This method search gateway name gatway status  tab in Audit Tab***/
	public void entergatewaystatusnminAuditforSearch(String searchgtwaystatusAudits ) throws InterruptedException {
		TestUtils.waitForElementPresent(searchgatewayststusAudit);
		TestUtils.type(searchgatewayststusAudit,searchgtwaystatusAudits);
	}
    
	
	 /*** This method search username in authentication logs  tab of  Audits Tab***/
	
	public void enterauthlogsunameforsearchAudits(String  searchunameAuthLogsAudits) throws InterruptedException {
		TestUtils.waitForElementPresent(searchauthlogsAudit);
		TestUtils.type(searchauthlogsAudit,searchunameAuthLogsAudits);
	}

	 /*** This method search username in User logins  tab of  Audits Tab***/
	
		public void enterUserNameLoginsunameforsearchinAudits(String searchunameUserLoginsAudits) throws InterruptedException {
			TestUtils.waitForElementPresent(searchUserLoginsAudit);
			TestUtils.type(searchUserLoginsAudit,searchunameUserLoginsAudits);
		}

		 /*** This method search username in User logins  tab of  Audits Tab***/
		
		public void enterUserNameLookupsforsearchinAudits(String searchunameUsernameLookupsAudits) throws InterruptedException {
			TestUtils.waitForElementPresent(searchUserLoginsAudit);
			TestUtils.type(searchUserLoginsAudit,searchunameUsernameLookupsAudits);
		}
	
}