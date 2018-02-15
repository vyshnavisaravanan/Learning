package bdd.argos.functional.pageobject;

import bdd.argos.functional.driver.DriverHelper;
import org.openqa.selenium.WebElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class HeaderPage extends DriverHelper {

    public void hoverToMegaNavElements(String to) {
        List<WebElement> megaNavLists = driver.findElements(By.cssSelector(".lg-row.meganav__level-1-list li"));
        for (WebElement element : megaNavLists) {
            if (element.getText().equalsIgnoreCase(to)) {
                new Actions(driver).moveToElement(element).perform();
                break;
            }
        }
    }

    public void selectItemsFromNavOptions(String category) {
        List<WebElement> elements = driver.findElements(By.cssSelector(".meganav__level-3-title"));
        for (WebElement element : elements) {
            if (element.getText().equalsIgnoreCase(category)) {
                element.click();
                break;
            }
        }

//        driver.findElement(By.linkText(category)).click();
    }
}
