**Boost testing Lead take Assessment Framework**

**Introduction**
This repository contains a Maven project implementing a Page Object Model (POM) design pattern for UI automation of the Boostb2b Website. The framework is based on a data-driven approach using Java, Selenium WebDriver, JUnit, Maven, Apache POI for reading Excel utilities, Log4j for logging, and Cucumber Reports.

**FUNCTIONALITY**

The following flows were automated:
1. Test case for Home Page
2. Test case for Get Started/Contact Page
3. Test case for Company Page

**FEATURES**
- Selenium WebDriver - for browser automation
- JDK 20(Java Development Kit)
- JUnit - a unit testing framework for Java applications
- Maven - a project management tool
- Apache POI - to read and write Excel files, aiding in data-driven testing
- Lo4j - for logging framework integration
- Cucumber Reports - for generating readable test reports

**PROJECT STRUCTURE**

The framework follows Page Object Model, also known as POM, is a design pattern in Selenium that creates an object repository for storing all web elements. It is useful in reducing code duplication and improves test case maintenance.
In Page Object Model, consider each web page of an application as a class file. Each class file will contain only corresponding web page elements. Using these elements, user can perform operations on the website under test.

- Why I have chosen Page Object Model?
    - Code Maintainability: Helps in organizing the code in a way that makes it more readable and maintainable. Each page in the application has a corresponding page class in the test, which holds the page's functionalities and elements.
    - Code re-usability: Elements and methods of page classes are reusable across different tests. Once you define a page object, you can use it in multiple test scripts, reducing code duplication.
    - Readability and Reduced Flakiness:  In POM, all the web elements are kept in page classes. If the UI changes, the changes need to be made in only one place rather than in all tests.
    - Provides structure to Automation Framework: that is particularly beneficial for large and complex applications where maintaining test scripts without a good structure can become challenging.

**ASSERTIONS AND REPORTING**
- Includes assertions to validate expected outcomes using JUnit testing framework.
- Uses Cucumber Reports for clear and detailed test reporting.

**TEST DATA MANAGEMENT**
- Utilizes external files (Excel) for managing test data
- Implements data-driven testing for scenarios

