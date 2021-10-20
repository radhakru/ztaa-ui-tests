package com.instasafe.ztaa.ui.core;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestBaseAgent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//Properties p = System.getProperties();
		//p.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/java/driverForApp/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",
				System.getProperty("user.dir")+"/src/main/java/driverForApp/chromedriver.exe");

		ChromeOptions electronOption = new ChromeOptions();
		//File f = new File("C:\\Users\\Administrator\\AppData\\Local\\Programs\\ZTAA_BETA\\Zero Trust Access Client Beta.exe");

		electronOption.setBinary(
				"C:\\Users\\Administrator\\AppData\\Local\\Programs\\ZTAA_BETA\\Zero Trust Access Client Beta.exe");
		//electronOption.setBinary(f);
		Capabilities capability = new DesiredCapabilities();
		System.out.println("1");
		//capability.setCapability(ChromeOptions.CAPABILITY, electronOption);
		
		//List<String> webview = Collections.singletonList("webview");
		List<String> webview = new ArrayList();
		webview.add("webview");
	
		electronOption.setExperimentalOption("windowTypes", webview);
	
		WebDriver driver = new ChromeDriver(electronOption);
		
		Thread.sleep(10000);

		String currentWindow = driver.getWindowHandle(); // will keep current window to switch back
		Set<String> handles = driver.getWindowHandles();
		Thread.sleep(7000);
		System.out.println("2");
		System.out.println(handles);
		
		for (String winHandle : handles) {
			System.out.println(driver.switchTo().window(winHandle).getTitle());
			
			Thread.sleep(5000);
			// the below code is to get into the webview for login
			if (driver.switchTo().window(winHandle).getTitle().equals("Software Defined Perimeter")) {
				driver.manage().window().maximize();
				Thread.sleep(5000);

				WebDriverWait wait = new WebDriverWait(driver, 20);
				System.out.println(3);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("focususername")));
				System.out.println(4);
				WebElement myElement = driver.findElement(By.id("focususername"));
				System.out.println(5);
				myElement.sendKeys("dixit");
				System.out.println(6);
				

				Thread.sleep(3000);

				WebElement element_username_btn_continue = driver.findElement(By.xpath(
						"/html/body/app-root/app-login/div/div[2]/div[2]/div/div[2]/div/div[2]/div/button"));
				System.out.println(7);
				//      //button[@class='login-button mat-raised-button mat-button-base ng-tns-c2-0 ng-star-inserted']   
				element_username_btn_continue.click();

				Thread.sleep(5000);
				WebElement element_password = driver.findElement(By.id("focuspassword"));
				element_password.sendKeys("dixit");

				Thread.sleep(3000);

				WebElement element_password_btn_continue = driver.findElement(By.xpath(
						"/html/body/app-root/app-login/div/div[2]/div[2]/div/div[2]/div/div[3]/div/button"));
			
				//   //button[@class='login-button mat-raised-button mat-button-base ng-tns-c2-0 ng-star-inserted']
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
						/*
						 * WebElement element_appln_tcp_youtube = driver.findElement(By.xpath(
						 * "/html/body/app-root/app-tenant-layout/div/div[2]/app-header/nav/div/div[2]/ul/li[2]/a/img"
						 * )); //
						 * /html/body/div[1]/div/div/div/div/div/div/div[4]/div[2]/div[1]/div/div[20]/
						 * div/img element_appln_tcp_youtube.click(); Thread.sleep(20000);
						 */

						WebElement element_logout = driver.findElement(By.xpath("//*[@id=\"logout-user\"]/img"));
						
						// //*[@id="logout-user"]/img
						
						Thread.sleep(5000);
						System.out.println("Logging out");
						element_logout.click();
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

}
