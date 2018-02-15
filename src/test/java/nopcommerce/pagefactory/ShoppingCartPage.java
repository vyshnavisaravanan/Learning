package nopcommerce.pagefactory;

import bdd.argos.functional.driver.DriverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartPage extends DriverHelper {

    @FindBy(css ="tbody .product")
    private List<WebElement> addedProductList;

    @FindBy(css=".button-2.continue-shopping-button")
    private WebElement continueShoppingbutton;

    List<String> productNameinCartList = new ArrayList<>();

    public void getProductCount()
    {
        int totalProductAdded = addedProductList.size();
        System.out.println("Total No of Product Added ==>"+totalProductAdded);
    }


    public String getProductName()
    {
        String productNameinCart = null;
        for (WebElement prodListinCart:addedProductList)
        {
            productNameinCart = prodListinCart.getText();
//            System.out.println("Actual Product List:" +prodListinCart.getText() );
        }
        return productNameinCart;
    }

    public List<String> getProductNameList()
    {
        for (WebElement prodListinCart:addedProductList)
        {
            String temp = prodListinCart.getText();
            temp=temp.trim();
            productNameinCartList.add(temp);
            System.out.println("Actual Product List:" +productNameinCartList );
        }
        return productNameinCartList;
    }
    public void clikContShopping()
    {
        continueShoppingbutton.click();
    }


}
