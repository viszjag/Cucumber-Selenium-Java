Feature: Login into account
Scenario: Login into account with valid crednetials
     Existing stckoverflow user should be able to login successfully
     
Given User navigates to stackoverflow login page
And User clicks on login option
And User enters username
And user enters password
When User clicks on login button
Then User should be navbigated to successful login page