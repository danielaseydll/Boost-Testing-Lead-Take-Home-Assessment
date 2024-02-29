package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {
    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//ul[@id='menu-1-6e4221c']/li")
    public List<WebElement> headerList;

    @FindBy(id = "wt-cli-accept-btn")
    public WebElement acceptCookieButton;

    public void clickAcceptCookie(){
        acceptCookieButton.click();
    }

    public void clickHeaderList(String headerOption) {
        WebElement headerElement = null;
        switch (headerOption.toLowerCase().trim()) {
            case "boost 100":
                headerList.get(0).click();
                break;
            case "buyers":
                headerList.get(1).click();
                break;
            case "suppliers":
                headerList.get(2).click();
                break;
            case "issuers":
                headerList.get(3).click();
                break;
            case "strategic partners":
                headerList.get(4).click();
                break;
            case "solutions":
                headerList.get(5).click();
                break;
            case "insights":
                headerList.get(6).click();
                break;
            case "company":
                //headerList.get(7).click();
                clickCompanyButton();
                break;
            case "get started":
                headerList.get(8).click();
                break;
            default:
                System.out.println("Header menu option not found");
                return;
        }
        if (headerElement != null) {
            headerElement.click();
    }


}
    private void clickCompanyButton() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement companyButton = driver.findElement(By.linkText("Company"));
        js.executeScript("arguments[0].scrollIntoView(true);", companyButton);
        js.executeScript("arguments[0].click();", companyButton);
    }}

