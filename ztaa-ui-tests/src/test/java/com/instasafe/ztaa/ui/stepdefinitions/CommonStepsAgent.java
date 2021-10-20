package com.instasafe.ztaa.ui.stepdefinitions;

import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonStepsAgent {
	
	@Given("^User launched ZTAA Agent$")
    public void user_launched_ztaa_agent() throws Throwable {
		
		System.setProperty("webdriver.chrome.driver",
				"/Users/pradipbisoi/Documents/Others/Instasafe/QA/Automation/ztaa-ui-tests/src/test/java/drivers/chrome/chromedriver83");

		ChromeOptions electronOption = new ChromeOptions();

		electronOption.setBinary(
				"/Applications/Zero Trust Access Client Beta.app/Contents/MacOS/Zero Trust Access Client Beta");

		DesiredCapabilities capability = new DesiredCapabilities();
		capability.setCapability(ChromeOptions.CAPABILITY, electronOption);

		List<String> webview = Collections.singletonList("webview");
		electronOption.setExperimentalOption("windowTypes", webview);

		WebDriver driver = new ChromeDriver(electronOption);

		Thread.sleep(10000);

		String currentWindow = driver.getWindowHandle(); // will keep current window to switch back
		Set<String> handles = driver.getWindowHandles();
		Thread.sleep(7000);
		for (String winHandle : handles) {

			Thread.sleep(5000);
			// the below code is to get into the webview for login
			if (driver.switchTo().window(winHandle).getTitle().equals("Software Defined Perimeter")) {

				Thread.sleep(5000);

				WebDriverWait wait = new WebDriverWait(driver, 20);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("focususername")));
				WebElement myElement = driver.findElement(By.id("focususername"));
				myElement.sendKeys("pooja@instasafe.com");

				Thread.sleep(3000);

				WebElement element_username_btn_continue = driver.findElement(By.xpath(
						"//button[@class='login-button mat-raised-button mat-button-base ng-tns-c2-0 ng-star-inserted']"));
				element_username_btn_continue.click();

				Thread.sleep(5000);
				WebElement element_password = driver.findElement(By.id("focuspassword"));
				element_password.sendKeys("Pooja@89#$");

				Thread.sleep(3000);

				WebElement element_password_btn_continue = driver.findElement(By.xpath(
						"//button[@class='login-button mat-raised-button mat-button-base ng-tns-c2-0 ng-star-inserted']"));
				element_password_btn_continue.click();

				Thread.sleep(30000);

				Set<String> windows1 = driver.getWindowHandles();

				Thread.sleep(3000);
				// the below code is to get into the webview for getting into the Application
				// List webview
				for (String window : windows1) {
					driver.switchTo().window(window);

					if (driver.switchTo().window(window).getTitle().equals("Application List")) {

						// the app path is from the qa tenant pooja, profile pooja@instsafe.com
						WebElement element_appln_tcp_youtube = driver.findElement(By.xpath(
								"/html/body/div[1]/div/div/div/div/div/div/div[4]/div[2]/div[1]/div/div[20]/div/img"));
						element_appln_tcp_youtube.click();
						Thread.sleep(20000);

						WebElement element_logout = driver.findElement(By.id("logout-user"));
						element_logout.click();
						Thread.sleep(5000);
					}
				}

				break;
			}

			else {
				driver.switchTo().window(currentWindow);

			}
		}

		
		driver.quit();
		

	}
        
    

    @When("^User enters Username and clicks on Continue button in ZTAA Agent$")
    public void user_enters_username_and_clicks_on_continue_button_in_ztaa_agent() throws Throwable {
        
    }

    @When("^User enters Password and clicks on Continue button in ZTAA Agent$")
    public void user_enters_password_and_clicks_on_continue_button_in_ztaa_agent() throws Throwable {
        
    }

    @Then("^Verify ZTAA Agent is launched$")
    public void verify_ztaa_agent_is_launched() throws Throwable {
       
    }

    @Then("^User should get Agent home page$")
    public void user_should_get_agent_home_page() throws Throwable {
     
    }

    @Then("^User should logout of ZTAA Agent$")
    public void user_should_logout_of_ztaa_agent() throws Throwable {
        
    }

    @Then("^User should close the ZTAA Agent$")
    public void user_should_close_the_ztaa_agent() throws Throwable {
        
    }


}
