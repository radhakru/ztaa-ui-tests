package com.instasafe.ztaa.ui.stepdefinitions;

import org.junit.runner.RunWith;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.instasafe.ztaa.ui.pages.AuthProfilePage;
import com.instasafe.ztaa.ui.pages.DevicesPage;
import com.instasafe.ztaa.ui.pages.DownloadsPage;
import com.instasafe.ztaa.ui.pages.EventsPage;
import com.instasafe.ztaa.ui.pages.GatewaysPage;
import com.instasafe.ztaa.ui.pages.HomePage;
import com.instasafe.ztaa.ui.pages.IdentityProviderPage;
import com.instasafe.ztaa.ui.pages.LoginPage;
import com.instasafe.ztaa.ui.pages.LogoutPage;
import com.instasafe.ztaa.ui.pages.UserGroupsPage;
import com.instasafe.ztaa.ui.pages.UsersPage;
import com.instasafe.ztaa.ui.core.TestBase;
import com.instasafe.ztaa.ui.pages.AgentReleasePage;
import com.instasafe.ztaa.ui.pages.ApplicationAccessPage;
import com.instasafe.ztaa.ui.pages.ApplicationPage;
import com.instasafe.ztaa.ui.pages.AuditPage;

import org.openqa.selenium.*;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)

public class CommonSteps extends TestBase {

//	public WebDriverWait wait;
	LoginPage loginPage = getPageInstance(LoginPage.class);
	HomePage homePage = getPageInstance(HomePage.class);
	AuthProfilePage authprofilePage = getPageInstance(AuthProfilePage.class);
	UsersPage usersPage = getPageInstance(UsersPage.class);
	UserGroupsPage usergroupsPage = getPageInstance(UserGroupsPage.class);
	DevicesPage devicePage = getPageInstance(DevicesPage.class);
	GatewaysPage gatewaysPage = getPageInstance(GatewaysPage.class);
	ApplicationPage applicationPage = getPageInstance(ApplicationPage.class);
	LogoutPage logoutPage = getPageInstance(LogoutPage.class);


    AgentReleasePage agentrelease= getPageInstance(AgentReleasePage.class);
    DownloadsPage downloadsPage = getPageInstance(DownloadsPage.class);
	ApplicationAccessPage applicationaccessPage= getPageInstance(ApplicationAccessPage.class);
	IdentityProviderPage identityproviderPage=getPageInstance(IdentityProviderPage.class);
	AuditPage auditPage =getPageInstance(AuditPage.class);
	EventsPage eventPage= getPageInstance(EventsPage.class);
    

	@Given("^User launched ZTAA in the browser$")
	public void user_launched_ztaa_in_the_browser() throws Throwable {

		driver.get(getConsoleUrl());
		driver.switchTo().defaultContent();
		driver.manage().window().maximize();

		Thread.sleep(6000);

	}

	/** test step methods for Login page **/

	@Then("^Verify ZTAA login page is displayed$")
	public void verify_ztaa_login_page_is_displayed() throws Throwable {
		String URL_Login = driver.getCurrentUrl();
		Assert.assertTrue(URL_Login.contains(getConsoleUrl() + "/#/"));
		Thread.sleep(2000);
		Assert.assertTrue(driver.getTitle().contains("Software Defined Perimeter"));
	}

	@When("^User enters Username and clicks on Continue button$")
	public void user_enters_username_and_clicks_on_continue_button() throws Throwable {

		loginPage.enterUserName(getUsername());
		loginPage.clickOnContinueButton();

	}

	@When("^User enters Password and clicks on Continue button$")
	public void user_enters_password_and_clicks_on_continue_button() throws Throwable {

		Thread.sleep(6000);
		loginPage.enterPassword(getPwd());
		loginPage.clickOnContinueButton();
		Thread.sleep(3000);

	}

	@When("^User clicks on Continue button without giving Username$")
	public void user_clicks_on_continue_button_without_giving_username() throws Throwable {

		loginPage.clickOnContinueButton();
		Thread.sleep(2000);
		WebElement element_username_unavailable = driver.findElement(By.xpath(
				"/html/body/app-root/app-login/div/div[2]/div[2]/div/div[2]/div/div[1]/mat-form-field/div/div[3]/div/mat-error"));
		String actual_msg_username_unavailable = element_username_unavailable.getText();
		String expected_msg_username_unavailable = "Username is required";
		Assert.assertEquals(expected_msg_username_unavailable, actual_msg_username_unavailable);
		Thread.sleep(2000);
	}

	@When("^User clicks on Continue button giving invalid Username$")
	public void user_clicks_on_continue_button_giving_invalid_username() throws Throwable {

		loginPage.enterUserName(getUsernameInvalid());
		loginPage.clickOnContinueButton();
		Thread.sleep(2000);

		WebElement element_username_invalid = driver
				.findElement(By.xpath("/html/body/app-root/app-login/div/div[2]/div[2]/div/div[2]/div/p"));
		String actual_msg_username_invalid = element_username_invalid.getText();
		String expected_msg_username_invalid = "Username is invalid";
		Assert.assertEquals(expected_msg_username_invalid, actual_msg_username_invalid);
		Thread.sleep(2000);
	}

	/** test step methods for Home page **/

	@Then("^User should see home page$")
	public void user_should_see_home_page() throws Throwable {
		Thread.sleep(6000);
		String URL_Home = driver.getCurrentUrl();
		Assert.assertTrue(URL_Home.contains(getConsoleUrl() + "/#/tenant/home"));
		Thread.sleep(2000);

	}

	@When("^User clicks on Create User$")
	public void user_clicks_on_create_user() throws Throwable {
		Thread.sleep(5000);

		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement element_createuser = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()=' Create User ']")));

		element_createuser = driver.findElement(By.xpath("//*[text()=' Create User ']"));
		element_createuser.click();

	}

	@When("^User gives Name$")
	public void user_gives_name() throws Throwable {

		Thread.sleep(4000);

		WebElement element_entername = driver.findElement(By.xpath(
				"/html/body/app-root/app-tenant-layout/div/div[2]/div/app-dashboard/div/div[1]/div[7]/div/div/mat-accordion/mat-expansion-panel/div/div/div[1]/div/div/div/mat-form-field[1]/div/div[1]/div/input"));
		element_entername.click();
		element_entername.sendKeys("autotest");
	}

	@When("^User gives Email$")
	public void user_gives_email() throws Throwable {

		Thread.sleep(2000);
		WebElement element_email = driver.findElement(By.xpath(
				"/html/body/app-root/app-tenant-layout/div/div[2]/div/app-dashboard/div/div[1]/div[7]/div/div/mat-accordion/mat-expansion-panel/div/div/div[1]/div/div/div/mat-form-field[2]/div/div[1]/div/input"));
		element_email.sendKeys("autotest@bh.exacttarget.com");
	}

	@When("^User gives Phone Number$")
	public void user_gives_phone_number() throws Throwable {

		Thread.sleep(2000);
		WebElement element_email = driver.findElement(By.xpath(
				"/html/body/app-root/app-tenant-layout/div/div[2]/div/app-dashboard/div/div[1]/div[7]/div/div/mat-accordion/mat-expansion-panel/div/div/div[1]/div/div/div/mat-form-field[3]/div/div[1]/div/input"));
		element_email.sendKeys("+918760000000");
	}

	@Then("^User clicks Add User$")
	public void user_clicks_add_user() throws Throwable {

		WebElement element_btn_AddUser = driver.findElement(By.xpath(
				"/html/body/app-root/app-tenant-layout/div/div[2]/div/app-dashboard/div/div[1]/div[7]/div/div/mat-accordion/mat-expansion-panel/div/div/div[1]/div/div/div/div/button"));
		element_btn_AddUser.click();

	}

	@Then("^User should logout$")
	public void user_should_logout() throws Throwable {

		Thread.sleep(3000);
		logoutPage.logout();

	}

	@Then("^User should close the ZTAA browser$")
	public void user_should_close_the_ztaa_browser() throws Throwable {

		driver.quit();
		Thread.sleep(2000);

	}

	/** Identity Management **/

	@When("^User clicks on Identity Management$")
	public void user_clicks_on_identity_management() throws Throwable {

		Thread.sleep(3000);

		/*
		 * WebElement element_idnmgmnt = driver .findElement(By.xpath(
		 * "/html/body/app-root/app-tenant-layout/div/div[1]/app-sidebar/div/ul/li[2]/a"
		 * )); element_idnmgmnt.click();
		 */

		homePage.clickOnIdentityMngmntButton();
		Thread.sleep(3000);

	}

	/** Perimeter Management **/

	@When("^User clicks on Perimeter Management$")
	public void user_clicks_on_perimeter_management() throws Throwable {

		Thread.sleep(4000);
		/*
		 * WebElement element_prmtrmgmnt = driver .findElement(By.xpath(
		 * "/html/body/app-root/app-tenant-layout/div/div[1]/app-sidebar/div/ul/li[3]/a"
		 * )); element_prmtrmgmnt.click();
		 */
		homePage.clickOnPerimeterMngmntButton();

	}

	/** Access Policies **/

	 @When("^User clicks on Access Policies$")
	    public void user_clicks_on_access_policies() throws Throwable {
	        
		 Thread.sleep(4000);
		 homePage.clickOnAccessPoliciesButton();
		 
	    }

}
