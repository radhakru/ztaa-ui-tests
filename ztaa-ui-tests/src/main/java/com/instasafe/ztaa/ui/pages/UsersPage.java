package com.instasafe.ztaa.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.instasafe.ztaa.ui.utils.TestUtils;

public class UsersPage {

	@FindBy(xpath = "//a[text()=' Users ']")
	private WebElement users;

	@FindBy(xpath = "//i[@class='fa fa-plus']")
	private WebElement addusersplusbtn;

	@FindBy(id = "displayName_id")
	private WebElement usersentername;

	@FindBy(id = "displayName_id")
	private WebElement usersenternameforadmin;

	@FindBy(id = "email_id")
	private WebElement usersenteremail;
	
	@FindBy(id = "email_id")	
	private WebElement usersenteremailforadmin;	
	

	@FindBy(id = "username_id")
	private WebElement usersenterusername;

	@FindBy(id = "username_id")
	private WebElement usersenterusernameforadmin;

	//(//mat-select[@name='countryCode']) (//*[@class='mat-select-arrow'])[3]	
		@FindBy(xpath = "(//mat-select[@name='countryCode'])")	
		private WebElement usersphonecntrycdearrow;

//	@FindBy(xpath = "(//*[@src='https://restcountries.eu/data/ind.svg'])[1]")
	@FindBy(xpath = "(//*[@class='mat-option-text'])[105]")
	private WebElement usersphonecntrycdeindia;

	@FindBy(id = "phone_id")
	private WebElement usersphonenumber;

	@FindBy(xpath = "(//div[@class='mat-slide-toggle-thumb'])[3]")
	private WebElement adminusertoggle;

	@FindBy(xpath = "(//div[@class='mat-slide-toggle-thumb'])[4]")
	private WebElement readonlytoggle;

	@FindBy(xpath = "(//div[@class='mat-slide-toggle-thumb'])[4]")
	private WebElement deviceblocktoggle;

	@FindBy(xpath = "(//*[text()='Add User'])[1]")
	private WebElement usersadduser;

	@FindBy(xpath = "//span[text()=' Edit ']")
	private WebElement editbuttonofusers;

	@FindBy(xpath = "//span[text()='3']")
	private WebElement selectusernameforblock;

	@FindBy(xpath = "(//div[@class='mat-tab-label-content'])[2]")
	private WebElement deviceunderDevices;

	@FindBy(xpath = "//i[@class='fa fa-download']")
	private WebElement csvdownloaduser;

	@FindBy(xpath = "//i[@class='fa fa-sync']")
	private WebElement adsynUsers;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-layout[1]/app-users[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[2]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]")
	private WebElement sortbytoggle;

	@FindBy(xpath = "//span[text()='Created Time']")
	private WebElement createdtime;

	@FindBy(xpath = "(//span[text()='Name'])[1]")
	private WebElement name;

	@FindBy(xpath = "(//span[text()='Active State'])")
	private WebElement activestateuser;

	
	@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[2]")	
	private WebElement checkboxforuser;	
		
	@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[1]")	
	private WebElement checkboxforadminuser;	
		
	@FindBy(xpath = "(//button[text()='Disable'])")	
	private WebElement disableuserExternally;	
		
	@FindBy(xpath = "(//button[text()='Yes, disable them!'])")	
    private WebElement userconfirmdisableExternally;	
		
	@FindBy(xpath = "(//button[text()='Delete'])")	
	private WebElement deleteuserExternally;	
		
	@FindBy(xpath = "(//button[text()='Yes, delete them!'])")	
    private WebElement userconfirmdeleteExternally;
		
	@FindBy(xpath = "(//button[text()='Enable'])")	
	private WebElement enableuserExternally;	
		
		@FindBy(xpath = "(//button[text()='Yes, enable them!'])")	
    private WebElement userconfirmenableExternally;	
		
		@FindBy(xpath = "//input[@type='text']")
		private WebElement searchAdminusername;	
		
		
	@FindBy(xpath = "(//mat-icon[text()='more_vert'])")	
	private WebElement verticaldotuser;
	@FindBy(xpath = "(//i[@class='fa fa-long-arrow-alt-up ng-star-inserted'])[1]")
	private WebElement sortedinascending;

	@FindBy(xpath = "(//i[@class='fa fa-long-arrow-alt-down ng-star-inserted'])[1]")
	private WebElement sortedindecending;

	/*
	 * This method clicks on the 'Users' tab in Identity Management
	 */
	public void clickOnUsersTab() {
		TestUtils.click(users);
	}

	/*
	 * This method clicks on the '+' sign in the Users tab
	 */
	public void clickOnAddUsersPlusSignBtn() {
		TestUtils.waitForElementPresent(addusersplusbtn);
		TestUtils.click(addusersplusbtn);
	}

	/*
	 * This method enters Name in the Users tab while creating new user
	 */
	public void usersEnterName(String name) throws InterruptedException {
		TestUtils.waitForElementPresent(usersentername);
		TestUtils.type(usersentername, name);

	}

	/*
	 * This method enters Email in the Users tab while creating new user
	 */
	public void usersEnterEmail(String email) throws InterruptedException {
		TestUtils.waitForElementPresent(usersenteremail);
		TestUtils.type(usersenteremail, email);

	}

	/*
	 * This method enters Username in the Users tab while creating new user
	 */
	public void usersEnterUsername(String username) throws InterruptedException {
		TestUtils.waitForElementPresent(usersenterusername);
		TestUtils.type(usersenterusername, username);

	}

	/*
	 * This method clicks on the Country Code dropdown arrow icon
	 */
	public void clickOnCountryCodeArrowBtn() {
		TestUtils.waitForElementPresent(usersphonecntrycdearrow);
		TestUtils.click(usersphonecntrycdearrow);
	}

	/*
	 * This method selects the Country Code as 'India'
	 */
	public void clickOnCountryCodeSelectIndia() {
		TestUtils.waitForElementPresent(usersphonecntrycdeindia);
		TestUtils.click(usersphonecntrycdeindia);
	}

	/*
	 * This method enters Phone Number in the Users tab while creating new user
	 */
	public void usersEnterPhoneNumber(String phonenumber) throws InterruptedException {
		TestUtils.waitForElementPresent(usersphonenumber);
		TestUtils.type(usersphonenumber, phonenumber);

	}

	/*
	 * This method clicks on the 'Add Users' button in the Users tab while creating
	 * new user
	 */
	public void clickOnUsersAddUser() {
		TestUtils.waitForElementPresent(usersadduser);
		TestUtils.click(usersadduser);
	}

	/*
	 * This method clicks on the ''sort by toggle sign in the Users tab
	 */
	public void clickOnsortbyToggle() {
		TestUtils.waitForElementPresent(sortbytoggle);
		TestUtils.click(sortbytoggle);
	}

	/*
	 * This method clicks on the ''sort by ascending in the Users tab
	 */
	public void clickOnsortedInAscending() {
		TestUtils.waitForElementPresent(sortedinascending);
		TestUtils.click(sortedinascending);
	}

	/*
	 * This method clicks on the ''sort by descending sign in the Users tab
	 */
	public void clickOnsortedInDecending() {
		TestUtils.waitForElementPresent(sortedindecending);
		TestUtils.click(sortedindecending);
	}

	/*
	 * This method clicks on the ''sort by active state " in the Users tab
	 */
	public void clickOnsortbyActivestate() {
		TestUtils.waitForElementPresent(activestateuser);
		TestUtils.click(activestateuser);
	}

	/*
	 * This method clicks on the ''sort by active state " in the Users tab
	 */
	public void clickOnsortbyName() {
		TestUtils.waitForElementPresent(name);
		TestUtils.click(name);
	}

	/*
	 * This method clicks on the ''sort by active state " in the Users tab
	 */
	public void clickOnsortbyCreatedTime() {
		TestUtils.waitForElementPresent(createdtime);
		TestUtils.click(createdtime);
	}

	/*
	 * This method clicks on the 'device block or unblock toggle under Devices'
	 * option in the Users tab
	 */
	public void clickOnDeviceBlockToggle() {
		TestUtils.waitForElementPresent(deviceblocktoggle);
		TestUtils.click(deviceblocktoggle);
	}

	/*
	 * This method clicks on the AD sync button 'Users' tab in Identity Management
	 */
	public void clickOnAdsysncButton() {
		TestUtils.waitForElementPresent(adsynUsers);
		TestUtils.click(adsynUsers);
	}

	/*
	 * This method clicks on the 'user for select device ' option in the Users tab
	 */
	public void clickOnselctUserofDevicename() {
		TestUtils.waitForElementPresent(selectusernameforblock);
		TestUtils.click(selectusernameforblock);
	}

	/*
	 * This method clicks on the 'admin user button' in the Users tab
	 */
	public void clickOnAdminuserToggle() {
		TestUtils.waitForElementPresent(adminusertoggle);
		TestUtils.click(adminusertoggle);
	}

	/*
	 * This method clicks on the 'Edit button' in the Users tab
	 */
	public void clickOneditbtn() {
		TestUtils.waitForElementPresent(editbuttonofusers);
		TestUtils.click(editbuttonofusers);
	}
	
	/*
	 * This method clicks on the 'admin button' sign in the Users tab
	 */
	public void clickOnReadonlyuserToggle() {
		TestUtils.waitForElementPresent(readonlytoggle);
		TestUtils.click(readonlytoggle);
	}

	/*
	 * This method clicks on the 'Device' under users
	 */
	public void clickOnDevicesunderUsers() {
		TestUtils.waitForElementPresent(deviceunderDevices);
		TestUtils.click(deviceunderDevices);
	}

	/*
	 * This method clicks on the CSV download button 'Users' tab in Identity
	 * Management
	 */
	public void clickOnCsvDownloadUser() {
		TestUtils.waitForElementPresent(csvdownloaduser);
		TestUtils.click(csvdownloaduser);
	}

		
		
	/*	
	 * This method clicks on the 'vertical dot of user in the Users tab	
	 */	
	public void clickOnthreeverticaldot() {	
		TestUtils.waitForElementPresent(verticaldotuser);	
		TestUtils.click(verticaldotuser);	
	}	
		
		
		
	/*	
	 * This method clicks on the 'check box of user in the Users tab	
	 */	
	public void clickOncheckboxofuser() {	
		TestUtils.waitForElementPresent(checkboxforuser);	
		TestUtils.click(checkboxforuser);	
	}	
		
	/*	
	 * This method clicks on the 'Disable user Externally of user in the Users tab	
	 */	
	public void clickOndisableUserExternally() {	
		TestUtils.waitForElementPresent(disableuserExternally);	
		TestUtils.click(disableuserExternally);	
	}
	/*	
	 * This method clicks on the 'Disable user Externally of user in the Users tab for conformation	
	 */	
	public void clickOnDisableUserConfirmExternally() {	
		TestUtils.waitForElementPresent(userconfirmdisableExternally);	
		TestUtils.click(userconfirmdisableExternally);	
	}
	/*	
	 * This method clicks on the 'enable user Externally of user in the Users tab	
	 */	
	public void clickOnEnableUserExternally() {	
		TestUtils.waitForElementPresent(enableuserExternally);	
		TestUtils.click(enableuserExternally);	
	}
	
	 /* This method clicks on the 'Delete user Externally of user in the Users tab	
	 */	
	public void clickOnDeleteUserExternally() {	
		TestUtils.waitForElementPresent(deleteuserExternally);	
		TestUtils.click(deleteuserExternally);	
	}	
	
	/*	
	 * This method clicks on the 'Delete user Externally of user in the Users tab for conformation	
	 */	
	public void clickOnDeleteUserConfirmExternally() {	
		TestUtils.waitForElementPresent(userconfirmdeleteExternally);	
		TestUtils.click(userconfirmdeleteExternally);	
	}
	/*	
	 * This method clicks on the 'Enable user Externally of user in the Users tab for conformation	
	 */	
	public void clickOnEnableUserConfirmExternally() {	
		TestUtils.waitForElementPresent(userconfirmenableExternally);	
		TestUtils.click(userconfirmenableExternally);	
	}	
	
	/*
	 * This method enters admin Username in the Users tab for search 
	 */
	public void searchAdminusername(String searchadminusername) throws InterruptedException {
		TestUtils.waitForElementPresent(searchAdminusername);
		TestUtils.type(searchAdminusername, searchadminusername);

	}


	
	/*	
	 * This method clicks on the 'check box of admin user in the Users tab	
	 */	
	public void clickOncheckboxofadminuser() {	
		TestUtils.waitForElementPresent(checkboxforadminuser);	
		TestUtils.click(checkboxforadminuser);	
	}	
	
}
