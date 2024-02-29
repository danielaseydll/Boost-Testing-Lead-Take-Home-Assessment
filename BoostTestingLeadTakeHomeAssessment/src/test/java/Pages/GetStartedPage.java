package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class GetStartedPage {
    WebDriver driver;

    public GetStartedPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//iframe")
    public List<WebElement> iframeList;

    @FindBy(xpath = "//input[@name='492571_77234pi_492571_77234']")
    public WebElement firstNameBox;

    @FindBy(id = "492571_77236pi_492571_77236")
    public WebElement lastNameBox;

    @FindBy(id = "492571_77238pi_492571_77238")
    public WebElement emailBox;

    @FindBy(id = "492571_77240pi_492571_77240")
    public WebElement titleBox;

    @FindBy(id = "492571_77242pi_492571_77242")
    public WebElement companyBox;

    @FindBy(id = "492571_78460pi_492571_78460")
    public WebElement countryBoxDropdown;

    @FindBy(id = "492571_79032pi_492571_79032")
    public WebElement stateBoxDropdown;

    @FindBy(id = "492571_77244pi_492571_77244")
    public WebElement commentsBox;

    @FindBy(id = "492571_77246pi_492571_77246_698662")
    public WebElement careerOpportunitiesCheckBox;

    @FindBy(className = "recaptcha-checkbox-border")
    public WebElement captchaCheckBox;

    @FindBy(id = "recaptcha-verify-button")
    public WebElement captchaVerifyButton;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement sendButton;




}
