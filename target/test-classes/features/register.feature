Feature: Regiastered in application
Scenario: New User Registerion
Given User is on the landing Page 
When User is register with following deatails 
|Arjun|abcdef|arjun@abcd.com|America|1234567890|
Then User Successfully Registered
And Verify thet Succesfully Registered is displayed