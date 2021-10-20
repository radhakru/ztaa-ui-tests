Feature: ZTAA Console: Perimeter Management - Gateways Test
  

@gateway @gatewayadd
Scenario: Add new gateway in Perimeter Management

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Gateways tab
   When User clicks on Add Gateway icon
   When User checks Private gateway checkbox and clicks on Next
   When User enters access code and clicks` on Next
   When User clicks on Authorize button
   Then User should logout
   Then User should close the ZTAA browser
   
@gateway @gatewayappadd @smoke
Scenario: Add application in Gateway

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Gateways tab
   When User searches for a gateway and clicks on the Gateway
   When User clicks on Applications tab in Gateway
   When User clicks on Add application
   When User selects the application and adds application
   Then User should logout
   Then User should close the ZTAA browser 
   
@gateway @gatewayappdel @smoke
Scenario: Delete application in Gateway

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Gateways tab
   When User searches for a gateway and clicks on the Gateway
   When User clicks on Applications tab in Gateway
   When User deletes the Application
   Then User should logout
   Then User should close the ZTAA browser
   
@gateway @gatewaydisable
Scenario: Disable the Gateway in Perimeter management

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Gateways tab
   When User searches for a gateway and clicks on the Gateway
   When User clicks on Action tab
   When User disables the Gateway
   Then User should logout
   Then User should close the ZTAA browser
   
@gateway @gatewayenable
Scenario: Enable the Gateway in Perimeter management

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Gateways tab
   When User searches for a gateway and clicks on the Gateway
   When User clicks on Action tab
   When User enables the Gateway
   Then User should logout
   Then User should close the ZTAA browser
   
 @gateway @gatewaydelete
Scenario: Delete the Gateway in Perimeter management

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Gateways tab
   When User searches for a gateway and clicks on the Gateway
   When User clicks on Action tab
   When User deletes the Gateway
   Then User should logout
   Then User should close the ZTAA browser  
   
 @gateway @gatewaybuttons
Scenario: All buttons in Gateway

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   When User clicks on Gateways tab
   When User clicks on Name button
   When User clicks on Created Time button
   When User clicks on Sorted in Ascending arrow
   When User clicks on Sorted in Decending arrow
   When User clicks on Show 10 button
   When User clicks on Show 20 button
   When User clicks on Show 50 button
   When User clicks on Show 100 button
   When User clicks on Sync Application button
   Then User should logout
   Then User should close the ZTAA browser
