package com.instasafe.ztaa.ui.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.instasafe.ztaa.ui.core.TestBase;
import com.instasafe.ztaa.ui.pages.AuthProfilePage;
import com.instasafe.ztaa.ui.pages.IdentityProviderPage;
import com.instasafe.ztaa.ui.pages.UserGroupsPage;
import com.instasafe.ztaa.ui.pages.UsersPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConsoleIdentityMgmntSteps extends TestBase {

	AuthProfilePage authprofilePage = getPageInstance(AuthProfilePage.class);
	UsersPage usersPage = getPageInstance(UsersPage.class);
	UserGroupsPage usergroupsPage = getPageInstance(UserGroupsPage.class);
	IdentityProviderPage identityproviderPage=getPageInstance(IdentityProviderPage.class);

	/** test step methods for Users page in Identity Management **/

	@When("^User clicks on Users tab$")
	public void user_clicks_on_users_tab() throws Throwable {

		Thread.sleep(4000);
		WebElement element_idnmgmnt_users = driver.findElement(By.xpath(
				"/html/body/app-root/app-tenant-layout/div/div[2]/div/app-identity-layout/nav/div[2]/div/div/a[2]"));
		element_idnmgmnt_users.click();
		Thread.sleep(4000);
	}

	@When("^User clicks on Users$")
	public void user_clicks_on_users() throws Throwable {

		usersPage.clickOnUsersTab();
		Thread.sleep(2000);

	}

	@When("^User clicks on add Users plus sign$")
	public void user_clicks_on_add_users_plus_sign() throws Throwable {

		usersPage.clickOnAddUsersPlusSignBtn();
		Thread.sleep(2000);

	}

	@When("^User enters name and email or username$")
	public void user_enters_name_and_email_or_username() throws Throwable {

		usersPage.usersEnterName(getUsersName());
		Thread.sleep(2000);

		usersPage.usersEnterEmail(getUsersEmail());
		Thread.sleep(2000);

		usersPage.usersEnterUsername(getUsersUserName());
		Thread.sleep(2000);
	}

	@When("^User select country code and enters phone number$")
	public void user_select_country_code_and_enters_phone_number() throws Throwable {

		usersPage.clickOnCountryCodeArrowBtn();
		Thread.sleep(2000);

		usersPage.clickOnCountryCodeSelectIndia();
		Thread.sleep(2000);

		usersPage.usersEnterPhoneNumber(getUsersPhone());
		Thread.sleep(2000);
	}

	@Then("^User clicks on add user button of users$")
	public void user_clicks_on_add_user_button_of_users() throws Throwable {

		// for add user
		// driver.findElement(By.xpath("(//*[text()='Add User'])[1]")).click();
		usersPage.clickOnUsersAddUser();
		Thread.sleep(2000);
		// driver.close();
		// driver.quit();

	}

	@When("^User clicks on admin User toggle$")
	public void user_clicks_on_admin_user_toggle() throws Throwable {
		usersPage.clickOnAdminuserToggle();
		// driver.findElement(By.xpath("(//div[@class='mat-slide-toggle-thumb'])[3]")).click();
		Thread.sleep(3000);
	}

	@When("^User clicks on read only toggle$")
	public void user_clicks_on_read_only_toggle() throws Throwable {
		usersPage.clickOnReadonlyuserToggle();
		Thread.sleep(3000);
	}

	@When("^User enters name and email or admin username$")
	public void user_enters_name_and_email_or_admin_username() throws Throwable {

		usersPage.usersEnterName(getAdminUserName());
		Thread.sleep(2000);
		usersPage.usersEnterEmail(getAdminUserEmail());
		Thread.sleep(2000);

		usersPage.usersEnterUsername(getAdminUsersUserName());
		Thread.sleep(2000);
	}

	// Users,User name search
	@Then("^User search user name$")
	public void user_search_user_name() throws Throwable {
		// for enter search user name
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("automation");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.RETURN);
		Thread.sleep(3000);

	}
	
	
	@Then("^User search admin user name$")
    public void user_search_admin_user_name() throws Throwable {
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("poohfui");
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.RETURN);
//		Thread.sleep(3000);
		usersPage.searchAdminusername(getAdminUsernameforsearch());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);//for admin uname seach and enter
		Thread.sleep(2000);
    }

	  @Then("^User clicks on checkbox of Admin users in users Tab$")
	    public void user_clicks_on_checkbox_of_admin_users_in_users_tab() throws Throwable {
	       usersPage.clickOncheckboxofadminuser();
	       Thread.sleep(2000);
	    }

	@And("^User select user name and clicks on Action Tab$")
	public void user_select_user_name_and_clicks_on_action_tab() throws Throwable {
		driver.findElement(By.xpath("//p[text()='automation ']")).click();

		Thread.sleep(3000);

		// fro actions
		driver.findElement(By.xpath("(//div[@class='mat-tab-label-content'])[4]")).click();

		Thread.sleep(2000);

	}

	@And("^User clicks on Disable toggle$")
	public void user_clicks_on_disable_toggle() throws Throwable {
		// for enable or disable
		driver.findElement(By.xpath("(//div[@class='mat-slide-toggle-thumb'])[3]")).click();
		Thread.sleep(2000);
	}

	@Then("^User enable edit for delete users$")
	public void user_enable_edit_for_delete_users() throws Throwable {
		// for edit
		// driver.findElement(By.xpath("//div[text()=' Edit ']")).click();
		// driver.findElement(By.id("edit-block-button")).click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("(//div[@class='mat-slide-toggle-thumb'])[3]")).click();
		usersPage.clickOneditbtn();
		Thread.sleep(2000);

	}

	@And("^User clicks on Delete button of users and confirm to delete user$")
	public void user_clicks_on_delete_button_of_users_and_confirm_to_delete_user() throws Throwable {
		// for delete buttonn then confirm

		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[text()='Yes, delete']")).click();
		Thread.sleep(2000);

	}

	@Then("^User clicks on OK and user is deleted$")
	public void user_clicks_on_ok_and_user_is_deleted() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(2000);
	}

	@Then("^User search user name for device block$")
	public void user_search_user_name_for_device_block() throws Throwable {
		// for enter search user name
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("cvb");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.RETURN);
		Thread.sleep(3000);
	}

	@Then("^User clicks on device toggle for block or unblock$")
	public void user_clicks_on_device_toggle_for_block_or_unblock() throws Throwable {
		// for block
		usersPage.clickOnDeviceBlockToggle();
		Thread.sleep(2000);
	}

	@And("^User select user name and clicks on Devices$")
	public void user_select_user_name_and_clicks_on_devices() throws Throwable {
		// driver.findElement(By.xpath("//span[text()='3']")).click();
		usersPage.clickOnselctUserofDevicename();
		Thread.sleep(3000);
		// for Devices
		usersPage.clickOnDevicesunderUsers();
		// driver.findElement(By.xpath("(//div[@class='mat-tab-label-content'])[2]")).click();
		Thread.sleep(3000);

	}

	@Then("^User clicks on csv download$")
	public void user_clicks_on_csv_download() throws Throwable {
		usersPage.clickOnCsvDownloadUser();
		Thread.sleep(3000);
	}

	@Then("^User clicks on AD sync button$")
	public void user_clicks_on_ad_sync_button() throws Throwable {
		usersPage.clickOnAdsysncButton();
		Thread.sleep(3000);
	}

//Users CSV
	@When("^User clicks on Download CSV button of users$")
	public void user_clicks_on_download_csv_button_of_users() throws Throwable {
		// CSV download Users
		driver.findElement(By.xpath("//i[@class='fa fa-download']")).click();
		Thread.sleep(2000);
	}

	@Then("^User click on checkbox of Users$")
	public void user_click_on_checkbox_of_users() throws Throwable {
		// driver.findElement(By.xpath("(//span[@class='mat-checkbox-inner-container
		// mat-checkbox-inner-container-no-side-margin'])[2]")).click();
		usersPage.clickOncheckboxofuser();
		Thread.sleep(2000);
	}

	@Then("^User click on vertical arrow$")
	public void user_click_on_vertical_arrow() throws Throwable {
		// driver.findElement(By.xpath("(//mat-icon[text()='more_vert'])")).click();
		usersPage.clickOnthreeverticaldot();
		Thread.sleep(2000);
	}

	@Then("^User click on disable button$")
	public void user_click_on_disable_button() throws Throwable {
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//button[text()='Disable'])[1]")).click();
		usersPage.clickOndisableUserExternally();
		Thread.sleep(3000);
		//(//button[@class='mat-focus-indicator mat-menu-item ng-tns-c36-48'])[3]
	}

	@Then("^User click on yes disable them button$")
	public void user_click_on_yes_disable_to_button() throws Throwable {
		// driver.findElement(By.xpath("(//button[text()='Yes, disable
		// them!'])")).click();
		usersPage.clickOnDisableUserConfirmExternally();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//button[text()='OK'])")).click();
		Thread.sleep(2000);

	}

	@Then("^User click on enable button$")
	public void user_click_on_enable_button() throws Throwable {
		// driver.findElement(By.xpath("(//button[text()='Enable'])")).click();
		usersPage.clickOnEnableUserExternally();
		Thread.sleep(2000);
	}

	@Then("^User click on yes enable them button$")
	public void user_click_on_yes_enable_them_button() throws Throwable {
		// driver.findElement(By.xpath("(//button[text()='Yes, enable
		// them!'])")).click();
		usersPage.clickOnEnableUserConfirmExternally();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		Thread.sleep(2000);
	}

	
	
	 @Then("^User click on delete button of selected admin user$")
	    public void user_click_on_delete_button_of_selected_admin_user() throws Throwable {
		
		 usersPage.clickOnDeleteUserExternally();
		 Thread.sleep(2000);   
		 
	 }

	
	 @Then("^User click on yes disable them button of users$")
	    public void user_click_on_yes_disable_them_button_of_users() throws Throwable {
		 usersPage.clickOnDeleteUserConfirmExternally();
		 Thread.sleep(2000);   
		 driver.findElement(By.xpath("//button[text()='OK']")).click();
			Thread.sleep(2000);
	    }
	
	// Users

	@When("^User clicks on Created Time option of users$")
	public void user_clicks_on_created_time_option_of_users() throws Throwable {
		driver.findElement(By.xpath("(//div[@class='mat-select-arrow'])[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span[text()='Created Time'])[1]")).click();
		Thread.sleep(4000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(4000);

		js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
		Thread.sleep(4000);

		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
		Thread.sleep(4000);
	}

	@When("^User clicks on Name Option of users$")
	public void user_clicks_on_name_option_of_users() throws Throwable {
		// for toggle and Name of users
		driver.findElement(By.xpath("(//div[@class='mat-select-arrow'])[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span[text()='Name'])[1]")).click();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(4000);

		js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
		Thread.sleep(4000);

		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
		Thread.sleep(4000);
	}

	@When("^User clicks on Active state of users$")
	public void user_clicks_on_active_state_of_users() throws Throwable {
//for Active state

		driver.findElement(By.xpath("(//div[@class='mat-select-arrow'])[1]")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//span[text()='Active State'])[1]")).click();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(4000);

		js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
		Thread.sleep(4000);

		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
		Thread.sleep(4000);
	}

	@When("^User clicks on Show 10 of Users$")
	public void user_clicks_on_show_10_of_users() throws Throwable {
		// for toggle icon
		// driver.findElement(By.xpath("(//div[@class='mat-select-arrow'])[2]")).click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-layout[1]/app-users[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]"))
				.click();
		Thread.sleep(2000);
		// for show 10
		// driver.findElement(By.xpath("(//span[text()='Show 10'])[2]")).click();
		// for show 10
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]"))
				.click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(4000);

		js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
		Thread.sleep(4000);
	}

	@When("^User clicks on Show 20 of Users$")
	public void user_clicks_on_show_20_of_users() throws Throwable {
		// for toggle icon
		// driver.findElement(By.xpath("(//div[@class='mat-select-arrow'])[2]")).click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-layout[1]/app-users[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]"))
				.click();
		Thread.sleep(2000);
		// for Show 20
		// driver.findElement(By.xpath("(//span[text()='Show 20'])[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Show 20')]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(4000);

		js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
		Thread.sleep(4000);
	}

	@When("^User clicks on Show 50 of Users$")
	public void user_clicks_on_show_50_of_users() throws Throwable {
		// for toggle
		// driver.findElement(By.xpath("(//div[@class='mat-select-arrow'])[2]")).click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-layout[1]/app-users[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]"))
				.click();
		Thread.sleep(2000);

		// driver.findElement(By.xpath("(//span[text()='Show 50'])[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Show 50')]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(4000);

		js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
		Thread.sleep(2000);

	}

	@When("^User clicks on Show 100 of Users$")
	public void user_clicks_on_show_100_of_users() throws Throwable {
		// for toggle
		// driver.findElement(By.xpath("(//div[@class='mat-select-arrow'])[2]")).click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-layout[1]/app-users[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]"))
				.click();
		Thread.sleep(2000);

		// driver.findElement(By.xpath("(//span[text()='Show 100'])[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Show 100')]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(2000);

		js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(2000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
		Thread.sleep(2000);
	}

	@When("^User Searches for User$")
	public void user_searches_for_user() throws Throwable {
		Thread.sleep(4000);

		WebElement element_idnmgmnt_usr_search = driver.findElement(By.xpath(
				"/html/body/app-root/app-tenant-layout/div/div[2]/div/app-identity-layout/app-users/mat-card/mat-card-content/section/div[1]/div[1]/div/input"));

		element_idnmgmnt_usr_search.sendKeys("autotest", Keys.RETURN);
		Thread.sleep(2000);

		// WebElement element_idnmgmnt_usr_srt =
		// driver.findElement(By.xpath("//*[@id=\"header-filter-template\"]/div[1]/div[4]/div/div/i"));
		// element_idnmgmnt_usr_srt.click();

		Thread.sleep(2000);
		// WebDriverWait w = new WebDriverWait(driver, 5);
		// w.until(ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/app-root/app-tenant-layout/div/div[2]/div/app-identity-layout/app-users/mat-card/mat-card-content/mat-accordion/mat-expansion-panel/mat-expansion-panel-header")));
	}

	@Then("^User detail should be retrieved$")
	public void user_detail_should_be_retrieved() throws Throwable {
		System.out.println("User detail should be retrieved");
	}

	@Then("^User clicks Edit from toggle$")
	public void user_clicks_edit_from_toggle() throws Throwable {

		WebElement element_usr_toggle_edit = driver.findElement(By.xpath(
				"/html/body/app-root/app-tenant-layout/div/div[2]/div/app-identity-layout/app-users/mat-card/mat-card-content/section/div[1]/div[3]/div/mat-button-toggle-group/mat-button-toggle[2]/button/div"));
		element_usr_toggle_edit.click();
	}

	@Then("^User selects profile from search results$")
	public void user_selects_profile_from_search_results() throws Throwable {
		WebElement element_select_usr = driver.findElement(By.xpath(
				"/html/body/app-root/app-tenant-layout/div/div[2]/div/app-identity-layout/app-users/mat-card/mat-card-content/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span[1]/mat-panel-title/div[2]/p[2]"));
		element_select_usr.click();

	}

	@Then("^User clicks Actions tab$")
	public void user_clicks_actions_tab() throws Throwable {
		Thread.sleep(2000);
		WebElement element_select_usr_action = driver.findElement(By.xpath(
				"/html/body/app-root/app-tenant-layout/div/div[2]/div/app-identity-layout/app-users/mat-card/mat-card-content/mat-accordion/mat-expansion-panel/div/div/mat-tab-group/mat-tab-header/div[2]/div/div/div[4]"));
		element_select_usr_action.click();
	}

	@Then("^User clicks Delete icon$")
	public void user_clicks_delete_icon() throws Throwable {
		Thread.sleep(2000);
//    	WebElement element_select_usr_del = driver.findElement(By.xpath("/html/body/app-root/app-tenant-layout/div/div[2]/div/app-identity-layout/app-users/mat-card/mat-card-content/mat-accordion/mat-expansion-panel/div/div/mat-tab-group/div/mat-tab-body[4]/div/div[2]/mat-grid-list/div/mat-grid-tile[2]/figure/mat-card/div[2]/button/span/mat-icon"));
		WebElement element_select_usr_del = driver.findElement(By.xpath(
				"/html/body/app-root/app-tenant-layout/div/div[2]/div/app-identity-layout/app-users/mat-card/mat-card-content/mat-accordion/mat-expansion-panel/div/div/mat-tab-group/div/mat-tab-body[4]/div/div/mat-card/div[2]/button/span/mat-icon"));
		element_select_usr_del.click();
	}

	@Then("^User confirm to delete profile$")
	public void user_confirm_to_delete_profile() throws Throwable {
		Thread.sleep(4000);
		WebElement element_confirm_usr_del = driver.findElement(By.xpath("//*[text()='Yes, delete']"));
		element_confirm_usr_del.click();
	}

	@Then("^User profile is deleted$")
	public void user_profile_is_deleted() throws Throwable {
		Thread.sleep(4000);
		WebElement element_usr_deleted = driver.findElement(By.xpath("//*[text()='OK']"));
		element_usr_deleted.click();
	}

	// test step methods for Identity Management User Groups
	// created by @pooja

	@Then("^User clicks on User Groups tab$")
	public void user_clicks_on_user_groups_tab() throws Throwable {

		usergroupsPage.clickOnUsersTab();
		Thread.sleep(2000);
	}

	@Then("^User clicks on csv download user group$")
	public void user_clicks_on_csv_download_user_group() throws Throwable {
		usergroupsPage.clickOnCsvDownloadUserGroup();
		Thread.sleep(3000);
	}

	@Then("^User clicks on Add icon in User Groups$")
	public void user_clicks_on_add_icon_in_user_groups() throws Throwable {

		usergroupsPage.clickOnAddUsersPlusSignBtn();
		Thread.sleep(2000);
	}

	@Then("^User enter User Group name$")
	public void user_enter_user_group_name() throws Throwable {

		usergroupsPage.usersEnterUsergroupname(getUserGroupsName());
		Thread.sleep(2000);
	}

	@Then("^User enter User Group name and click on enters$")
	public void user_enter_user_group_name_and_click_on_enters() throws Throwable {
		// for enter usergroup name and create
		driver.findElement(By.xpath("//input[@data-placeholder='Enter Name']")).sendKeys("QARTRY");
		driver.findElement(By.xpath("//input[@data-placeholder='Enter Name']")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);
	}

	@Then("^User clicks on Next after entering User Group name$")
	public void user_clicks_on_next_after_entering_user_group_name() throws Throwable {
		// driver.findElement(By.xpath("//span[text()='Next']")).click();
		usergroupsPage.userclickOnNextBtnug();
		Thread.sleep(2000);
	}

	@Then("^User clicks on Add User button to add user to User Group$")
	public void user_clicks_on_add_user_button_to_add_user_to_user_group() throws Throwable {
		driver.findElement(By.xpath("//span[text()='Add User']")).click();
		// usergroupsPage.clickOnUsersAddUserGroups();
		Thread.sleep(2000);
	}

	@Then("^User enters user name in Add member field and select user$")
	public void user_enters_user_name_in_add_member_field_and_select_user() throws Throwable {

		// driver.findElement(By.id("userInputData")).sendKeys("cvb");
		usergroupsPage.usersEnterUsergroupnameforSearch(getUserGroupsSearch());

		Thread.sleep(2000);

		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' cvb ']")).click();

		Thread.sleep(2000);
	}

	@Then("^User searches user to be added to User group and clicks on Add$")
	public void user_searches_user_to_be_added_to_user_group_and_clicks_on_add() throws Throwable {
		driver.findElement(By.xpath("(//input[contains (@placeholder, 'Search')])[2]")).sendKeys("pooja", Keys.ENTER);
		Thread.sleep(2000);

		// for check box
		/*
		 * driver.findElement(By.xpath(
		 * "(//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[14]"
		 * )) .click();
		 */
		driver.findElement(By.xpath(
				"(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[14]"))
				.click();
		Thread.sleep(2000);

		// for add user
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-filter-popup/mat-dialog-actions/button[1]/span[1]")).click();
		Thread.sleep(2000);
	}

	@Then("^User clicks on Create group$")
	public void user_clicks_on_create_group() throws Throwable {

		usergroupsPage.clickOnCreateUserGroup();
		Thread.sleep(2000);
	}

	@Then("^User searches for User Group$")
	public void user_searches_for_user_group() throws Throwable {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("QAGroup");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.RETURN);
		Thread.sleep(2000);

	}

	@Then("^User selects User Group and clicks on Action tab$")
	public void user_selects_user_group_and_clicks_on_action_tab() throws Throwable {
		// for cick on green toggle (select user)
		usergroupsPage.clickOnSelectUserGroups();
		Thread.sleep(2000);

		// for action
		usergroupsPage.clickOnActionUserGroupBtn();
		Thread.sleep(2000);

		// driver.findElement(By.id("mat-tab-label-1-3")).click();

	}

	@Then("^User clicks on Edit button to update User Group$")
	public void user_clicks_on_edit_button_to_update_user_group() throws Throwable {

		// span[text()=' Edit ']
		// This is for Modified UI Edit Button with name
		// driver.findElement(By.xpath("//div[text()=' Edit ']")).click();
		// driver.findElement(By.xpath("(//div[@class='mat-slide-toggle-thumb'])[3]")).click();
		usergroupsPage.userclickOnEditBtn();
		Thread.sleep(2000);
	}

	@Then("^User clicks on delete icon to delete User Group$")
	public void user_clicks_on_delete_icon_to_delete_user_group() throws Throwable {

		usergroupsPage.userclickOnDeleteBtn();
		Thread.sleep(2000);
	}

	@Then("^User click on delete button of user group$")
	public void user_click_on_delete_button_of_user_group() throws Throwable {
		// driver.findElement(By.xpath("//button[text()='Delete']")).click();
		usergroupsPage.clickOndelecteusergroupExternally();
		Thread.sleep(2000);
	}

	@Then("^User click on yes delete them button$")
	public void user_click_on_yes_delete_them_button() throws Throwable {
		// driver.findElement(By.xpath("//button[text()='Yes, delete them!']")).click();
		usergroupsPage.clickOnconfirmdelecteusergroupExternally();
		Thread.sleep(2000);
		usergroupsPage.userclickOnOKBtn();
		Thread.sleep(2000);
	}

	@Then("^User confirms deleting of the User Group$")
	public void user_confirms_deleting_of_the_user_group() throws Throwable {

		usergroupsPage.userclickOnDeleteBtnConfirm();
		Thread.sleep(2000);

		usergroupsPage.userclickOnOKBtn();
		Thread.sleep(2000);
	}

	@And("^User select user group name$")
	public void user_select_user_group_name() throws Throwable {
		// driver.findElement(By.xpath("(//img[@class='insta-live'])[1]")).click();
		usergroupsPage.clickOnSelectUserGroups();
		Thread.sleep(2000);
	}

	@Then("^User enters updated user group name$")
	public void user_enters_updated_user_group_name() throws Throwable {

		// driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).clear();
		usergroupsPage.clickonclearUsergroupname();
		Thread.sleep(2000);
		usergroupsPage.usersEnterUpdateUserGroupName(getuserUpdatedGroupsName());
		Thread.sleep(2000);
	}

	@And("^User clicks on Update button of user group$")
	public void user_clicks_on_update_button_of_user_group() throws Throwable {
		// driver.findElement(By.xpath("//span[text()='Update Group']")).click();
		usergroupsPage.clickOnUpdateUsergroup();
		Thread.sleep(2000);

	}

	@Then("^User enable edit of user group name$")
	public void user_enable_edit_of_user_group_name() throws Throwable {
		// driver.findElement(By.xpath("(//div[@class='mat-slide-toggle-thumb'])[3]")).click();
		usergroupsPage.userclickOnEditBtnUpdate();
		Thread.sleep(2000);

	}

	@Then("^User clicks on sort by Created time of User group$")
	public void user_clicks_on_sort_by_created_time_of_user_group() throws Throwable {

		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-layout[1]/app-user-group[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[2]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Created Time']")).click();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		//
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(3000);
		//
		js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(3000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
		Thread.sleep(3000);
	}

	@Then("^User clicks on sort by Name of User group$")
	public void user_clicks_on_sort_by_name_of_user_group() throws Throwable {
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-layout[1]/app-user-group[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[2]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Name'])[1]")).click();
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

	@Then("^User clicks on sort by Active state of User group$")
	public void user_clicks_on_sort_by_active_state_of_user_group() throws Throwable {
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-layout[1]/app-user-group[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[2]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Active State'])[1]")).click();
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

	@Then("^User clicks on show 10 of User Group$")
	public void user_clicks_on_show_10_of_user_group() throws Throwable {
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-layout[1]/app-user-group[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Show 10'])[2]")).click();
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

	@Then("^User clicks on show 20 of User Group$")
	public void user_clicks_on_show_20_of_user_group() throws Throwable {
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-layout[1]/app-user-group[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Show 20'])[1]")).click();
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

	@Then("^User clicks on show 50 of User Group$")
	public void user_clicks_on_show_50_of_user_group() throws Throwable {
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-layout[1]/app-user-group[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Show 50'])[1]")).click();
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

	@Then("^User clicks on show 100 of User Group$")
	public void user_clicks_on_show_100_of_user_group() throws Throwable {
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-layout[1]/app-user-group[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Show 100'])[1]")).click();
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

	// **** User Groups End Here *****//

	// **** Auth Profile Begins Here *****//

	@When("^User clicks on Auth Profile tab$")
	public void user_clicks_on_auth_profile_tab() throws Throwable {

		Thread.sleep(4000);
		authprofilePage.clickOnAuthProfileButton();
		Thread.sleep(4000);
	}

	@Then("^User clicks on Add icon under Exclusions in User tab$")
	public void user_clicks_on_add_icon_under_exclusions_in_user_tab() throws Throwable {

		authprofilePage.clickOnAuthProfileAddIconButton();
		Thread.sleep(2000);

	}

	@Then("^User clicks on Add User button in Create section$")
	public void user_clicks_on_add_user_button_in_create_section() throws Throwable {
		// driver.findElement(By.xpath("//span[text()='Add User']")).click();
		authprofilePage.clickOnAuthProfileAddUser();
		Thread.sleep(2000);
	}

	@Then("^User searches with user name and selects it$")
	public void user_searches_with_user_name_and_selects_it() throws Throwable {
		WebElement sc = driver.findElement(By.xpath("(//input[contains (@placeholder, 'Search')])[2]"));
		sc.sendKeys("cvb", Keys.ENTER);

		Thread.sleep(3000);
		/*
		 * driver.findElement(By
		 * .xpath("(//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[1]"
		 * )) .click();
		 */
		authprofilePage.clickOnAuthProfileAddSelectedUserChkBox();
		Thread.sleep(2000);
	}

	@Then("^User clicks Add User button in the search window$")
	public void user_clicks_add_user_button_in_the_search_window() throws Throwable {
		// driver.findElement(By.xpath("(//span[text()='user'])[2]")).click();
		authprofilePage.clickOnAuthProfileAddSelectedUser();
		Thread.sleep(2000);
		// For next
		// driver.findElement(By.xpath("(//span[text()='Next'])[1]")).click();
		authprofilePage.clickOnAuthProfileSelectedUserNext();
		Thread.sleep(2000);
	}

	@Then("^User selects Password as Primary Authentication and clicks on next$")
	public void user_selects_password_as_primary_authentication_and_clicks_on_next() throws Throwable {
		// driver.findElement(By.xpath("(//span[text()='Next'])[2]")).click();
		authprofilePage.clickOnAuthProfilePriAuthNext();
	}

	@Then("^User clicks next on Secondary Authentication$")
	public void user_clicks_next_on_secondary_authentication() throws Throwable {
		// modified due to UI changes
		// driver.findElement(By.xpath("(//div[@class='mat-checkbox-inner-container'])[1]")).click();
		authprofilePage.clickOnAuthProfileSecondaryAuthNext();
		Thread.sleep(3000);
	}

	@Then("^User clicks next on Configuration$")
	public void user_clicks_next_on_configuration() throws Throwable {
		// click on next

		authprofilePage.clickOnAuthProfileConfigureSessionAuthNext();
		Thread.sleep(2000);
	}

	@Then("^User clicks on Submit$")
	public void user_clicks_on_submit() throws Throwable {

		authprofilePage.clickOnAuthProfilesubmit();
		Thread.sleep(3000);
	}

	@Then("^User search for Auth Profile user$")
	public void user_search_for_auth_profile_user() throws Throwable {
		driver.findElement(By.xpath("(//input[contains (@placeholder, 'Search')])[1]")).sendKeys("cvb123", Keys.ENTER);
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//div[text()=' cvb '])[1]")).click();
		Thread.sleep(2000);
	}

	@Then("^User clicks on arrow toggle and selects display name$")
	public void user_clicks_on_arrow_toggle_and_selects_display_name() throws Throwable {
		driver.findElement(By.xpath("(//div[@class='mat-select-arrow'])[1]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(4000);

		js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
		Thread.sleep(4000);
		// display name
		driver.findElement(By.xpath("(//span[text()='Display Name'])[2]")).click();
		Thread.sleep(4000);
	}

	@Then("^User clicks on arrow toggle and selects created time$")
	public void user_clicks_on_arrow_toggle_and_selects_created_time() throws Throwable {
		driver.findElement(By.xpath("(//div[@class='mat-select-arrow'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Created Time'])[1]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(4000);

		js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
		Thread.sleep(4000);
	}

	@Then("^User clicks on sorted in ascending order$")
	public void user_clicks_on_sorted_in_ascending_order() throws Throwable {
		// driver.findElement(By.xpath("(//i[@class='fa fa-long-arrow-alt-up
		// ng-star-inserted'])[1]")).click();
		usersPage.clickOnsortedInAscending();
		Thread.sleep(4000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(4000);

		js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
		Thread.sleep(4000);
	}

	@Then("^User clicks on decending order$")
	public void user_clicks_on_decending_order() throws Throwable {
		// driver.findElement(By.xpath("(//i[@class='fa fa-long-arrow-alt-down
		// ng-star-inserted'])[1]")).click();
		usersPage.clickOnsortedInDecending();
		Thread.sleep(4000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(4000);

		js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
		Thread.sleep(4000);
	}

	@Then("^User clicks on show 10$")
	public void user_clicks_on_show_10() throws Throwable {
		// for toggle icon
		// driver.findElement(By.xpath("(//div[@class='mat-select-arrow'])[2]")).click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-layout[1]/app-users[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]"))
				.click();
		Thread.sleep(2000);
		// for show 10
		// driver.findElement(By.xpath("(//span[text()='Show 10'])[2]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]"))
				.click();
		// driver.findElement(By.xpath("//span[contains(text(),'Show 10')]")).click();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(4000);

		js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
		Thread.sleep(4000);
	}

	@Then("^User clicks on show 20$")
	public void user_clicks_on_show_20() throws Throwable {
		// driver.findElement(By.xpath("(//div[@class='mat-select-arrow'])[2]")).click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-layout[1]/app-users[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]"))
				.click();
		Thread.sleep(2000);
		// driver.findElement(By.xpath("(//span[text()='Show 20'])[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Show 20')]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(4000);

		js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
		Thread.sleep(4000);
	}

	@Then("^User clicks on show 50$")
	public void user_clicks_on_show_50() throws Throwable {
		// driver.findElement(By.xpath("(//div[@class='mat-select-arrow'])[2]")).click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-layout[1]/app-users[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]"))
				.click();
		Thread.sleep(2000);

		// driver.findElement(By.xpath("(//span[text()='Show 50'])[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Show 50')]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(4000);

		js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
		Thread.sleep(4000);
	}

	@Then("^User clicks on show 100$")
	public void user_clicks_on_show_100() throws Throwable {
		// driver.findElement(By.xpath("(//div[@class='mat-select-arrow'])[2]")).click();
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-layout[1]/app-users[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]"))
				.click();
		Thread.sleep(2000);

		// driver.findElement(By.xpath("(//span[text()='Show 100'])[1]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Show 100')]")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(2000);

		js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
		Thread.sleep(4000);

	}

	@Then("^User clicks on sort by Created time$")
	public void user_clicks_on_sort_by_created_time() throws Throwable {
		usersPage.clickOnsortbyToggle();
		Thread.sleep(2000);
		usersPage.clickOnsortbyCreatedTime();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
	}

	@Then("^User clicks on sort by Name$")
	public void user_clicks_on_sort_by_name() throws Throwable {
		usersPage.clickOnsortbyToggle();
		Thread.sleep(2000);
		usersPage.clickOnsortbyName();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
	}

	@Then("^User clicks on sort by Active state$")
	public void user_clicks_on_sort_by_active_state() throws Throwable {
		usersPage.clickOnsortbyToggle();
		Thread.sleep(2000);
		usersPage.clickOnsortbyActivestate();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
	}

	@Then("^User clicks on Edit button to update Auth Profile$")
	public void user_clicks_on_edit_button_to_update_auth_profile() throws Throwable {
		// commented as the Edit toggle has been made a button
		// driver.findElement(By.xpath("/html/body/app-root/app-tenant-layout/div/div[2]/div/app-identity-layout/app-auth-profile/mat-card[2]/mat-card-content/mat-tab-group/div/mat-tab-body[1]/div/app-user-auth/section/div/div[6]/div/div[1]/mat-slide-toggle")).click();
		driver.findElement(By.xpath(
				"/html/body/app-root/app-tenant-layout/div/div[2]/div/app-identity-layout/app-auth-profile/mat-card[2]/mat-card-content/mat-tab-group/div/mat-tab-body[1]/div/app-user-auth/section/div/div[6]/div/mat-button-toggle-group/mat-button-toggle[2]/button/span"))
				.click();

		Thread.sleep(2000);
	}

	@Then("^User clicks on Auth Profile Actions tab$")
	public void user_clicks_on_auth_profile_actions_tab() throws Throwable {
		driver.findElement(By.xpath("(//div[@class='mat-tab-label-content'])[9]")).click();
		Thread.sleep(2000);
	}

	@Then("^User clicks on Delete icon in Auth Profile$")
	public void user_clicks_on_delete_icon_in_auth_profile() throws Throwable {
		Thread.sleep(2000);
		// driver.findElement(By.xpath("/html/body/app-root/app-tenant-layout/div/div[2]/div/app-identity-layout/app-auth-profile/mat-card[2]/mat-card-content/mat-tab-group/div/mat-tab-body[1]/div/app-user-auth/mat-accordion/mat-expansion-panel[1]/div/div/mat-tab-group/div/mat-tab-body[4]/div/div[2]/mat-grid-list/div/mat-grid-tile[2]/figure/mat-card/div[2]/button/span/mat-icon")).click();
		driver.findElement(By.xpath("//mat-icon[contains(text(),'delete_forever')]")).click();
		Thread.sleep(2000);
	}

	@Then("^User confirms to Delete Auth Profile$")
	public void user_confirms_to_delete_auth_profile() throws Throwable {
		driver.findElement(By.xpath("//button[text()='Yes, delete']")).click();
		Thread.sleep(2000);
	}

	@Then("^User is confirmed of Auth Profile deletion$")
	public void user_is_confirmed_of_auth_profile_deletion() throws Throwable {
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
	}

	@Then("^User clicks on Groups under Exclusion$")
	public void user_clicks_on_groups_under_exclusion() throws Throwable {
		driver.findElement(By.xpath("//div[text()='Groups']")).click();
		Thread.sleep(2000);

	}

	@Then("^User search for AD user in Auth Profile user$")
	public void user_search_for_ad_user_in_auth_profile_user() throws Throwable {

		WebElement sc = driver.findElement(By.xpath("(//input[contains (@placeholder, 'Search')])[2]"));
		sc.sendKeys("viscosity", Keys.ENTER);

		Thread.sleep(3000);
		/*
		 * driver.findElement(By
		 * .xpath("(//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[1]"
		 * )) .click();
		 */
		authprofilePage.clickOnAuthProfileAddSelectedUserChkBox();
		Thread.sleep(2000);

	}

	@Then("^User selects AD as Primary Authentication and clicks on Add AD$")
	public void user_selects_ad_as_primary_authentication_and_clicks_on_add_ad() throws Throwable {
		authprofilePage.clickOnSelectPrimaryADAuthentication();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()=' Add AD ']")).click();
		Thread.sleep(2000);

	}

	@Then("^User enters AD Server name$")
	public void user_enters_ad_server_name() throws Throwable {
		driver.findElement(By.xpath("//input[@data-placeholder='AD Server']")).sendKeys("192.168.10.211");
		Thread.sleep(2000);
	}

	@Then("^User enters AD Domain name$")
	public void user_enters_ad_domain_name() throws Throwable {
		driver.findElement(By.xpath("//input[@data-placeholder='AD Domain']")).sendKeys("instasafe.io");
		Thread.sleep(2000);
	}

	@Then("^User select Gateway and enable edit toggle of gateway$")
	public void user_select_gateway_and_enable_edit_toggle_of_gateway() throws Throwable {
		// enable gateway toggle
		driver.findElement(By.xpath("(//div[@class='mat-slide-toggle-thumb-container'])[3]")).click();
		Thread.sleep(2000);

		// driver.findElement(By.xpath("//mat-pseudo-checkbox[@class='mat-pseudo-checkbox
		// mat-option-pseudo-checkbox ng-star-inserted']")).click();
//				  Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-layout[1]/app-auth-profile[1]/mat-card[2]/mat-card-content[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/app-user-auth[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[1]/mat-card[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/mat-card[1]/div[2]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]"))
				.click();
		Thread.sleep(2000);
		// for checkbox
		driver.findElement(By.xpath(
				"(//mat-pseudo-checkbox[@class='mat-pseudo-checkbox mat-option-pseudo-checkbox ng-star-inserted'])"))
				.click();
		Thread.sleep(2000);

	}

	@Then("^User clicks next on Primary Authentication$")
	public void user_clicks_next_on_primary_authentication() throws Throwable {
		driver.findElement(By.xpath(
				"(//div[@class='cdk-overlay-backdrop cdk-overlay-transparent-backdrop cdk-overlay-backdrop-showing'])"))
				.click();
		Thread.sleep(2000);
		authprofilePage.clickOnAuthProfilePriAuthNext();
		Thread.sleep(2000);

	}

	@Then("^User search for Auth Profile AD user under Users$")
	public void user_search_for_auth_profile_ad_user_under_users() throws Throwable {
		driver.findElement(By.xpath("(//input[contains (@placeholder, 'Search')])[1]")).sendKeys("viscosity",
				Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()=' viscosity '])[1]")).click();
		Thread.sleep(2000);
	}

	@Then("^User clicks on Disable icon in Auth Profile$")
	public void user_clicks_on_disable_icon_in_auth_profile() throws Throwable {

		authprofilePage.clickOnAuthProfileUserDisableButton();
		Thread.sleep(2000);
	}

	@Then("^User search for Auth Profile user group$")
	public void user_search_for_auth_profile_user_group() throws Throwable {
		driver.findElement(By.xpath("(//input[contains (@placeholder, 'Search')])[1]")).sendKeys("poojagroup",
				Keys.ENTER);
		Thread.sleep(2000);
		// driver.findElement(By.xpath("(//div[text()=' poojagroup '])[1]")).click();
		// Thread.sleep(2000);
	}

	@Then("^User clicks on Add User button in Create section of user group$")
	public void user_clicks_on_add_user_button_in_create_section_of_user_group() throws Throwable {
		driver.findElement(By.xpath("//span[text()='Add Group']")).click();
		Thread.sleep(2000);
	}

	@Then("^User searches with user group name and selects it$")
	public void user_searches_with_user_group_name_and_selects_it() throws Throwable {
		WebElement sc = driver.findElement(By.xpath("(//input[contains (@placeholder, 'Search')])[2]"));
		sc.sendKeys("poojagroup", Keys.ENTER);

		Thread.sleep(3000);
		/*
		 * driver.findElement(By
		 * .xpath("(//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[1]"
		 * )) .click();
		 */
		authprofilePage.clickOnAuthProfileAddSelectedUserChkBox();
		Thread.sleep(2000);
	}

	@Then("^User clicks Add Group button in the search window$")
	public void user_clicks_add_group_button_in_the_search_window() throws Throwable {
//		    	driver.findElement(By.xpath("(//span[text()='user'])[2]")).click();

		driver.findElement(By.xpath("(//span[text()='Add '])[1]")).click();
		// authprofilePage.clickOnAuthProfileAddSelectedUser();
		Thread.sleep(2000);
		// For next
		// driver.findElement(By.xpath("(//span[text()='Next'])[1]")).click();
		authprofilePage.clickOnAuthProfileSelectedUserNext();
		Thread.sleep(2000);
	}

	@Then("^User clicks on show 10 of auth profile$")
	public void user_clicks_on_show_10_of_auth_profile() throws Throwable {
		authprofilePage.clickOnAuthShowlistToggle();
		Thread.sleep(2000);
		authprofilePage.clickOnshow10auth();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
	}

	@Then("^User clicks on show 20 of auth profile$")
	public void user_clicks_on_show_20_of_auth_profile() throws Throwable {
		authprofilePage.clickOnAuthShowlistToggle();
		Thread.sleep(2000);
		authprofilePage.clickOnshow20auth();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
	}

	@Then("^User clicks on show 50 of auth profile$")
	public void user_clicks_on_show_50_of_auth_profile() throws Throwable {
		authprofilePage.clickOnAuthShowlistToggle();
		Thread.sleep(2000);
		authprofilePage.clickOnshow50auth();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");

	}

	@Then("^User clicks on show 100 of auth profile$")
	public void user_clicks_on_show_100_of_auth_profile() throws Throwable {

		authprofilePage.clickOnAuthShowlistToggle();
		Thread.sleep(2000);
		authprofilePage.clickOnshow100auth();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
	}

	@Then("^User clicks on sort by Created name$")
	public void user_clicks_on_sort_by_created_name() throws Throwable {
		authprofilePage.clickOnAuthProfileSortingToggle();
		Thread.sleep(2000);
		authprofilePage.clickOnAuthProfileCreatedTime();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(4000);

		js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");

	}

	@Then("^User clicks on sort by Display name$")
	public void user_clicks_on_sort_by_display_name() throws Throwable {
		authprofilePage.clickOnAuthProfileSortingToggle();
		Thread.sleep(2000);
		authprofilePage.clickOnAuthProfileDispalyTime();
		Thread.sleep(2000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0, 500)");
		Thread.sleep(4000);

		js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0, -500)");
		Thread.sleep(4000);
		js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");
	}

	@When("^User selects value from Show list$")
	public void user_selects_value_from_show_list() throws Throwable {

		/*
		 * Select listbox = new Select(driver.findElement(By.xpath(
		 * "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-identity-layout/app-auth-profile/mat-card[2]/mat-card-content/mat-tab-group/div/mat-tab-body[1]/div/app-user-auth/section/div/div[7]/div/mat-form-field/div/div[1]/div/mat-select/div"
		 * ))); listbox.selectByVisibleText("Show 20"); // listbox.selectByIndex(1);
		 * Thread.sleep(4000);
		 */

		Thread.sleep(2000);
		WebElement element_idnmgmnt_authprofile_show = driver.findElement(By.xpath(
				"/html/body/app-root/app-tenant-layout/div/div[2]/div/app-identity-layout/app-auth-profile/mat-card[2]/mat-card-content/mat-tab-group/div/mat-tab-body[1]/div/app-user-auth/section/div/div[7]/div/mat-form-field/div/div[1]/div/mat-select/div"));
		element_idnmgmnt_authprofile_show.click();
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[2]/span")).click();
		// element_idnmgmnt_authprofile_show.sendKeys("Show 20");
		Thread.sleep(4000);
	}

	@When("^User clicks on Identity Provider$")
	public void user_clicks_on_identity_provider() throws Throwable {

		identityproviderPage.clickOnIdentityProviderTab();
		Thread.sleep(2000);

	}

	@When("^User click on add button of Identity Provider$")
	public void user_click_on_add_button_of_identity_provider() throws Throwable {
		identityproviderPage.clickOnAddbuttonofIdentityProvider();
		Thread.sleep(3000);
		
		

	}

	@When("^User enters IDP name and select Generic SAML SP$")
	public void user_enters_idp_name_and_select_generic_saml_sp() throws Throwable {
		// Give IDP name
	identityproviderPage.enterIDPName(getIDPName());
		Thread.sleep(2000);

	}

	@Then("^User clicks on Nextbutton$")
	public void user_clicks_on_nextbutton() throws Throwable {
		// For next
		identityproviderPage.clickOnNextbuttonofIdentityProvider();
		Thread.sleep(2000);
	}

	@Then("^User clicks on Generate Certificate$")
	public void user_clicks_on_generate_certificate() throws Throwable {
		// Gerenate certificate
		Thread.sleep(3000);
		identityproviderPage.clickOnGenerateCertificatebuttonofIdentityProvider();
		Thread.sleep(3000);
		
	}

	@Then("^User enters ACS URL which is configured in Reamaze SP$")
	public void user_enters_acs_url_which_is_configured_in_reamaze_sp() throws Throwable {
		// enter ACS URL
		identityproviderPage.enterACSURL(getASCurl());
		Thread.sleep(2000);
	}

	@And("^User enters SP Entity ID and IDP entity ID$")
	public void user_enters_sp_entity_id_and_idp_entity_id() throws Throwable {
		// FOR SP Entity id
		identityproviderPage.enterSPEntity(getSpEntityid());
		Thread.sleep(2000);
		// For entity ID
		identityproviderPage.enterIDPentityID(getIDPEntityName());
		Thread.sleep(3000);
	}

	
	
	@Then("^User clicks on Attribute pluse sign$")
    public void user_clicks_on_attribute_pluse_sign() throws Throwable {
        identityproviderPage.clickOnAttributeIdentityProviderTab();
        Thread.sleep(3000);
    }

	
	  @And("^User clicks on Attribure Formate and select unspecified$")
	    public void user_clicks_on_attribure_formate_and_select_unspecified() throws Throwable {
		  Thread.sleep(3000);
	      identityproviderPage.clickOnAttributeformateIdentityProviderTab();
		  Thread.sleep(2000);
	      identityproviderPage.clickOnUnspecifiedIdentityProvider();
		  Thread.sleep(2000);
	  }

	
	
	
	 @Then("^User clicks on Select Type Email and enter attribute name$")
	    public void user_clicks_on_select_type_email_and_enter_attribute_name() throws Throwable {
		 identityproviderPage.clickOnselectDropDownToggleIdentityProvider();
		 Thread.sleep(2000);
		 identityproviderPage.clickOnselectTypeattributeEmailbuttonofIdentityProvider();
		 	       Thread.sleep(2000);
	       identityproviderPage.enterAttributeNameIDP(getAttributeName());
	       Thread.sleep(2000);
	    }
	
	
	@Then("^User enables allow access from Browser$")
	public void user_enables_allow_access_from_browser() throws Throwable {
		// Allow access from browser
		identityproviderPage.clickOnAccessfromBrowserIdentityProviderTab();
		Thread.sleep(3000);
	}

	@Then("^User enables allow access from Desktop$")
	public void user_enables_allow_access_from_desktop() throws Throwable {
		// Allow access from DESKtop
		identityproviderPage.clickOnAccessfromDekstopIdentityProviderTab();
		Thread.sleep(3000);
	}

	@Then("^User enables allow access from Mobile$")
	public void user_enables_allow_access_from_mobile() throws Throwable {
		// Allow access from mobile
		identityproviderPage.clickOnAccessfromMobileIdentityProviderTab();
		Thread.sleep(3000);
	}

	@When("^User clicks on next and submit then Identity provider should created successfully$")
	public void user_clicks_on_next_and_submit_then_identity_provider_should_created_successfully() throws Throwable {
		// For Next button
		identityproviderPage.clickOnNextLastbuttonofIdentityProvider();
		Thread.sleep(2000);
		// select saml to local and click on next for submit
		identityproviderPage.clickOnSubmitbuttonofIdentityProvider();
		Thread.sleep(3000);
	}


	
	@Then("^User enters IDP name for search$")
    public void user_enters_idp_name_for_search() throws Throwable {
		identityproviderPage.SearchAndenterIDP(getSearchIDPName());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);//for IDP seach and enter
		Thread.sleep(2000);
    }

	
	 @Then("^User enters Invalid IDP name for search$")
	    public void user_enters_invalid_idp_name_for_search() throws Throwable {
	        identityproviderPage.SearchAndenterInvalidAppIDP(getSearchInvalidIDP());
	        Thread.sleep(2000);
			driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);//for IDP seach and enter
			Thread.sleep(2000);  
		//	searchinvalidappnameunderIDP
	 }
	
	 
	 @Then("^User enters invalid IDP name for search with two characters$")
	    public void user_enters_invalid_idp_name_for_search_with_two_characters() throws Throwable {
		 identityproviderPage.SearchAndenterMinimmtwoCharInvalidAppIDP(getSearchMinicharIDP());
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys(Keys.ENTER);//for IDP seach and enter
		 Thread.sleep(2000);
	    }


	@Then("^User Enable Edit$")
	public void user_enable_edit() throws Throwable {
		// for edit of IDP

		identityproviderPage.clickOnEditbuttonofIdentityProvider();
		Thread.sleep(3000);
	}

	@Then("^User clicks on Reamaze application$")
	public void user_clicks_on_reamaze_application() throws Throwable {
		// for select searched IDP app 
		identityproviderPage.clickOnSearchedIDPappinIdentityProviderTab();
		Thread.sleep(3000);
	}

	
	@Then("^User clicks on selected searched IDP Application$")
    public void user_clicks_on_selected_searched_idp_application() throws Throwable {
		identityproviderPage.clickOnSearchedIDPappinIdentityProviderTab();
		Thread.sleep(3000);
    }

	
	
	@Then("^User Go to Action$")
	public void user_go_to_action() throws Throwable {
		// For Action
		identityproviderPage.clickOnActionsIdentityProviderTab();
		Thread.sleep(3000);
	}

	@And("^User clicks on deleteIDP$")
	public void user_clicks_on_deleteidp() throws Throwable {
		// for delete
	
		identityproviderPage.clickOnDeleteButtonIdentityProviderTab();
		Thread.sleep(3000);
	}

	@Then("^User confirm  to delete while clicking Yes,Delete option$")
	public void user_confirm_to_delete_while_clicking_yesdelete_option() throws Throwable {
		// yes delete
		identityproviderPage.clickOnConfirmDeleteButtonIdentityProviderTab();
		Thread.sleep(3000);
		// Click on OK
		identityproviderPage.clickOnDeleteOkButtonIdentityProviderTab();
		Thread.sleep(3000);
		// driver.close();
	}

	
	@Then("^User clicks on sort by toggle and select created time of IDP$")
    public void user_clicks_on_sort_by_toggle_and_select_created_time_of_idp() throws Throwable {
        
		identityproviderPage.clickOnsortbyDropdownToggleIdentityProviderTab();
		Thread.sleep(2000);
		identityproviderPage.clickOnsortBycreatedTimeIdentityProvider();
		Thread.sleep(2000);
    }

    @Then("^User clicks on sort by toggle and select Name of IDP$")
    public void user_clicks_on_sort_by_toggle_and_select_name_of_idp() throws Throwable {
    	identityproviderPage.clickOnsortbyDropdownToggleIdentityProviderTab();
		Thread.sleep(2000);
		identityproviderPage.clickOnsortByNameIdentityProvider();
		Thread.sleep(2000);
    }
    @Then("^User clicks on sorted in asending order arrow of IDP$")
    public void user_clicks_on_sorted_in_asending_order_arrow_of_idp() throws Throwable {
    	 identityproviderPage.clickOnsortedInAscendingOrderIdentityProviderTab();
         Thread.sleep(2000); 
    }

    @Then("^User clicks on sorted in decending order arrow of IDP$")
    public void user_clicks_on_sorted_in_decending_order_arrow_of_idp() throws Throwable {
       identityproviderPage.clickOnsortedInDescendingOrderIdentityProviderTab();
       Thread.sleep(2000); 
    }
	
	
	
	
	
	
	
	@Then("^User clicks on Download IDP MetaData$")
	public void user_clicks_on_download_idp_metadata() throws Throwable {
		driver.findElement(By.xpath("//div[ text()=' Download IDP Metadata ']")).click();
		Thread.sleep(3000);
	}

	@Then("^User clicks on BackEnd SAML and  Download SP MetaData$")
	public void user_clicks_on_backend_saml_and_download_sp_metadata() throws Throwable {
		// For BackEnd SAML
		identityproviderPage.clickOnBackEndSAMLofIdentityProviderTab();
		Thread.sleep(3000);
		// Download SP metadata
		identityproviderPage.clickOnDownloadSPMetadataofIdentityProviderTab();
		Thread.sleep(3000);
	}

	@Then("^User clicks on Application tab$")
	public void user_clicks_on_application_tab() throws Throwable {
		// For Application of IDP
		
		identityproviderPage.clickOnApplicationTabIdentityProvider();
		Thread.sleep(3000);
	}

	@Then("^User clicks on Add Application Button$")
	public void user_clicks_on_add_application_button() throws Throwable {

		// for add app
		identityproviderPage.clickOnAddAppIdentityProviderTab();
		Thread.sleep(3000);

	}

	@When("^User enter application name in search box and add application successfully$")
	public void user_enter_application_name_in_search_box_and_add_application_successfully() throws Throwable {
		// for search
	
         identityproviderPage.SearchAppnameInIDP(getSearchAppnameunderIDP());
         driver.findElement(By.xpath("(//input[contains (@placeholder, 'Search')])[2]")).sendKeys(Keys.ENTER);      //for enter app name in IDP
		Thread.sleep(3000);

		
		identityproviderPage.clickOnselectCheckboxAppofIdentityProvider();  // FOR SELECT CHECKBOX OF REAMAZE
		Thread.sleep(2000);
		
		
		identityproviderPage.clickOnConfirmAddbuttonofIdentityProvider();  // Click on add application for confirmationn
		Thread.sleep(2000);

	}
	
	
	@When("^User enter application name in search box with two characters$")
    public void user_enter_application_name_in_search_box_with_two_characters() throws Throwable {
		// for search application name with two charcters
		
        identityproviderPage.SearchAndenterAppnamewithMinimmtwoCharacterInIDP(getSearchappnameMinicharIDP());
        driver.findElement(By.xpath("(//input[contains (@placeholder, 'Search')])[2]")).sendKeys(Keys.ENTER);      //for enter app name in IDP
		Thread.sleep(3000);
    }

	
	
	

	// for IDP application Delete
	@When("^User should select application for delete$")
	public void user_should_select_application_for_delete() throws Throwable {
		
		identityproviderPage.clickOndeleteAppfromIdentityProviderTab();
		Thread.sleep(2000);
	}
	
	
	
	
	 @Then("^User clicks on show 10 of IDP$")
	    public void user_clicks_on_show_10_of_idp() throws Throwable {
		 identityproviderPage.clickOnShowlistToggleIdentityProviderTab();
		       Thread.sleep(2000);
	        identityproviderPage.clickOnShow10IdentityProviderTab();
	        Thread.sleep(2000);
	    }

	    @Then("^User clicks on show 20 of IDP$")
	    public void user_clicks_on_show_20_of_idp() throws Throwable {
	    	 identityproviderPage.clickOnShowlistToggleIdentityProviderTab();
		       Thread.sleep(2000);
	        identityproviderPage.clickOnShow20IdentityProviderTab();
	        Thread.sleep(2000);
	    }

	    @Then("^User clicks on show 50 of IDP$")
	    public void user_clicks_on_show_50_of_idp() throws Throwable {
	    	 identityproviderPage.clickOnShowlistToggleIdentityProviderTab();
		       Thread.sleep(2000);
	        identityproviderPage.clickOnShow50IdentityProviderTab();
	        Thread.sleep(2000);
	    }

	    @Then("^User clicks on show 100 of IDP$")
	    public void user_clicks_on_show_100_of_idp() throws Throwable {
	    	 identityproviderPage.clickOnShowlistToggleIdentityProviderTab();
		       Thread.sleep(2000);
	        identityproviderPage.clickOnShow100IdentityProviderTab();
	        Thread.sleep(2000);
	    }


}


