Feature: Validating login functionality
//Background:
//Given User launches a specific application URL



@RegTest
Scenario Outline: Validate Login with the right username and password

Given User is on the login page
When User enters the username as <Username> and password as <Password>
And User clciks on the Login button
Then Application hompage will be displayed

Examples:
|Username|Password|
|User1|Password1|
|User2|Password2|
|User3|Password3|
|User4|Password4|

@SmokeTest
Scenario: Validate Login with the wrong username and password

Given User is on the login page
When User enters the wrong username as <Username> and password as <Password>
And User clicks on the Login button
Then Application displays error message