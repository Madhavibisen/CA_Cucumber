Feature: Login

Scenario Outline: Login with different credentials

Given Getting driver from the Landing Page of the application
When user click on SignIn
And User enters Email as "<email>" and Password as "<password>"
And Click on Submit

Examples:
|email|password|
|||
|simon@123|abcd|
|JackNJill@gmail.com|JackNJill@123|
