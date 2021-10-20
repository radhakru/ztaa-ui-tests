Feature:  Application Access

@applnaccessmcafee
Scenario: Login and app access scenario

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Application access
   When User clicks on Mcafee application
   
   
   @searchappInapplnaccess
Scenario: search app in app access 

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Application access
   When User enters app name for search in application access
   Then User should logout
   Then User should close the ZTAA browser
    