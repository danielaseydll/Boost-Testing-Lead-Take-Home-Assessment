package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class CompanyPage {
    WebDriver driver;

    public CompanyPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h2[text()='Global Footprint']/ancestor::div[contains(@class, 'elementor-widget-heading')]/following-sibling::section//h2")
    public List<WebElement> everythingList;

    public List<WebElement> countryList() {
        for (WebElement element : everythingList) {
            String text = element.getText();
            if (text.equals("Global Footprint")){
                everythingList.remove(element);
            }
        }
        return everythingList;
    }
}
