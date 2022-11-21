Feature: TEsting the register functionality to the Application 

Scenario: User is able to register with the required information 

Given user open the browser 
And user navigate to "https://demo.nopcommerce.com/"
When user click on register button 
And user select the Gender 
And user enter the Nmae 
And User enter date of birth 
And user enter email 
And user enter company Name 
And user enter password and confirm password 
And user click on register button 
Then user finishes registrstion 


Scenario: User is able to logout and lonin back with register email and password 

When User click on Logout button 
And user click in login button 
And user enter email and password 
And user click on submit button 
Then user navigate to home page 

 

