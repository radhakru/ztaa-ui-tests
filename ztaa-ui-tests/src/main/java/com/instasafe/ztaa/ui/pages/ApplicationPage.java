package com.instasafe.ztaa.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.instasafe.ztaa.ui.utils.TestUtils;

public class ApplicationPage {
	
	@FindBy(xpath = "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-perimeter-layout/nav/div[2]/div/div/a[2]")
	private WebElement applicationtabperimtr;

	@FindBy(xpath = "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-perimeter-layout/app-applications/mat-card/mat-card-content/section/div[2]/div[2]/div/button")
	private WebElement applicationaddplusprimtr;

	@FindBy(xpath = "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-perimeter-layout/app-applications/mat-card/mat-card-content/mat-accordion/mat-expansion-panel[1]/div/div/mat-tab-group/div/mat-tab-body/div/div/div/mat-card/div/div[1]/div[1]")
	private WebElement webapplicationselectadd;

	@FindBy(xpath = "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-perimeter-layout/app-applications/mat-card/mat-card-content/mat-accordion/mat-expansion-panel[1]/div/div/mat-tab-group/div/mat-tab-body/div/div/div/mat-card/div/div[1]/mat-form-field[1]/div/div[1]/div/input")
	private WebElement appnameadd;

	@FindBy(xpath = "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-perimeter-layout/app-applications/mat-card/mat-card-content/mat-accordion/mat-expansion-panel[1]/div/div/mat-tab-group/div/mat-tab-body/div/div/div/mat-card/div/div[1]/mat-form-field[2]/div/div[1]/div/input")
	private WebElement appurladd;

	@FindBy(xpath = "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-perimeter-layout/app-applications/mat-card/mat-card-content/mat-accordion/mat-expansion-panel[1]/div/div/mat-tab-group/div/mat-tab-body/div/div/div/mat-card/div/div[2]/button")
	private WebElement addapplicationbutton;

	@FindBy(xpath = "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-perimeter-layout/app-applications/mat-card/mat-card-content/section/div[1]/div[1]/div/input")
	private WebElement appsearchperimtr;

	@FindBy(xpath = "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-perimeter-layout/app-applications/mat-card/mat-card-content/section/div[1]/div[3]/div/mat-button-toggle-group/mat-button-toggle[2]/button/span")
	private WebElement applicationeditbutton;

	@FindBy(xpath = "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-perimeter-layout/app-applications/mat-card/mat-card-content/mat-accordion/mat-expansion-panel/mat-expansion-panel-header/span[1]/mat-panel-title/div/span[2]")
	private WebElement selectapplicationsearchresult;

	@FindBy(xpath = "//div[contains(text(),'Actions')]")
	private WebElement applicationactiontab;

	@FindBy(xpath = "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-perimeter-layout/app-applications/mat-card/mat-card-content/mat-accordion/mat-expansion-panel/div/div/mat-tab-group/div/mat-tab-body[3]/div/div[2]/div/mat-card/div[2]/button/span/mat-icon")
	private WebElement applicationdeleteicon;

	@FindBy(xpath = "//*[text()='Yes, delete']")
	private WebElement applicationdeleteconfirm;

	@FindBy(xpath = "//*[text()='OK']")
	private WebElement applicationdeletedok;

	@FindBy(xpath = "//mat-tab-body/div[1]/div[2]/div[1]/mat-card[1]/div[1]/div[1]/mat-slide-toggle[1]/label[1]/div[1]/div[1]/div[1]")
	private WebElement applicationdisabletoggle;

	@FindBy(xpath = "//mat-tab-body/div[1]/div[2]/div[1]/mat-card[1]/div[1]/div[1]/mat-slide-toggle[1]/label[1]/div[1]/div[1]/div[1]")
	private WebElement applicationenabletoggle;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-applications[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[2]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]")
	private WebElement applicationnametimedropdown;
	
	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option[2]/span[1]")
	private WebElement applicationnameoption;
	
	@FindBy(xpath = "//span[contains(text(),'Created Time')]")
	private WebElement applicationcreatedtimeoption;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-applications[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/i[1]")
	private WebElement applicationsortedascend;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-applications[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/i[1]")
	private WebElement applicationsorteddecend;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-applications[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]")
	private WebElement applicationshowdropdown;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]")
	private WebElement applicationshow10option;

	@FindBy(xpath = "//span[contains(text(),'Show 20')]")
	private WebElement applicationshow20option;

	@FindBy(xpath = "//span[contains(text(),'Show 50')]")
	private WebElement applicationshow50option;

	@FindBy(xpath = "//span[contains(text(),'Show 100')]")
	private WebElement applicationshow100option;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-applications[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[5]/button[2]")
	private WebElement applicationnextpagebutton;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-applications[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[5]/button[1]/i[1]")
	private WebElement applicationpreviouspagebutton;

	@FindBy(xpath = "//span[contains(text(),'Update Application')]")
	private WebElement updateapplicationbutton;

	@FindBy(xpath = "//span[contains(text(),'Direct Access')]")
	private WebElement applicationdirectaccesstoggle;

	@FindBy(xpath = "//span[contains(text(),'Enable Network Access')]")
	private WebElement applicationnetworkaccesstoggle;

	@FindBy(xpath = "//input[@placeholder='Enter cidr Hosts']")
	private WebElement applicationnetworkaccesscidrenter;
	
	@FindBy(xpath = "//mat-icon[contains(text(),'cancel')]")
	private WebElement applicationnetworkaccessCidrremove;
	
	@FindBy(xpath = "//span[contains(text(),'Legacy IE Mode')]")
	private WebElement applicationlegacyIEtoggle;
	
	@FindBy(xpath = "//span[contains(text(),'Prevent Client Checks')]")
	private WebElement applicationpreventclientchecktoggle;
	
	@FindBy(xpath = "//span[contains(text(),'Block Clipboard Access')]")
	private WebElement applicationblockClipAccesstoggle;
	
	@FindBy(xpath = "//span[contains(text(),'Block Pop-ups')]")
	private WebElement applicationBlockpopuptoggle;
	
	@FindBy(xpath = "//span[contains(text(),'Block Downloads')]")
	private WebElement applicationBlockdownloadtoggle;
	
	@FindBy(xpath = "//span[contains(text(),'Hide Address Bar')]")
	private WebElement applicationHideAddresstoggle;
	
	@FindBy(xpath = "//span[contains(text(),'Block Screen Capture')]")
	private WebElement applicationBlockScreenCapturetoggle;
	
	@FindBy(xpath = "//span[contains(text(),'Record Application Screen')]")
	private WebElement applicationRecordAppScreentoggle;
	
	@FindBy(xpath = "//div[@class='col-xs-6 col-sm-4 col-md-3 text-center mb-4 ng-star-inserted'][2]")
	private WebElement sshapplicationselect;
	
	@FindBy(xpath = "//input[@id='focusDisplayName']")
	private WebElement appsnameadding;
	
	@FindBy(xpath = "//input[@data-placeholder='Enter Hostname']")
	private WebElement appshostname;
	
	@FindBy(xpath = "//div[@class='col-xs-6 col-sm-4 col-md-3 text-center mb-4 ng-star-inserted'][3]")
	private WebElement rdpapplicationselect;
	
	@FindBy(xpath = "//div[@class='col-xs-6 col-sm-4 col-md-3 text-center mb-4 ng-star-inserted'][4]")
	private WebElement fileshareapplicationselect;

	@FindBy(xpath = "//input[@data-placeholder='Enter shared folder path']")
	private WebElement fileshareappfolder;
	
	@FindBy(xpath = "//div[@class='col-xs-6 col-sm-4 col-md-3 text-center mb-4 ng-star-inserted'][8]")
	private WebElement networkapplicationselect;
	
	@FindBy(xpath = "//mat-tab-body/div[1]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]")
	private WebElement networkappprotocoldropdown;
	
	@FindBy(xpath = "//span[contains(text(),'TCP')]")
	private WebElement networkappprotocoldTCPoption;
		
	@FindBy(xpath = "//span[contains(text(),'UDP')]")
	private WebElement networkappprotocoldUDPoption;
	
	@FindBy(xpath = "//span[contains(text(),'ICMP')]")
	private WebElement networkappprotocoldICMPoption;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-applications[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-form-field[2]/div[1]/div[1]/div[1]/input[1]")
	private WebElement networkappIDadd;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-applications[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/mat-card[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-form-field[3]/div[1]/div[1]/div[1]/input[1]")
	private WebElement networkappPortnumberadd;

	@FindBy(xpath = "//span[contains(text(),'Save')]")
	private WebElement networkappsavebutton;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	


	public void clickOnapplicationtabperimtr() {
		TestUtils.click(applicationtabperimtr);
	}

	public void clickOnapplicationaddplusprimtr() {
		TestUtils.click(applicationaddplusprimtr);
	}

	public void clickOnwebapplicationselectadd() {
		TestUtils.click(webapplicationselectadd);
	}

	public void clickOnappnameadd() {
		TestUtils.click(appnameadd);
	}

	public void enterAppnameperimtr(String appnameaddperimtr) throws InterruptedException {
		TestUtils.waitForElementPresent(appnameadd);
		TestUtils.type(appnameadd, appnameaddperimtr);
	}

	public void clickOnappurladd() {
		TestUtils.click(appurladd);
	}

	public void enterAppurladdperimtr(String appurladdperimtr) throws InterruptedException {
		TestUtils.waitForElementPresent(appurladd);
		TestUtils.type(appurladd, appurladdperimtr);
	}

	public void clickOnaddapplicationbutton() {
		TestUtils.click(addapplicationbutton);
	}

	public void enterAppsearchperimtr(String appSearchperimtr) throws InterruptedException {
		TestUtils.waitForElementPresent(appsearchperimtr);
		TestUtils.type(appsearchperimtr, appSearchperimtr);
	}
	public void clickOnapplicationeditbutton() {
		TestUtils.click(applicationeditbutton);
	}

	public void clickOnselectapplicationsearchresult() {
		TestUtils.click(selectapplicationsearchresult);
	}

	public void clickOnapplicationactiontab() {
		TestUtils.click(applicationactiontab);
	}

	public void clickOnapplicationdeleteicon() {
		TestUtils.click(applicationdeleteicon);
	}

	public void clickOnapplicationdeleteconfirm() {
		TestUtils.click(applicationdeleteconfirm);
	}

	public void clickOnapplicationdeletedok() {
		TestUtils.click(applicationdeletedok);
	}
	public void clickOnapplicationdisabletoggle() {
		TestUtils.click(applicationdisabletoggle);
	}
	public void clickOnapplicationenabletoggle() {
		TestUtils.click(applicationenabletoggle);
	}
	public void clickOnapplicationnametimedropdown() {
		TestUtils.click(applicationnametimedropdown);
	}
	public void clickOnapplicationnameoption() {
		TestUtils.click(applicationnameoption);
	}
	public void clickOnapplicationcreatedtimeoption() {
		TestUtils.click(applicationcreatedtimeoption);
	}
	public void clickOnapplicationsortedascend() {
		TestUtils.click(applicationsortedascend);
	}
	public void clickOnapplicationsorteddecend() {
		TestUtils.click(applicationsorteddecend);
	}
	public void clickOnapplicationshowdropdown() {
		TestUtils.click(applicationshowdropdown);
	}
	public void clickOnapplicationshow10option() {
		TestUtils.click(applicationshow10option);
	}
	public void clickOnapplicationshow20option() {
		TestUtils.click(applicationshow20option);
	}
	public void clickOnapplicationshow50option() {
		TestUtils.click(applicationshow50option);
	}
	public void clickOnapplicationshow100option() {
		TestUtils.click(applicationshow100option);
	}
	public void clickOnapplicationnextpagebutton() {
		TestUtils.click(applicationnextpagebutton);
	}
	public void clickOnapplicationpreviouspagebutton() {
		TestUtils.click(applicationpreviouspagebutton);
	}
	public void clickOnupdateapplicationbutton() {
		TestUtils.click(updateapplicationbutton);
	}
	public void clickOnapplicationdirectaccesstoggle() {
		TestUtils.click(applicationdirectaccesstoggle);
	}
	public void clickOnapplicationnetworkaccesstoggle() {
		TestUtils.click(applicationnetworkaccesstoggle);
	}
	public void enterapplicationcidrvalue(String appcidrperimtr) throws InterruptedException {
		TestUtils.waitForElementPresent(applicationnetworkaccesscidrenter);
		TestUtils.type(applicationnetworkaccesscidrenter, appcidrperimtr);
	}
	public void clickOnapplicationnetworkaccesscidrenter() {
		TestUtils.click(applicationnetworkaccesscidrenter);
	}
	public void clickOnapplicationnetworkaccessCidrremove() {
		TestUtils.click(applicationnetworkaccessCidrremove);
	}
	public void clickOnapplicationlegacyIEtoggle() {
		TestUtils.click(applicationlegacyIEtoggle);
	}
	public void clickOnapplicationpreventclientchecktoggle() {
		TestUtils.click(applicationpreventclientchecktoggle);
	}
	public void clickOnapplicationblockClipAccesstoggle() {
		TestUtils.click(applicationblockClipAccesstoggle);
	}
	public void clickOnapplicationBlockpopuptoggle() {
		TestUtils.click(applicationBlockpopuptoggle);
	}
	public void clickOnapplicationBlockdownloadtoggle() {
		TestUtils.click(applicationBlockdownloadtoggle);
	}
	public void clickOnapplicationHideAddresstoggle() {
		TestUtils.click(applicationHideAddresstoggle);
	}
	public void clickOnapplicationBlockScreenCapturetoggle() {
		TestUtils.click(applicationBlockScreenCapturetoggle);
	}
	public void clickOnapplicationRecordAppScreentoggle() {
		TestUtils.click(applicationRecordAppScreentoggle);
	}
	public void clickOnsshapplicationselect() {
		TestUtils.click(sshapplicationselect);
	}
	public void enterappsnameadding(String appsnameenter) throws InterruptedException {
		TestUtils.waitForElementPresent(appsnameadding);
		TestUtils.type(appsnameadding, appsnameenter);
	}
	public void enterappshostname(String appsHostname) throws InterruptedException {
		TestUtils.waitForElementPresent(appshostname);
		TestUtils.type(appshostname, appsHostname);
	}
	public void clickOnrdpapplicationselect() {
		TestUtils.click(rdpapplicationselect);
	}
	public void clickOnfileshareapplicationselect() {
		TestUtils.click(fileshareapplicationselect);
	}
	public void enterfileshareappfolder(String filesharefolderpath) throws InterruptedException {
		TestUtils.waitForElementPresent(fileshareappfolder);
		TestUtils.type(fileshareappfolder, filesharefolderpath);
	}
	public void clickOnnetworkapplicationselect() {
		TestUtils.click(networkapplicationselect);
	}
	public void clickOnnetworkappprotocoldropdown() {
		TestUtils.click(networkappprotocoldropdown);
	}
	public void clickOnnetworkappprotocoldTCPoption() {
		TestUtils.click(networkappprotocoldTCPoption);
	}
	public void clickOnnetworkappprotocoldUDPoption() {
		TestUtils.click(networkappprotocoldUDPoption);
	}
	public void clickOnnetworkappprotocoldICMPoption() {
		TestUtils.click(networkappprotocoldICMPoption);
	}
	public void enternetworkappIDadd(String networkappIP) throws InterruptedException {
		TestUtils.waitForElementPresent(networkappIDadd);
		TestUtils.type(networkappIDadd, networkappIP);
	}

	public void enternetworkappPortnumberadd(String networkappPort) throws InterruptedException {
		TestUtils.waitForElementPresent(networkappPortnumberadd);
		TestUtils.type(networkappPortnumberadd, networkappPort);
	}

	public void clickOnnetworkappsavebutton() {
		TestUtils.click(networkappsavebutton);
	}







	
	
}
