Feature: ZTAA Console: Perimeter Management - Applications Test

@createappln @appln @smoke
Scenario: Add new web application in Perimeter Management

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User clicks on Add Applications icon
   When User selects Web Application create
   When User fills Application details
   When User clicks Add Application
   Then User should logout
   Then User should close the ZTAA browser
   
   
@searchappln @appln
Scenario: Search application in Perimeter Management

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User searches for application
   Then User selects application from search results
   Then User should logout
   Then User should close the ZTAA browser
   
@disableappln @appln
Scenario: Disable application in Perimeter Management

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User searches for application
   Then User clicks Application Edit from toggle
   Then User selects application from search results
   Then User clicks Application Actions tab
   When User clicks on Disable icon
   Then User should logout
   Then User should close the ZTAA browser


@enableappln @appln
Scenario: Enable application in Perimeter Management

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User searches for application
   Then User clicks Application Edit from toggle
   Then User selects application from search results
   Then User clicks Application Actions tab
   When User clicks on Enable icon
   Then User should logout
   Then User should close the ZTAA browser   

   
@applnbutton @appln
Scenario: All buttons in application

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User clicks on Name button inside Application tab
   When User clicks on Created Time button inside Application tab
   When User clicks on Sorted in Ascending arrow inside Application tab
   When User clicks on Sorted in Decending arrow inside Application tab
   When User clicks on Next page button inside Application tab
   When User clicks on Previous page button inside Application tab
   When User clicks on Show 10 button inside Application tab
   When User clicks on Show 20 button inside Application tab
   When User clicks on Show 50 button inside Application tab
   When User clicks on Show 100 button inside Application tab
   When User searches for application
   Then User selects application from search results
   Then User should logout
   Then User should close the ZTAA browser
   

   
@enabledirectaccessweb
Scenario: Enable Direct Access toggle button for web application

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User searches for application
   Then User clicks Application Edit from toggle
   Then User selects application from search results
   When User enables Direct access toggle for web application
   When User clicks on Update application button
   Then User should logout
   Then User should close the ZTAA browser
   
@disabledirectaccessweb
Scenario: Disable Direct Access toggle button for web application

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User searches for application
   Then User clicks Application Edit from toggle
   Then User selects application from search results
   When User disables Direct access toggle for web application
   Then User clicks on Update application button
   Then User should logout
   Then User should close the ZTAA browser
   
@enablenetaccessweb
Scenario: Enable Network Access toggle button for web application

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User searches for application
   Then User clicks Application Edit from toggle
   Then User selects application from search results
   When User enables Network access toggle for web application
   When User enters cidr value for web application
   When User clicks on Update application button
   Then User should logout
   Then User should close the ZTAA browser
   
@disablenetaccessweb
Scenario: Disable Network Access toggle button for web application

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User searches for application
   Then User clicks Application Edit from toggle
   Then User selects application from search results
   When User removes cidr value for web application
   When User disables Network access toggle for web application
   Then User clicks on Update application button
   Then User should logout
   Then User should close the ZTAA browser
   
@deleteappln @appln @smoke
Scenario: Delete application in Perimeter Management

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User searches for application
   Then User clicks Application Edit from toggle
   Then User selects application from search results
   Then User clicks Application Actions tab
   Then User clicks Application Delete icon
   Then User confirm to delete application
   Then Application is deleted
   Then User should logout
   Then User should close the ZTAA browser   
   
@enableIEmodeweb @LegacyIEModeweb
Scenario: Enable Legacy IE Mode toggle button for web application

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User searches for application
   Then User clicks Application Edit from toggle
   Then User selects application from search results
   When User enables Legacy IE Mode for web application
   When User clicks on Update application button
   Then User should logout
   Then User should close the ZTAA browser
   
@disableIEmodeweb @LegacyIEModeweb
Scenario: Disable Legacy IE Mode toggle button for web application

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User searches for application
   Then User clicks Application Edit from toggle
   Then User selects application from search results
   When User disables Legacy IE Mode toggle for web application
   Then User clicks on Update application button
   Then User should logout
   Then User should close the ZTAA browser
   
@enablePreventclientweb @PreventClientChecksweb
Scenario: Enable Prevent client check toggle button for web application

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User searches for application
   Then User clicks Application Edit from toggle
   Then User selects application from search results
   When User enables Prevent client check toggle for web application
   When User clicks on Update application button
   Then User should logout
   Then User should close the ZTAA browser
   
@disablePreventclientweb @PreventClientChecksweb
Scenario: Disable Prevent client checks toggle button for web application

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User searches for application
   Then User clicks Application Edit from toggle
   Then User selects application from search results
   When User disables Prevent client check toggle for web application
   Then User clicks on Update application button
   Then User should logout
   Then User should close the ZTAA browser
     
 @enableBlockclipboardweb @BlockClipboardWeb
Scenario: Enable Block Clipboard Access toggle button for web application

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User searches for application
   Then User clicks Application Edit from toggle
   Then User selects application from search results
   When User enables Block Clipboard Access toggle for web application
   Then User clicks on Update application button
   Then User should logout
   Then User should close the ZTAA browser  
   
@disableBlockclipboardweb @BlockClipboardWeb
Scenario: Disable Block Clipboard Access toggle button for web application

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User searches for application
   Then User clicks Application Edit from toggle
   Then User selects application from search results
   When User disables Block Clipboard Access toggle for web application
   Then User clicks on Update application button
   Then User should logout
   Then User should close the ZTAA browser   
   
@enableBlockPopupweb @BlockPopupWeb
Scenario: Enable Block Popup toggle button for web application

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User searches for application
   Then User clicks Application Edit from toggle
   Then User selects application from search results
   When User enables Block Popup toggle for web application
   Then User clicks on Update application button
   Then User should logout
   Then User should close the ZTAA browser   
   
@disableBlockPopupweb @BlockPopupWeb
Scenario: Disable Block Popup toggle button for web application

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User searches for application
   Then User clicks Application Edit from toggle
   Then User selects application from search results
   When User disables Block Popup toggle for web application
   Then User clicks on Update application button
   Then User should logout
   Then User should close the ZTAA browser   
   
@enableBlockDownloadweb @BlockDownloadweb
Scenario: Enable Block Download toggle button for web application

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User searches for application
   Then User clicks Application Edit from toggle
   Then User selects application from search results
   When User enables Block Download toggle for web application
   Then User clicks on Update application button
   Then User should logout
   Then User should close the ZTAA browser   
   
@disableBlockDownloadweb @BlockDownloadweb
Scenario: Disable Block Download toggle button for web application

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User searches for application
   Then User clicks Application Edit from toggle
   Then User selects application from search results
   When User disables Block Download toggle for web application
   Then User clicks on Update application button
   Then User should logout
   Then User should close the ZTAA browser   
   
@enableHideAddressBarweb @HideAddressBarweb
Scenario: Enable Hide Address Bar toggle button for web application

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User searches for application
   Then User clicks Application Edit from toggle
   Then User selects application from search results
   When User enables Hide Address Bar toggle for web application
   Then User clicks on Update application button
   Then User should logout
   Then User should close the ZTAA browser   
     
@disableHideAddressBarweb @HideAddressBarweb
Scenario: Disable Hide Address Bar toggle button for web application

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User searches for application
   Then User clicks Application Edit from toggle
   Then User selects application from search results
   When User disables Hide Address Bar toggle for web application
   Then User clicks on Update application button
   Then User should logout
   Then User should close the ZTAA browser

@enableBlockScreenCaptureweb @BlockScreenCaptureweb
Scenario: Enable Block Screen Capture toggle button for web application

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User searches for application
   Then User clicks Application Edit from toggle
   Then User selects application from search results
   When User enables Block Screen Capture toggle for web application
   Then User clicks on Update application button
   Then User should logout
   Then User should close the ZTAA browser

@disableBlockScreenCaptureweb @BlockScreenCaptureweb
Scenario: Disable Block Screen Capture toggle button for web application

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User searches for application
   Then User clicks Application Edit from toggle
   Then User selects application from search results
   When User disables Block Screen Capture toggle for web application
   Then User clicks on Update application button
   Then User should logout
   Then User should close the ZTAA browser   
   
@enableRecordAppScreenweb @RecordAppScreenweb
Scenario: Enable Record Application Screen toggle button for web application

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User searches for application
   Then User clicks Application Edit from toggle
   Then User selects application from search results
   When User enables Record Application Screen toggle for web application
   Then User clicks on Update application button
   Then User should logout
   Then User should close the ZTAA browser

@disableRecordAppScreenweb @RecordAppScreenweb
Scenario: Disable Record Application Screen toggle button for web application

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User searches for application
   Then User clicks Application Edit from toggle
   Then User selects application from search results
   When User disables Record Application Screen toggle for web application
   Then User clicks on Update application button
   Then User should logout
   Then User should close the ZTAA browser   
   
 @SSHappln @SSHapplnadd
Scenario: Add new SSH application in Perimeter Management

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User clicks on Add Applications icon
   When User selects SSH Application to add
   When User enters Application name
   When User enters Application Hostname
   When User clicks Add Application
   Then User should logout
   Then User should close the ZTAA browser


@RDPappln @RDPapplnadd
Scenario: Add new RDP application in Perimeter Management

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User clicks on Add Applications icon
   When User selects RDP Application to add
   When User enters Application name
   When User enters Application Hostname
   When User clicks Add Application
   Then User should logout
   Then User should close the ZTAA browser


@Fileshareappln @Fileshareapplnadd
Scenario: Add new Fileshare application in Perimeter Management

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User clicks on Add Applications icon
   When User selects Fileshare Application to add
   When User enters Application name
   When User enters Application Hostname
   When User enters Shared Folder path
   When User clicks Add Application
   Then User should logout
   Then User should close the ZTAA browser

@Networkppln @NetworkapplnaddTCP
Scenario: Add new Network application(TCP) in Perimeter Management

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User clicks on Add Applications icon
   When User selects Network Application to add
   When User enters Application name
   When User clicks on protocol dropdown
   When User selects TCP protocol
   When User Enters IP address for Network app
   When User Enters Port number for Network app
   When User clicks on Save button for Network app
   When User clicks Add Application
   Then User should logout
   Then User should close the ZTAA browser

@Networkppln @NetworkapplnaddUDP
Scenario: Add new Network application(UDP) in Perimeter Management

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User clicks on Add Applications icon
   When User selects Network Application to add
   When User enters Application name
   When User clicks on protocol dropdown
   When User selects UDP protocol
   When User Enters IP address for Network app
   When User Enters Port number for Network app
   When User clicks on Save button for Network app
   When User clicks Add Application
   Then User should logout
   Then User should close the ZTAA browser

@Networkppln @NetworkapplnaddICMP
Scenario: Add new Network application(ICMP) in Perimeter Management

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Applications tab	
   When User clicks on Add Applications icon
   When User selects Network Application to add
   When User enters Application name
   When User clicks on protocol dropdown
   When User selects ICMP protocol
   When User Enters IP address for Network app
   When User clicks on Save button for Network app
   When User clicks Add Application
   Then User should logout
   Then User should close the ZTAA browser  
   