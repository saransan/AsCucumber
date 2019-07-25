
@tag
Feature: To test add customer  functionality

  @tag1
  Scenario: To test the generate customer Id functionality
    Given the user is in add customer page
    When the user fill in valid customer details
    |firstName|vijay|
    |lastName|Saran|
    |email|er@gmail.com|
    |address|Chennai|
    |phoneNum|956622333|
    And the user clicks the submit button
    Then the user should see the customer id generated
    

 

  @tag1
  Scenario: To test the generate customer Id functionality
    Given the user is in add customer page
    When the user fill invalid customer details
    |firstName|vijay|
    |lastName|Saran|
    |email|er@gmail.com|
    |address|Chennai|
    |phoneNum||
    And the user clicks the submit button
    Then the user should see the error message