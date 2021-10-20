Feature: ZTAA Console: Identity Management - User Groups Test

@createusergrp @usersgroup @smoke
Scenario: Create User Group and add user

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Identity Management
   Then User clicks on User Groups tab
   Then User clicks on Add icon in User Groups
   Then User enter User Group name
   Then User clicks on Next after entering User Group name
   Then User clicks on Add User button to add user to User Group
#   Then User enters user name in Add member field and select user
	 Then User searches user to be added to User group and clicks on Add
   Then User clicks on Create group
   Then User should logout
   Then User should close the ZTAA browser
 
 
@searchusergrp @usersgroup
Scenario: Search user in user group Identity management
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Identity Management
   Then User clicks on User Groups tab
   Then User searches for User Group
   Then User should logout
   Then User should close the ZTAA browser  
   
   @showug @usersgroup
Scenario: Show list user in user group Identity management
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Identity Management
   Then User clicks on User Groups tab
   Then User clicks on show 10 of User Group
   Then User clicks on show 20 of User Group
   Then User clicks on show 50 of User Group
   Then User clicks on show 100 of User Group
   Then User should logout
   Then User should close the ZTAA browser  
   
     @updateug
   Scenario: user group update in Identity management
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Identity Management
   Then User clicks on User Groups tab
   Then User searches for User Group 
   And  User select user group name 
   Then User enable edit of user group name 
   Then User enters updated user group name
   And  User clicks on Update button of user group
   Then User should logout
   Then User should close the ZTAA browser
   
     @sortingug @usersgroup
Scenario: Sorting user in user group Identity management
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Identity Management
   Then User clicks on User Groups tab
   Then User clicks on sort by Created time of User group
   Then User clicks on sort by Name of User group
   Then User clicks on sort by Active state of User group
   Then User should logout
   Then User should close the ZTAA browser
   

   
@deleteusergrp @usersgroup @smoke
Scenario: Delete User Group
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Identity Management
    Then User clicks on User Groups tab
    Then User searches for User Group
    Then User selects User Group and clicks on Action tab
    Then User clicks on Edit button to update User Group
    Then User clicks on delete icon to delete User Group
    Then User confirms deleting of the User Group
    Then User should logout
    Then User should close the ZTAA browser
    
    
    @deleteusergrpexternally @usersgroup
Scenario: Delete User Group Externally
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Identity Management
    Then User clicks on User Groups tab
    Then User searches for User Group
    Then User click on checkbox of Users
    Then User click on vertical arrow
    Then User click on yes delete them button
    Then User confirms deleting of the User Group
    Then User should logout
    Then User should close the ZTAA browser