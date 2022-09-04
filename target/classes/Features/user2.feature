Feature: user should able to login to the system

Background: user open browser and go to login page
Scenario: user login with valid username and password
Given user navigates to login page
When user enter valid username and password
And user click on login button
    #expected result
Then the user cant login
