Feature: ZTAA Console: Configuration - Data Management

@adddataset @serialnumber @smoke
Scenario: Add new dataset in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User clicks on Add Dataset icon
   When User clicks on Select variable search bar
   When User selects Serial number as the variable
   When User enters Dataset name
   When User clicks Add Dataset button
   Then User should logout
   Then User should close the ZTAA browser
   
@searchdataset
Scenario: Search dataset in Data Management 

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab
   When User searches for Dataset
   Then User selects Dataset from search results
   Then User should logout
   Then User should close the ZTAA browser
   
@addrecord  @smoke
Scenario: Add dataset record in Data Management 

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab
   When User searches for Dataset
   Then User selects Dataset from search results
   Then User enables Edit mode for Data management
   When User clicks on Records tab
   When User clicks on Add Records icon
   When User enters Record value
   When User clicks on Add Record Tick mark
   Then User should logout
   Then User should close the ZTAA browser
   
   
 @addlocation @locationdataset
Scenario: Add new location dataset in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User clicks on Add Dataset icon
   When User clicks on Select variable search bar
   When User selects location as the variable
   When User enters Dataset name
   When User clicks Add Dataset button
   Then User should logout
   Then User should close the ZTAA browser
      
@AddOSfamily @OSfamily
Scenario: Add new OS family dataset in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User clicks on Add Dataset icon
   When User clicks on Select variable search bar
   When User selects OS Family as the variable
   When User enters Dataset name
   When User clicks Add Dataset button
   Then User should logout
   Then User should close the ZTAA browser
  
@AddOSminorVersion @OSminorVersion
Scenario: Add new OS Minor Version dataset in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User clicks on Add Dataset icon
   When User clicks on Select variable search bar
   When User selects OS Minor version as the variable
   When User enters Dataset name
   When User clicks Add Dataset button
   Then User should logout
   Then User should close the ZTAA browser
  
@AddOSmainVersion @OSmainVersion
Scenario: Add new OS Main Version dataset in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User clicks on Add Dataset icon
   When User clicks on Select variable search bar
   When User selects OS Main version as the variable
   When User enters Dataset name
   When User clicks Add Dataset button
   Then User should logout
   Then User should close the ZTAA browser
  
@AddOSBuildVersion @OSBuildVersion
Scenario: Add new OS Biuld Version dataset in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User clicks on Add Dataset icon
   When User clicks on Select variable search bar
   When User selects OS Build version as the variable
   When User enters Dataset name
   When User clicks Add Dataset button
   Then User should logout
   Then User should close the ZTAA browser
  
@AddSystemDomainName @SystemDomainName
Scenario: Add new System Domain Name dataset in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User clicks on Add Dataset icon
   When User clicks on Select variable search bar
   When User selects System Domain Name as the variable
   When User enters Dataset name
   When User clicks Add Dataset button
   Then User should logout
   Then User should close the ZTAA browser
  
@AddMACAddress @MACAddress
Scenario: Add new MAC Address dataset in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User clicks on Add Dataset icon
   When User clicks on Select variable search bar
   When User selects MAC Address as the variable
   When User enters Dataset name
   When User clicks Add Dataset button
   Then User should logout
   Then User should close the ZTAA browser
  
@AddAVinstalledname @AVinstalledname
Scenario: Add new AV installed name dataset in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User clicks on Add Dataset icon
   When User clicks on Select variable search bar
   When User selects AV installed name as the variable
   When User enters Dataset name
   When User clicks Add Dataset button
   Then User should logout
   Then User should close the ZTAA browser
  
@AddAVenabledname @AVenabledname
Scenario: Add new AV enabled name dataset in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User clicks on Add Dataset icon
   When User clicks on Select variable search bar
   When User selects AV enabled name as the variable
   When User enters Dataset name
   When User clicks Add Dataset button
   Then User should logout
   Then User should close the ZTAA browser
  
@AddAVupdatedname @AVupdatedname
Scenario: Add new AV enabled name dataset in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User clicks on Add Dataset icon
   When User clicks on Select variable search bar
   When User selects AV updated name as the variable
   When User enters Dataset name
   When User clicks Add Dataset button
   Then User should logout
   Then User should close the ZTAA browser
  
@AddDatetimeDataset @DatetimeDataset
Scenario: Add new Datetime Dataset in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User clicks on Add Dataset icon
   When User clicks on Select variable search bar
   When User selects Datetime as the variable
   When User enters Dataset name
   When User clicks Add Dataset button
   Then User should logout
   Then User should close the ZTAA browser

   
@AddDatetimeRecordMon @DatetimeDataset @MondayDateTime
Scenario: Add new Monday Datetime Record in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User searches for Dataset
   Then User selects Dataset from search results
   Then User enables Edit mode for Data management
   When User clicks on Records tab
   When User clicks on Monday check box
   When User enters Monday Start Time
   When User enters Monday End Time
   When User clicks on Add Date time button
   Then User should logout
   Then User should close the ZTAA browser
   
@AddDatetimeRecordTue @DatetimeDataset @TuesdayDateTime
Scenario: Add new Tuesday Datetime Record in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User searches for Dataset
   Then User selects Dataset from search results
   Then User enables Edit mode for Data management
   When User clicks on Records tab
   When User clicks on Tuesday check box
   When User enters Tuesday Start Time
   When User enters Tuesday End Time
   When User clicks on Add Date time button
   Then User should logout
   Then User should close the ZTAA browser
  
   
@AddDatetimeRecordWed @DatetimeDataset @WedDateTime
Scenario: Add new Wednesday Datetime Record in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User searches for Dataset
   Then User selects Dataset from search results
   Then User enables Edit mode for Data management
   When User clicks on Records tab
   When User clicks on Wednesday check box
   When User enters Wednesday Start Time
   When User enters Wednesday End Time
   When User clicks on Add Date time button
   Then User should logout
   Then User should close the ZTAA browser 
   

   
@AddDatetimeRecordThur @DatetimeDataset @ThursdayDateTime
Scenario: Add new Thursday Datetime Record in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User searches for Dataset
   Then User selects Dataset from search results
   Then User enables Edit mode for Data management
   When User clicks on Records tab
   When User clicks on Thursday check box
   When User enters Thursday Start Time
   When User enters Thursday End Time
   When User clicks on Add Date time button
   Then User should logout
   Then User should close the ZTAA browser   

   
@AddDatetimeRecordFri @DatetimeDataset @FirdayDateTime
Scenario: Add new Friday Datetime Record in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User searches for Dataset
   Then User selects Dataset from search results
   Then User enables Edit mode for Data management
   When User clicks on Records tab
   When User clicks on Friday check box
   When User enters Friday Start Time
   When User enters Friday End Time
   When User clicks on Add Date time button
   Then User should logout
   Then User should close the ZTAA browser   

   
@AddDatetimeRecordSat @DatetimeDataset @SatDateTime
Scenario: Add new Saturday Datetime Record in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User searches for Dataset
   Then User selects Dataset from search results
   Then User enables Edit mode for Data management
   When User clicks on Records tab
   When User clicks on Saturday check box
   When User enters Saturday Start Time
   When User enters Saturday End Time
   When User clicks on Add Date time button
   Then User should logout
   Then User should close the ZTAA browser   

   
@AddDatetimeRecordSun @DatetimeDataset @SundayDateTime
Scenario: Add new Sunday Datetime Record in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User searches for Dataset
   Then User selects Dataset from search results
   Then User enables Edit mode for Data management
   When User clicks on Records tab
   When User clicks on Sunday check box
   When User enters Sunday Start Time
   When User enters Sunday End Time
   When User clicks on Add Date time button
   Then User should logout
   Then User should close the ZTAA browser   
   
     
@RemoveDatetimeRecordMon @DatetimeDataset @MondayDateTime
Scenario: Remove Monday Datetime Record in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User searches for Dataset
   Then User selects Dataset from search results
   Then User enables Edit mode for Data management
   When User clicks on Records tab
   When User clicks on Monday check box
   When User clicks on Add Date time button
   Then User should logout
   Then User should close the ZTAA browser
   
@RemoveDatetimeRecordTue @DatetimeDataset @TuesdayDateTime
Scenario: Remove Tuesday Datetime Record in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User searches for Dataset
   Then User selects Dataset from search results
   Then User enables Edit mode for Data management
   When User clicks on Records tab
   When User clicks on Tuesday check box
   When User clicks on Add Date time button
   Then User should logout
   Then User should close the ZTAA browser
  
   
@RemoveDatetimeRecordWed @DatetimeDataset @WedDateTime
Scenario: Remove Wednesday Datetime Record in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User searches for Dataset
   Then User selects Dataset from search results
   Then User enables Edit mode for Data management
   When User clicks on Records tab
   When User clicks on Wednesday check box
   When User clicks on Add Date time button
   Then User should logout
   Then User should close the ZTAA browser 
   

   
@RemoveDatetimeRecordThur @DatetimeDataset @ThursdayDateTime
Scenario: Remove Thursday Datetime Record in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User searches for Dataset
   Then User selects Dataset from search results
   Then User enables Edit mode for Data management
   When User clicks on Records tab
   When User clicks on Thursday check box
   When User clicks on Add Date time button
   Then User should logout
   Then User should close the ZTAA browser   

   
@RemoveDatetimeRecordFri @DatetimeDataset @FirdayDateTime
Scenario: Remove Friday Datetime Record in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User searches for Dataset
   Then User selects Dataset from search results
   Then User enables Edit mode for Data management
   When User clicks on Records tab
   When User clicks on Friday check box
   When User clicks on Add Date time button
   Then User should logout
   Then User should close the ZTAA browser   

   
@RemoveDatetimeRecordSat @DatetimeDataset @SatDateTime
Scenario: Remove Saturday Datetime Record in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User searches for Dataset
   Then User selects Dataset from search results
   Then User enables Edit mode for Data management
   When User clicks on Records tab
   When User clicks on Saturday check box
   When User clicks on Add Date time button
   Then User should logout
   Then User should close the ZTAA browser   

   
@RemoveDatetimeRecordSun @DatetimeDataset @SundayDateTime
Scenario: Remove Sunday Datetime Record in Data Management under Configauration

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab	
   When User searches for Dataset
   Then User selects Dataset from search results
   Then User enables Edit mode for Data management
   When User clicks on Records tab
   When User clicks on Sunday check box
   When User clicks on Add Date time button
   Then User should logout
   Then User should close the ZTAA browser       
  
@deleterecord @smoke
Scenario: Delete dataset record in Data Management 

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab
   When User searches for Dataset
   Then User selects Dataset from search results
   Then User enables Edit mode for Data management
   When User clicks on Records tab
   When User clicks on Delete icon for a Record
   Then User should logout
   Then User should close the ZTAA browser
   
   
@datasetdelete @smoke
Scenario: Delete dataset in Data Management 

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Configauration
   When User clicks on Data Management tab
   When User searches for Dataset
   Then User selects Dataset from search results
   Then User enables Edit mode for Data management
   When User clicks on Actions tab for Data management
   When User clicks on Delete icon for Data management
   Then User confirm dataset delete
   Then Dataset is deleted
   Then User should logout
   Then User should close the ZTAA browser