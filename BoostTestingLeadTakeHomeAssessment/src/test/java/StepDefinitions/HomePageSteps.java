package StepDefinitions;

import Pages.HomePage;
import Utilities.ConfigurationReader;
import Utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import java.io.File;
import java.io.IOException;

public class HomePageSteps {
    WebDriver driver = Driver.getInstance().getDriver();
    HomePage homePage = new HomePage(driver);

    @Given("User navigates to Boost Payment Solutions home Page")
    public void user_navigates_to_Boost_Payment_Solutions_home_Page() {
        String url = ConfigurationReader.getProperty("ui-config.properties", "boostPaymentSolutions.url");
        driver.get(url);

    }
    @Given("User clicks on {string} Header")
    public void user_clicks_on_Header(String headerOption) {
       homePage.clickAcceptCookie();
       homePage.clickHeaderList(headerOption);
    }

    @Given("User retrieves the list of tabs on front page and save to a {string} with title “BoostBB_HeadersListing”")
    public void userRetrievesTheListOfTabsOnFrontPageAndSaveToAWithTitleBoostBB_HeadersListing( String fileType) {

        StringBuilder fileContent = new StringBuilder();
        fileContent.append("Tab Name\n");
        for (WebElement tab : homePage.headerList) {
            fileContent.append(tab.getText()).append("\n");
        }


        try {
            String pathname = "src\\test\\resources\\testData\\BoostB2B_HeadersListing"+fileType;
            File file = new File(pathname);
            FileUtils.writeStringToFile(file, fileContent.toString());
            System.out.println("Tabs list saved to BoostB2B_HeadersListing" + fileType);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Then("User get screenshot of screen and save as PNG with title “BoostB2B_Headers”")
    public void userGetScreenshotOfScreenAndSaveAsPNGWithTitleBoostB2B_Headers() {
        File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        screenshotFile.renameTo(new File("src\\test\\resources\\testData\\BoostB2B_Headers.png"));
    }

}
