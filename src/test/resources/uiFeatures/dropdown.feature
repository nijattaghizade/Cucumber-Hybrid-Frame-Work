Feature: As a user I should be able to select dropdown

  @dropdown
  Scenario: Select random dropdown
     Given User Navigates to "http://the-internet.herokuapp.com"
     Then User clicks dropdown from available examples
     And User selects rondom dropdown from Dropdown List


