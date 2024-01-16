

  Feature: testing

    @test
    Scenario: Search functionality
      When User Opens https://www.amazon.in/ web page
      Then User Clicks on the hamburger menu in the top left corner
      Then User Scrolls down and then Clicks on the TV, Appliances and Electronics link under Shop by Department section.
      Then Then click on Televisions under Tv, Audio & Cameras sub section.
      Then Scroll down and filter the results by Brand ‘Samsung’.
      Then Sort the Samsung results with price High to Low.
      Then Click on the second highest priced item (whatever that maybe at the time of automating).
      Then Switch the Window
      And Assert that “About this item” section is present and log this section text to console/report.
