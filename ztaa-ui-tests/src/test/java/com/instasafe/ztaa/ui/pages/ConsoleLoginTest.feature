Feature: ZTAA Console: Login Test

@login @smoke
Scenario: Login scenario

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   Then User should logout
   Then User should close the ZTAA browser
   
   
@loginerrors @smoke
Scenario: Validate the error messages related to username in Login

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User clicks on Continue button without giving Username
   When User clicks on Continue button giving invalid Username
   Then User should close the ZTAA browser
  
   