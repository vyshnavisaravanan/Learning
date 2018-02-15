package nopcommerce.pagefactory;

import bdd.argos.functional.driver.DriverHelper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class ProductPage extends DriverHelper {

    Random random=new Random();
    @FindBy(css =".product-item")
    private List<WebElement> productList;



public void selectPrododuct()
{
    int i=random.nextInt(productList.size());
    productList.get(i).click();
}


}
