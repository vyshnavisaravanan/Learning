package nopcommerce.pagefactory;

import bdd.argos.functional.driver.DriverHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.Random;

public class HomePage extends DriverHelper {

    Random random=new Random();
    @FindBy(css =".top-menu>li")
    private List<WebElement> topMenuList;

    @FindBy(css=".sublist.first-level>li>a")
    private List<WebElement> subListFirstLevel;


    public void getTopMenuList()
    {
//        List<WebElement> topMenuList = driver.findElements(By.cssSelector(".top-menu>li"));
        int i=random.nextInt(6);


        if(i>6)
        {
            i = i-1;
        }
        System.out.println("i value"+i);
        if(i<3)
        {
//            topMenuList.get(i).click();
            new Actions(driver).moveToElement(topMenuList.get(i)).perform();

            if(i==0) {
                int j=random.nextInt(2);
                subListFirstLevel.get(j).click();
            }
            else if(i==1)
            {
                int j=random.nextInt(3)+3;
                System.out.println("J is"+j);
                subListFirstLevel.get(j).click();
            }
            else if(i==2)
            {
                int j=random.nextInt(6)+3;
                System.out.println("J is"+j);
                subListFirstLevel.get(j).click();
            }

        }
        else
        {
            topMenuList.get(i).click();
        }
    }


}
