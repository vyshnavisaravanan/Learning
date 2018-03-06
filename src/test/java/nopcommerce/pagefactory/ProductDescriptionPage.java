package nopcommerce.pagefactory;

import bdd.argos.functional.driver.DriverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ProductDescriptionPage extends DriverHelper {

    @FindBy(css = ".add-to-cart-button")
    private WebElement addToCartButton;

    @FindBy(css=".bar-notification.success .content>a")
    private WebElement shoppingCartLink;

    @FindBy(css = ".product-name>h1")
    private WebElement productTitle;

    List<String> productListfromProdDesc = new ArrayList<>();


    public void clickaddToCartButton()
    {
        addToCartButton.click();
    }

    public String getProductNamefromProdDescpage()
    {
        String prodDescriProductName = productTitle.getText();
        //System.out.println("Expected Title:"+prodDescriProductName);
        return prodDescriProductName;
    }

    public List<String> getProductNamefromProdDescpageList()
    {
        String prodDescriProductName = productTitle.getText();
        productListfromProdDesc.add(prodDescriProductName);
        //System.out.println("Prd name List" +productListfromProdDesc);
        return productListfromProdDesc;
    }

    public void clicShoppingCartLink()
    {
        shoppingCartLink.click();
    }




}
