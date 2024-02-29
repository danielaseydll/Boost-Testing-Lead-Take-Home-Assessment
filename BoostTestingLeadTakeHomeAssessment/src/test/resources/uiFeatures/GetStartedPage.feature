@getStartedPage @Regression @Smoke
Feature: This feature file validates Get Started Page Functionality

  Background:
    Given User navigates to Boost Payment Solutions home Page
    Given User clicks on "Get Started" Header


  Scenario Outline: User should be able to fill out the form in Get Started Page
    Then User fills out the Get Started Page form with "<firstName>", "<lastName>", "<email>", "<title>", "<company>"
    Then User clicks on "<country>" and "<state>" dropdown
    And User write in the comment box and clicks in interests check boxes
    And Insert a pause for user to validate reCAPTCHA
    Then User clicks on Send button
    Examples:
      | firstName | lastName | email             | title                        | company                      | country       | state |
      | Daniela   | Romo     | daniela@gmail.com | Testing Technical Assessment | Testing Technical Assessment | United States | NY    |



