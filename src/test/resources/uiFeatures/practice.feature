Feature: This feature is verifying all practice tasks

  @downloadRun
  Scenario: User should be able to download file
    Given user navigates to download page
    Then user successfully downloads the file

#  Locate the element for ‘firstname’
#  Pass your first name using sendkeys method
#  Remove each letter of your first name using Keys.BACK_SPACE
#  Leave the initial letter of your first name
#  Note: You can use Thread.sleep() each time you remove a letter



  @practice
    Scenario: User should add Name and remove the latters except Initial Lettter

     Given User Navigates to given page "https://demo.automationtesting.in/Register.html"
      And User clicks "FirstName"



