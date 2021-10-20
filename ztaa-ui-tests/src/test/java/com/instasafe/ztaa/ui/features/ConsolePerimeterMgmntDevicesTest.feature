Feature: ZTAA Console: Perimeter Management - Devices Test


@searchdevice @smoke @regression
Scenario: User search for device in Perimeter management

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   Then User clicks on Devices
   Then User enters Devices name for search
   Then User should logout
   Then User should close the ZTAA browser
   
   
@csvdwnloaddevice 
Scenario: CSV download of device 

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   Then User clicks on Devices
   Then User clicks on CSV download of Device
   Then User should logout
   Then User should close the ZTAA browser
   
   
@blockunblockdevice @smoke @regression
Scenario: block device in Perimeter management 
     
    Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   Then User clicks on Devices
   Then User enters Devices name for search
   Then User clicks on Device for select
   Then User Enable edit button of device
   And  User clicks on Action tab of device
   And  User clicks on Enable or disable toggle
   Then User should logout
   Then User should close the ZTAA browser
   

@deviceinventoryatributes @regression
Scenario: Attributes under devices
    Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   Then User clicks on Devices
   Then User enters Devices name for search
   Then User clicks on Device for select
   Then User Enable edit button of device
   And  User clicks on Atributes tab of device
   Then User should logout
   Then User should close the ZTAA browser
   
@deviceNetworkinterface @regression
Scenario: List of network interfaces under devices
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   Then User clicks on Devices
   Then User enters Devices name for search
   Then User clicks on Device for select
   Then User Enable edit button of device
   And  User clicks on Network Interfaces tab of device
   Then User should logout
   Then User should close the ZTAA browser
   
   
@DeviceShowlist @regression
Scenario: List of network interfaces under devices
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   Then User clicks on Devices
   Then User Enable edit button of device
   Then User clicks on show 10 of devices
   Then User clicks on show 20 of devices
   Then User clicks on show 50 of devices
   Then User clicks on show 100 of devices
   Then User should logout
   Then User should close the ZTAA browser
   

@DeviceSortby @regression
Scenario: Sort devices by Created Time and Name
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   Then User clicks on Devices
   Then User clicks on Created Time of Devices
   Then User clicks on Name of Devices
   Then User should logout
   Then User should close the ZTAA browser


@DeviceAscendingDescending
Scenario: sorting in ascending and decending order under device in Perimeter management
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   Then User clicks on Devices
   Then User clicks on sorting in Ascending order
   Then User clicks on sorting in Descending order
   Then User should logout
   Then User should close the ZTAA browser

   
     @deviceapprovals
Scenario: Approvals device in Perimeter management 
     
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   Then User clicks on Devices
   Then User clicks on Approvals of devices tab
   Then User Enable edit button of device
   Then User should logout
   Then User should close the ZTAA browser
   
    @deviceapprovalsCSV
Scenario: Approvals csv download device in Perimeter management 
     
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   Then User clicks on Devices
   Then User clicks on Approvals of devices tab
   Then User clicks on CSV download of Device
   Then User should logout
   Then User should close the ZTAA browser
   
   
    @deviceapprovalsAscendingDescending
Scenario: Sort Device Approvals in Ascending and Descending order
     
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   Then User clicks on Devices
   Then User clicks on Approvals of devices tab
   Then User clicks on sorting in Ascending order
   Then User clicks on sorting in Descending order
   Then User should logout
   Then User should close the ZTAA browser
   
     @deviceapprovalsSortby
Scenario: Sort Device Approvals by Created Time, User Name and Device Name
     
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   Then User clicks on Devices
   Then User clicks on Approvals of devices tab
   Then User clicks on Created Time of Devices approvals
   Then User clicks on User Name of Approved Devices
   Then User clicks on Device Name of Approved Devices
   Then User should logout
   Then User should close the ZTAA browser
   
