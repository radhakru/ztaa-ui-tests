Feature: ZTAA Console: Perimeter Management - Agent Release Test


@agentRelease @smoke
Scenario: validate the different resultset display in Agent Release
     
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   Then User clicks on Agent Release
   Then User clicks on edit button of Agent Release
   Then User clicks on show 10 of agent release
   Then User clicks on show 20 of agent release
   Then User clicks on show 50 of agent release
   Then User clicks on show 100 of agent release
   Then User should logout
   Then User should close the ZTAA browser
   
   
@agentpublish
Scenario: Agent Release UI in Perimeter management 
     
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Perimeter Management
   Then User clicks on Agent Release
   Then User clicks on edit button of Agent Release
   Then User clicks on show 50 of agent release and click on publish button
   Then User should logout
   Then User should close the ZTAA browser
   
   
