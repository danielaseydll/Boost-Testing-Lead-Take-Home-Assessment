package StepDefinitions;

import Pages.CompanyPage;
import Utilities.Driver;
import Utilities.ExcelUtility;
import Utilities.GenericHelper;
import io.cucumber.java.en.Then;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;
import java.util.ArrayList;
import java.util.List;



public class CompanyPageSteps {
    WebDriver driver = Driver.getInstance().getDriver();
    CompanyPage companyPage = new CompanyPage(driver);
    private static final Logger oLog = LogManager.getLogger(GenericHelper.class);

    @Then("user verifies that each country exists in the list of the countries in Global Footprint portion")
    public void userVerifiesThatEachCountryExistsInTheListOfTheCountriesInGlobalFootprintPortion() throws Exception {

        String countryListFilePath = System.getProperty("user.dir") + "\\src\\test\\resources\\testData\\countriesList.xlsx";
        ExcelUtility.setExcelFile(countryListFilePath, "Sheet1");
        List<String> expectedCountryList = ExcelUtility.getExpectedCountryList();
        System.out.println("Expected: " + expectedCountryList);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement companyButton = driver.findElement(By.linkText("Company"));
        js.executeScript("arguments[0].scrollIntoView(true);", companyButton);
        js.executeScript("arguments[0].click();", companyButton);

        List<WebElement> countryElements = companyPage.countryList();
        List<String> actualCountryList = new ArrayList<>();

        // Extract text from each WebElement to get the list of country names
        for (WebElement countryElement : countryElements) {
            actualCountryList.add(countryElement.getText());
        }

        System.out.println("Actual: " + actualCountryList);

        //Check if the actual list contains all the countries from the expected list
        SoftAssert softAssert = new SoftAssert();
        for (String expected : expectedCountryList) {
            if (!actualCountryList.contains(expected)) {
                softAssert.fail(expected + " not found in Actual country list");
            }
        }


        for (String actual : actualCountryList) {
            if (!expectedCountryList.contains(actual)) {
                softAssert.fail(actual + " not found in Expected country list");
            }
        }
        softAssert.assertAll();

//
        oLog.info("user verifies that each country exists in the list of the countries in Global Footprint portion");
    }
}







