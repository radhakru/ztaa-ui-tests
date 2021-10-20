Feature: ZTAA Console: Identity Management - Users Test

@createuseridn  @idnusers @smoke
Scenario: Create new user from Identity Management Users tab

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Identity Management
   When User clicks on Users 
   When User clicks on add Users plus sign
   When User enters name and email or username
   When User select country code and enters phone number
   Then User clicks on add user button of users 
   Then User should logout
   Then User should close the ZTAA browser
   
   
@deleteuseridn @idnusers @smoke
Scenario: Delete user from Identity Management Users tab
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Identity Management
   When User clicks on Users 
   Then User search user name
   And  User select user name and clicks on Action Tab
   Then User enable edit for delete users
   And  User clicks on Delete button of users and confirm to delete user
   Then User clicks on OK and user is deleted
   Then User should logout
   Then User should close the ZTAA browser
   
@createadminuseridn  @idnusers
Scenario: Create new admin user from Identity Management Users tab

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Identity Management
   When User clicks on Users 
   When User clicks on add Users plus sign
   When User clicks on admin User toggle
   When User enters name and email or admin username
   When User select country code and enters phone number
   Then User clicks on add user button of users 
   Then User should logout
   Then User should close the ZTAA browser
   
    @enableadminuseridn  @idnusers
Scenario: Enable Admin user from Identity Management Users tab
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Identity Management
   When User clicks on Users 
   Then User search admin user name
   Then User clicks on checkbox of Admin users in users Tab
   Then User click on vertical arrow
   Then User click on enable button
   Then User click on yes enable them button
   Then User should logout
   Then User should close the ZTAA browser
   
   @disableadminuseridn  @idnusers
Scenario: Disable Admin user from Identity Management Users tab
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Identity Management
   When User clicks on Users 
   Then User search admin user name
   Then User clicks on checkbox of Admin users in users Tab
   Then User click on vertical arrow
   Then User click on disable button
   Then User click on yes disable them button
   Then User should logout
   Then User should close the ZTAA browser

@deleteadminuseridn  @idnusers
Scenario: Delete Admin user from Identity Management Users tab
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Identity Management
   When User clicks on Users 
   Then User search admin user name
   Then User clicks on checkbox of Admin users in users Tab
   Then User click on vertical arrow
   Then User click on delete button of selected admin user
   Then User click on yes disable them button of users
   Then User should logout
   Then User should close the ZTAA browser


@csvuserdwnload @idnusers
Scenario: CSV download from Identity Management Users tab
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Identity Management
   When User clicks on Users 
   Then User clicks on csv download
   Then User should logout
   Then User should close the ZTAA browser
   
@ADSyncUsers @idnusers
Scenario: ADsync button from Identity Management Users tab
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Identity Management
   When User clicks on Users 
   Then User clicks on AD sync button
   Then User should logout
   Then User should close the ZTAA browser
   
   
@ascendingUser @idnusers
Scenario: ascending or decending order arrow from Identity Management Users tab
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Identity Management
   When User clicks on Users 
   Then User clicks on sorted in ascending order
   Then User clicks on decending order
   Then User should logout
   Then User should close the ZTAA browser
   
   
@showuser @idnusers
Scenario: ascending or decending order arrow from Identity Management Users tab
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Identity Management
   When User clicks on Users 
   Then User clicks on show 10
   Then User clicks on show 20
   Then User clicks on show 50
   Then User clicks on show 100
   Then User should logout
   Then User should close the ZTAA browser
   
     @shortbyuser @idnusers
Scenario: sorting feature of  Identity Management Users tab
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Identity Management
   When User clicks on Users 
   Then User clicks on sort by Created time
   Then User clicks on sort by Name
   Then User clicks on sort by Active state
   Then User should logout
   Then User should close the ZTAA browser
   
    
     @enableuserexteranlly @idnusers
Scenario: Enable User externally feature of  Identity Management Users tab
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Identity Management
   When User clicks on Users 
   Then User click on checkbox of Users
   Then User click on vertical arrow
   Then User click on enable button
   Then User click on yes enable them button
   Then User should logout
   Then User should close the ZTAA browser
   
   
    @disableuserexteranlly @idnusers
Scenario: Enable User externally feature of  Identity Management Users tab
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Identity Management
   When User clicks on Users 
   Then User click on checkbox of Users
   Then User click on vertical arrow
   Then User click on disable button
   Then User click on yes disable them button
   Then User should logout
   Then User should close the ZTAA browser
   
   
   
   @blockunblockdeviceuser @idnusers
Scenario: Block device of  user from Identity Management Users tab
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Identity Management
   When User clicks on Users 
   Then User search user name for device block
   And  User select user name and clicks on Devices
   Then User enable edit for delete users
   Then User clicks on device toggle for block or unblock
   Then User should logout
   Then User should close the ZTAA browser