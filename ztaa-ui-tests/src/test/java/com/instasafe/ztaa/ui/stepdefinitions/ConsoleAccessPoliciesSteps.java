package com.instasafe.ztaa.ui.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.instasafe.ztaa.ui.core.TestBase;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConsoleAccessPoliciesSteps extends TestBase {

	@When("^User clicks on Add Policy icon$")
	public void user_clicks_on_add_policy_icon() throws Throwable {
		Thread.sleep(3000);

		WebElement element_access_policies_add = driver.findElement(By.xpath(
				"/html/body/app-root/app-tenant-layout/div/div[2]/div/app-access-control/mat-card/mat-card-content/section/div[2]/div[2]/div/button[1]"));
		element_access_policies_add.click();
		Thread.sleep(3000);
	}

	@When("^User gives Policy Basic information and clicks Next$")
	public void user_gives_policy_basic_information_and_clicks_next() throws Throwable {
		Thread.sleep(3000);

		WebElement element_access_policies_info_name = driver.findElement(By.xpath(
				"/html/body/app-root/app-tenant-layout/div/div[2]/div/app-access-control/mat-card/mat-card-content/mat-accordion/mat-expansion-panel[1]/div/div/mat-tab-group/div/mat-tab-body/div/div/mat-horizontal-stepper/div[2]/div/div/mat-card/div/mat-form-field[1]/div/div[1]/div/input"));
		element_access_policies_info_name.click();
		element_access_policies_info_name.sendKeys("autotestpolicy");

		WebElement element_access_policies_info_desc = driver.findElement(By.xpath(
				"/html/body/app-root/app-tenant-layout/div/div[2]/div/app-access-control/mat-card/mat-card-content/mat-accordion/mat-expansion-panel[1]/div/div/mat-tab-group/div/mat-tab-body/div/div/mat-horizontal-stepper/div[2]/div/div/mat-card/div/mat-form-field[2]/div/div[1]/div/textarea"));
		element_access_policies_info_desc.click();
		element_access_policies_info_desc.sendKeys("policy created by automation");

		Thread.sleep(3000);

		WebElement element_access_policies_info_next = driver.findElement(By.xpath(
				"/html/body/app-root/app-tenant-layout/div/div[2]/div/app-access-control/mat-card/mat-card-content/mat-accordion/mat-expansion-panel[1]/div/div/mat-tab-group/div/mat-tab-body/div/div/mat-horizontal-stepper/div[2]/div/div/mat-card/div/div/button"));
		// WebElement element_access_policies_info_next =
		// driver.findElement(By.xpath("//span[text()='Next']"));
		element_access_policies_info_next.click();
	}

	@When("^User gives user details to be added to the Policy and clicks Next$")
	public void user_gives_user_details_to_be_added_to_the_policy_and_clicks_next() throws Throwable {

		Thread.sleep(3000);
	/*	WebElement element_access_policies_adduser = driver.findElement(By.xpath(
				"/html/body/app-root/app-tenant-layout/div/div[2]/div/app-access-control/mat-card/mat-card-content/mat-accordion/mat-expansion-panel[1]/div/div/mat-tab-group/div/mat-tab-body/div/div/mat-horizontal-stepper/div[2]/div[2]/div/mat-card/div/div[1]/button[1]"));
		*/
		WebElement element_access_policies_adduser = driver.findElement(By.xpath(
				"/html/body/app-root/app-tenant-layout/div/div[2]/div/app-access-control/mat-card/mat-card-content/mat-accordion/mat-expansion-panel[1]/div/div/mat-tab-group/div/mat-tab-body/div/div/mat-horizontal-stepper/div[2]/div[2]/div/mat-card/div[1]/button[1]"));
		
		element_access_policies_adduser.click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[contains (@placeholder, 'Search')])[2]")).sendKeys("pooja", Keys.ENTER);
		Thread.sleep(2000);

		// for check box
		/*
		 * driver.findElement(By.xpath(
		 * "(//div[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[14]"
		 * )) .click();
		 */
		driver.findElement(By.xpath(
				"//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-filter-popup[1]/mat-dialog-content[1]/section[2]/ul[1]/li[2]/div[1]/div[1]/mat-checkbox[1]/label[1]/span[1]"))
				.click();
		Thread.sleep(2000);

		// for add user
		driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/mat-dialog-container/app-filter-popup/mat-dialog-actions/button[1]/span[1]")).click();
		Thread.sleep(2000);

		// for clicking Next after adding user
	/*	driver.findElement(By.xpath(
				"//mat-tab-body/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[1]/mat-card[1]/div[1]/div[3]/button[2]/span[1]"))
				.click(); */
		driver.findElement(By.xpath(
				"/html/body/app-root/app-tenant-layout/div/div[2]/div/app-access-control/mat-card/mat-card-content/mat-accordion/mat-expansion-panel[1]/div/div/mat-tab-group/div/mat-tab-body/div/div/mat-horizontal-stepper/div[2]/div[2]/div/mat-card/div[3]/button[2]"))
				.click();
		Thread.sleep(2000);
		/*
		 * WebElement element_access_policies_users = driver.findElement(By.xpath(
		 * "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-access-control/mat-card/mat-card-content/mat-accordion/mat-expansion-panel[1]/div/div/mat-tab-group/div/mat-tab-body/div/div/mat-horizontal-stepper/div[2]/div[2]/div/mat-card/div/div[2]/mat-form-field[1]/div/div[1]/div[2]/input"
		 * )); element_access_policies_users.click();
		 * element_access_policies_users.sendKeys("autotest");
		 */
	}

	@When("^User gives application details to be added to the Policy and clicks Next$")
	public void user_gives_application_details_to_be_added_to_the_policy_and_clicks_next() throws Throwable {
		// click on the "Add Application" buttom
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Add Application')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[contains (@placeholder, 'Search')])[2]")).sendKeys("Amazon", Keys.ENTER);
		Thread.sleep(2000);
		// clicks on application checkbox
		driver.findElement(By.xpath(
				"//body/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-filter-popup[1]/mat-dialog-content[1]/section[2]/ul[1]/li[1]/div[1]/div[1]/mat-checkbox[1]/label[1]/span[1]"))
				.click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(
				"/html/body/div[3]/div[2]/div/mat-dialog-container/app-filter-popup/mat-dialog-actions/button[1]/span[1]"))
				.click();
		Thread.sleep(2000);
	/*	driver.findElement(By.xpath(
				"//mat-tab-body/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[3]/div[1]/mat-card[1]/div[1]/div[3]/button[2]"))
				.click(); */
		driver.findElement(By.xpath(
				"/html/body/app-root/app-tenant-layout/div/div[2]/div/app-access-control/mat-card/mat-card-content/mat-accordion/mat-expansion-panel[1]/div/div/mat-tab-group/div/mat-tab-body/div/div/mat-horizontal-stepper/div[2]/div[3]/div/mat-card/div[3]/button[2]"))
				.click();
		Thread.sleep(2000);
	}

	@When("^User gives Policy manage rules details and clicks Next$")
	public void user_gives_policy_manage_rules_details_and_clicks_next() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//mat-tab-body/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[4]/div[1]/mat-card[1]/div[1]/div[2]/button[2]/span[1]"))
				.click();
		Thread.sleep(2000);
	}

	@When("^User gives Policy authentication details and clicks Next$")
	public void user_gives_policy_authentication_details_and_clicks_next() throws Throwable {
		Thread.sleep(2000);
	/*	driver.findElement(By.xpath(
				"//mat-tab-body/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[5]/div[1]/mat-card[1]/div[1]/div[1]/button[2]/span[1]"))
				.click(); */
		driver.findElement(By.xpath(
				"/html/body/app-root/app-tenant-layout/div/div[2]/div/app-access-control/mat-card/mat-card-content/mat-accordion/mat-expansion-panel[1]/div/div/mat-tab-group/div/mat-tab-body/div/div/mat-horizontal-stepper/div[2]/div[5]/div/mat-card/div[2]/button[2]"))
				.click();
		Thread.sleep(2000);
	}

	@When("^User submits Policy by clicking Submit$")
	public void user_submits_policy_by_clicking_submit() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Submit')]")).click();
		Thread.sleep(2000);
	}

	// Access Policy delete methods
	@Then("^User searches for a Access Policy$")
	public void user_searches_for_a_access_policy() throws Throwable {
		Thread.sleep(2000);
		WebElement element_accpolicies_policy_search = driver.findElement(By.xpath(
				"//body/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-access-control[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[1]/div[1]/input[1]"));

		element_accpolicies_policy_search.sendKeys("autotestpolicy", Keys.RETURN);
		Thread.sleep(2000);
		Thread.sleep(2000);
	}

	@Then("^User selects Access Policy from search results$")
	public void user_selects_access_policy_from_search_results() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"//body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-access-control[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-expansion-panel[1]/mat-expansion-panel-header[1]/span[1]/mat-panel-title[1]/div[1]"))
				.click();
		Thread.sleep(2000);
	}

	@Then("^User clicks the Edit button to update Access Policy$")
	public void user_clicks_the_edit_button_to_update_access_policy() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Edit')]")).click();
		Thread.sleep(2000);
	}

	@And("^User clicks on the Actions tab in the selected Access Policy$")
	public void user_clicks_on_the_actions_tab_in_the_selected_access_policy() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath(
				"/html/body/app-root/app-tenant-layout/div/div[2]/div/app-access-control/mat-card/mat-card-content/mat-accordion/mat-expansion-panel[1]/div/div/mat-tab-group/mat-tab-header/div[2]/div/div/div[6]/div"))
				.click();
		Thread.sleep(2000);
	}

	@Then("^User clicks on the Delete icon to delete the Access Policy$")
	public void user_clicks_on_the_delete_icon_to_delete_the_access_policy() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("//mat-icon[contains(text(),'delete_forever')]")).click();
		Thread.sleep(2000);
	}

	@And("^User confirms to delete the Access Policy$")
	public void user_confirms_to_delete_the_access_policy() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
	}

	@Then("^User gets confirmation on the Access Policy deletion$")
	public void user_gets_confirmation_on_the_access_policy_deletion() throws Throwable {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[4]/div/div[3]/button[1]")).click();
		Thread.sleep(2000);
	}

}
