package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

public class BrowserFactory {
    public static WebDriver createInstance() {

        WebDriver driver = null;

        try {

            if (driver == null) {
                if(System.getProperty("browser")==null){
                    WebDriverManager.chromedriver().setup();
                    //chromePrefs is key value combination and useful if you change default behavior of browser like download directory
                    HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
                    chromePrefs.put("download.default_directory", System.getProperty("user.dir")+"\\src\\test\\resources\\testData\\Downloads");
                    //chromeOptions are useful if you want to manage options specific to Chromediver - like ignoring certificate
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--ignore-ssl-errors=yes");
                    options.addArguments("--ignore-certificate-errors");
                    //and we can even add chromePrefs that we created in line 32 and additional preferences
                    options.setExperimentalOption("prefs", chromePrefs);
                    //need to create Chromedriver with preferences
                    driver = new ChromeDriver(options);
                }
                else {
                  switch (System.getProperty("browser")) {
                        case "firefox":
                            WebDriverManager.firefoxdriver().setup();
                            driver = new FirefoxDriver();
                            break;
                        case "firefox-headless":
                            WebDriverManager.firefoxdriver().setup();
                            driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                            break;
                        case "ie":
                            if (System.getProperty("os.name").toLowerCase().contains("mac")) {
                                throw new WebDriverException("Your operating system does not support the requested browser");
                            }
                            WebDriverManager.iedriver().setup();
                            driver = new InternetExplorerDriver();
                            break;
                        case "edge":
                            if (System.getProperty("os.name").toLowerCase().contains("mac")) {
                                throw new WebDriverException("Your operating system does not support the requested browser");
                            }
                            WebDriverManager.edgedriver().setup();
                            driver = new EdgeDriver();
                            break;
                        case "safari":
                            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                                throw new WebDriverException("Your operating system does not support the requested browser");
                            }
                            WebDriverManager.getInstance(SafariDriver.class).setup();
                            driver = new SafariDriver();
                            break;
                        default:
                            WebDriverManager.chromedriver().setup();
                            driver = new ChromeDriver();
                            break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return driver;
    }
}
