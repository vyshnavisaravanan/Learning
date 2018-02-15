package bdd.argos.functional.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DriverHelper {

    public static WebDriver driver;
    public static Actions actions;
    public static WebDriverWait expwait;
    public DriverHelper() {
        PageFactory.initElements(driver, this);
    }

    private String browserToExecute = "chrome";

    public void closeBrowser()
    {
        driver.quit();
    }

    public void openBrowser() {
        switch (browserToExecute) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "ie":
                WebDriverManager.iedriver().setup();
                driver = new InternetExplorerDriver();
                break;
            case "opera":
                WebDriverManager.operadriver().setup();
                driver = new OperaDriver();
                break;
            default:
//                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
        }
    }

    public void maximiseBrowser() {
        driver.manage().window().maximize();
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void applyImpWaits() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void applyExpWaits(){
        expwait = new WebDriverWait(driver,20);
    }

    public void applyActions(){
        actions= new Actions(driver);
    }
}
