package bdd.argos.functional.testrun;

import bdd.argos.functional.Hooks;
import bdd.argos.functional.pageobject.HeaderPage;
import bdd.argos.functional.pageobject.SearchPage;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;

import java.util.List;

import static org.hamcrest.CoreMatchers.both;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Every.everyItem;
import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.hamcrest.number.OrderingComparison.greaterThan;

public class ProductFilterTestRun {

//    private HeaderPage headerPage ;
//    private SearchPage searchPage ;
//
//    public ProductFilterTestRun(){
//        this.headerPage = new HeaderPage();
//        this.searchPage = new SearchPage();
//    }
//
//    public void reviewTest() {
//        headerPage.hoverToMegaNavElements("Home & Garden");
//        headerPage.selectItemsFromNavOptions("Armchairs");
//        searchPage.selectFilterType("CUSTOMER RATING", "5only");
//        List<Double> actualList = searchPage.getRatingForAllProducts();
//        assertThat(actualList, everyItem(greaterThan(5.0)));
//        assertThat(searchPage.getCurrentURL(),endsWith(":5/"));
//
//    }
//
//
//
//    public void productRatesVerification()
//    {
//        headerPage.hoverToMegaNavElements("Home & Garden");
//        headerPage.selectItemsFromNavOptions("Armchairs");
//
//        searchPage.getFilterBy("£100 - £150");
//        List<Double> actualrateofproduct = searchPage.getRateOfAllProduct();
//
//        System.out.println("Test Assertion Started");
//        assertThat(actualrateofproduct, CoreMatchers.everyItem(is(both(Matchers.greaterThan(100.0)).and(lessThan(150.0)))));
//
//        System.out.println("Test Assertion Completed");
//
//    }
}
