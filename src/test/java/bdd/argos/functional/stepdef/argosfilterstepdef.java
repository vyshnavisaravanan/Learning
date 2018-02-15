package bdd.argos.functional.stepdef;


import bdd.argos.functional.pageobject.HeaderPage;
import bdd.argos.functional.pageobject.HomePage;
import bdd.argos.functional.pageobject.SearchPage;
import org.assertj.core.api.Condition;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.assertj.core.api.SoftAssertions;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matchers;
import org.testng.asserts.SoftAssert;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.lessThan;

public class argosfilterstepdef {
    HomePage homePage;
    HeaderPage headerPage;
    SearchPage searchPage;
    SoftAssertions softassertion;
    SoftAssert softassertes;

    public argosfilterstepdef()
    {
        this.homePage = new HomePage();
        this.headerPage = new HeaderPage();
        this.searchPage = new SearchPage();
        this.softassertion =new SoftAssertions();
        this.softassertes=new SoftAssert();

    }

    @Given("^User is in Homepage$")
    public void user_is_in_Homepage()
    {
       //softassertion.assertThat(homePage.isOnHomePage(),is(true));
        //assertion using Testng
       softassertes.assertEquals(homePage.isOnHomePage(),is(true));



    }

    @When("^User Hover on \"([^\"]*)\"$")
    public void user_Hover_on(String hoverElement)  {
        headerPage.hoverToMegaNavElements(hoverElement);
    }

    @When("^User Clicks on \"([^\"]*)\"$")
    public void user_Clicks_on(String sublist){
        headerPage.selectItemsFromNavOptions(sublist);
    }

    @When("^User expands \"([^\"]*)\"$")
    public void user_expands(String filterType)  {
        searchPage.expandFilterType(filterType);
    }

    @When("^User selects \"([^\"]*)\"$")
    public void user_selects(String selectFilter)  {
        searchPage.getFilterBy(selectFilter);

    }

    @Then("^User verifies only products between price \"([^\"]*)\" and \"([^\"]*)\" is present$")
    public void user_verifies_only_products_between_price_and_is_present(Double min, Double max)  {
        List<Double> actualrateofproduct = searchPage.getRateOfAllProduct();
        searchPage.clickAddtoCartButton();
//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        searchPage.clickGotoTrolleyButton();
        System.out.println("Test Assertion Started");
        //HAMCREST ASSERT WITHOUT SOFT ASSERT
        assertThat(actualrateofproduct,everyItem(is(both(Matchers.greaterThan(min)).and(lessThan(max)))));
        //ASSERT WITH SOFT ASSERT FROM HAMCREST
        //softassertion.assertThat(actualrateofproduct,everyItem(is(both(Matchers.greaterThan(min)).and(lessThan(max)))));
        //SOFT ASSER FROM TESTNG
        softassertes.assertEquals(1,1);
        softassertion.assertAll();
        System.out.println("Test Assertion Completed");

    }




}
