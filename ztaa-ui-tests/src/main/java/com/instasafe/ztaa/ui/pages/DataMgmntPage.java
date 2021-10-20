package com.instasafe.ztaa.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.instasafe.ztaa.ui.utils.TestUtils;

public class DataMgmntPage {

	@FindBy(xpath = "(//a[@class='mat-tooltip-trigger ng-star-inserted'])[6]")
	private WebElement configauration;
	
	@FindBy(xpath = "//a[contains(text(),'Data Management')]")
	private WebElement datamanagementtab;


	@FindBy(xpath = "//button[@class='col-12']")
	private WebElement datamanagementaddicon;

	@FindBy(xpath = "//input[@data-placeholder='Select Variable']")
	private WebElement datamgmntSelectvariable;

	@FindBy(xpath = "(//span[@class='mat-option-text'])[1]")
	private WebElement datamgmntserialnumber;

	@FindBy(xpath = "//input[@data-placeholder='Enter Dataset Name']")
	private WebElement datasetname;

	@FindBy(xpath = "//span[contains(text(),'Add Dataset')]")
	private WebElement adddatasetbutton;

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement searchdataset;

	@FindBy(xpath = "//mat-expansion-panel-header/span[1]/mat-panel-title[1]")
	private WebElement selectsearchedDataset;

	@FindBy(xpath = "//div[contains(text(),'Records')]")
	private WebElement datasetrecordtab;

	@FindBy(xpath = "//span[contains(text(),'Edit')]")
	private WebElement datamgmntedittab;

	@FindBy(xpath = "//button[@class='mat-ripple col-12 header-block-box']")
	private WebElement recordaddbutton;

	@FindBy(xpath = "//input[@data-placeholder='Record value']")
	private WebElement addrecordvalue;

	@FindBy(xpath = "//mat-icon[contains(text(),'check')]")
	private WebElement addrecordtickmark;

	@FindBy(xpath = "//div[contains(text(),'Actions')]")
	private WebElement datasetactionstab;

	@FindBy(xpath = "//mat-icon[contains(text(),'delete_forever')]")
	private WebElement datasetdeleteicon;

	@FindBy(xpath = "//button[contains(text(),'Yes, delete')]")
	private WebElement datasetdeleteconfirm;
	
	@FindBy(xpath = "//*[text()='OK']")
	private WebElement datasetdeleted;

	@FindBy(xpath = "(//span[@class='mat-option-text'])[2]")
	private WebElement datamgmntlocation;

	@FindBy(xpath = "(//span[@class='mat-option-text'])[3]")
	private WebElement datamgmntOSfamily;

	@FindBy(xpath = "(//span[@class='mat-option-text'])[4]")
	private WebElement datamgmntOSMainVersion;

	@FindBy(xpath = "(//span[@class='mat-option-text'])[5]")
	private WebElement datamgmntOSMinorVersion;

	@FindBy(xpath = "(//span[@class='mat-option-text'])[6]")
	private WebElement datamgmntOSBuildVersion;

	@FindBy(xpath = "(//span[@class='mat-option-text'])[7]")
	private WebElement datamgmntSysDomainName;

	@FindBy(xpath = "(//span[@class='mat-option-text'])[8]")
	private WebElement datamgmntMACaddress;

	@FindBy(xpath = "(//span[@class='mat-option-text'])[9]")
	private WebElement datamgmntAVInstalledName;

	@FindBy(xpath = "(//span[@class='mat-option-text'])[10]")
	private WebElement datamgmntAVEnabledName;

	@FindBy(xpath = "(//span[@class='mat-option-text'])[11]")
	private WebElement datamgmntAVUpdatedName;

	@FindBy(xpath = "(//span[@class='mat-option-text'])[13]")
	private WebElement datamgmntDateTime;

	@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container'])[2]")
	private WebElement datetimeMondaycheckbox;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-configuration-layout[1]/app-data-management[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/div[2]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement datetimeMondayStartTime;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-configuration-layout[1]/app-data-management[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/div[2]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[3]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement datetimeMondayEndTime;

	@FindBy(xpath = "//span[contains(text(),'Add DateTime Check')]")
	private WebElement datetimeAddbutton;

	@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container'])[3]")
	private WebElement datetimeTuesdaycheckbox;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-configuration-layout[1]/app-data-management[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/div[2]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement datetimeTuesdayStartTime;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-configuration-layout[1]/app-data-management[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/div[2]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[2]/td[3]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement datetimeTuesdayEndTime;

	@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container'])[4]")
	private WebElement datetimeWednesdaycheckbox;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-configuration-layout[1]/app-data-management[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/div[2]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement datetimeWednesdayStartTime;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-configuration-layout[1]/app-data-management[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/div[2]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[3]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement datetimeWednesdayEndTime;

	@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container'])[5]")
	private WebElement datetimeThursdaycheckbox;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-configuration-layout[1]/app-data-management[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/div[2]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement datetimeThursdayStartTime;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-configuration-layout[1]/app-data-management[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/div[2]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[3]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement datetimeThursdayEndTime;

	@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container'])[6]")
	private WebElement datetimeFridaycheckbox;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-configuration-layout[1]/app-data-management[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/div[2]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement datetimeFridayStartTime;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-configuration-layout[1]/app-data-management[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/div[2]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[5]/td[3]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement datetimeFridayEndTime;

	@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container'])[7]")
	private WebElement datetimeSaturdaycheckbox;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-configuration-layout[1]/app-data-management[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/div[2]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement datetimeSaturdayStartTime;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-configuration-layout[1]/app-data-management[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/div[2]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[6]/td[3]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement datetimeSaturdayEndTime;

	@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container'])[8]")
	private WebElement datetimeSundaycheckbox;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-configuration-layout[1]/app-data-management[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/div[2]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[7]/td[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement datetimeSundayStartTime;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-configuration-layout[1]/app-data-management[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/div[2]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[7]/td[3]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement datetimeSundayEndTime;

	@FindBy(xpath = "//mat-icon[contains(text(),'delete')]")
	private WebElement deleteRecordvalue;

	
		
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	


	public void clickOnconfigauration() {
		TestUtils.click(configauration);
	}

	public void clickOndatamanagementtab() {
		TestUtils.click(datamanagementtab);
	}

	public void clickOndatamanagementaddicon() {
		TestUtils.click(datamanagementaddicon);
	}

	public void clickOndatamgmntSelectvariable() {
		TestUtils.click(datamgmntSelectvariable);
	}

	public void clickOndatamgmntserialnumber() {
		TestUtils.click(datamgmntserialnumber);
	}

	public void enterdatasetname(String datasetnameadd) throws InterruptedException {
		TestUtils.waitForElementPresent(datasetname);
		TestUtils.type(datasetname, datasetnameadd);
	}

	public void clickOnadddatasetbutton() {
		TestUtils.click(adddatasetbutton);
	}

	public void entersearchdataset(String datasetsearch) throws InterruptedException {
		TestUtils.waitForElementPresent(searchdataset);
		TestUtils.type(searchdataset, datasetsearch);
	}

	public void clickOnselectsearchedDataset() {
		TestUtils.click(selectsearchedDataset);
	}

	public void clickOndatasetrecordtab() {
		TestUtils.click(datasetrecordtab);
	}

	public void clickOndatamgmntedittab() {
		TestUtils.click(datamgmntedittab);
	}

	public void clickOnrecordaddbutton() {
		TestUtils.click(recordaddbutton);
	}

	public void enteraddrecordvalue(String datasetrecordvalue) throws InterruptedException {
		TestUtils.waitForElementPresent(addrecordvalue);
		TestUtils.type(addrecordvalue, datasetrecordvalue);
	}

	public void clickOnaddrecordtickmark() {
		TestUtils.click(addrecordtickmark);
	}

	public void clickOndatasetactionstab() {
		TestUtils.click(datasetactionstab);
	}
	public void clickOndatasetdeleteicon() {
		TestUtils.click(datasetdeleteicon);
	}
	public void clickOndatasetdeleteconfirm() {
		TestUtils.click(datasetdeleteconfirm);
	}
	public void clickOndatasetdeleted() {
		TestUtils.click(datasetdeleted);
	}
	public void clickOndatamgmntlocation() {
		TestUtils.click(datamgmntlocation);
	}
	public void clickOndatamgmntOSfamily() {
		TestUtils.click(datamgmntOSfamily);
	}
	public void clickOndatamgmntOSMainVersion() {
		TestUtils.click(datamgmntOSMainVersion);
	}
	public void clickOndatamgmntOSMinorVersion() {
		TestUtils.click(datamgmntOSMinorVersion);
	}
	public void clickOndatamgmntOSBuildVersion() {
		TestUtils.click(datamgmntOSBuildVersion);
	}
	public void clickOndatamgmntSysDomainName() {
		TestUtils.click(datamgmntSysDomainName);
	}
	public void clickOndatamgmntMACaddress() {
		TestUtils.click(datamgmntMACaddress);
	}
	public void clickOndatamgmntAVInstalledName() {
		TestUtils.click(datamgmntAVInstalledName);
	}
	public void clickOndatamgmntAVEnabledName() {
		TestUtils.click(datamgmntAVEnabledName);
	}
	public void clickOndatamgmntAVUpdatedName() {
		TestUtils.click(datamgmntAVUpdatedName);
	}
	public void clickOndatamgmntDateTime() {
		TestUtils.click(datamgmntDateTime);
	}
	public void clickOndatetimeMondaycheckbox() {
		TestUtils.click(datetimeMondaycheckbox);
	}

	public void enterdatetimeMondayStartTime(String datastimeStarttime) throws InterruptedException {
		TestUtils.waitForElementPresent(datetimeMondayStartTime);
		TestUtils.type(datetimeMondayStartTime, datastimeStarttime);
	}
	public void enterdatetimeMondayEndTime(String datastimeEndtime) throws InterruptedException {
		TestUtils.waitForElementPresent(datetimeMondayEndTime);
		TestUtils.type(datetimeMondayEndTime, datastimeEndtime);
	}
	public void clickOndatetimeAddbutton() {
		TestUtils.click(datetimeAddbutton);
	}
	public void clickOndatetimeTuesdaycheckbox() {
		TestUtils.click(datetimeTuesdaycheckbox);
	}

	public void enterdatetimeTuesdayStartTime(String datastimeStarttime) throws InterruptedException {
		TestUtils.waitForElementPresent(datetimeTuesdayStartTime);
		TestUtils.type(datetimeTuesdayStartTime, datastimeStarttime);
	}
	public void enterdatetimeTuesdayEndTime(String datastimeEndtime) throws InterruptedException {
		TestUtils.waitForElementPresent(datetimeTuesdayEndTime);
		TestUtils.type(datetimeTuesdayEndTime, datastimeEndtime);
	}
	public void clickOndatetimeWednesdaycheckbox() {
		TestUtils.click(datetimeWednesdaycheckbox);
	}
	public void enterdatetimeWednesdayStartTime(String datastimeStarttime) throws InterruptedException {
		TestUtils.waitForElementPresent(datetimeWednesdayStartTime);
		TestUtils.type(datetimeWednesdayStartTime, datastimeStarttime);
	}
	public void enterdatetimeWednesdayEndTime(String datastimeEndtime) throws InterruptedException {
		TestUtils.waitForElementPresent(datetimeWednesdayEndTime);
		TestUtils.type(datetimeWednesdayEndTime, datastimeEndtime);
	}
	public void clickOndatetimeThursdaycheckbox() {
		TestUtils.click(datetimeThursdaycheckbox);
	}
	public void enterdatetimeThursdayStartTime(String datastimeStarttime) throws InterruptedException {
		TestUtils.waitForElementPresent(datetimeThursdayStartTime);
		TestUtils.type(datetimeThursdayStartTime, datastimeStarttime);
	}
	public void enterdatetimeThursdayEndTime(String datastimeEndtime) throws InterruptedException {
		TestUtils.waitForElementPresent(datetimeThursdayEndTime);
		TestUtils.type(datetimeThursdayEndTime, datastimeEndtime);
	}

	public void clickOndatetimeFridaycheckbox() {
		TestUtils.click(datetimeFridaycheckbox);
	}
	public void enterdatetimeFridayStartTime(String datastimeStarttime) throws InterruptedException {
		TestUtils.waitForElementPresent(datetimeFridayStartTime);
		TestUtils.type(datetimeFridayStartTime, datastimeStarttime);
	}
	public void enterdatetimeFridayEndTime(String datastimeEndtime) throws InterruptedException {
		TestUtils.waitForElementPresent(datetimeFridayEndTime);
		TestUtils.type(datetimeFridayEndTime, datastimeEndtime);
	}

	public void clickOndatetimeSaturdaycheckbox() {
		TestUtils.click(datetimeSaturdaycheckbox);
	}
	public void enterdatetimeSaturdayStartTime(String datastimeStarttime) throws InterruptedException {
		TestUtils.waitForElementPresent(datetimeSaturdayStartTime);
		TestUtils.type(datetimeSaturdayStartTime, datastimeStarttime);
	}
	public void enterdatetimeSaturdayEndTime(String datastimeEndtime) throws InterruptedException {
		TestUtils.waitForElementPresent(datetimeSaturdayEndTime);
		TestUtils.type(datetimeSaturdayEndTime, datastimeEndtime);
	}

	public void clickOndatetimeSundaycheckbox() {
		TestUtils.click(datetimeSundaycheckbox);
	}
	public void enterdatetimeSundayStartTime(String datastimeStarttime) throws InterruptedException {
		TestUtils.waitForElementPresent(datetimeSundayStartTime);
		TestUtils.type(datetimeSundayStartTime, datastimeStarttime);
	}
	public void enterdatetimeSundayEndTime(String datastimeEndtime) throws InterruptedException {
		TestUtils.waitForElementPresent(datetimeSundayEndTime);
		TestUtils.type(datetimeSundayEndTime, datastimeEndtime);
	}

	public void clickOndeleteRecordvalue() {
		TestUtils.click(deleteRecordvalue);
	}
	
	
	
	
	
	
	
	
	

}
