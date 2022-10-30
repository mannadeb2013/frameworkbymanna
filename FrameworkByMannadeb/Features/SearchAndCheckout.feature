
Feature: testing the search functionality to the application 

Background: user is able to search the product 

When User click on search box and search for computers 
Then user can search for computers 

Scenario: User can customise computer and can add to the cart 
When User click on Build your own computer
And user select the processor,RAM,HDD,OS,Software 
And User click on the add to cart 
Then User is success to customize the computer and able to add the computer to the cart 

Scenario: User Can able to check out with the requirement Process
When User mouse over Shoping Cart and Click go to cart
And User click on the Terms and Codition box
And User click on Checkout button
And User fill up all the requirement Boxes 
And User Click on Continue Button
And User select Shipping Ground and Click Continue botton
And User Select Payment method and Click on Continue botton 
And User Click Continue2 botton 
And User Click on Confirm bottom 
Then User Can see Order Successfully processed message 
And User Click on Continue3 botton
And User is able to checkout