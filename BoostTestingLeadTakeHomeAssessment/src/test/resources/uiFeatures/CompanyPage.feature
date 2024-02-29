@CompanyPage @Regression
Feature: This feature file validates Company Page Functionality

  Background:
    Given User navigates to Boost Payment Solutions home Page
    Given User clicks on "Company" Header

  Scenario: User validates list of the countries in Global Footprint portion
    Then user verifies that each country exists in the list of the countries in Global Footprint portion
