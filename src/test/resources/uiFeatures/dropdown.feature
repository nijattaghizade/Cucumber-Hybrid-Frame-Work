Feature: Select Dropdown
@Dropdown
  Scenario: Select Dropdown
    Given User Navigates to given page "https://demo.automationtesting.in/Register.html"
    Then Locate the dropdown “Year”
    And Print all options for “Year”dropdown on your console
    And Select your 2015 from “Year” dropdown