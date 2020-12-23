Feature: Login Page Feature

Scenario: Login Page Title
Given user is on login page
When 	user gets title of the page
Then page title should be "My Store"

Scenario: Forgot Password Link
Given user is on login page
Then forgot password link should be present

Scenario: Login with correct credentials
Given user is on login page
When user enters username "dec2020secondbatch@gmail.com"
And user enyters password "Selenium@12345"
And user clicks on Login Button.
Then 	user gets title of the page
And page title should be "My Account"