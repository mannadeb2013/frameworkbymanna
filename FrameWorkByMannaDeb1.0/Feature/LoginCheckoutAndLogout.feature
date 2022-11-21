

Feature: Testing LogIn and Checkout Functionality to the WebApplication

Background: User can Login using the correct username and password

    Given One User Open The Browser
    And Two User Navigate to  "https://www.saucedemo.com/"
    And User put Valid User Name
    And User put Valid  User Password
    And User Click on Submit Button
    Then User  Successfully Logged in In page
   
   
   Scenario: User is able to Add Product On the Cart 
   When User Click on The Sauce Labs Backpack
   And User Click on Shopping Cart 
   And User Clicks On CheckOut Button 
   And User Put Valid FirstName
   And USer Put Valid LastName
   And User Put Valid Zip code
   And User Click on Continue
   And User go to Checkout/OverReview page and click On Finish
   Then User Displayed Thank You FOr Your Order Page Message
   
   Scenario: User is able to  Successfully Log Out
   When User Click on Menu bar
   And User Click on Logout  button
   Then User should Successfully Log out 
   
