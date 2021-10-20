Feature: Downloads

@downloads
Scenario: Download Agent from Download Tab
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Downloads
    Then User clicks on download agent for windows
    Then User should logout
    Then User should close the ZTAA browser
    
    
    @notyourOS
Scenario: check not your OS button from Downloads Tab
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Downloads
    Then User clicks on not your OS
    Then User clicks on windows
    Then User clicks on Linux
    Then User should logout
    Then User should close the ZTAA browser
    
     @notyourOSMac
Scenario: check not your OS and select MacOS from Downloads Tab
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Downloads
    Then User clicks on not your OS
    Then User clicks on MacOS
    Then User should logout
    Then User should close the ZTAA browser