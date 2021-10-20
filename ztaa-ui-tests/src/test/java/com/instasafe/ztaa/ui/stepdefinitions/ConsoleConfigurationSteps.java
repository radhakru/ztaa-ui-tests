package com.instasafe.ztaa.ui.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.instasafe.ztaa.ui.core.TestBase;
import com.instasafe.ztaa.ui.pages.DataMgmntPage;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConsoleConfigurationSteps extends TestBase {
	
	
	
	DataMgmntPage datamgmnt = getPageInstance(DataMgmntPage.class);


    @When("^User clicks on Configauration$")
    public void user_clicks_on_configauration() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOnconfigauration(); 
		
    }

    @When("^User clicks on Data Management tab$")
    public void user_clicks_on_data_management_tab() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatamanagementtab(); 
		
    }

    @When("^User clicks on Add Dataset icon$")
    public void user_clicks_on_add_dataset_icon() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatamanagementaddicon(); 
		
    }

    @When("^User clicks on Select variable search bar$")
    public void user_clicks_on_select_variable_search_bar() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatamgmntSelectvariable(); 
		
    }

    @When("^User selects Serial number as the variable$")
    public void user_selects_serial_number_as_the_variable() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatamgmntserialnumber(); 
		
    }

    @When("^User enters Dataset name$")
    public void user_enters_dataset_name() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.enterdatasetname(getDatasetname()); 
		
    }

    @When("^User clicks Add Dataset button$")
    public void user_clicks_add_dataset_button() throws Throwable {
     	Thread.sleep(4000);
    	datamgmnt.clickOnadddatasetbutton(); 
		
    }

    @When("^User searches for Dataset$")
    public void user_searches_for_dataset() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.entersearchdataset(getDatasetsearch()); 
    	WebElement dataset_search = driver.findElement(By.xpath("//input[@placeholder='Search']"));
    	dataset_search.sendKeys(Keys.ENTER);
		
    }

    @Then("^User selects Dataset from search results$")
    public void user_selects_dataset_from_search_results() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOnselectsearchedDataset(); 
		
    }
    @When("^User clicks on Records tab$")
    public void user_clicks_on_records_tab() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatasetrecordtab(); 
		
    }

    @When("^User clicks on Add Records icon$")
    public void user_clicks_on_add_records_icon() throws Throwable {
    	Thread.sleep(4000);
	datamgmnt.clickOnrecordaddbutton(); 
	Thread.sleep(2000);
    }

    @When("^User enters Record value$")
    public void user_enters_record_value() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.enteraddrecordvalue(getDatasetRecordvalue()); 
		
    }

    @When("^User clicks on Add Record Tick mark$")
    public void user_clicks_on_add_record_tick_mark() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOnaddrecordtickmark(); 
		
    }

    @Then("^User enables Edit mode for Data management$")
    public void user_enables_edit_mode_for_data_management() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatamgmntedittab(); 
		
    }

    @When("^User clicks on Actions tab for Data management$")
    public void user_clicks_on_actions_tab_for_data_management() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatasetactionstab(); 
		
    }

    @When("^User clicks on Delete icon for Data management$")
    public void user_clicks_on_delete_icon_for_data_management() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatasetdeleteicon(); 
		
    }

    @Then("^User confirm dataset delete$")
    public void user_confirm_dataset_delete() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatasetdeleteconfirm(); 
		
    }

    @Then("^Dataset is deleted$")
    public void dataset_is_deleted() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatasetdeleted(); 
		
    }
    @When("^User selects location as the variable$")
    public void user_selects_location_as_the_variable() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatamgmntlocation(); 
		Thread.sleep(4000);
    }

    @When("^User selects OS Family as the variable$")
    public void user_selects_os_family_as_the_variable() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatamgmntOSfamily(); 
		Thread.sleep(4000);
    }

    @When("^User selects OS Main version as the variable$")
    public void user_selects_os_main_version_as_the_variable() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatamgmntOSMainVersion(); 
		Thread.sleep(4000);
    }

    @When("^User selects OS Minor version as the variable$")
    public void user_selects_os_minor_version_as_the_variable() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatamgmntOSMinorVersion(); 
		Thread.sleep(4000);
    }

    @When("^User selects OS Build version as the variable$")
    public void user_selects_os_build_version_as_the_variable() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatamgmntOSBuildVersion(); 
		Thread.sleep(4000);
    }

    @When("^User selects System Domain Name as the variable$")
    public void user_selects_system_domain_name_as_the_variable() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatamgmntSysDomainName(); 
		Thread.sleep(4000);
    }

    @When("^User selects MAC Address as the variable$")
    public void user_selects_mac_address_as_the_variable() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatamgmntMACaddress(); 
		Thread.sleep(4000);
    }

    @When("^User selects AV installed name as the variable$")
    public void user_selects_av_installed_name_as_the_variable() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatamgmntAVInstalledName(); 
		Thread.sleep(4000);
    }

    @When("^User selects AV enabled name as the variable$")
    public void user_selects_av_enabled_name_as_the_variable() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatamgmntAVEnabledName(); 
		Thread.sleep(4000);
    }

    @When("^User selects AV updated name as the variable$")
    public void user_selects_av_updated_name_as_the_variable() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatamgmntAVUpdatedName(); 
		Thread.sleep(4000);
    }

    @When("^User selects Datetime as the variable$")
    public void user_selects_datetime_as_the_variable() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatamgmntDateTime(); 
		Thread.sleep(4000);
    }

    @When("^User clicks on Monday check box$")
    public void user_clicks_on_monday_check_box() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatetimeMondaycheckbox(); 
		Thread.sleep(4000);
    }

    @When("^User enters Monday Start Time$")
    public void user_enters_monday_start_time() throws Throwable {
     	Thread.sleep(4000);
    	datamgmnt.enterdatetimeMondayStartTime(getdatastimeStarttime()); 
		Thread.sleep(4000); 
    }

    @When("^User enters Monday End Time$")
    public void user_enters_monday_end_time() throws Throwable {
      	Thread.sleep(4000);
    	datamgmnt.enterdatetimeMondayEndTime(getdatastimeEndtime()); 
		Thread.sleep(4000); 
    }

    @When("^User clicks on Add Date time button$")
    public void user_clicks_on_add_date_time_button() throws Throwable {
       	    	Thread.sleep(4000);
    	    	datamgmnt.clickOndatetimeAddbutton(); 
    			Thread.sleep(4000);
    }

    @When("^User clicks on Tuesday check box$")
    public void user_clicks_on_tuesday_check_box() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatetimeTuesdaycheckbox(); 
		Thread.sleep(4000);
    }

    @When("^User enters Tuesday Start Time$")
    public void user_enters_tuesday_start_time() throws Throwable {
     	Thread.sleep(4000);
    	datamgmnt.enterdatetimeTuesdayStartTime(getdatastimeStarttime()); 
		Thread.sleep(4000); 
    }

    @When("^User enters Tuesday End Time$")
    public void user_enters_tuesday_end_time() throws Throwable {
     	Thread.sleep(4000);
    	datamgmnt.enterdatetimeTuesdayEndTime(getdatastimeEndtime()); 
		Thread.sleep(4000); 
    }

    @When("^User clicks on Wednesday check box$")
    public void user_clicks_on_wednesday_check_box() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatetimeWednesdaycheckbox(); 
		Thread.sleep(4000);
    }

    @When("^User enters Wednesday Start Time$")
    public void user_enters_wednesday_start_time() throws Throwable {
       	Thread.sleep(4000);
    	datamgmnt.enterdatetimeWednesdayStartTime(getdatastimeStarttime()); 
		Thread.sleep(4000); 
    }

    @When("^User enters Wednesday End Time$")
    public void user_enters_wednesday_end_time() throws Throwable {
      	Thread.sleep(4000);
    	datamgmnt.enterdatetimeWednesdayEndTime(getdatastimeEndtime()); 
		Thread.sleep(4000); 
    }
    @When("^User clicks on Thursday check box$")
    public void user_clicks_on_thursday_check_box() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatetimeThursdaycheckbox(); 
		Thread.sleep(4000);
    }

    @When("^User enters Thursday Start Time$")
    public void user_enters_thursday_start_time() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.enterdatetimeThursdayStartTime(getdatastimeStarttime()); 
		Thread.sleep(4000); 
    }

    @When("^User enters Thursday End Time$")
    public void user_enters_thursday_end_time() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.enterdatetimeThursdayEndTime(getdatastimeEndtime()); 
		Thread.sleep(4000);  
    }
    @When("^User clicks on Friday check box$")
    public void user_clicks_on_friday_check_box() throws Throwable {
     	Thread.sleep(4000);
    	datamgmnt.clickOndatetimeFridaycheckbox(); 
		Thread.sleep(4000);
    }

    @When("^User enters Friday Start Time$")
    public void user_enters_friday_start_time() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.enterdatetimeFridayStartTime(getdatastimeStarttime()); 
		Thread.sleep(4000); 
    }

    @When("^User enters Friday End Time$")
    public void user_enters_friday_end_time() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.enterdatetimeFridayEndTime(getdatastimeEndtime()); 
		Thread.sleep(4000); 
    }
    @When("^User clicks on Saturday check box$")
    public void user_clicks_on_saturday_check_box() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatetimeSaturdaycheckbox(); 
		Thread.sleep(4000);
    }

    @When("^User enters Saturday Start Time$")
    public void user_enters_saturday_start_time() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.enterdatetimeSaturdayStartTime(getdatastimeStarttime()); 
		Thread.sleep(4000); 
    }

    @When("^User enters Saturday End Time$")
    public void user_enters_saturday_end_time() throws Throwable {
           	Thread.sleep(4000);
        	datamgmnt.enterdatetimeSaturdayEndTime(getdatastimeEndtime()); 
    		Thread.sleep(4000); 
    }
    @When("^User clicks on Sunday check box$")
    public void user_clicks_on_sunday_check_box() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndatetimeSundaycheckbox(); 
		Thread.sleep(4000);
    }

    @When("^User enters Sunday Start Time$")
    public void user_enters_sunday_start_time() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.enterdatetimeSundayStartTime(getdatastimeStarttime()); 
		Thread.sleep(4000); 
    }

    @When("^User enters Sunday End Time$")
    public void user_enters_sunday_end_time() throws Throwable {
       	Thread.sleep(4000);
    	datamgmnt.enterdatetimeSundayEndTime(getdatastimeEndtime()); 
		Thread.sleep(4000); 
    }

    @When("^User clicks on Delete icon for a Record$")
    public void user_clicks_on_delete_icon_for_a_record() throws Throwable {
    	Thread.sleep(4000);
    	datamgmnt.clickOndeleteRecordvalue(); 
		Thread.sleep(2000);
    }

    


    
    
    
   










	
}
