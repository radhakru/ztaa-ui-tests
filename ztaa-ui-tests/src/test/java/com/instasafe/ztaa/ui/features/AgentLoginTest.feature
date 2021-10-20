Feature: ZTAA Agent Login

@agent
Scenario: Agent Login scenario

   Given User launched ZTAA Agent
   Then Verify ZTAA Agent is launched
   When User enters Username and clicks on Continue button in ZTAA Agent
   When User enters Password and clicks on Continue button in ZTAA Agent
   Then User should get Agent home page
   Then User should logout of ZTAA Agent
   Then User should close the ZTAA Agent