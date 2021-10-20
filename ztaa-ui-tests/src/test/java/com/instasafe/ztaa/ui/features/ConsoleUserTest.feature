Feature: User Test

@createuser
Scenario: Create new user scenario

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Create User
   When User gives Name
   When User gives Email
   When User gives Phone Number
   Then User clicks Add User
   Then User should logout
   Then User should close the ZTAA browser
   
   
@searchuser
Scenario: Search user scenario

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Identity Management
   When User clicks on Users tab	
   When User Searches for User
   Then User detail should be retrieved
   Then User should logout
   Then User should close the ZTAA browser
   
   
 @deleteuser
Scenario: Delete user scenario

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Identity Management
   When User clicks on Users tab	
   When User Searches for User
   Then User detail should be retrieved
   Then User clicks Edit from toggle
   Then User selects profile from search results
   Then User clicks Actions tab
   Then User clicks Delete icon
   Then User confirm to delete profile
   Then User profile is deleted
   Then User should logout
   Then User should close the ZTAA browser