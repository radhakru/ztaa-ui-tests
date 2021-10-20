package com.instasafe.ztaa.ui.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.instasafe.ztaa.ui.core.TestBase;
import com.instasafe.ztaa.ui.pages.AgentReleasePage;
import com.instasafe.ztaa.ui.pages.ApplicationPage;
import com.instasafe.ztaa.ui.pages.DevicesPage;
import com.instasafe.ztaa.ui.pages.GatewaysPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConsolePerimeterMgmntSteps extends TestBase {
	
	
	DevicesPage devicePage = getPageInstance(DevicesPage.class);
    AgentReleasePage agentrelease= getPageInstance(AgentReleasePage.class);
    ApplicationPage applicationPage = getPageInstance(ApplicationPage.class);
	GatewaysPage gatewaysPage = getPageInstance(GatewaysPage.class);

	
	
 // ***Perimeter Management >Device methods starts here***//

    
    
 	@Then("^User clicks on Devices$")
 	public void user_clicks_on_devices() throws Throwable {
 		// for Devices Tab
 		devicePage.clickOnDeviceTab();

 		Thread.sleep(2000);

 	}

 	@Then("^User enters Devices name for search$")
 	public void user_enters_devices_name_for_search() throws Throwable {

 		// for enter search device name
 		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("LAPTOP");
 		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Keys.RETURN);
 		Thread.sleep(2000);

 	}

 	@Then("^User clicks on CSV download of Device$")
 	public void user_clicks_on_csv_download_of_device() throws Throwable {
 		// DEVICE CSV Download
 		devicePage.clickOnCsvDownloadDevice();
 		Thread.sleep(2000);
 	}

 	@Then("^User clicks on Device for select$")
 	public void user_clicks_on_device_for_select() throws Throwable {
 		// for device select
 		devicePage.clickOnDeviceselect();
 		Thread.sleep(2000);

 	}

 	@Then("^User Enable edit button of device$")
 	public void user_enable_edit_button_of_device() throws Throwable {
 		// for ENABLE BUTTON device name
 		// driver.findElement(By.xpath("(//div[@class='mat-slide-toggle-thumb'])[3]")).click();
 		devicePage.clickOnDeviceedit();
 		Thread.sleep(2000);
 	}

 
 	@And("^User clicks on Enable or disable toggle$")
 	public void user_clicks_on_enable_or_disable_toggle() throws Throwable {

 		// for block or unblock device
 		devicePage.clickOnBlockUnblockDevice();
 		Thread.sleep(2000);

 	}

 	@Then("^User clicks on Approvals of devices tab$")
 	public void user_clicks_on_approvals_of_devices_tab() throws Throwable {
 		devicePage.clickOnDeviceApprovals();
 		Thread.sleep(2000);
 	}

 	@Then("^User clicks on CSV download of Approvals devices tab$")
 	public void user_clicks_on_csv_download_of_approvals_devices_tab() throws Throwable {
 		devicePage.clickOnCsvDownloadDeviceApprovals();
 		Thread.sleep(2000);
 	}
 	
 	
	@And("^User clicks on Action tab of device$")
	public void user_clicks_on_action_tab_of_device() throws Throwable {
		Thread.sleep(2000);
		// click on actions tab of devices
		devicePage.clickOnDeviceActions();
		Thread.sleep(2000);
	}
	
	 @And("^User clicks on Atributes tab of device$")
	    public void user_clicks_on_atributes_tab_of_device() throws Throwable {
		 devicePage.clickOnDeviceAttributesTab();
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
	
	 @And("^User clicks on Network Interfaces tab of device$")
	    public void user_clicks_on_network_interfaces_tab_of_device() throws Throwable {
	        devicePage.clickOnDeviceNetworkInterfacesTab();
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
	
	 @Then("^User clicks on show 10 of devices$")
	    public void user_clicks_on_show_10_of_devices() throws Throwable {
	        devicePage.clickOnDevicesShowlistToggle();
	        Thread.sleep(2000);
	        devicePage.clickOnshow10Devices();
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
	    @Then("^User clicks on show 20 of devices$")
	    public void user_clicks_on_show_20_of_devices() throws Throwable {
	    	  devicePage.clickOnDevicesShowlistToggle();
		        Thread.sleep(2000);
		        devicePage.clickOnshow20Devices();
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
	    @Then("^User clicks on show 50 of devices$")
	    public void user_clicks_on_show_50_of_devices() throws Throwable {
	    	  devicePage.clickOnDevicesShowlistToggle();
		        Thread.sleep(2000);
		        devicePage.clickOnshow50Devices();
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
	    @Then("^User clicks on show 100 of devices$")
	    public void user_clicks_on_show_100_of_devices() throws Throwable {
	    	  devicePage.clickOnDevicesShowlistToggle();
		        Thread.sleep(2000);
		        devicePage.clickOnshow100Devices();
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
	
	    @Then("^User clicks on Created Time of Devices$")
	    public void user_clicks_on_created_time_of_devices() throws Throwable {
	    	devicePage.clickOnsortingToggleDevices();
	        Thread.sleep(2000);
	        devicePage.clickOnCreatedTimeDevices();
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

	    @Then("^User clicks on Name of Devices$")
	    public void user_clicks_on_name_of_devices() throws Throwable {
	    	devicePage.clickOnsortingToggleDevices();
	        Thread.sleep(2000);
	        devicePage.clickOnNameDevices();
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

	    
	    @Then("^User clicks on sorting in Descending order$")
	    public void user_clicks_on_sorting_in_descending_order() throws Throwable {
	    	 devicePage.clickOnDecendingorderDevice();
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

	    @Then("^User clicks on sorting in Ascending order$")
	    public void user_clicks_on_sorting_in_ascending_order() throws Throwable {
	    	devicePage.clickOnAscendingorderDevice();
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

	    
	    @Then("^User clicks on Created Time of Devices approvals$")
	    public void user_clicks_on_created_time_of_devices_approvals() throws Throwable {
	    	devicePage.clickOnsortingToggleDevicesApprovals();
			Thread.sleep(2000);
			devicePage.clickOnSortbyCreatedtimeDeviceApprovals();
			Thread.sleep(2000);
			
	    }

	    @Then("^User clicks on User Name of Approved Devices$")
	    public void user_clicks_on_user_name_of_approved_devices() throws Throwable {
	    	devicePage.clickOnsortingToggleDevicesApprovals();
			Thread.sleep(2000);
	    	devicePage.clickOnSortbyUserNameDeviceApprovals();
			Thread.sleep(2000);
			
	    }

	    @Then("^User clicks on Device Name of Approved Devices$")
	    public void user_clicks_on_device_name_of_approved_devices() throws Throwable {
	    	devicePage.clickOnsortingToggleDevicesApprovals();
			Thread.sleep(2000);
			devicePage.clickOnSortbyDeviceNameDeviceApprovals();
			Thread.sleep(2000);
	    }

	    
	    
	   
	    
 	
	/** test step methods for Agent Release page in Perimeter Management **/
	    
	    
	    

	 @Then("^User clicks on Agent Release$")
	    public void user_clicks_on_agent_release() throws Throwable {
		 Thread.sleep(2000);
		 agentrelease.clickOnAgentReleaseTab();
		 Thread.sleep(3000);
	 }

	
	
	 @Then("^User clicks on edit button of Agent Release$")
	    public void user_clicks_on_edit_button_of_agent_release() throws Throwable {
	       agentrelease.clickOnEditButtonofAgentReleaseTab();
	       Thread.sleep(3000);
	    }

	 @Then("^User clicks on show 10 of agent release$")
	    public void user_clicks_on_show_10_of_agent_release() throws Throwable {
		  agentrelease.clickOnAgentReleaseShowlistToggle();
		    Thread.sleep(2000);
		    agentrelease.clickOnshow10agentrelease();
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

	    @Then("^User clicks on show 20 of agent release$")
	    public void user_clicks_on_show_20_of_agent_release() throws Throwable {
	    	 agentrelease.clickOnAgentReleaseShowlistToggle();
			    Thread.sleep(2000);
			    agentrelease.clickOnshow20agentrelease();
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

	    @Then("^User clicks on show 50 of agent release$")
	    public void user_clicks_on_show_50_of_agent_release() throws Throwable {
	    	 agentrelease.clickOnAgentReleaseShowlistToggle();
			    Thread.sleep(2000);
			    agentrelease.clickOnshow50agentrelease();
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
	    
	    
	    @Then("^User clicks on show 50 of agent release and click on publish button$")
	    public void user_clicks_on_show_50_of_agent_release_and_click_on_publish_button() throws Throwable {
	    	 agentrelease.clickOnAgentReleaseShowlistToggle();
			    Thread.sleep(2000);
			    agentrelease.clickOnshow50agentrelease();
				Thread.sleep(2000);
				
				JavascriptExecutor js = (JavascriptExecutor) driver;
				js.executeScript("window.scrollBy(0, 500)");
				Thread.sleep(4000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=5000");
				Thread.sleep(4000);
				
				driver.findElement(By.xpath("(//button[@class='btn btn-insta-success ng-star-inserted'])[36]")).click();
				Thread.sleep(2000);
			
				agentrelease.clickOnAgentReleasePublishButton();
				Thread.sleep(2000);
				js.executeScript("window.scrollBy(0, -500)");
				Thread.sleep(4000);
				js.executeScript("document.querySelector('.main-panel').scrollTop=-5000");  
				
	    }


	    @Then("^User clicks on show 100 of agent release$")
	    public void user_clicks_on_show_100_of_agent_release() throws Throwable {
	    	 agentrelease.clickOnAgentReleaseShowlistToggle();
			    Thread.sleep(2000);
			    agentrelease.clickOnshow100agentrelease();
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

	 /** test step methods for Applications Tab in Perimeter Management **/

	
	    @When("^User clicks on Applications tab$")
		public void user_clicks_on_applications_tab() throws Throwable {

			/*
			 * Thread.sleep(4000); WebElement element_prmtrmgmnt_appln =
			 * driver.findElement(By.xpath(
			 * "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-perimeter-layout/nav/div[2]/div/div/a[2]"
			 * )); element_prmtrmgmnt_appln.click();
			 */
			Thread.sleep(4000); // user clicks on application tab in perimeter management
			applicationPage.clickOnapplicationtabperimtr();
		}

		@When("^User clicks on Add Applications icon$")
		public void user_clicks_on_add_applications_icon() throws Throwable {
			Thread.sleep(4000);
			/*
			 * WebElement element_prmtrmgmnt_appln = driver.findElement(By.xpath(
			 * "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-perimeter-layout/app-applications/mat-card/mat-card-content/section/div[2]/div[2]/div/button"
			 * )); element_prmtrmgmnt_appln.click();
			 */
			Thread.sleep(4000); // user clicks on plus icon for adding application
			applicationPage.clickOnapplicationaddplusprimtr();
		}

		@When("^User selects Web Application create$")
		public void user_selects_web_application_create() throws Throwable {
			/*
			 * Thread.sleep(4000); WebElement element_prmtrmgmnt_appln_web =
			 * driver.findElement(By.xpath(
			 * "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-perimeter-layout/app-applications/mat-card/mat-card-content/mat-accordion/mat-expansion-panel[1]/div/div/mat-tab-group/div/mat-tab-body/div/div/div/mat-card/div/div[1]/div[1]"
			 * )); element_prmtrmgmnt_appln_web.click();
			 */
			Thread.sleep(4000); // user selects web application to add
			applicationPage.clickOnwebapplicationselectadd();

		}

		@When("^User fills Application details$")
		public void user_fills_application_details() throws Throwable {
			Thread.sleep(4000);

			/*
			 * WebElement element_prmtrmgmnt_appln_entername = driver.findElement(By.xpath(
			 * "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-perimeter-layout/app-applications/mat-card/mat-card-content/mat-accordion/mat-expansion-panel[1]/div/div/mat-tab-group/div/mat-tab-body/div/div/div/mat-card/div/div[1]/mat-form-field[1]/div/div[1]/div/input"
			 * )); element_prmtrmgmnt_appln_entername.click();
			 * element_prmtrmgmnt_appln_entername.sendKeys("Yahoo"); Thread.sleep(4000);
			 * 
			 * WebElement element_prmtrmgmnt_appln_url = driver.findElement(By.xpath(
			 * "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-perimeter-layout/app-applications/mat-card/mat-card-content/mat-accordion/mat-expansion-panel[1]/div/div/mat-tab-group/div/mat-tab-body/div/div/div/mat-card/div/div[1]/mat-form-field[2]/div/div[1]/div/input"
			 * )); element_prmtrmgmnt_appln_url.click();
			 * element_prmtrmgmnt_appln_url.sendKeys("http://www.yahoo.com/");
			 */

			applicationPage.clickOnappnameadd();
			applicationPage.enterAppnameperimtr(getAppnameaddperimtr()); // user enter application name
			Thread.sleep(4000);
			applicationPage.clickOnappurladd();
			applicationPage.enterAppurladdperimtr(getAppurladdperimtr()); // user enters application url
		}

		@When("^User clicks Add Application$")
		public void user_clicks_add_application() throws Throwable {

			Thread.sleep(4000);

			/*
			 * WebElement element_prmtrmgmnt_appln_add = driver.findElement(By.xpath(
			 * "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-perimeter-layout/app-applications/mat-card/mat-card-content/mat-accordion/mat-expansion-panel[1]/div/div/mat-tab-group/div/mat-tab-body/div/div/div/mat-card/div/div[2]/button"
			 * )); element_prmtrmgmnt_appln_add.click();
			 */

			applicationPage.clickOnaddapplicationbutton(); // User clicks on add application button
		}
	    
		@When("^User searches for application$")
		public void user_searches_for_application() throws Throwable {
			/*
			 * WebElement element_prmtrmgmnt_appln_search = driver.findElement(By.xpath(
			 * "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-perimeter-layout/app-applications/mat-card/mat-card-content/section/div[1]/div[1]/div/input"
			 * ));
			 * 
			 * element_prmtrmgmnt_appln_search.sendKeys("Yahoo", Keys.ENTER);
			 */
			applicationPage.enterAppsearchperimtr(getAppsearchperimtr()); // User searches for an application
			WebElement element_prmtrmgmnt_appln_search = driver.findElement(By.xpath(
					"/html/body/app-root/app-tenant-layout/div/div[2]/div/app-perimeter-layout/app-applications/mat-card/mat-card-content/section/div[1]/div[1]/div/input"));
			element_prmtrmgmnt_appln_search.sendKeys(Keys.ENTER);
			Thread.sleep(3000);

		}

		@Then("^User selects application from search results$")
		public void user_selects_application_from_search_results() throws Throwable {
			Thread.sleep(2000);
			/*
			 * WebElement element_select_appln = driver.findElement(By.xpath(
			 * "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-perimeter-layout/app-applications/mat-card/mat-card-content/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span[1]/mat-panel-title/div/span[2]"
			 * )); element_select_appln.click();
			 */
			applicationPage.clickOnselectapplicationsearchresult(); // Selects the searched application
		}

		@Then("^Application details retrieved$")
		public void application_details_retrieved() throws Throwable {
			// WebElement element_prmtrmgmnt_appln_srt =
			// driver.findElement(By.xpath("/html/body/app-root/app-tenant-layout/div/div[2]/div/app-perimeter-layout/app-applications/mat-card/mat-card-content/section/div[1]/div[4]/div/div"));
			// element_prmtrmgmnt_appln_srt.click();

			Thread.sleep(2000);
		}

		@Then("^User clicks Application Edit from toggle$")
		public void user_clicks_application_edit_from_toggle() throws Throwable {
			Thread.sleep(2000);
			/*
			 * // WebElement element_appln_toggle_edit = driver.findElement(By.xpath( //
			 * "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-perimeter-layout/app-applications/mat-card/mat-card-content/section/div[1]/div[3]/div/mat-button-toggle-group/mat-button-toggle[2]/button/div"
			 * )); WebElement element_appln_toggle_edit = driver.findElement(By.xpath(
			 * "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-perimeter-layout/app-applications/mat-card/mat-card-content/section/div[1]/div[3]/div/mat-button-toggle-group/mat-button-toggle[2]/button/span"
			 * )); element_appln_toggle_edit.click();
			 */
			applicationPage.clickOnapplicationeditbutton(); // user clicks on edit toggle button in application
		}

		
		@Then("^User clicks Application Actions tab$")
		public void user_clicks_application_actions_tab() throws Throwable {
			Thread.sleep(2000);
			/*
			 * WebElement element_select_appln_action = driver.findElement(By.xpath(
			 * "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-perimeter-layout/app-applications/mat-card/mat-card-content/mat-accordion/mat-expansion-panel[1]/div/div/mat-tab-group/mat-tab-header/div[2]/div/div/div[3]/div"
			 * )); element_select_appln_action.click();
			 */
			applicationPage.clickOnapplicationactiontab(); // Goes to actions tab in a application
		}

		@Then("^User clicks Application Delete icon$")
		public void user_clicks_application_delete_icon() throws Throwable {
			Thread.sleep(2000);
			/*
			 * WebElement element_select_appln_del = driver.findElement(By.xpath(
			 * "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-perimeter-layout/app-applications/mat-card/mat-card-content/mat-accordion/mat-expansion-panel/div/div/mat-tab-group/div/mat-tab-body[3]/div/div[2]/div/mat-card/div[2]/button/span/mat-icon"
			 * )); element_select_appln_del.click();
			 */
			applicationPage.clickOnapplicationdeleteicon(); // user clicks on delete icon for application
		}

		@Then("^User confirm to delete application$")
		public void user_confirm_to_delete_application() throws Throwable {
			Thread.sleep(3000);
			/*
			 * WebElement element_confirm_usr_del =
			 * driver.findElement(By.xpath("//*[text()='Yes, delete']"));
			 * element_confirm_usr_del.click();
			 */
			applicationPage.clickOnapplicationdeleteconfirm(); // user confirms delete for application
			Thread.sleep(2000);
		}

		@Then("^Application is deleted$")
		public void application_is_deleted() throws Throwable {
			Thread.sleep(4000);
			/*
			 * WebElement element_appln_deleted =
			 * driver.findElement(By.xpath("//*[text()='OK']"));
			 * element_appln_deleted.click();
			 */
			applicationPage.clickOnapplicationdeletedok();
		}

		/** Perimeter Management Gateways methods start here **/

		@When("^User clicks on Gateways tab$")
		public void user_clicks_on_gateway_tab() throws Throwable {
			Thread.sleep(4000);
			gatewaysPage.clickOngatewaytab();
			Thread.sleep(4000);
		}
   
		@When("^User clicks on Add Gateway icon$")
		public void user_clicks_on_add_gateway_icon() throws Throwable {
			gatewaysPage.clickOngatewayaddplus();

			Thread.sleep(4000);
		}

		@When("^User checks Private gateway checkbox and clicks on Next$")
		public void user_checks_private_gateway_checkbox_and_clicks_on_next() throws Throwable {
			gatewaysPage.clickOnprigatewaycheck();
			Thread.sleep(5000);
			gatewaysPage.clickOnprigatewaynextbutton();
			Thread.sleep(3000);
		}

		@When("^User enters access code and clicks on Next$")
		public void user_enters_access_code_and_clicks_on_next() throws Throwable {
			gatewaysPage.enterAccesscode(getAccess());
			Thread.sleep(3000);
			gatewaysPage.clickOnaccessnextbutton();
			Thread.sleep(3000);
		}

		@When("^User clicks on Authorize button$")
		public void user_clicks_on_authorize_button() throws Throwable {
			gatewaysPage.clickOnauthorizebutton();
			Thread.sleep(3000);
		}

		@When("^User searches for a gateway and clicks on the Gateway$")
		public void user_searches_for_a_gateway_and_clicks_on_the_gateway() throws Throwable {
			gatewaysPage.entergatewaysearch(getGatewaysearch());
			Thread.sleep(2000);
			WebElement gateway_search = driver.findElement(By.xpath("//input[@placeholder='Search Gateway']"));
			gateway_search.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			// Selects the gateway search result
			gatewaysPage.clickOnselectgatewaysearchresult();
			Thread.sleep(2000);
		}

		@When("^User clicks on Applications tab in Gateway$")
		public void user_clicks_on_applications_tab_in_gateway() throws Throwable {

			gatewaysPage.clickOngatewayapptabselect();
			Thread.sleep(2000);
			WebElement Gateway_add_app = driver
					.findElement(By.xpath("//mat-tab-header/div[2]/div[1]/div[1]/div[2]/div[1]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", Gateway_add_app);
			Thread.sleep(4000);
		}

		@When("^User clicks on Add application$")
		public void user_clicks_on_add_application() throws Throwable {
			gatewaysPage.clickOngatewayedit();
			Thread.sleep(2000);
			gatewaysPage.clickOngatewayaddappbutton();
			Thread.sleep(4000);
		}

		@When("^User selects the application and adds application$")
		public void user_selects_the_application_and_adds_application() throws Throwable {

			gatewaysPage.entergatewaysearchapp(getGatewaysearchApp());
			Thread.sleep(2000);
			WebElement gateway_app_search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
			gateway_app_search.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			gatewaysPage.clickOngatewayselectsearchedapp(); // user select the searched app
			gatewaysPage.clickOngatewayaddappselected(); // User cliks on Add application button after selecting the app
			Thread.sleep(4000);
		}

		@When("^User deletes the Application$")
		public void user_deletes_the_application() throws Throwable {
			/*
			 * gatewaysPage.entergatewaysearchapp(getGatewaysearchApp()); // user searches
			 * for the app to be deleted Thread.sleep(2000); WebElement gateway_app_search =
			 * driver.findElement(By.xpath("//input[@placeholder='Search']"));
			 */
			WebElement gateway_app_search = driver.findElement(By.xpath(
					"/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-gateway[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[2]/input[1]")); // user
																																																																																					// searches
																																																																																					// for
																																																																																					// the
																																																																																					// app
																																																																																					// to
																																																																																					// be
																																																																																					// deleted
			Thread.sleep(2000);
			gateway_app_search.sendKeys("AMAZON");
			gateway_app_search.sendKeys(Keys.ENTER);
			Thread.sleep(2000);
			// gateway edit toggle button
			// driver.findElement(By.xpath("//div[contains(text(),'Edit')]")).click();
			gatewaysPage.clickOngatewayedit(); // User clicks on edit toggle button
			Thread.sleep(2000);
			gatewaysPage.clickOngatewayappdelete(); // user deletes the application
			Thread.sleep(4000);
		}

		@When("^User clicks on Action tab$")
		public void user_clicks_on_action_tab() throws Throwable {

			gatewaysPage.clickOngatewayactiontab(); // User goes to application action tab
			// gateway edit toggle button
			// driver.findElement(By.xpath("//div[contains(text(),'Edit')]")).click();
			gatewaysPage.clickOngatewayedit(); // enable edit toggle button
			Thread.sleep(4000);
		}

		@When("^User disables the Gateway$")
		public void user_disables_the_gateway() throws Throwable {
			gatewaysPage.clickOngatewaydisable(); // disable gateway
			Thread.sleep(4000);
		}

		@When("^User enables the Gateway$")
		public void user_enables_the_gateway() throws Throwable {
			gatewaysPage.clickOngatewayenable(); // enable gateway
			Thread.sleep(4000);
		}

		@When("^User deletes the Gateway$")
		public void user_deletes_the_gateway() throws Throwable {
			gatewaysPage.clickOngatewaydeleteicon(); // delete gateway
			Thread.sleep(2000);
			// gateway.clickOngatewaydeleteconfirm(); //confirm gateway delete
			gatewaysPage.clickOngatewaydeletecancel(); // cancel gateway delete
			Thread.sleep(4000);
		}

		@When("^User clicks on Name button$")
		public void user_clicks_on_name_button() throws Throwable {
			gatewaysPage.clickOngatewaynametimedropdown(); // click on name drop down
			Thread.sleep(1000);
			gatewaysPage.clickOngatewaynamesortoption(); // select name option
			Thread.sleep(4000);
		}

		@When("^User clicks on Created Time button$")
		public void user_clicks_on_created_time_button() throws Throwable {
			gatewaysPage.clickOngatewaynametimedropdown(); // click on name drop down
			Thread.sleep(1000);
			gatewaysPage.clickOngatewaycreatedtimesortoption(); // select created time option
			Thread.sleep(4000);
		}

		@When("^User clicks on Sorted in Ascending arrow$")
		public void user_clicks_on_sorted_in_ascending_arrow() throws Throwable {
			gatewaysPage.clickOngatewaysortascend(); // select ascend sort arrow
			Thread.sleep(4000);
		}

		@When("^User clicks on Sorted in Decending arrow$")
		public void user_clicks_on_sorted_in_decending_arrow() throws Throwable {
			gatewaysPage.clickOngatewaysortdecend(); // select decend sort arrow
			Thread.sleep(4000);
		}

		@When("^User clicks on Show 10 button$")
		public void user_clicks_on_show_10_button() throws Throwable {
			gatewaysPage.clickOngatewayshowdropdown(); // show drop down
			Thread.sleep(2000);
			gatewaysPage.clickOngatewayshow10(); // select show 10
			Thread.sleep(4000);

		}

		@When("^User clicks on Show 20 button$")
		public void user_clicks_on_show_20_button() throws Throwable {
			gatewaysPage.clickOngatewayshowdropdown(); // show drop down
			Thread.sleep(2000);
			gatewaysPage.clickOngatewayshow20(); /// select show 20
			Thread.sleep(4000);
		}

		@When("^User clicks on Show 50 button$")
		public void user_clicks_on_show_50_button() throws Throwable {
			gatewaysPage.clickOngatewayshowdropdown(); // show drop down
			Thread.sleep(2000);
			gatewaysPage.clickOngatewayshow50(); // select show 50
			Thread.sleep(4000);
		}

		@When("^User clicks on Show 100 button$")
		public void user_clicks_on_show_100_button() throws Throwable {
			gatewaysPage.clickOngatewayshowdropdown(); // show drop down
			Thread.sleep(2000);
			gatewaysPage.clickOngatewayshow100(); // select show 100
			Thread.sleep(4000);

		}

		@When("^User clicks on Sync Application button$")
		public void user_clicks_on_sync_application_button() throws Throwable {
			// driver.findElement(By.xpath("//mat-expansion-panel-header/span[1]/mat-panel-description[1]/div[1]/div[6]"))
			// .click();
			gatewaysPage.clickOngatewaysyncapp();
			Thread.sleep(4000);
		}

		@When("^User clicks on Disable icon$")
		public void user_clicks_on_disable_icon() throws Throwable {
			/*
			 * driver.findElement(By.xpath(
			 * "//mat-tab-body/div[1]/div[2]/mat-grid-list[1]/div[1]/mat-grid-tile[2]/figure[1]/mat-card[1]/div[1]/div[1]/mat-slide-toggle[1]/label[1]/div[1]/div[1]/div[1]"
			 * )) .click();
			 */
			applicationPage.clickOnapplicationdisabletoggle(); // user disables the application
			Thread.sleep(4000);
		}

		@When("^User clicks on Enable icon$")
		public void user_clicks_on_enable_icon() throws Throwable {
			/*
			 * driver.findElement(By.xpath(
			 * "//mat-tab-body/div[1]/div[2]/mat-grid-list[1]/div[1]/mat-grid-tile[2]/figure[1]/mat-card[1]/div[1]/div[1]/mat-slide-toggle[1]/label[1]/div[1]/div[1]/div[1]"
			 * )) .click();
			 */
			Thread.sleep(2000);
			applicationPage.clickOnapplicationenabletoggle(); // user enables the application
			Thread.sleep(4000);
		}

		@When("^User clicks on Name button inside Application tab$")
		public void user_clicks_on_name_button_inside_application_tab() throws Throwable {
			/*
			 * driver.findElement(By.xpath(
			 * "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-applications[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[3]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]"
			 * )) .click(); Thread.sleep(1000); driver.findElement(By.xpath(
			 * "//body/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[2]/span[1]")).click();
			 */
			Thread.sleep(2000);
			applicationPage.clickOnapplicationnametimedropdown(); // user clicks on name and created time dropdown box
			Thread.sleep(2000);
			applicationPage.clickOnapplicationnameoption(); // user selects name option
			Thread.sleep(4000);
		}

		@When("^User clicks on Created Time button inside Application tab$")
		public void user_clicks_on_created_time_button_inside_application_tab() throws Throwable {
			/*
			 * driver.findElement(By.xpath(
			 * "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-applications[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[3]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]"
			 * )) .click(); Thread.sleep(1000);
			 * driver.findElement(By.xpath("//span[contains(text(),'Created Time')]")).click
			 * ();
			 */
			applicationPage.clickOnapplicationnametimedropdown();
			Thread.sleep(1000);
			applicationPage.clickOnapplicationcreatedtimeoption(); // user selects created time option
			Thread.sleep(4000);
		}

		@When("^User clicks on Sorted in Ascending arrow inside Application tab$")
		public void user_clicks_on_sorted_in_ascending_arrow_inside_application_tab() throws Throwable {
			/*
			 * driver.findElement(By.xpath(
			 * "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-applications[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[4]/div[1]/div[1]/i[1]"
			 * )) .click();
			 */
			applicationPage.clickOnapplicationsortedascend(); // user clicks on ascending order arrow
			Thread.sleep(4000);
		}

		@When("^User clicks on Sorted in Decending arrow inside Application tab$")
		public void user_clicks_on_sorted_in_decending_arrow_inside_application_tab() throws Throwable {
			/*
			 * driver.findElement(By.xpath(
			 * "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-applications[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[4]/div[1]/div[1]/i[1]"
			 * )) .click();
			 */
			applicationPage.clickOnapplicationsorteddecend(); // user clicks on descending order arrow
			Thread.sleep(4000);
		}

		@When("^User clicks on Show 10 button inside Application tab$")
		public void user_clicks_on_show_10_button_inside_application_tab() throws Throwable {
			/*
			 * driver.findElement(By.xpath(
			 * "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-applications[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[6]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]"
			 * )) .click(); Thread.sleep(2000); driver.findElement(By.xpath(
			 * "/html[1]/body[1]/div[2]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]"))
			 * .click();
			 */
			applicationPage.clickOnapplicationshowdropdown(); // user selects show dropdown
			Thread.sleep(2000);
			applicationPage.clickOnapplicationshow10option(); // user selects show 10 option
			Thread.sleep(6000);
		}

		@When("^User clicks on Show 20 button inside Application tab$")
		public void user_clicks_on_show_20_button_inside_application_tab() throws Throwable {
			/*
			 * driver.findElement(By.xpath(
			 * "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-applications[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[6]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]"
			 * )) .click(); Thread.sleep(2000);
			 * driver.findElement(By.xpath("//span[contains(text(),'Show 20')]")).click();
			 */
			applicationPage.clickOnapplicationshowdropdown();
			Thread.sleep(2000);
			applicationPage.clickOnapplicationshow20option(); // user selects show 20 option
			Thread.sleep(6000);
		}

		@When("^User clicks on Show 50 button inside Application tab$")
		public void user_clicks_on_show_50_button_inside_application_tab() throws Throwable {
			/*
			 * driver.findElement(By.xpath(
			 * "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-applications[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[6]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]"
			 * )) .click(); Thread.sleep(2000);
			 * driver.findElement(By.xpath("//span[contains(text(),'Show 50')]")).click();
			 */
			applicationPage.clickOnapplicationshowdropdown();
			Thread.sleep(2000);
			applicationPage.clickOnapplicationshow50option(); // user selects show 50 option
			Thread.sleep(6000);

		}

		@When("^User clicks on Show 100 button inside Application tab$")
		public void user_clicks_on_show_100_button_inside_application_tab() throws Throwable {
			/*
			 * driver.findElement(By.xpath(
			 * "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-applications[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[6]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]"
			 * )) .click(); Thread.sleep(2000);
			 * driver.findElement(By.xpath("//span[contains(text(),'Show 100')]")).click();
			 */
			applicationPage.clickOnapplicationshowdropdown();
			Thread.sleep(2000);
			applicationPage.clickOnapplicationshow100option(); // user selects show 100 option
			Thread.sleep(6000);
		}

		@When("^User clicks on Next page button inside Application tab$")
		public void user_clicks_on_next_page_button_inside_application_tab() throws Throwable {
			/*
			 * driver.findElement(By.xpath(
			 * "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-applications[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[7]/button[2]/i[1]"
			 * )) .click();
			 */
			applicationPage.clickOnapplicationnextpagebutton(); // user goes to next page
			Thread.sleep(4000);
		}

		@When("^User clicks on Previous page button inside Application tab$")
		public void user_clicks_on_previous_page_button_inside_application_tab() throws Throwable {
			/*
			 * driver.findElement(By.xpath(
			 * "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-applications[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[7]/button[1]/i[1]"
			 * )) .click();
			 */
			applicationPage.clickOnapplicationpreviouspagebutton(); // user goes to previous page
			Thread.sleep(4000);
		}

		@When("^User enables Direct access toggle for web application$")
		public void user_enables_direct_access_toggle_for_web_application() throws Throwable {
			// driver.findElement(By.xpath("//span[contains(text(),'Direct
			// Access')]")).click();
			Thread.sleep(4000);
			applicationPage.clickOnapplicationdirectaccesstoggle(); // direct access toggle button enable
			Thread.sleep(4000);
		}

		@When("^User clicks on Update application button$")
		public void user_clicks_on_update_application_button() throws Throwable {
			WebElement update_app_button = driver.findElement(By.xpath("//span[contains(text(),'Update Application')]"));
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].scrollIntoView();", update_app_button);
			Thread.sleep(2000);
			// driver.findElement(By.xpath("//span[contains(text(),'Update
			// Application')]")).click();
			applicationPage.clickOnupdateapplicationbutton(); // click on update application button
			Thread.sleep(4000);
		}

		@When("^User disables Direct access toggle for web application$")
		public void user_disables_direct_access_toggle_for_web_application() throws Throwable {
			// driver.findElement(By.xpath("//span[contains(text(),'Direct
			// Access')]")).click();
			Thread.sleep(4000);
			applicationPage.clickOnapplicationdirectaccesstoggle(); // direct access toggle button disable
			Thread.sleep(4000);
		}

		@When("^User enables Network access toggle for web application$")
		public void user_enables_network_access_toggle_for_web_application() throws Throwable {
			// driver.findElement(By.xpath("//span[contains(text(),'Enable Network
			// Access')]")).click();
			Thread.sleep(4000);
			applicationPage.clickOnapplicationnetworkaccesstoggle(); // network access toggle enable
			Thread.sleep(6000);
		}

		@When("^User enters cidr value for web application$")
		public void user_enters_cidr_value_for_web_application() throws Throwable {
			/*
			 * WebElement cidr_webapp =
			 * driver.findElement(By.xpath("//input[@placeholder='Enter cidr Hosts']"));
			 * cidr_webapp.click(); cidr_webapp.sendKeys("192.168.10.15/32");
			 * cidr_webapp.sendKeys(Keys.ENTER); Thread.sleep(2000); Thread.sleep(4000);
			 */
			applicationPage.clickOnapplicationnetworkaccesscidrenter();
			applicationPage.enterapplicationcidrvalue(getAppcidrperimtr()); // enter cidr value
			WebElement cidr_webapp = driver.findElement(By.xpath("//input[@placeholder='Enter cidr Hosts']"));
			cidr_webapp.sendKeys(Keys.ENTER);
			Thread.sleep(4000);
		}

		@When("^User removes cidr value for web application$")
		public void user_removes_cidr_value_for_web_application() throws Throwable {
			// driver.findElement(By.xpath("//mat-icon[contains(text(),'cancel')]")).click();
			Thread.sleep(4000);
			applicationPage.clickOnapplicationnetworkaccessCidrremove(); // remove cidr value
			Thread.sleep(4000);
		}

		@When("^User disables Network access toggle for web application$")
		public void user_disables_network_access_toggle_for_web_application() throws Throwable {
			// driver.findElement(By.xpath("//span[contains(text(),'Enable Network
			// Access')]")).click();
			Thread.sleep(4000);
			applicationPage.clickOnapplicationnetworkaccesstoggle(); // network access toggle disable
			Thread.sleep(6000);
		}

		@When("^User enables Legacy IE Mode for web application$")
		public void user_enables_legacy_ie_mode_for_web_application() throws Throwable {
			// driver.findElement(By.xpath("//span[contains(text(),'Legacy IE
			// Mode')]")).click();
			Thread.sleep(4000);
			applicationPage.clickOnapplicationlegacyIEtoggle(); // legacy IE toggle enable
			Thread.sleep(4000);
		}

		@When("^User disables Legacy IE Mode toggle for web application$")
		public void user_disables_legacy_ie_mode_toggle_for_web_application() throws Throwable {
			// driver.findElement(By.xpath("//span[contains(text(),'Legacy IE
			// Mode')]")).click();
			Thread.sleep(4000);
			applicationPage.clickOnapplicationlegacyIEtoggle(); // legacy IE toggle disable
			Thread.sleep(4000);
		}

		@When("^User enables Prevent client check toggle for web application$")
		public void user_enables_prevent_client_check_toggle_for_web_application() throws Throwable {
			// driver.findElement(By.xpath("//span[contains(text(),'Prevent Client
			// Checks')]")).click();
			Thread.sleep(4000);
			applicationPage.clickOnapplicationpreventclientchecktoggle(); // enable prevent client check toggle
			Thread.sleep(4000);
		}

		@When("^User disables Prevent client check toggle for web application$")
		public void user_disables_prevent_client_check_toggle_for_web_application() throws Throwable {
			// driver.findElement(By.xpath("//span[contains(text(),'Prevent Client
			// Checks')]")).click();
			Thread.sleep(4000);
			applicationPage.clickOnapplicationpreventclientchecktoggle(); // disable prevent client check toggle
			Thread.sleep(4000);
		}

		@When("^User enables Block Clipboard Access toggle for web application$")
		public void user_enables_block_clipboard_access_toggle_for_web_application() throws Throwable {
			// driver.findElement(By.xpath("//span[contains(text(),'Block Clipboard
			// Access')]")).click();
			Thread.sleep(4000);
			applicationPage.clickOnapplicationblockClipAccesstoggle(); // enable block clipboard toggle
			Thread.sleep(4000);
		}

		@When("^User disables Block Clipboard Access toggle for web application$")
		public void user_disables_block_clipboard_access_toggle_for_web_application() throws Throwable {
			// driver.findElement(By.xpath("//span[contains(text(),'Block Clipboard
			// Access')]")).click();
			Thread.sleep(4000);
			applicationPage.clickOnapplicationblockClipAccesstoggle(); // disable block clipboard toggle
			Thread.sleep(4000);
		}

		@When("^User enables Block Popup toggle for web application$")
		public void user_enables_block_popup_toggle_for_web_application() throws Throwable {
			// driver.findElement(By.xpath("//span[contains(text(),'Block
			// Pop-ups')]")).click();
			Thread.sleep(4000);
			applicationPage.clickOnapplicationBlockpopuptoggle(); // enable block poppup toggle
			Thread.sleep(4000);
		}

		@When("^User disables Block Popup toggle for web application$")
		public void user_disables_block_popup_toggle_for_web_application() throws Throwable {
			// driver.findElement(By.xpath("//span[contains(text(),'Block
			// Pop-ups')]")).click();
			Thread.sleep(4000);
			applicationPage.clickOnapplicationBlockpopuptoggle(); // disable block poppup toggle
			Thread.sleep(4000);
		}

		@When("^User enables Block Download toggle for web application$")
		public void user_enables_block_download_toggle_for_web_application() throws Throwable {
			// driver.findElement(By.xpath("//span[contains(text(),'Block
			// Downloads')]")).click();
			Thread.sleep(4000);
			applicationPage.clickOnapplicationBlockdownloadtoggle(); // enable block download toggle
			Thread.sleep(4000);
		}

		@When("^User disables Block Download toggle for web application$")
		public void user_disables_block_download_toggle_for_web_application() throws Throwable {
			// driver.findElement(By.xpath("//span[contains(text(),'Block
			// Downloads')]")).click();
			Thread.sleep(4000);
			applicationPage.clickOnapplicationBlockdownloadtoggle(); // disable block download toggle
			Thread.sleep(4000);
		}

		@When("^User enables Hide Address Bar toggle for web application$")
		public void user_enables_hide_address_bar_toggle_for_web_application() throws Throwable {
			// driver.findElement(By.xpath("//span[contains(text(),'Hide Address
			// Bar')]")).click();
			Thread.sleep(4000);
			applicationPage.clickOnapplicationHideAddresstoggle(); // enable hide address bar toggle
			Thread.sleep(4000);
		}

		@When("^User disables Hide Address Bar toggle for web application$")
		public void user_disables_hide_address_bar_toggle_for_web_application() throws Throwable {
			// driver.findElement(By.xpath("//span[contains(text(),'Hide Address
			// Bar')]")).click();
			Thread.sleep(4000);
			applicationPage.clickOnapplicationHideAddresstoggle(); // disable hide address bar toggle
			Thread.sleep(4000);
		}

		@When("^User enables Block Screen Capture toggle for web application$")
		public void user_enables_block_screen_capture_toggle_for_web_application() throws Throwable {
			// driver.findElement(By.xpath("//span[contains(text(),'Block Screen
			// Capture')]")).click();
			Thread.sleep(4000);
			applicationPage.clickOnapplicationBlockScreenCapturetoggle(); // enable block screen capture toggle
			Thread.sleep(4000);
		}

		@When("^User disables Block Screen Capture toggle for web application$")
		public void user_disables_block_screen_capture_toggle_for_web_application() throws Throwable {
			// driver.findElement(By.xpath("//span[contains(text(),'Block Screen
			// Capture')]")).click();
			Thread.sleep(4000);
			applicationPage.clickOnapplicationBlockScreenCapturetoggle(); // disable block screen capture toggle
			Thread.sleep(4000);
		}

		@When("^User enables Record Application Screen toggle for web application$")
		public void user_enables_record_application_screen_toggle_for_web_application() throws Throwable {
			// driver.findElement(By.xpath("//span[contains(text(),'Record Application
			// Screen')]")).click();
			Thread.sleep(4000);
			applicationPage.clickOnapplicationRecordAppScreentoggle(); // enable record application toggle
			Thread.sleep(4000);
		}

		@When("^User disables Record Application Screen toggle for web application$")
		public void user_disables_record_application_screen_toggle_for_web_application() throws Throwable {
			// driver.findElement(By.xpath("//span[contains(text(),'Record Application
			// Screen')]")).click();
			Thread.sleep(4000);
			applicationPage.clickOnapplicationRecordAppScreentoggle(); // disable record application screen toggle
			Thread.sleep(4000);
		}


	    @When("^User selects SSH Application to add$")
	    public void user_selects_ssh_application_to_add() throws Throwable {
			Thread.sleep(4000);
			applicationPage.clickOnsshapplicationselect(); // Select the SSH application for adding
			Thread.sleep(4000);
	    }
	    @When("^User enters Application name$")
	    public void user_enters_application_name() throws Throwable {
			Thread.sleep(4000);
	    	applicationPage.enterappsnameadding(getAppsnameenter()); // enter app name
			Thread.sleep(4000);
	    }

	    @When("^User enters Application Hostname$")
	    public void user_enters_application_hostname() throws Throwable {
	    	Thread.sleep(4000);
	    	applicationPage.enterappshostname(getApphostname()); // enter hostname value
			Thread.sleep(4000);
	    }

	    @When("^User selects RDP Application to add$")
	    public void user_selects_rdp_application_to_add() throws Throwable {
	    	Thread.sleep(4000);
			applicationPage.clickOnrdpapplicationselect(); // Select the RDP application for adding
			Thread.sleep(4000);
	    }
	    @When("^User selects Fileshare Application to add$")
	    public void user_selects_fileshare_application_to_add() throws Throwable {
	    	Thread.sleep(4000);
			applicationPage.clickOnfileshareapplicationselect(); // Select the FS application for adding
			Thread.sleep(4000);
	    }
	    @When("^User enters Shared Folder path$")
	    public void user_enters_shared_folder_path() throws Throwable {
	    	Thread.sleep(4000);
	    	applicationPage.enterfileshareappfolder(getfilesharefolderpath()); // enter shared folder path value
			Thread.sleep(4000);
	    }

	    @When("^User selects Network Application to add$")
	    public void user_selects_network_application_to_add() throws Throwable {
	    	Thread.sleep(4000);
			applicationPage.clickOnnetworkapplicationselect(); // Select the Network application for adding
			Thread.sleep(4000);
	    }

	    @When("^User clicks on protocol dropdown$")
	    public void user_clicks_on_protocol_dropdown() throws Throwable {
	    	Thread.sleep(4000);
			applicationPage.clickOnnetworkappprotocoldropdown(); // Select the Network application protocol dropdown
			Thread.sleep(4000);
	    }

	    @When("^User selects TCP protocol$")
	    public void user_selects_tcp_protocol() throws Throwable {
	    	Thread.sleep(4000);
			applicationPage.clickOnnetworkappprotocoldTCPoption(); //Network application TCP protocol select
			Thread.sleep(4000);
	    }

	    @When("^User selects UDP protocol$")
	    public void user_selects_udp_protocol() throws Throwable {
	    	Thread.sleep(4000);
			applicationPage.clickOnnetworkappprotocoldUDPoption(); //Network application UDP protocol select
			Thread.sleep(4000);
	    }

	    @When("^User selects ICMP protocol$")
	    public void user_selects_icmp_protocol() throws Throwable {
	    	Thread.sleep(4000);
			applicationPage.clickOnnetworkappprotocoldICMPoption(); //Network application ICMP protocol select
			Thread.sleep(4000);
	    }

	    @When("^User Enters IP address for Network app$")
	    public void user_enters_ip_address_for_network_app() throws Throwable {
	    	Thread.sleep(4000);
	    	applicationPage.enternetworkappIDadd(getnetworkappIP()); 
			Thread.sleep(4000);
	    }

	    @When("^User Enters Port number for Network app$")
	    public void user_enters_port_number_for_network_app() throws Throwable {
	    	Thread.sleep(4000);
	    	applicationPage.enternetworkappPortnumberadd(getnetworkappPort()); 
			Thread.sleep(4000);
	    }

	    @When("^User clicks on Save button for Network app$")
	    public void user_clicks_on_save_button_for_network_app() throws Throwable {
	    	Thread.sleep(4000);
			applicationPage.clickOnnetworkappsavebutton(); 
			Thread.sleep(4000);
	    }


		
	    
	    
		
	    
	    
	    
}
