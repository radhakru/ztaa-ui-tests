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

public class TestBaseAgentPKDixit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Properties p = System.getProperties();
		p.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/main/java/driverForApp/chromedriver.exe");
		
		ChromeOptions electronOption = new ChromeOptions();
		File f = new File("C:\\Users\\Administrator\\AppData\\Local\\Programs\\ZTAA_BETA\\Zero Trust Access Client Beta.exe");

		
		electronOption.setBinary(f);
		DesiredCapabilities capability = new DesiredCapabilities();
		
		capability.setCapability(ChromeOptions.CAPABILITY, electronOption);
		
		//List<String> webview = Collections.singletonList("webview");
		List<String> webview = new ArrayList<String>();
		webview.add("webview");
	
		electronOption.setExperimentalOption("windowTypes", webview);
	
		WebDriver driver = new ChromeDriver(electronOption);
		
		Thread.sleep(10000);

		String currentWindow = driver.getWindowHandle(); // will keep current window to switch back
		Set<String> handles = driver.getWindowHandles();
		Thread.sleep(7000);
	
		
		for (String winHandle : handles) {
			System.out.println(driver.switchTo().window(winHandle).getTitle());
			Thread.sleep(5000);
			
			if (driver.switchTo().window(winHandle).getTitle().equals("Software Defined Perimeter")) {

				Thread.sleep(5000);

				WebDriverWait wait = new WebDriverWait(driver, 20);
			
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("focususername")));
				
				WebElement myElement = driver.findElement(By.id("focususername"));
				
				myElement.sendKeys("dixit");
				
				Thread.sleep(3000);

				WebElement element_username_btn_continue = driver.findElement(By.xpath(
						"/html/body/app-root/app-login/div/div[2]/div[2]/div/div[2]/div/div[2]/div/button"));
				System.out.println(7);
				
				element_username_btn_continue.click();

				Thread.sleep(5000);
				WebElement element_password = driver.findElement(By.id("focuspassword"));
				element_password.sendKeys("dixit");

				Thread.sleep(3000);

				WebElement element_password_btn_continue = driver.findElement(By.xpath(
						"/html/body/app-root/app-login/div/div[2]/div[2]/div/div[2]/div/div[3]/div/button"));
			
				
				element_password_btn_continue.click();

				Thread.sleep(30000);

				Set<String> windows1 = driver.getWindowHandles();

				Thread.sleep(3000);
				
				for (String window : windows1) {
					driver.switchTo().window(window);

					if (driver.switchTo().window(window).getTitle().equals("Application List")) {

						

						WebElement element_logout = driver.findElement(By.xpath("//*[@id=\"logout-user\"]/img"));
						
						
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
