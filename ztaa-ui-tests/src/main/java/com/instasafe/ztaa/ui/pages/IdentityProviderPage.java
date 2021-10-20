package com.instasafe.ztaa.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.instasafe.ztaa.ui.utils.TestUtils;

public class IdentityProviderPage {
	@FindBy(xpath = "//a[text()=' Identity Provider ']")
	private WebElement identityprovider;
	
	@FindBy(xpath = "//i[@class='fa fa-plus']")
	private WebElement addbuttonIdentityprovider ;
	
	@FindBy(xpath = "//input[@data-placeholder='IDP Name']")
	private WebElement enterIDPNameonIdentityprovider ;
	
	
	@FindBy(xpath = "//span[text()='Add Application']")
	private WebElement addAppinIdentityprovider ;
	
	
	@FindBy(xpath = "(//span[text()='Next'])[1]")
	private WebElement enterIDPNameandNextbuttonIdentityprovider ;
	
	@FindBy(xpath = "//div[text()=' Generate Certificate ']")
	private WebElement GenerateCertificate ;
	
	@FindBy(xpath = "//input[@data-placeholder='ACS URL']")
	private WebElement ACsurl;
	
	
	@FindBy(xpath = "//input[@data-placeholder='SP Entity Id']")
	private WebElement SPEntityId;
	
	@FindBy(xpath = "//input[@data-placeholder='IDP Entity ID']")
	private WebElement IDPEntityId;
	
	
	
	@FindBy(xpath = "(//span[text()=' [+] Attribute '])[1]")
	private WebElement attributeplusicon;
	
	
	@FindBy(xpath = "(//div[@class='mat-slide-toggle-thumb'])[3]")
	private WebElement AccessFromBrowser;
	
	@FindBy(xpath = "(//div[@class='mat-slide-toggle-thumb'])[4]")
	private WebElement AccessFromDekstop;
	
	@FindBy(xpath = "(//div[@class='mat-slide-toggle-thumb'])[5]")
	private WebElement AccessFromMobile;
	
	
	@FindBy(xpath = "(//span[text()='Next'])[2]")
	private WebElement NextbuttonofIdpcreation;
	
	
	@FindBy(xpath = "(//span[text()='Submit'])[1]")
	private WebElement SubmitButtonofIdpcreation;
			
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement SearchIdp;
	
	@FindBy(xpath = "//span[text()=' Edit ']")
	private WebElement EnableEditofIdp;
	
	@FindBy(xpath = "(//img[@class='insta-live'])[2]")
	private WebElement searchesIDPapp;
	
	@FindBy(xpath = "(//span[text()='Email'])[2]")
	private WebElement selectTypeEmail;
	
	@FindBy(xpath = "(//div[@class='mat-tab-label-content'])[8]")
	private WebElement ActionIdp;
	
	
	@FindBy(xpath = "(//div[@class='mat-tab-label-content'])[7]")
	private WebElement ApplicationTabIdp;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement deleteIDP;
	
	@FindBy(xpath = "(//div[@class='mat-tab-label-content'])[6]")
	private WebElement backendSAML;
	
	@FindBy(xpath = "(//div[text()=' Download SP Metadata '])")
	private WebElement downloadSPMetadata;
	
	@FindBy(xpath = "(//span[text()='application'])[2]")
	private WebElement confirmAddappinIDP;
	

	
	@FindBy(xpath = "//mat-icon[text()='delete_outline']")
	private WebElement deleteappfromIDP;
	
	@FindBy(xpath = "(//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin'])[2]")
	private WebElement selectCheckboxofappIDP;
	
	@FindBy(xpath = "//button[text()='Yes, delete']")
	private WebElement confirmdeleteIDP;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-layout[1]/app-identity-provider[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[2]/div[1]/div[2]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]")
	private WebElement sortbyDropdowntoggleofIDP;
	
	@FindBy(xpath = "(//span[text()='Created Time'])")
	private WebElement sortyBycreatedtimeIDP;
	
	@FindBy(xpath = "(//span[text()='Name'])[1]")
	private WebElement sortyByNameIDP;
	
	@FindBy(xpath = "//button[@class='swal2-confirm swal2-styled']")
	private WebElement deleteOKIDP;
	
	@FindBy(xpath = "(//span[text()='urn:oasis:names:tc:SAML:2.0:attrname-format:unspecified'])")
	private WebElement selectunspecifiedoption;
	
	@FindBy(xpath = "//input[@data-placeholder='Enter Attribute name']")
	private WebElement enterAttributeName;
	
	@FindBy(xpath = "(//input[contains (@placeholder, 'Search')])[2]")
	private WebElement entersearchAppNameIdp;
	
	

	@FindBy(xpath = "(//i[@class='fa fa-long-arrow-alt-up ng-star-inserted'])[1]")
	private WebElement sortedinAscendingorderIdp;
	
	@FindBy(xpath = "(//i[@class='fa fa-long-arrow-alt-down ng-star-inserted'])[1]")
	private WebElement sortedinDescendingorderIdp;
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-layout[1]/app-identity-provider[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[1]/mat-card[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]")
	private WebElement attributeformate;
	
	@FindBy(xpath ="/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-layout[1]/app-identity-provider[1]/mat-card[1]/mat-card-content[1]/mat-accordion[1]/mat-expansion-panel[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/mat-horizontal-stepper[1]/div[2]/div[2]/div[1]/mat-card[1]/div[1]/form[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[4]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]/div[1]")
	private WebElement SelectTypeDropdownToggleofIdp;		
	
	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/app-tenant-layout[1]/div[1]/div[2]/div[1]/app-identity-layout[1]/app-identity-provider[1]/mat-card[1]/mat-card-content[1]/section[1]/div[1]/div[4]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]")
	private WebElement showlistToggleofIDP;
	
	
	@FindBy(xpath = "(//span[text()='Show 10'])[2]")
	private WebElement IDPshow10option;

	
	@FindBy(xpath = "//span[contains(text(),'Show 20')]")
	private WebElement IDPshow20option;

	@FindBy(xpath = "//span[contains(text(),'Show 50')]")
	private WebElement IDPshow50option;

	@FindBy(xpath = "//span[contains(text(),'Show 100')]")
	private WebElement IDPshow100option;
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement entersearchminimmcharAppNameIdp;
	
	
	@FindBy(xpath = "//input[@placeholder='Search']")
	private WebElement entersearchInvalidAppNameIdp;
	
	
	@FindBy(xpath = "(//input[contains (@placeholder, 'Search')])[2]")
	private WebElement searchAppNamewithminiTwoCharIdp;
	
	
	/*** This method click on Identity Provider***/
	public void clickOnIdentityProviderTab() {
		TestUtils.click(identityprovider);
	}
	
	
	/*** This method click on  add app in selected Identity Provider***/
	public void clickOnAddAppIdentityProviderTab() {
		TestUtils.click(addAppinIdentityprovider);
	}
	
	
	
	/*** This method click on  add app in selected Identity Provider***/
	public void clickOndeleteAppfromIdentityProviderTab() {
		TestUtils.click(deleteappfromIDP);
	}
	

	/*** This method click on  backend SAML Identity Provider***/
	public void clickOnBackEndSAMLofIdentityProviderTab() {
		TestUtils.click(backendSAML);
	}
	
	

	/*** This method click on  Download SP metadata in  Identity Provider***/
	public void clickOnDownloadSPMetadataofIdentityProviderTab() {
		TestUtils.click(downloadSPMetadata);
	}
	
	
	/*** This method click on add button of Identity Provider***/
	public void clickOnAddbuttonofIdentityProvider() {
		TestUtils.click(addbuttonIdentityprovider);
	}
	
	
	
	/*** This method click on confirm add button of Identity Provider***/
	public void clickOnConfirmAddbuttonofIdentityProvider() {
		TestUtils.click(confirmAddappinIDP);
	}
	
	
	/*** This method click on select checkbox button of app in Identity Provider***/
	public void clickOnselectCheckboxAppofIdentityProvider() {
		TestUtils.click(selectCheckboxofappIDP);
	}
	
	
	/*** This method click on edit button of Identity Provider***/
	public void clickOnEditbuttonofIdentityProvider() {
		TestUtils.click(EnableEditofIdp);
	}
	
	/*** This method click on search idp app in Identity Provider***/
	public void clickOnSearchedIDPappinIdentityProviderTab() {
		TestUtils.click(searchesIDPapp);
	}
	
	/*** This method click on Actions Tab ofIdentity Provider***/
	public void clickOnActionsIdentityProviderTab() {
		TestUtils.click(ActionIdp);
	}
	
	
	/*** This method click on Actions Tab ofIdentity Provider***/
	public void clickOnApplicationTabIdentityProvider() {
		TestUtils.click(ApplicationTabIdp);
	}
	

	
	
	
	/*** This method click on Delete button of Identity Provider***/
	public void clickOnDeleteButtonIdentityProviderTab() {
		TestUtils.click(deleteIDP);
	}
	
	/*** This method click on confirm Delete (Yes,Delete )button of Identity Provider***/
	public void clickOnConfirmDeleteButtonIdentityProviderTab() {
		TestUtils.click(confirmdeleteIDP);
	}
	
	/*** This method click on Delete( OK) button of Identity Provider***/
	public void clickOnDeleteOkButtonIdentityProviderTab() {
		TestUtils.click(deleteOKIDP);
	}
	
	/*** This method click on Next button once configuration is done  of Identity Provider***/
	public void clickOnNextLastbuttonofIdentityProvider() {
		TestUtils.click(NextbuttonofIdpcreation);
	}
	
	/*** This method click on Submit button of Identity Provider***/
	public void clickOnSubmitbuttonofIdentityProvider() {
		TestUtils.click(SubmitButtonofIdpcreation);
	}
	
	
	/*** This method click on Unspecified  option of  Identity Provider***/
	public void clickOnUnspecifiedIdentityProvider() {
		TestUtils.click(selectunspecifiedoption);
	}
	
	
	/*** This method click on enter Attribute name  Identity Provider***/
	public void clickOnEnterAttributeNameIdentityProvider() {
		TestUtils.click(enterAttributeName);
	}
	
	/*** This method click on select drop down Toggle Identity Provider***/
	public void clickOnselectDropDownToggleIdentityProvider() {
		TestUtils.click(SelectTypeDropdownToggleofIdp);
	}
	
	
	
	/*** This method click on sort by Created time of  Identity Provider***/
	public void clickOnsortBycreatedTimeIdentityProvider() {
		TestUtils.click(sortyBycreatedtimeIDP);
	}
	
	/*** This method click on sort by Name of  Identity Provider***/
	public void clickOnsortByNameIdentityProvider() {
		TestUtils.click(sortyByNameIDP);
	}
	
	/*** This method click on select type Email for Attribute in Identity Provider***/
	
	public void clickOnselectTypeattributeEmailbuttonofIdentityProvider() {
		TestUtils.click(selectTypeEmail);
	}
	
	/*** This method click on sort by drop down toggle of Identity Provider***/
	public void clickOnsortbyDropdownToggleIdentityProviderTab() {
		TestUtils.click(sortbyDropdowntoggleofIDP);
	}
	
	/*** This method click on sorted in ascending orde of Identity Provider***/
	public void clickOnsortedInAscendingOrderIdentityProviderTab() {
		TestUtils.click(sortedinAscendingorderIdp);
	}
	
	/*** This method click on sorted in descending orde of Identity Provider***/
	public void clickOnsortedInDescendingOrderIdentityProviderTab() {
		TestUtils.click(sortedinDescendingorderIdp);
	}
	
	
	
	/*** This method click on Attribute(+) Icon Identity Provider***/
	public void clickOnAttributeIdentityProviderTab() {
		TestUtils.click(attributeplusicon);
	}
	
	/*** This method click on Attribure Formate Identity Provider***/
	public void clickOnAttributeformateIdentityProviderTab() {
		TestUtils.click(attributeformate);
	}
	
	
	/*** This method click on generate Certificate button of Identity Provider***/
	public void clickOnGenerateCertificatebuttonofIdentityProvider() {
		TestUtils.click(GenerateCertificate);
	}
	
	
	
	/*** This method enters IDP name  of Identity Provider***/
	public void enterIDPName(String enteridpName) throws InterruptedException {
		TestUtils.waitForElementPresent(enterIDPNameonIdentityprovider);
		TestUtils.type(enterIDPNameonIdentityprovider, enteridpName);
	}
	
	
	/*** This method click on Next button(once enter Idp name and select generic saml of Identity Provider***/
	public void clickOnNextbuttonofIdentityProvider() {
	 	TestUtils.click(enterIDPNameandNextbuttonIdentityprovider);
		
	}
	
	/*** This method enters ACS URL  of Identity Provider***/
	public void enterACSURL(String ascurl) throws InterruptedException {
		TestUtils.waitForElementPresent(ACsurl);
		TestUtils.type(ACsurl, ascurl);
	}
	
	
	
	/*** This method enters IDP entity ID  of Identity Provider***/
	public void enterIDPentityID(String idpentity) throws InterruptedException {
		TestUtils.waitForElementPresent(IDPEntityId);
		TestUtils.type(IDPEntityId, idpentity);
	}
	
	/*** This method enters SP entity ID  of Identity Provider***/
	public void enterSPEntity(String spentityid ) throws InterruptedException {
		TestUtils.waitForElementPresent(SPEntityId);
		TestUtils.type(SPEntityId, spentityid);
	}
	
	
	/*** This method entersattributename  of Identity Provider***/
	public void enterAttributeNameIDP(String attributenameofIDP ) throws InterruptedException {
		TestUtils.waitForElementPresent(enterAttributeName);
		TestUtils.type(enterAttributeName, attributenameofIDP);
	}
	
  /*** This method click on Allow access from browser Identity Provider***/
    public void clickOnAccessfromBrowserIdentityProviderTab() {
	TestUtils.click(AccessFromBrowser);
}
    /*** This method click on Allow access from Dekstop Identity Provider***/
    public void clickOnAccessfromDekstopIdentityProviderTab() {
	TestUtils.click(AccessFromDekstop);
}
    /*** This method click on Allow access from Mobile Identity Provider***/
    public void clickOnAccessfromMobileIdentityProviderTab() {
	TestUtils.click(AccessFromMobile);
}
    
    
    
    
    /*** This method click on ShowlistToggle of Identity Provider***/
	public void clickOnShowlistToggleIdentityProviderTab() {
		TestUtils.click(showlistToggleofIDP);
	}
    
	 
    /*** This method click on Show 10  of Identity Provider***/
	public void clickOnShow10IdentityProviderTab() {
		TestUtils.click(IDPshow10option);
	}
    
	/*** This method click on Show 20  of Identity Provider***/
	public void clickOnShow20IdentityProviderTab() {
		TestUtils.click(IDPshow20option);
	}
	
	
	/*** This method click on Show 50  of Identity Provider***/
	public void clickOnShow50IdentityProviderTab() {
		TestUtils.click(IDPshow50option);
	}
	
	/*** This method click on Show 20  of Identity Provider***/
	public void clickOnShow100IdentityProviderTab() {
		TestUtils.click(IDPshow100option);
	}
	
	
    /*** This method search name of IDP app  in Identity Provider Tab***/
	public void SearchAndenterIDP(String searchIDPname ) throws InterruptedException {
		TestUtils.waitForElementPresent(SearchIdp);
		TestUtils.type(SearchIdp, searchIDPname);
	}
    
	
	
	 /*** This method search application name under appplication Tab  in Identity Provider ***/
		public void SearchAppnameInIDP(String searchappnameunderIDP ) throws InterruptedException {
			TestUtils.waitForElementPresent(entersearchAppNameIdp);
			TestUtils.type(entersearchAppNameIdp, searchappnameunderIDP);
		}
    
	
		 /*** This method search name of Invalid IDP app  in Identity Provider Tab***/
		public void SearchAndenterInvalidAppIDP(String searchinvalidappnameunderIDP ) throws InterruptedException {
			TestUtils.waitForElementPresent(entersearchInvalidAppNameIdp);
			TestUtils.type(entersearchInvalidAppNameIdp, searchinvalidappnameunderIDP);
		}
	    
		 /*** This method search name of Invalid IDP app with 2 chacters in Identity Provider Tab***/
		public void SearchAndenterMinimmtwoCharInvalidAppIDP(String searchmincharwithappnameunderIDP ) throws InterruptedException {
			TestUtils.waitForElementPresent(entersearchminimmcharAppNameIdp);
			TestUtils.type(entersearchminimmcharAppNameIdp, searchmincharwithappnameunderIDP);
		}
		 /*** This method search app  name with two charcter applications tab in Identity Provider Tab***/
		public void SearchAndenterAppnamewithMinimmtwoCharacterInIDP(String searchappnamewithminicharunderIDP ) throws InterruptedException {
			TestUtils.waitForElementPresent(searchAppNamewithminiTwoCharIdp);
			TestUtils.type(searchAppNamewithminiTwoCharIdp,searchappnamewithminicharunderIDP);
		}
	    
	
	
	
}
