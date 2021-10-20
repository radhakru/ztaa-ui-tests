Feature: ZTAA Console: Audit Test


@AuditRecentActiveUsers
Scenario: Recent Active users tab in Audits
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on Recent active users and see list of live user
    Then User should logout
    Then User should close the ZTAA browser

@AuditGatewaystatus
Scenario: Gateway status from Audit Tab
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on Gateway Status of audits
    Then User should logout
    Then User should close the ZTAA browser
    
    @sortingAuditGatewaystatus
Scenario: sorting of Gateway status from Audit Tab
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on Gateway Status of audits
    Then User clicks on sorted in descending order of gateway status
    Then User clicks on sorted in ascending order of gateway status
    Then User should logout
    Then User should close the ZTAA browser
    
@showlistAuditGatewaystatus
Scenario: show list of Gateway status from Audit Tab
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on Gateway Status of audits
    Then User clicks on show 10 of Audit
    Then User clicks on show 20 of Audit
    Then User clicks on show 50 of Audit
    Then User clicks on show 100 of Audit
    Then User should logout
    Then User should close the ZTAA browser
    
    
@searchAuditGatewaystatus @smoke
Scenario: Search Gateway status from Audit Tab
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on Gateway Status of audits
    Then User enter gateway name for search in gateway status audits 
    Then User should logout
    Then User should close the ZTAA browser
    
    
      @searcherrorAuditGatewaystatus
Scenario: Search Gateway status from Audit Tab
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on Gateway Status of audits
    Then User enter no charcter of gateway name for search in gateway status audits 
    Then User should logout
    Then User should close the ZTAA browser
    
    
     @showlistAuditAuthenticationLogs
Scenario: show list of Authentication Logs from Audit Tab
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on Authentication Logs of audits
    Then User clicks on show 10 of authentication logs in audits
    Then User clicks on show 20 of authentication logs in audits
    Then User clicks on show 50 of authentication logs in audits
    Then User clicks on show 100 of authentication logs in audits
    Then User should logout
    Then User should close the ZTAA browser
    
    
   @sortingAuditAuthenticationLogs
Scenario: sorting of Authentication Logs from Audit Tab
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on Authentication Logs of audits
    Then User clicks on sorted in descending order of audits
    Then User clicks on sorted in ascending order of audits
    Then User should logout
    Then User should close the ZTAA browser
    
    
@searchAuditAuthenticationsLogs
Scenario: Search Authentication logs from Audit Tab
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on Authentication Logs of audits
    Then User enter username for search in authentication logs audits 
    Then User should logout
    Then User should close the ZTAA browser
    
     @searcherrorAuditAuthLogs
Scenario: Search Authentication logs without any username in Audit Tab
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on Authentication Logs of audits
    Then User enter no charcter of username for search in authentication logs audits 
    Then User should logout
    Then User should close the ZTAA browser
   
   
   @AuditUserLogins
Scenario: User Logins tab in Audits
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on User Logins in Audits
    Then User clicks on sorted in descending order of audits
    Then User clicks on sorted in ascending order of audits
    Then User should logout
    Then User should close the ZTAA browser

 @AuditUserLoginsCSVdwnload
Scenario: CSV download User Logins tab in Audits
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on User Logins in Audits
    Then User clicks on export to cvs in audits
    Then User should logout
    Then User should close the ZTAA browser
    
    
      @searchAudituserlogin
Scenario: Search user logins from Audit Tab
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on User Logins in Audits
    Then User enter user name for search in User Logins audits 
    Then User should logout
    Then User should close the ZTAA browser


@AuditUserLoginsshowlist
Scenario: show list of User Logins tab in Audits
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on User Logins in Audits
    Then User clicks on show 10 of user logins in audits
    Then User clicks on show 20 of user logins in audits
    Then User clicks on show 50 of user logins in audits
    Then User clicks on show 100 of user logins in audits
    Then User should logout
    Then User should close the ZTAA browser


	@AuditUserLoginsselectdaterange
Scenario: select date range User Logins tab in Audits
    Given User launched ZTAA in the browser
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on User Logins in Audits
    Then User clicks on select date range  
    Then User clicks on yesterday
    Then User clicks on select date range  
    Then User clicks on Last 7 days
    Then User clicks on select date range  
    Then User clicks on Last 30 days
    Then User clicks on select date range  
    Then User clicks on This Month
    Then User clicks on select date range  
    Then User clicks on Last Month
    Then User clicks on select date range  
    Then User clicks on Custom range and select range and click on apply
    Then User should logout
    Then User should close the ZTAA browser
	
	@AuditUserLoginsCustomrange
Scenario: select custom  date range User Logins tab in Audits
    Given User launched ZTAA in the browser
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on User Logins in Audits
    Then User clicks on select date range 
    Then User clicks on Custom range and select range and click on apply
    Then User should logout
    Then User should close the ZTAA browser 
	
	
	
	
		@datarangeUserNameLookupAudit
Scenario: select date range Username Lookups tab in Audits
    Given User launched ZTAA in the browser
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on Username Lookups in Audits
    Then User clicks on select date range  
    Then User clicks on yesterday
    Then User clicks on select date range  
    Then User clicks on Last 7 days
    Then User clicks on select date range  
    Then User clicks on Last 30 days
    Then User clicks on select date range  
    Then User clicks on This Month
    Then User clicks on select date range  
    Then User clicks on Last Month
    Then User should logout
    Then User should close the ZTAA browser 
    
     @sortingUsernameLookupsAudit
Scenario: User name lookups tab in Audits
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on Username Lookups in Audits
    Then User clicks on sorted in descending order of audits
    Then User clicks on sorted in ascending order of audits
    Then User should logout
    Then User should close the ZTAA browser
	
	     @failedUsernameLookupsAudit
Scenario: list of  Failed User name lookups tab in Audits
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on Username Lookups in Audits
    Then User clicks on failed username lookups tab in audits
    Then User should logout
    Then User should close the ZTAA browser
	
	
	
	 @CSVdwnloadusernamelookup
Scenario: CSV download Username Lookups tab in Audits
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on Username Lookups in Audits
    Then User clicks on export to cvs in audits
    Then User should logout
    Then User should close the ZTAA browser
	
	@CustomrangeAuditUsernamelookups
Scenario: select custom  date range Username Lookups tab in Audits
    Given User launched ZTAA in the browser
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on Username Lookups in Audits
    Then User clicks on select date range 
    Then User clicks on Custom range and select range and click on apply
    Then User should logout
    Then User should close the ZTAA browser 
	
	
	@showlistusernamelookups
Scenario: show list of Username lookups tab in Audits
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on Username Lookups in Audits
    Then User clicks on show 10 of username lookups in audits
    Then User clicks on show 20 of username lookups in audits
    Then User clicks on show 50 of username lookups in audits
    Then User clicks on show 100 of username lookups in audits
    Then User should logout
    Then User should close the ZTAA browser
	
	
	
	  @searchusernamelookupsAudit
Scenario: Search username lookups from Audit Tab
    Given User launched ZTAA in the browser
    Then Verify ZTAA login page is displayed
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on Username Lookups in Audits
    Then User enter user name for search in Username Lookups audits 
    Then User should logout
    Then User should close the ZTAA browser
	
	
	
	
	
		
	@AuditExports
Scenario: sorted in ascending and descending order of exports tab in Audits
    Given User launched ZTAA in the browser
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on Exports in Audits
    Then User clicks on sorted in descending order of audits
    Then User clicks on sorted in ascending order of audits
    Then User should logout
    Then User should close the ZTAA browser
    
    
	@showlistAuditExports
Scenario: show list  of exports tab in Audits
    Given User launched ZTAA in the browser
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on Exports in Audits
    Then User clicks on show 10 of exports in audits
    Then User clicks on show 20 of exports in audits
    Then User clicks on show 50 of exports in audits
    Then User clicks on show 100 of exports in audits
    Then User should logout
    Then User should close the ZTAA browser
    
    
    @csvAuditExports
Scenario: csv download  exports tab in Audits
    Given User launched ZTAA in the browser
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on Exports in Audits
    Then User clicks on csv download of exports in audits
    Then User should logout
    Then User should close the ZTAA browser
    
     @addAuditExports @Addexport
Scenario: add all new export  in exports tab of Audits
    Given User launched ZTAA in the browser
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on Exports in Audits
    Then User clicks on add new export plus sign and select exports type
    Then User clicks on submit button in exports tab
    Then User clicks on add new export plus sign and select exports type gateway status
    Then User clicks on submit button in exports tab
    Then User clicks on add new export plus sign and select exports type policy status
    Then User clicks on submit button in exports tab
    Then User clicks on add new export plus sign and select exports type tenant app 
    Then User clicks on submit button in exports tab
    Then User clicks on add new export plus sign and select exports type users
    Then User clicks on submit button in exports tab
    Then User clicks on add new export plus sign and select exports type user groups
    Then User clicks on submit button in exports tab
    Then User clicks on add new export plus sign and select exports type user last login
    Then User clicks on submit button in exports tab
    Then User clicks on add new export plus sign and select exports type user logins
    Then User clicks on submit button in exports tab
    Then User should logout
    Then User should close the ZTAA browser
    
     @addulookupsExports @Addexport
Scenario: add username lookups in exports tab of Audits
    Given User launched ZTAA in the browser
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on Exports in Audits
    Then User clicks on add new export plus sign and select exports type user lookups
    Then User clicks on select date range of userlookups and select
    Then User clicks on submit button in exports tab
    Then User should logout
    Then User should close the ZTAA browser
    
    
     @addTOTPverifeduserExports @Addexport
Scenario: add T-OTP verified users in exports tab of Audits
    Given User launched ZTAA in the browser
    When User enters Username and clicks on Continue button
    When User enters Password and clicks on Continue button
    Then User should see home page
    Then User clicks on Audit
    Then User clicks on Exports in Audits
    Then User clicks on add new export plus sign and select exports type TOTP veified user
    Then User clicks on submit button in exports tab
    Then User should logout
    Then User should close the ZTAA browser
    
 