package com.instasafe.ztaa.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.instasafe.ztaa.ui.utils.TestUtils;

public class AuthProfilePage {
	
	@FindBy(xpath = "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-identity-layout/nav/div[2]/div/div/a[4]")
	private WebElement authprofile;

	// '+' button in Exclusions -> Users tab of Auth Profile	
	@FindBy(xpath = "(//i[@class='fa fa-plus'])[1]")
	private WebElement authprofileaddbtn;
	
	
	@FindBy(xpath = "//span[text()='Add User']")
	private WebElement authprofileadduser;
	
	@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[1]")
	private WebElement authprofileselectuserchkbox;
	
	
	
	@FindBy(xpath = "/html/body/div[3]/div[2]/div/mat-dialog-container/app-filter-popup/mat-dialog-actions/button[1]/span[1]")
	private WebElement authprofileselecteduser;
	
	@FindBy(xpath = "(//span[text()='Next'])[1]")
	private WebElement authprofileselectedusernext;
	
	@FindBy(xpath = "(//span[text()='Next'])[2]")
	private WebElement authprofilepriauthnext;
	
	@FindBy(xpath = "(//span[@class='mat-radio-container'])[7]")	
	private WebElement selectADprimaryAuthentication;	
		
	
	@FindBy(xpath = "(//span[text()='Next'])[3]")	
	private WebElement authprofilesecondaryuthnext;
	
	
	
	@FindBy(xpath = "(//span[text()='Next'])[4]")	
	private WebElement authprofileconfiguresessionnext;	
		
		
	@FindBy(xpath = "(//span[text()=' Edit '])[2]")	
	private WebElement editbuttonofauthprofile ;
	
	
	
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-layout[1]/app-auth-profile[1]/mat-card[2]/mat-card-content[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/app-user-auth[1]/section[1]/div[1]/div[7]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]")	
	private WebElement  authshowlist;
	
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-layout[1]/app-auth-profile[1]/mat-card[2]/mat-card-content[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/app-user-auth[1]/section[1]/div[1]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]")	
	private WebElement  sortingauthtoggle ;	
			
	
		
	@FindBy(xpath = "(//span[text()='Created Time'])[1]")	
	private WebElement  authcreatedtime;	
		
	@FindBy(xpath = "(//span[text()='Display Name'])[1]")	
	private WebElement  dispalyTime;	
	
	
	
	@FindBy(xpath = "(//span[text()='Show 10'])[2]")	
	private WebElement  show10Auth;	
		
	@FindBy(xpath = "(//span[text()='Show 20'])[1]")	
	private WebElement  show20Auth;	
		
	@FindBy(xpath = "(//span[text()='Show 50'])[1]")	
	private WebElement  show50Auth;	
		
	@FindBy(xpath = "(//span[text()='Show 100'])[1]")	
	private WebElement  show100Auth;	
		
		
		
	@FindBy(xpath = "(//span[@class='mat-ripple mat-button-ripple'])[5]")	
	private WebElement  ADnext;	
	
	@FindBy(xpath = "(//span[text()='Submit'])")
	private WebElement  nextsubmit;
	
	
	
	@FindBy(xpath = "(//div[@class='mat-slide-toggle-thumb-container'])[3]")
	private WebElement  diableuserinexclusion;
	
	
	/*
	 * This method clicks on the Auth Profile tab in Identity Management icon
	 */
	public void clickOnAuthProfileButton() {
		TestUtils.click(authprofile);
	}
	
	public void clickOnAuthProfileAddIconButton() {
		TestUtils.click(authprofileaddbtn);
	}
	
	public void clickOnAuthProfileAddUser() {
		TestUtils.click(authprofileadduser);
	}
	
	public void clickOnAuthProfileAddSelectedUserChkBox() {
		TestUtils.click(authprofileselectuserchkbox);
	}
	
	public void clickOnAuthProfileAddSelectedUser() {
		TestUtils.click(authprofileselecteduser);
	}
	
	public void clickOnAuthProfileSelectedUserNext() {
		TestUtils.waitForElementPresent(authprofileselectedusernext);	
		TestUtils.click(authprofileselectedusernext);
	}
	
	public void clickOnAuthProfilePriAuthNext() {
		TestUtils.click(authprofilepriauthnext);
	}
	
	
		
	public void clickOnAuthProfileSecondaryAuthNext() {	
		TestUtils.waitForElementPresent(authprofilesecondaryuthnext);	
		TestUtils.click(authprofilesecondaryuthnext);	
	}	
		
	//This method click on auth created time	
	public void clickOnAuthProfileCreatedTime() {	
		TestUtils.click(authcreatedtime);	
	}	
		
	//This method click on auth display time	
	public void clickOnAuthProfileDispalyTime() {	
		TestUtils.click(dispalyTime);	
	}	
		
		
	/*	
	 * This method clicks on the Auth Profile tab in Identity Management icon	
	 */	
	public void clickOnSelectPrimaryADAuthentication() {	
		TestUtils.click(selectADprimaryAuthentication);	
	}	
		
		
	//** This method click on  Auth profile edit button	
		//	
		public void clickOnAuthProfileEdit() {	
				
			TestUtils.click(editbuttonofauthprofile);	
		}	
			
			
		/*	
		 * This method clicks on the Auth Profile tab(show list) in Identity Management icon	
		 */	
		public void clickOnAuthShowlistToggle() {	
			TestUtils.click(authshowlist);	
		}	
			
		
		
		
	//** This method click on configure session next button of Auth profile 	
	//	
	public void clickOnAuthProfileConfigureSessionAuthNext() {	
		TestUtils.waitForElementPresent(authprofileconfiguresessionnext);	
		TestUtils.click(authprofileconfiguresessionnext);	
	}
	
	
	
	//** This method click on sorting toggle of Auth profile 	
	//	
	public void clickOnAuthProfileSortingToggle() {	
		TestUtils.waitForElementPresent(sortingauthtoggle);	
		TestUtils.click(sortingauthtoggle);	
	}	
		
	/*	
	 * This method clicks on the 'show 10 sign in the auth profile tab	
	 */	
	public void clickOnshow10auth() {	
		TestUtils.waitForElementPresent(show10Auth);	
		TestUtils.click(show10Auth);	
	}	
		
	/*	
	 * This method clicks on the 'show 20 sign in the auth profile tab	
	 */	
	public void clickOnshow20auth() {	
		TestUtils.waitForElementPresent(show20Auth);	
		TestUtils.click(show20Auth);	
	}
	
	
	/*	
	 * This method clicks on the 'show 50 sign in the auth profile tab	
	 */	
	public void clickOnshow50auth() {	
		TestUtils.waitForElementPresent(show50Auth);	
		TestUtils.click(show50Auth);	
	}	
	
	
	
	/*	
	 * This method clicks on the 'show 100 sign in the auth profile tab	
	 */	
	public void clickOnshow100auth() {	
		TestUtils.waitForElementPresent(show100Auth);	
		TestUtils.click(show100Auth);	
	}	
		
			
		
	public void clickOnAuthProfileAD() {	
		TestUtils.waitForElementPresent(ADnext);	
		TestUtils.click(ADnext);	
	}	
		
	
	/*
	 * This method clicks on the Auth Profile tab in Identity Management icon
	 */
	public void clickOnAuthProfilesubmit() {
		TestUtils.click(nextsubmit);
	}
	
	
	/*
	 * This method clicks on the Auth Profile >Exclusion>Users disable button in Identity Management icon
	 */
	public void clickOnAuthProfileUserDisableButton() {
		TestUtils.click(diableuserinexclusion);
	}
	
}
