package com.instasafe.ztaa.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.instasafe.ztaa.ui.utils.TestUtils;

public class GatewaysPage {

	@FindBy(xpath = "/html/body/app-root/app-tenant-layout/div/div[2]/div/app-perimeter-layout/nav/div[2]/div/div/a[5]")
	private WebElement gatewaytab;

	@FindBy(xpath = "//*[@class='fa fa-plus']")
	private WebElement gatewayaddplus;

	@FindBy(xpath = "//span[text()=' Private Gateway ']")
	private WebElement prigatewaycheck;

	@FindBy(xpath = "//span[text()='Next']")
	private WebElement prigatewaynextbutton;

	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-gateway[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-card[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/mat-card[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/input[1]")
	private WebElement accesscode;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-gateway[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-card[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/button[2]/span[1]")	
	private WebElement accessnextbutton;

	@FindBy(xpath = "//span[text()='Authorize']")
	private WebElement authorizebutton;

	@FindBy(xpath = "//input[@placeholder='Search Gateway']")
	private WebElement gatewaysearch;

	@FindBy(xpath = "//mat-expansion-panel-header/span[1]/mat-panel-title[1]/div[1]")
	private WebElement selectgatewaysearchresult;

	@FindBy(xpath = "//mat-tab-header/div[2]/div[1]/div[1]/div[2]/div[1]")
	private WebElement gatewayapptabselect;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-gateway[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[3]/div[1]/mat-button-toggle-group[1]/mat-button-toggle[2]/button[1]/span[1]")
	private WebElement gatewayedit;

	@FindBy(xpath = "//span[text()='Add Application']")
	private WebElement gatewayaddappbutton;

	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement gatewaysearchapps;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-filter-popup[1]/mat-dialog-content[1]/section[2]/ul[1]/li[1]/div[1]/div[1]/mat-checkbox[1]")
	private WebElement gatewayselectsearchedapp;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/mat-dialog-container[1]/app-filter-popup[1]/mat-dialog-actions[1]/button[1]/span[1]")
	private WebElement gatewayaddappselected;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-gateway[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[2]/div[1]/div[1]/div[3]/drag-scroll[1]/div[1]/div[1]/mat-list[1]/mat-list-item[1]/div[1]/div[4]/mat-icon[1]")
	private WebElement gatewayappdelete;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-gateway[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[3]/div[1]/div[2]/div[1]/mat-card[1]/div[1]/div[2]/mat-slide-toggle[1]/label[1]/div[1]/div[1]")
	private WebElement gatewaydisable;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-gateway[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[3]/div[1]/div[2]/div[1]/mat-card[1]/div[1]/div[2]/mat-slide-toggle[1]/label[1]/div[1]/div[1]")
	private WebElement gatewayenable;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-gateway[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/mat-tab-group[1]/mat-tab-header[1]/div[2]/div[1]/div[1]/div[3]")
	private WebElement gatewayactiontab;

	@FindBy(xpath = "//mat-icon[contains(text(),'delete_forever')]")
	private WebElement gatewaydeleteicon;

	@FindBy(xpath = "//button[contains(text(),'Yes, delete')]")
	private WebElement gatewaydeleteconfirm;

	@FindBy(xpath = "//button[contains(text(),'No, cancel it')]")
	private WebElement gatewaydeletecancel;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-gateway[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[2]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]")
	private WebElement gatewaynametimedropdown;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option[2]/span[1]")
	private WebElement gatewaynamesortoption;

	@FindBy(xpath = "//span[contains(text(),'Created Time')]")
	private WebElement gatewaycreatedtimesortoption;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-gateway[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/i[1]")
	private WebElement gatewaysortascend;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-gateway[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/i[1]")
	private WebElement gatewaysortdecend;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-perimeter-layout[1]/app-gateway[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]")
	private WebElement gatewayshowdropdown;

	@FindBy(xpath = "/html[1]/body[1]/div[3]/div[2]/div[1]/div[1]/div[1]/mat-option[1]/span[1]")
	private WebElement gatewayshow10;

	@FindBy(xpath = "//span[contains(text(),'Show 20')]")
	private WebElement gatewayshow20;

	@FindBy(xpath = "//span[contains(text(),'Show 50')]")
	private WebElement gatewayshow50;

	@FindBy(xpath = "//span[contains(text(),'Show 100')]")
	private WebElement gatewayshow100;

	@FindBy(xpath = "//mat-expansion-panel-header/span[1]/mat-panel-description[1]/div[1]/div[6]")
	private WebElement gatewaysyncapp;

	public void clickOngatewaytab() {
		TestUtils.click(gatewaytab);
	}

	public void clickOngatewayaddplus() {
		TestUtils.click(gatewayaddplus);
	}

	public void clickOnprigatewaycheck() {
		TestUtils.click(prigatewaycheck);
	}

	public void clickOnprigatewaynextbutton() {
		TestUtils.click(prigatewaynextbutton);
	}

	public void enterAccesscode(String access) throws InterruptedException {
		TestUtils.waitForElementPresent(accesscode);
		TestUtils.type(accesscode, access);
	}

	public void clickOnaccessnextbutton() {
		TestUtils.click(accessnextbutton);
	}

	public void clickOnauthorizebutton() {
		TestUtils.click(authorizebutton);
	}

	public void entergatewaysearch(String gatewaysearchip) throws InterruptedException {
		TestUtils.waitForElementPresent(gatewaysearch);
		TestUtils.type(gatewaysearch, gatewaysearchip);
	}

	public void clickOnselectgatewaysearchresult() {
		TestUtils.click(selectgatewaysearchresult);
	}

	public void clickOngatewayapptabselect() {
		TestUtils.click(gatewayapptabselect);
	}

	public void clickOngatewayedit() {
		TestUtils.click(gatewayedit);
	}

	public void clickOngatewayaddappbutton() {
		TestUtils.click(gatewayaddappbutton);
	}

	public void entergatewaysearchapp(String gatewaysearchapp) throws InterruptedException {
		TestUtils.waitForElementPresent(gatewaysearchapps);
		TestUtils.type(gatewaysearchapps, gatewaysearchapp);
	}

	public void clickOngatewayselectsearchedapp() {
		TestUtils.click(gatewayselectsearchedapp);
	}

	public void clickOngatewayaddappselected() {
		TestUtils.click(gatewayaddappselected);
	}

	public void clickOngatewayappdelete() {
		TestUtils.click(gatewayappdelete);
	}

	public void clickOngatewaydisable() {
		TestUtils.click(gatewaydisable);
	}

	public void clickOngatewayenable() {
		TestUtils.click(gatewayenable);
	}

	public void clickOngatewayactiontab() {
		TestUtils.click(gatewayactiontab);
	}

	public void clickOngatewaydeleteicon() {
		TestUtils.click(gatewaydeleteicon);
	}

	public void clickOngatewaydeleteconfirm() {
		TestUtils.click(gatewaydeleteconfirm);
	}

	public void clickOngatewaydeletecancel() {
		TestUtils.click(gatewaydeletecancel);
	}

	public void clickOngatewaynametimedropdown() {
		TestUtils.click(gatewaynametimedropdown);
	}

	public void clickOngatewaynamesortoption() {
		TestUtils.click(gatewaynamesortoption);
	}

	public void clickOngatewaycreatedtimesortoption() {
		TestUtils.click(gatewaycreatedtimesortoption);
	}

	public void clickOngatewaysortascend() {
		TestUtils.click(gatewaysortascend);
	}

	public void clickOngatewaysortdecend() {
		TestUtils.click(gatewaysortdecend);
	}

	public void clickOngatewayshowdropdown() {
		TestUtils.click(gatewayshowdropdown);
	}

	public void clickOngatewayshow10() {
		TestUtils.click(gatewayshow10);
	}

	public void clickOngatewayshow20() {
		TestUtils.click(gatewayshow20);
	}

	public void clickOngatewayshow50() {
		TestUtils.click(gatewayshow50);
	}

	public void clickOngatewayshow100() {
		TestUtils.click(gatewayshow100);
	}

	public void clickOngatewaysyncapp() {
		TestUtils.click(gatewaysyncapp);
	}

}
