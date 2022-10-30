Feature: Testing the Register and Login/Logout functionality to the application 
 

@Registration 
 Scenario: User can Register with valid information
 
 Given Users open the browser
 And Users Navigate to "https://demo.nopcommerce.com/"
 When Users click on the register button 
 And Users select the Gender
 And Users enter the Name 
 And Users enter Date of birth 
 And Users enter Valid Email
 And Users enter Company Name 
 And Users enter Password and Confirm Password 
 And Users click on Register Button 
 Then Users Finishes registration
 
 
 
 @LogoutandLogin 
 Scenario: User logs out and Logs back inn with correct email and password
	Given Users displayed successfully register message and Logs out
	When User clicks the Login button
	And Enters the Email and Password
 	Then Users Logs in and navigates to home page 
 

