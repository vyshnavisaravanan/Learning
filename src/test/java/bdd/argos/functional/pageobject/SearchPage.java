package bdd.argos.functional.pageobject;

import bdd.argos.functional.driver.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.ArrayList;
import java.util.List;

public class SearchPage extends DriverHelper {


    public String getCurrentURL() {
        return driver.getCurrentUrl();
    }

    public void selectFilterType(String type, String filterOptions) {
        expandFilterType(type);
        selectFilter(filterOptions);
    }

    public void expandFilterType(String type) {
        List<WebElement> expandFilterTypes = driver.findElements(By.cssSelector(".ac-accordion__expand-button"));
        System.out.println(expandFilterTypes.size());
        for (WebElement expandFilterType : expandFilterTypes) {
            if (expandFilterType.getText().contains(type)) {
                if (expandFilterType.getAttribute("aria-expanded").equalsIgnoreCase("false")) {
                    expandFilterType.click();
                    break;
                }
            }

        }
    }

    public List<Double> getRatingForAllProducts() {

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> elements = driver.findElements(By.cssSelector(".ac-star-rating"));
        List<Double> allProductRatingList = new ArrayList<>();
        System.out.println("elements" + elements.size());
        for (WebElement element : elements) {
            String ratingInString = element.getAttribute("data-star-rating");
            allProductRatingList.add(Double.parseDouble(ratingInString));
        }
        System.out.println("allProductRatingList" + allProductRatingList);

        return allProductRatingList;
    }


    public void selectFilter(String option) {
        List<WebElement> filterOptions = driver.findElements(By.cssSelector(".ac-facet__label"));

        for (WebElement filterOption : filterOptions) {
            if (filterOption.getText().equalsIgnoreCase(option)) {
                filterOption.click();
                break;
            }
        }
    }


    public void getFilterBy(String filtervalue) {

        List<WebElement> filterList = driver.findElements(By.cssSelector(".ac-facet__label.ac-facet__label--default.checkbox__label"));
//        System.out.println("List1" + filterList.size());
        for (WebElement eleobj : filterList) {
//            System.out.println("Filter Value" + filtervalue);
//            System.out.println("Ele get out:" + eleobj.getText());
            if (eleobj.getText().equalsIgnoreCase(filtervalue)) {
//                System.out.println("i am in IF loop");
                eleobj.click();

                break;
            }


        }
    }

    public List<Double> getRateOfAllProduct() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<WebElement> rateFilter = driver.findElements(By.cssSelector(".ac-product-price__amount"));
        List<Double> collectedProductList = new ArrayList<>();
        for (WebElement element : rateFilter) {
            String pricetemp = element.getText();
            String temp2=pricetemp.substring(1);
            collectedProductList.add(Double.parseDouble(temp2));
        }
        System.out.println("List" + collectedProductList);
        return collectedProductList;


    }

    public void clickAddtoCartButton()
    {
        WebElement addToCartButton = driver.findElement(By.cssSelector(".add-to-trolley-button.button.button--primary.button--full.add-to-trolley-button--beta"));
        addToCartButton.click();
    }
    public void clickGotoTrolleyButton()
    {
        WebElement GotoTrolleyButton = expwait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".button.button--full.xs-hidden.sm-block"))));
        GotoTrolleyButton.click();
    }


}
