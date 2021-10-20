package com.instasafe.ztaa.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.instasafe.ztaa.ui.utils.TestUtils;

public class DevicesPage {
	
	
	@FindBy(xpath = "//a[text()=' Devices ']")
	private WebElement devices ;
	
	
	@FindBy(xpath = "//i[@class='fa fa-download']")
	private WebElement csvdownloaddevice ;
	
	
	@FindBy(xpath = "//i[@class='fa fa-download']")
	private WebElement csvdownloaddeviceapprovals ;
	
	@FindBy(xpath = "//div[text()=' LAPTOP-9C48QO5F ']")
	private WebElement deviceselect ;
	
	
	
	@FindBy(xpath = "(//span[text()=' Edit '])")
	private WebElement deviceeditbutton ;
	
	@FindBy(xpath = "(//div[@class='mat-tab-label-content'])[4]")
	private WebElement actiontabofdevice ;
	
	@FindBy(xpath = "(//div[@class='mat-slide-toggle-thumb'])[3]")
	private WebElement blockunblockdevice ;
	

	@FindBy(xpath = "(//div[@class='mat-tab-label-content'])[3]")
	private WebElement NetworkInterfacesofdevice ;
	
	@FindBy(xpath = "(//div[@class='mat-tab-label-content'])[2]")
	private WebElement attributestabofdevice ;
	

	
	@FindBy(xpath = "(//a[text()=' Approvals '])")
	private WebElement approvalstab ;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-device-layout[1]/app-inventory[1]/mat-card[1]/section[1]/div[1]/div[7]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]")	
	private WebElement  devicesshowlistToggle;
	
	
	@FindBy(xpath = "(//span[text()='Show 10'])[2]")	
	private WebElement  show10Devices;	
		
	@FindBy(xpath = "(//span[text()='Show 20'])[1]")	
	private WebElement  show20Devices;	
		
	@FindBy(xpath = "(//span[text()='Show 50'])[1]")	
	private WebElement  show50Devices;	
		
	@FindBy(xpath = "(//span[text()='Show 100'])[1]")	
	private WebElement  show100Devices;	
	
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-device-layout[1]/app-inventory[1]/mat-card[1]/section[1]/div[1]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]")	
	private WebElement  DevicessortingToggle;	
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-device-layout[1]/app-approval[1]/div[1]/div[1]/section[1]/div[1]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]")	
	private WebElement  sortbyDeviceApprovalsToggle;	
	
	
	@FindBy(xpath = "(//span[text()='Created Time'])[1]")	
	private WebElement  CreatedTimeDeviceApprovals;	
	
	
	@FindBy(xpath = "(//span[text()='User Name'])[1]")	
	private WebElement  UserNameDevicesApprovals;	
	
	@FindBy(xpath = "(//span[text()='Device Name'])[1]")	
	private WebElement  DeviceNameDevicesApprovals;	
	
	@FindBy(xpath = "(//span[text()='Created Time'])[1]")	
	private WebElement  CreatedTimeDevice;	
	

	@FindBy(xpath = "(//span[text()='Name'])[1]")	
	private WebElement  NameDevices;	
	
	@FindBy(xpath = "//i[@class='fa fa-long-arrow-alt-up ng-star-inserted']")	
	private WebElement  sortedinAscending;	
	
	@FindBy(xpath = "//i[@class='fa fa-long-arrow-alt-down ng-star-inserted']")	
	private WebElement  sortedinDecending;	
	
	/*
	 * This method clicks on the 'Devices' tab in Perimeter Management
	 */
	public void clickOnDeviceTab() {
		TestUtils.click(devices);
	}
	
		
	
	/*
	 * This method clicks on the 'CSV Download button ' of device in Perimeter Management
	 */
	public void clickOnCsvDownloadDevice() {
		TestUtils.waitForElementPresent(csvdownloaddevice);
		TestUtils.click(csvdownloaddevice);
	}
	
	
	
	/*
	 * This method clicks on the 'CSV Download button ' of device in Perimeter Management
	 */
	public void clickOnCsvDownloadDeviceApprovals() {
		TestUtils.waitForElementPresent(csvdownloaddeviceapprovals);
		TestUtils.click(csvdownloaddeviceapprovals);
	}
	/*
	 * This method clicks on the 'Devices'and select device for enable  in Perimeter Management
	 */
	public void clickOnDeviceselect() {
		TestUtils.click(deviceselect);
	}
	
	
	/*
	 * This method clicks on the 'Devices' tab in Perimeter Management
	 */
	public void clickOnDeviceActions() {
		TestUtils.click(actiontabofdevice);
	}

	
	/*
	
	
	/*
	 * This method clicks on the 'Devices' tab in Perimeter Management
	 */
	public void clickOnDeviceApprovals() {
		TestUtils.click(approvalstab);
	}
	
	
	
	
	
	
	/*
	 * This method clicks on the 'Devices' Edit  in Perimeter Management
	 */
	public void clickOnDeviceedit() {
		TestUtils.click(deviceeditbutton);
	}
	
	
	/*
	 * This method clicks on the 'Attributes tab under Devices ( Perimeter Management)
	 */
	public void clickOnDeviceAttributesTab() {
		TestUtils.waitForElementPresent(attributestabofdevice);
		TestUtils.click(attributestabofdevice);
	}
	
	/*
	 * This method clicks on the 'Netwok Interfaces tab under Devices ( Perimeter Management)
	 */
	public void clickOnDeviceNetworkInterfacesTab() {
		TestUtils.waitForElementPresent(NetworkInterfacesofdevice);
		TestUtils.click(NetworkInterfacesofdevice);
	}
	
	/*
	 * This method clicks on the 'Devices' tab in Perimeter Management
	 */
	public void clickOnBlockUnblockDevice() {
		TestUtils.waitForElementPresent(blockunblockdevice);
		TestUtils.click(blockunblockdevice);
	}
	
	
	/*
	
	
	/*	
	 * This method clicks on the Agent Release tab(show list) in Perimeter Management 	
	 */	
	public void clickOnDevicesShowlistToggle() {	
		TestUtils.click(devicesshowlistToggle);	
	}	
		
	
	/*	
	 * This method clicks on the 'show 10 sign in the Agent Release Tab
	 */	
	public void clickOnshow10Devices() {	
		TestUtils.waitForElementPresent(show10Devices);	
		TestUtils.click(show10Devices);	
	}	
	
	
		
	/*	
	 * This method clicks on the 'show 20 sign in the Agent Release Tab
	 */	
	public void clickOnshow20Devices() {	
		TestUtils.waitForElementPresent(show20Devices);	
		TestUtils.click(show10Devices);	
	}	
	
	
	
	/*	
	 * This method clicks on the 'show 50' sign in the Devices Tab
	 */	
	public void clickOnshow50Devices() {	
		TestUtils.waitForElementPresent(show50Devices);	
		TestUtils.click(show50Devices);	
	}	
	
	
	
	/*	
	 * This method clicks on the 'show 100' sign in the Devices Tab
	 */	
	public void clickOnshow100Devices() {	
		TestUtils.waitForElementPresent(show100Devices);	
		TestUtils.click(show100Devices);	
	}	

	
	
	
	/*
	 * This method clicks on the 'sort by option under Devices ( Perimeter Management)
	 */
	public void clickOnsortingToggleDevices() {
		TestUtils.waitForElementPresent(DevicessortingToggle);
		TestUtils.click(DevicessortingToggle);
	}

	
	
	
	
	
	
/*
 * This method clicks on the 'created time under Devices ( Perimeter Management)
 */
public void clickOnCreatedTimeDevices() {
	//TestUtils.waitForElementPresent(CreatedTimeDevice);
	TestUtils.click(CreatedTimeDevice);
}




/*
 * This method clicks on the 'Name under Devices ( Perimeter Management)
 */
public void clickOnNameDevices() {
	TestUtils.waitForElementPresent(NameDevices);
	TestUtils.click(NameDevices);
}


/*
 * This method clicks on the sorted in ascending order' of device in Perimeter Management
 */
public void clickOnAscendingorderDevice() {
	TestUtils.waitForElementPresent(sortedinAscending);
	TestUtils.click(sortedinAscending);
}

/*
 * This method clicks on the sorted in decending order' of device in Perimeter Management
 */
public void clickOnDecendingorderDevice() {
	TestUtils.waitForElementPresent(sortedinDecending);
	TestUtils.click(sortedinDecending);
}

	
	
/*
 * This method clicks on the sort by  Created name ' of device approvals in Perimeter Management
 */
public void clickOnSortbyCreatedtimeDeviceApprovals() {
	TestUtils.waitForElementPresent(CreatedTimeDeviceApprovals);
	TestUtils.click(CreatedTimeDeviceApprovals);
}


/*
 * This method clicks on the sort by  User Name ' of device approvals in Perimeter Management
 */
public void clickOnSortbyUserNameDeviceApprovals() {
	TestUtils.waitForElementPresent(UserNameDevicesApprovals);
	TestUtils.click(UserNameDevicesApprovals);
}


/*
 * This method clicks on the sort by  Device Name ' of device approvals in Perimeter Management
 */
public void clickOnSortbyDeviceNameDeviceApprovals() {
	TestUtils.waitForElementPresent(DeviceNameDevicesApprovals);
	TestUtils.click(DeviceNameDevicesApprovals);
}


/*
 * This method clicks on the 'sort by option(toggle) under Devices Approvals( Perimeter Management)
 */
public void clickOnsortingToggleDevicesApprovals() {
	TestUtils.waitForElementPresent(sortbyDeviceApprovalsToggle);
	TestUtils.click(sortbyDeviceApprovalsToggle);
}



}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

