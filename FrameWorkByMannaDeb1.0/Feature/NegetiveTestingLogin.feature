
Feature: Testing the login functionality to the application 

Scenario Outline: This scenario test all invalid username and password 
Description: We can use boundary tests, State Transition techniques, etc.

Given I open the browser and I navigate to the application
When I enter "<Username >" and "<Password>"
And I click on the login button
Then I am suppose to get an error message

Examples: 

|Username  | Password |
|MannaDeb  |12345     |
|Debmanna  |56789     |
|Manna2013 |20890     |
|Manna8662 |190834    |