Feature: As a user I should be able to send keys to the field

  @sendkeys
  Scenario: Send keys to the field
    Given User Navigates to given page "https://demo.automationtesting.in/Register.html"
    Then User click first name
    And User sends first name to first name field
