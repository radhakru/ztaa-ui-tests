Feature: ZTAA Console: Identity Management - Auth Profile Test


@authuseradd  @smoke
Scenario: Add user in exclusion Auth Profile
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Identity Management
    Then User clicks on Auth Profile tab
    Then User clicks on Add icon under Exclusions in User tab
    Then User clicks on Add User button in Create section
    Then User searches with user name and selects it
    Then User clicks Add User button in the search window
    Then User selects Password as Primary Authentication and clicks on next
    Then User clicks next on Secondary Authentication
    Then User clicks next on Configuration
    Then User clicks on Submit
    Then User should logout
    Then User should close the ZTAA browser
    
    
@searchauthprofile
Scenario: Search Auth Profile of user
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Identity Management
    Then User clicks on Auth Profile tab
    Then User search for Auth Profile user
    Then User should logout
    Then User should close the ZTAA browser
    
    
@deleteauthprofile  @smoke
Scenario: Delete Auth Profile of user
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Identity Management
    Then User clicks on Auth Profile tab 
    Then User search for Auth Profile user
    Then User clicks on Edit button to update Auth Profile
    Then User clicks on Auth Profile Actions tab
    Then User clicks on Delete icon in Auth Profile
    Then User confirms to Delete Auth Profile
    Then User is confirmed of Auth Profile deletion
    Then User should logout
    Then User should close the ZTAA browser
    
    
@showauth 
Scenario: show list of  Auth Profile user
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Identity Management
    Then User clicks on Auth Profile tab
    Then User clicks on show 10 of auth profile
    Then User clicks on show 20 of auth profile
    Then User clicks on show 50 of auth profile
    Then User clicks on show 100 of auth profile
    Then User should logout
    Then User should close the ZTAA browser
    
    
 @sortingauth
 Scenario: show list of  Auth Profile user
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Identity Management
    Then User clicks on Auth Profile tab
    Then User clicks on sort by Created name
    Then User clicks on sort by Display name
    Then User should logout
    Then User should close the ZTAA browser
        
    
@sortauthascendinggroup 
 Scenario: show list of  Auth Profile user
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Identity Management
    Then User clicks on Auth Profile tab
    Then User clicks on Groups under Exclusion
    Then User clicks on sorted in ascending order
    Then User clicks on decending order
    Then User should logout
    Then User should close the ZTAA browser
    
        
@createauthausergroupexcusion 
 Scenario: show list of  Auth Profile user
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Identity Management
    Then User clicks on Auth Profile tab
    Then User clicks on Groups under Exclusion
    Then User clicks on Add icon under Exclusions in User tab
    Then User clicks on Add User button in Create section of user group
    Then User searches with user group name and selects it
    Then User clicks Add Group button in the search window
    Then User selects Password as Primary Authentication and clicks on next
    Then User clicks next on Secondary Authentication
    Then User clicks next on Configuration
    Then User clicks on Submit
    Then User should logout
    Then User should close the ZTAA browser
    
    
@searchauthprofileusergrp  
Scenario: Delete Auth Profile of user group
   Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Identity Management
    Then User clicks on Auth Profile tab
    Then User clicks on Groups under Exclusion
    Then User search for Auth Profile user group
    Then User should logout
    Then User should close the ZTAA browser
    
   
@sortauthascending
 Scenario: show list of  Auth Profile user
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Identity Management
    Then User clicks on Auth Profile tab
    Then User clicks on sorted in ascending order
    Then User clicks on decending order
    Then User should logout
    Then User should close the ZTAA browser
    

@authADuseradd
Scenario: Add  AD user in exclusion Auth Profile
   Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Identity Management
    Then User clicks on Auth Profile tab
    Then User clicks on Add icon under Exclusions in User tab
    Then User clicks on Add User button in Create section
    Then User search for AD user in Auth Profile user
    Then User clicks Add User button in the search window
    Then User selects AD as Primary Authentication and clicks on Add AD
    Then User enters AD Server name 
    Then User enters AD Domain name 
    Then User select Gateway and enable edit toggle of gateway
    Then User clicks next on Primary Authentication
    Then User clicks next on Secondary Authentication
    Then User clicks next on Configuration
    Then User clicks on Submit
    Then User should logout
    Then User should close the ZTAA browser
    
    
@authADuserdisable
Scenario: Disable AD user in exclusion Auth Profile
   Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Identity Management
    Then User clicks on Auth Profile tab
    Then User search for Auth Profile AD user under Users
    Then User clicks on Edit button to update Auth Profile
    Then User clicks on Auth Profile Actions tab
    Then User clicks on Disable icon in Auth Profile
    Then User should logout
    Then User should close the ZTAA browser
    
   
@authADuserdelete
Scenario: delete  AD user in exclusion Auth Profile
   Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Identity Management
    Then User clicks on Auth Profile tab
    Then User search for Auth Profile AD user under Users
    Then User clicks on Edit button to update Auth Profile
    Then User clicks on Auth Profile Actions tab
    Then User clicks on Delete icon in Auth Profile
    Then User confirms to Delete Auth Profile
    Then User is confirmed of Auth Profile deletion
    Then User should logout
    Then User should close the ZTAA browser
    