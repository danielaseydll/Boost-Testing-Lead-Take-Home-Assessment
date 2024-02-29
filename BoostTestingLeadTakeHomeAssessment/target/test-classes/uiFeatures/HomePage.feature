@HomePage @Regression
  Feature: This feature file validates Home Page Functionality

    Background:
    Given User navigates to Boost Payment Solutions home Page

    Scenario: User should be able to click on the header list tabs on Homepage
      Given User clicks on "Get Started" Header

    Scenario Outline: User should be able to validate list of tabs on HRM Homepage
      And User retrieves the list of tabs on front page and save to a "<fileType>" with title “BoostBB_HeadersListing”
      Then User get screenshot of screen and save as PNG with title “BoostB2B_Headers”
      Examples:
        |fileType|
        | .csv   |
        | .txt   |

