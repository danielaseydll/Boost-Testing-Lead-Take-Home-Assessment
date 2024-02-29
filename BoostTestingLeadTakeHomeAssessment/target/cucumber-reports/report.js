$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/uiFeatures/CompanyPage.feature");
formatter.feature({
  "name": "This feature file validates Company Page Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@CompanyPage"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Boost Payment Solutions home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.user_navigates_to_Boost_Payment_Solutions_home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"Company\" Header",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.user_clicks_on_Header(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User validates list of the countries in Global Footprint portion",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@CompanyPage"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "user verifies that each country exists in the list of the countries in Global Footprint portion",
  "keyword": "Then "
});
formatter.match({
  "location": "CompanyPageSteps.userVerifiesThatEachCountryExistsInTheListOfTheCountriesInGlobalFootprintPortion()"
});
formatter.result({
  "error_message": "java.lang.AssertionError: The following asserts failed:\n\tTURKIYE not found in Actual country list,\n\tU.S.A not found in Actual country list,\n\tJAMAICA not found in Expected country list,\n\tU.S.A. not found in Expected country list\r\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:46)\r\n\tat org.testng.asserts.SoftAssert.assertAll(SoftAssert.java:30)\r\n\tat StepDefinitions.CompanyPageSteps.userVerifiesThatEachCountryExistsInTheListOfTheCountriesInGlobalFootprintPortion(CompanyPageSteps.java:62)\r\n\tat ✽.user verifies that each country exists in the list of the countries in Global Footprint portion(file:src/test/resources/uiFeatures/CompanyPage.feature:9)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/uiFeatures/GetStartedPage.feature");
formatter.feature({
  "name": "This feature file validates Get Started Page Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@getStartedPage"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.scenarioOutline({
  "name": "User should be able to fill out the form in Get Started Page",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User fills out the Get Started Page form with \"\u003cfirstName\u003e\", \"\u003clastName\u003e\", \"\u003cemail\u003e\", \"\u003ctitle\u003e\", \"\u003ccompany\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "User clicks on \"\u003ccountry\u003e\" and \"\u003cstate\u003e\" dropdown",
  "keyword": "Then "
});
formatter.step({
  "name": "User write in the comment box and clicks in interests check boxes",
  "keyword": "And "
});
formatter.step({
  "name": "Insert a pause for user to validate reCAPTCHA",
  "keyword": "And "
});
formatter.step({
  "name": "User clicks on Send button",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "firstName",
        "lastName",
        "email",
        "title",
        "company",
        "country",
        "state"
      ]
    },
    {
      "cells": [
        "Daniela",
        "Romo",
        "daniela@gmail.com",
        "Testing Technical Assessment",
        "Testing Technical Assessment",
        "United States",
        "NY"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Boost Payment Solutions home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.user_navigates_to_Boost_Payment_Solutions_home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"Get Started\" Header",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.user_clicks_on_Header(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to fill out the form in Get Started Page",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@getStartedPage"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "User fills out the Get Started Page form with \"Daniela\", \"Romo\", \"daniela@gmail.com\", \"Testing Technical Assessment\", \"Testing Technical Assessment\"",
  "keyword": "Then "
});
formatter.match({
  "location": "GetStartedPageSteps.user_fills_out_the_Get_Started_Page_form_with(String,String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on \"United States\" and \"NY\" dropdown",
  "keyword": "Then "
});
formatter.match({
  "location": "GetStartedPageSteps.user_clicks_on_and_dropdown(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User write in the comment box and clicks in interests check boxes",
  "keyword": "And "
});
formatter.match({
  "location": "GetStartedPageSteps.user_write_in_the_comment_box_and_clicks_in_interests_check_boxes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Insert a pause for user to validate reCAPTCHA",
  "keyword": "And "
});
formatter.match({
  "location": "GetStartedPageSteps.insert_a_pause_for_user_to_validate_reCAPTCHA()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on Send button",
  "keyword": "Then "
});
formatter.match({
  "location": "GetStartedPageSteps.user_clicks_on_Send_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/uiFeatures/HomePage.feature");
formatter.feature({
  "name": "This feature file validates Home Page Functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@HomePage"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Boost Payment Solutions home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.user_navigates_to_Boost_Payment_Solutions_home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to click on the header list tabs on Homepage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@HomePage"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User clicks on \"Get Started\" Header",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.user_clicks_on_Header(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User should be able to validate list of tabs on HRM Homepage",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User retrieves the list of tabs on front page and save to a \"\u003cfileType\u003e\" with title “BoostBB_HeadersListing”",
  "keyword": "And "
});
formatter.step({
  "name": "User get screenshot of screen and save as PNG with title “BoostB2B_Headers”",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "fileType"
      ]
    },
    {
      "cells": [
        ".csv"
      ]
    },
    {
      "cells": [
        ".txt"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Boost Payment Solutions home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.user_navigates_to_Boost_Payment_Solutions_home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to validate list of tabs on HRM Homepage",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@HomePage"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User retrieves the list of tabs on front page and save to a \".csv\" with title “BoostBB_HeadersListing”",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.userRetrievesTheListOfTabsOnFrontPageAndSaveToAWithTitleBoostBB_HeadersListing(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User get screenshot of screen and save as PNG with title “BoostB2B_Headers”",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.userGetScreenshotOfScreenAndSaveAsPNGWithTitleBoostB2B_Headers()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User navigates to Boost Payment Solutions home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "HomePageSteps.user_navigates_to_Boost_Payment_Solutions_home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should be able to validate list of tabs on HRM Homepage",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@HomePage"
    },
    {
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "name": "User retrieves the list of tabs on front page and save to a \".txt\" with title “BoostBB_HeadersListing”",
  "keyword": "And "
});
formatter.match({
  "location": "HomePageSteps.userRetrievesTheListOfTabsOnFrontPageAndSaveToAWithTitleBoostBB_HeadersListing(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User get screenshot of screen and save as PNG with title “BoostB2B_Headers”",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.userGetScreenshotOfScreenAndSaveAsPNGWithTitleBoostB2B_Headers()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});