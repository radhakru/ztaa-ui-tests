Feature: ZTAA Console: Access Policies Test

@accesspoliciesadd @accesspolicies @smoke 
Scenario: Add new policy in Access Policies

   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Access Policies
   When User clicks on Add Policy icon
   When User gives Policy Basic information and clicks Next
   When User gives user details to be added to the Policy and clicks Next
   When User gives application details to be added to the Policy and clicks Next
   When User gives Policy manage rules details and clicks Next
   When User gives Policy authentication details and clicks Next
   When User submits Policy by clicking Submit
   Then User should logout
   Then User should close the ZTAA browser
   
@accesspoliciesdelete @accesspolicies @smoke
Scenario: Delete policy in Access Policies
   Given User launched ZTAA in the browser
   Then Verify ZTAA login page is displayed
   When User enters Username and clicks on Continue button
   When User enters Password and clicks on Continue button
   Then User should see home page
   When User clicks on Access Policies
   Then User searches for a Access Policy
   Then  User selects Access Policy from search results
   Then User clicks the Edit button to update Access Policy
   And  User clicks on the Actions tab in the selected Access Policy
   Then User clicks on the Delete icon to delete the Access Policy
   And  User confirms to delete the Access Policy
   Then User gets confirmation on the Access Policy deletion
   Then User should logout
   Then User should close the ZTAA browser
   