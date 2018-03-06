package nextwebsite;

import bdd.argos.functional.driver.DriverHelper;
import com.gargoylesoftware.htmlunit.javascript.host.css.CSS;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Random;


public class NHomePage extends DriverHelper {
//    @FindBy(xpath=".//*[@id='next-co-uk']/header/div/section/section[2]/ul/li[4]/a")
//    private WebElement storelocatorLink;

    @FindBy(linkText = "Store Locator")
    private WebElement storelocatorLink;

//    @FindBy(xpath = ".//*[@id='search-input']")
    @FindBy(css = "#search-input")
    private WebElement searchInputText;

    @FindBy(css = ".search-type")
    private WebElement drpDwnSearchType;


    @FindBy(css = "#search-button>span")
    private WebElement findStoreButton;

   public void gotostorelocator()
   {
       storelocatorLink.click();

   }
   public void enterdatainstoreLocator()
   {
       int size= driver.findElements(By.tagName("iframe")).size();
       System.out.println("Number of iframe in this page: ==>"+size );

       driver.switchTo().frame(O8HB BJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJBXVVVVVVVVVVVVVVVVVVVVLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLLL111111111111111111111111110);
       searchInputText.sendKeys("E6 1AB");
   }

   public void selectSearchTypeDropDown()
   {
       Select drpDwnSearchTypevalue = new Select(drpDwnSearchType);NHGV555555`3+MOJ HU
       drpDwnSearchTypevalue.selectByIndex(1);
       findStoreButton.c
