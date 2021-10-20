package com.instasafe.ztaa.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.instasafe.ztaa.ui.utils.TestUtils;

public class UserGroupsPage {

	
	@FindBy(xpath = "//a[text()=' User Groups ']")
	private WebElement usergroups ;
	
	@FindBy(xpath = "//i[@class='fa fa-plus']")
	private WebElement addusergroupsplusbtn; 
	
	@FindBy(id = "displayName_id")
	private WebElement usersenterusergroupname;
	
	@FindBy(xpath = "(//i[@class='fa fa-download'])[1]")	
	private WebElement csvdownloadusergroup;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement userclicksonnextbutton;
	
	
	@FindBy(xpath = "//span[text()='Add User']")
	private WebElement usersaddusergroups;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement userclicksondeletebuttonofusergroup;
	
	@FindBy(xpath = "//button[text()='Yes, delete']")
	private WebElement userclicksonYesdeletebuttonofusergroup;

	@FindBy(xpath = "//button[text()= 'OK']")
	private WebElement userclicksonOKbuttnofusergroup;

	
	@FindBy(xpath = "//span[text()=' Edit ']")
	private WebElement userclicksonEditBtnofusergroup;

	
	@FindBy(id= "userInputData")
	private WebElement usergrpsearch;
	
	@FindBy(xpath= "(//span[text()='Create Group'])[1]")
	private WebElement createusergroup;

	
	@FindBy(xpath= "(//img[@class='insta-live'])[1]")
	private WebElement selectusergroup;
	
	
	@FindBy(xpath= "(//div[@class='mat-tab-label-content'])[4]")
	private WebElement actiontabusergroup;
	
	
	@FindBy(xpath= "//span[text()='Update Group']")
	private WebElement updateusergroup;
	
	 // @FindBy(xpath = "(//div[@class='mat-slide-toggle-thumb'])[3]")	
	@FindBy(xpath = "//span[text()=' Edit ']")
    private WebElement userclicksonEditBtnofusergroupforUpdate;
   
   
	 //** @FindBy(xpath = "//input[@placeholder='Enter Name']")	
	@FindBy(xpath = "//input[@data-placeholder='Enter Name']")
    private WebElement clearname;
	
	@FindBy(xpath = "//button[text()='Delete']")	
	 private WebElement deleteusergroupexternally;	
		
	@FindBy(xpath = "//button[text()='Yes, delete them!']")	
	 private WebElement confirmdeleteusergroupexternally;

   
   @FindBy(id = "displayName_id")
	private WebElement usersenterusergroupnameforupdategroupname;


	/*
	 * This method clicks on the 'UserGroups' tab in Identity Management
	 */
	public void clickOnUsersTab() {
		TestUtils.click(usergroups);
	}
	
	
	/*
	 * This method clicks on the '+' sign in the User Groups tab
	 */
	public void clickOnAddUsersPlusSignBtn() {
		TestUtils.waitForElementPresent(addusergroupsplusbtn);
		TestUtils.click(addusergroupsplusbtn);
	}
	
	/*	
 * This method clicks on the 'delete user group externally' from  three dot sign in the User Groups tab	
 */	
public void clickOndelecteusergroupExternally() {	
	TestUtils.waitForElementPresent(deleteusergroupexternally);	
	TestUtils.click(deleteusergroupexternally);	
}	
	
	
	
/*	
 * This method clicks on the 'delete user group externally and ' from   the User Groups tab	
 */	
public void clickOnconfirmdelecteusergroupExternally() {	
	TestUtils.waitForElementPresent(confirmdeleteusergroupexternally);	
	TestUtils.click(confirmdeleteusergroupexternally);	
}
	 
	
	 /*
	  * This method enters User name in the Usergroups tab while creating new user group
	  */
	public void usersEnterUsergroupname(String usergroupname) throws InterruptedException {
		TestUtils.waitForElementPresent(usersenterusergroupname);
		TestUtils.type(usersenterusergroupname, usergroupname);
		
	}

	
	

	/*
	 * This method clicks on the 'NextButton'  in the Users Group tab
	 */
	public void userclickOnNextBtnug() {
		TestUtils.waitForElementPresent(userclicksonnextbutton);
		TestUtils.click(userclicksonnextbutton);
	}
	
	
	 /*
	  * This method clicks on the 'Add User Groups' button in the User Groups tab while creating new user group
	  */
	public void clickOnUsersAddUserGroups() {
		TestUtils.waitForElementPresent(usersaddusergroups);
		TestUtils.click(usersaddusergroups);
	}
	

	/*
	 * This method clicks on the 'DELETE Button'  in the User Group Action Tab
	 */
	public void userclickOnDeleteBtn() {
		TestUtils.waitForElementPresent(userclicksondeletebuttonofusergroup);
		TestUtils.click(userclicksondeletebuttonofusergroup);
	}
	
	/*
	 * This method clicks on the ' Yes,DELETE Button' for confirmed user  in the User Group Action Tab
	 */
	public void userclickOnDeleteBtnConfirm() {
		TestUtils.waitForElementPresent(userclicksonYesdeletebuttonofusergroup);
		TestUtils.click(userclicksonYesdeletebuttonofusergroup);
	}
	
	/*
	 * This method clicks on the ' OK' for confirmed user  in the User Group Action Tab Delete
	 */
	public void userclickOnOKBtn() {
		TestUtils.waitForElementPresent(userclicksonOKbuttnofusergroup);
		TestUtils.click(userclicksonOKbuttnofusergroup);
	}
	
	
	/*
	 * This method clicks on the ' Edit Button' of   the User Group  
	 */
	public void userclickOnEditBtn() {
		TestUtils.waitForElementPresent(userclicksonEditBtnofusergroup);
		TestUtils.click(userclicksonEditBtnofusergroup);
	}
	
	 /*
	  * This method enters User name in the Usergroups tab for search user group name
	  */
	public void usersEnterUsergroupnameforSearch(String usergroupname) throws InterruptedException {
		TestUtils.waitForElementPresent(usergrpsearch);
		TestUtils.type(usergrpsearch, usergroupname);
		
	}
	
	
	
	/*
	 * This method clicks on the ' Create UserGroups' button in Identity Management
	 */
	public void clickOnCreateUserGroup() {
		TestUtils.waitForElementPresent(createusergroup);
		TestUtils.click(createusergroup);
	}
	
	
	
	/*
	 * This method clicks on the 'select User Groups'  in Identity Management
	 */
	public void clickOnSelectUserGroups() {
		TestUtils.click(selectusergroup);
	}
	
	
	/*
	 * This method clicks on the 'Action tab ' of  User Groups in Identity Management
	 */
	public void clickOnActionUserGroupBtn() {
		TestUtils.waitForElementPresent(actiontabusergroup);
		TestUtils.click(actiontabusergroup);
	}
	
	/*	
	 * This method clicks on the CSV download button 'Users' tab in Identity Management	
	 */	
	public void clickOnCsvDownloadUserGroup() {	
		TestUtils.waitForElementPresent(csvdownloadusergroup);	
		TestUtils.click(csvdownloadusergroup);	
	}
	
	/*
	 * This method clicks on the 'UserGroups' tab in Identity Management
	 */
	public void clickOnUpdateUsergroup() {
		TestUtils.waitForElementPresent(updateusergroup);
		TestUtils.click(updateusergroup);
	}
	
	/*
	 * This method clicks on the ' Edit Button' of   the User Group  for update name of user group
	 */
	public void userclickOnEditBtnUpdate() {
		TestUtils.waitForElementPresent(userclicksonEditBtnofusergroupforUpdate);
		TestUtils.click(userclicksonEditBtnofusergroupforUpdate);
	}
	
	/*
	 * This method clear  the 'UserGroups'name  in Identity Management
	 */
	public void clickonclearUsergroupname() {
		TestUtils.waitForElementPresent(clearname);
		TestUtils.click(clearname);
	}
	
	
	
	 /*
	  * This method enters new user group  in the User Group tab while updating  user group name
	  */
	public void usersEnterUpdateUserGroupName(String updatedusergroupname) throws InterruptedException {
		TestUtils.waitForElementPresent(usersenterusergroupnameforupdategroupname);
		TestUtils.type(usersenterusergroupnameforupdategroupname, updatedusergroupname);
		
	}
	
	
	
	
	
}
