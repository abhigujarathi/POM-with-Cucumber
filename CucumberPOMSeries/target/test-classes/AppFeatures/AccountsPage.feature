Feature: Accounts Page Feature

Background: 
Given user has already logged into application
	|username|password|
	|naveenanimation20@gmail.com|Selenium12345|
	
Scenario: Accounts page title
Given user is on Accounts Page
When user gets title of the page
Then page title should be "My Account - My Store"

Scenario: Accounts section count
Given use is on Accounts page
Then user gets accounts section
|Order Hitory and Details|
|My Credit slips|
|My Addresses|
|My Personal Information|
|My wishlists|
And accounts section count should be 4






























