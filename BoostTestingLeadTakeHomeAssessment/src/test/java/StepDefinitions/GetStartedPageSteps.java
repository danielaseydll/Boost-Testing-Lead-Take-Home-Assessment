package StepDefinitions;

import Pages.GetStartedPage;
import Utilities.Driver;
import Utilities.GenericHelper;
import io.cucumber.java.en.Then;
import io.restassured.response.Response;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import static io.restassured.RestAssured.given;

public class GetStartedPageSteps {
    WebDriver driver = Driver.getInstance().getDriver();
    GetStartedPage getStartedPage = new GetStartedPage(driver);
    private static final Logger oLog = LogManager.getLogger(GenericHelper.class);

    @Then("User fills out the Get Started Page form with {string}, {string}, {string}, {string}, {string}")
    public void user_fills_out_the_Get_Started_Page_form_with(String firstName, String lastName, String email, String title, String company) {

     driver.switchTo().frame(getStartedPage.iframeList.get(0));
     getStartedPage.firstNameBox.sendKeys(firstName);
     getStartedPage.lastNameBox.sendKeys(lastName);
     getStartedPage.emailBox.sendKeys(email);
     getStartedPage.titleBox.sendKeys(title);
     getStartedPage.companyBox.sendKeys(company);
     oLog.info("User fills out the Contact page form with First Name, Last Name, Email, Title and Company");
    }

    @Then("User clicks on {string} and {string} dropdown")
    public void user_clicks_on_and_dropdown(String country, String state) {

        getStartedPage.countryBoxDropdown.click();
        Select selectCountry = new Select(getStartedPage.countryBoxDropdown);
        selectCountry.selectByVisibleText(country);

        getStartedPage.stateBoxDropdown.click();
        Select selectState = new Select(getStartedPage.stateBoxDropdown);
        selectState.selectByVisibleText(state);

        oLog.info("User clicks on country and state dropdown");
    }
    @Then("User write in the comment box and clicks in interests check boxes")
    public void user_write_in_the_comment_box_and_clicks_in_interests_check_boxes() throws IOException, ParseException {

        String timeZone = "America/New_York";

        Response response = given()
                .param("timeZone", timeZone)
                .when()
                .get("https://timeapi.io/api/Time/current/zone");

        String dateStr = response.then().extract().path("date");
        SimpleDateFormat inputFormat = new SimpleDateFormat("MM/dd/yyyy");
        SimpleDateFormat outputFormat = new SimpleDateFormat("MMMM dd, yyyy");
        Date date = inputFormat.parse(dateStr);
        String dateString =outputFormat.format(date);
        getStartedPage.commentsBox.sendKeys(dateString);

        getStartedPage.careerOpportunitiesCheckBox.click();
        oLog.info("User write in the comment box and clicks in interests check boxes");

    }

    @Then("Insert a pause for user to validate reCAPTCHA")
    public void insert_a_pause_for_user_to_validate_reCAPTCHA() throws InterruptedException {
       driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='reCAPTCHA']")));
       getStartedPage.captchaCheckBox.click();
       int pauseTime = 15000;
       Thread.sleep(pauseTime);
       oLog.info("User clicks on Cpatcha check box and pause "+pauseTime+" seconds to do manual verification");
    }

    @Then("User clicks on Send button")
    public void user_clicks_on_Send_button() {
       driver.switchTo().parentFrame();
       getStartedPage.sendButton.click();
       oLog.info("User clicks on send button");
    }

}
