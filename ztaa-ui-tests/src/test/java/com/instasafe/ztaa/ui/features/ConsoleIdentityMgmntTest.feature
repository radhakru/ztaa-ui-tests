Feature: Identity Management

@addusergroup
Scenario: Create User Group and add user
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Identity Management
    Then User clicks on User Groups tab
    Then User clicks on Add icon in User Groups
    Then User enter User Group name
    Then User clicks on Next after entering User Group name
    Then User clicks on Add User button to add user to User Group
    Then User searches user to be added to User group and clicks on Add 
    Then User clicks on Create group
    Then User should logout
    Then User should close the ZTAA browser
    
    
@deleteusergroup
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

    
    
@searchauthprofilesort
Scenario: Search Auth Profile resultset sorting and count
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Identity Management
    Then User clicks on Auth Profile tab
    Then User clicks on arrow toggle and selects display name 
    Then User clicks on arrow toggle and selects created time
    Then User clicks on sorted in ascending order
    Then User clicks on decending order
    Then User clicks on show 10
    Then User clicks on show 20
    Then User clicks on show 50
    Then User clicks on show 100
    Then User should logout
    Then User should close the ZTAA browser
    
  
@CreateIdp
Scenario: Create Identity Provider
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    When User clicks on Identity Management
    When User clicks on Identity Provider
    When User click on add button of Identity Provider
    When User enters IDP name and select Generic SAML SP
    Then User clicks on Nextbutton
    Then User clicks on Generate Certificate 
    Then User enters ACS URL which is configured in Reamaze SP 
    And  User enters SP Entity ID and IDP entity ID
    Then User clicks on Attribute pluse sign
    And  User clicks on Attribure Formate and select unspecified
    Then User clicks on Select Type Email and enter attribute name
    Then User enables allow access from Browser
    Then User enables allow access from Desktop
    Then User enables allow access from Mobile
    When User clicks on next and submit then Identity provider should created successfully
    Then User should logout
    Then User should close the ZTAA browser    
 
 
 
 
 @SearchIdp
Scenario: Search Identity Provider
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    When User clicks on Identity Management
    When User clicks on Identity Provider
    Then User enters IDP name for search
    Then User should logout
    Then User should close the ZTAA browser   
    
    @searchErrorminimumcharIdp
Scenario: Search Identity Provider
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    When User clicks on Identity Management
    When User clicks on Identity Provider
    Then User enters invalid IDP name for search with two characters
    Then User should logout
    Then User should close the ZTAA browser 
    
      @searchInvalidIdp
Scenario: Search Identity Provider
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    When User clicks on Identity Management
    When User clicks on Identity Provider
    Then User enters Invalid IDP name for search
    Then User should logout
    Then User should close the ZTAA browser 
    
    @addappIdp
Scenario: Add Application in selected Identity Provider
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    When User clicks on Identity Management
    When User clicks on Identity Provider
    Then User enters IDP name for search
    Then User clicks on selected searched IDP Application
    Then User clicks on Application tab
    Then User Enable Edit 
    Then User clicks on Add Application Button
    When User enter application name in search box and add application successfully
    Then User should logout
    Then User should close the ZTAA browser
    
    @addappminicharIdperror
Scenario: Add Application in selected Identity Provider
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    When User clicks on Identity Management
    When User clicks on Identity Provider
    Then User enters IDP name for search
    Then User clicks on selected searched IDP Application
    Then User clicks on Application tab
    Then User Enable Edit 
    Then User clicks on Add Application Button
    When User enter application name in search box with two characters
    Then User should close the ZTAA browser
    
    
    
@removeappIdp
Scenario: Remove Application in Identity Provider
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    When User clicks on Identity Management
    When User clicks on Identity Provider
    Then User enters IDP name for search
    Then User clicks on selected searched IDP Application
    Then User clicks on Application tab
    Then User Enable Edit 
    When User should select application for delete
    Then User should logout
    Then User should close the ZTAA browser    
    
     
 
 
 @Deleteidp
Scenario: delete the identity provider  from Identity Provider Tab
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    When User clicks on Identity Management
    When User clicks on Identity Provider
    Then User enters IDP name for search
    Then User Enable Edit 
    Then User clicks on selected searched IDP Application
    Then User Go to Action 
    And  User clicks on deleteIDP
    Then User confirm  to delete while clicking Yes,Delete option
    Then User should logout
    Then User should close the ZTAA browser    
 
 @showlistIdp
Scenario: show list in Identity Provider
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    When User clicks on Identity Management
    When User clicks on Identity Provider
    Then User clicks on show 10 of IDP
    Then User clicks on show 20 of IDP
    Then User clicks on show 50 of IDP
    Then User clicks on show 100 of IDP
    Then User should logout
    Then User should close the ZTAA browser    
 
  @sortbyIdp
Scenario: sorty by option   from Identity Provider Tab
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    When User clicks on Identity Management
    When User clicks on Identity Provider
    Then User clicks on sort by toggle and select created time of IDP
    Then User clicks on sort by toggle and select Name of IDP
    Then User should logout
    Then User should close the ZTAA browser    
 
  @sortingascendingDecendingIdp
Scenario: sorted in asending or descending option in Identity Provider Tab
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    When User clicks on Identity Management
    When User clicks on Identity Provider
    Then User clicks on sorted in asending order arrow of IDP
    Then User clicks on sorted in decending order arrow of IDP
    Then User should logout
    Then User should close the ZTAA browser
 
 
@metaIDP
Scenario: download IDP meta data from Identity Provider
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    When User clicks on Identity Management
    When User clicks on Identity Provider
    Then User enters IDP name for search
    Then User clicks on selected searched IDP Application
    Then User clicks on Download IDP MetaData
    Then User should logout
    Then User should close the ZTAA browser

    
    
 @metaSP
Scenario: download SP meta data from Identity Provider
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    When User clicks on Identity Management
    When User clicks on Identity Provider
    Then User enters IDP name for search
    Then User clicks on selected searched IDP Application
    Then User clicks on BackEnd SAML and  Download SP MetaData
    
    
  