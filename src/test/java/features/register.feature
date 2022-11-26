Feature: Regiastered in application
Scenario: New User Registerion
Given User is on the landing Page 
When User is register with following deatails 
|Arjun|abcdef|arjun@abcd.com|America|1234567890|
Then User Successfully Registered
And Verify thet Succesfully Registered is displayed


Scenario: New User2 Registerion
Given User2 is on the landing Page 
When User2 is register with following deatails 
|Arjun2|abcdef2|arjun2@abcd.com|America2|2234567890|
Then User2 Successfully Registered
And Verify thet Succesfully Registered is displayed
