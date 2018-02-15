package bdd.argos.functional.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import nopcommerce.pagefactory.HomePage;
import nopcommerce.pagefactory.ProductDescriptionPage;
import nopcommerce.pagefactory.ProductPage;
import nopcommerce.pagefactory.ShoppingCartPage;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;

public class nopcomaddtobaskstepdef {

    HomePage homepage = new HomePage();
    ProductPage productpage = new ProductPage();
    ProductDescriptionPage productdespage = new ProductDescriptionPage();
    ShoppingCartPage shoppingcartpage = new ShoppingCartPage();
    List<String> expectedProductNameList = null;
    String expectedProductName = null;
    List<String> actualProductNameList = null;


    @Given("^User is in main Homepage$")
    public void user_is_in_main_Homepage() {
        homepage.getTopMenuList();
    }

    @When("^user adds a product to add to bag$")
    public void user_adds_a_product_to_add_to_bag() {
        productpage.selectPrododuct();
        expectedProductName = productdespage.getProductNamefromProdDescpage();
        expectedProductName = expectedProductName.trim();
        productdespage.clickaddToCartButton();
        productdespage.clicShoppingCartLink();
        shoppingcartpage.getProductCount();
    }

    @Then("^product is added$")
    public void product_is_added() {
        String actualProductName = shoppingcartpage.getProductName();
        actualProductName = actualProductName.trim();
        assertThat("Actual and exp are not same", actualProductName.equalsIgnoreCase(expectedProductName));
    }


    //Add three product for comparision and remove one product

    @When("^user adds a product to add to bag and continue with shopping$")
    public void user_adds_a_product_to_add_to_bag_and_continue_with_shopping() {
        productpage.selectPrododuct();
        productdespage.getProductNamefromProdDescpageList();
        productdespage.clickaddToCartButton();
        productdespage.clicShoppingCartLink();
        shoppingcartpage.getProductCount();
        shoppingcartpage.clikContShopping();
    }

    @When("^User adds two more product to cart$")
    public void user_adds_two_more_product_to_cart() {
        homepage.getTopMenuList();
        productpage.selectPrododuct();
        expectedProductNameList = productdespage.getProductNamefromProdDescpageList();
        productdespage.clickaddToCartButton();
        productdespage.clicShoppingCartLink();

        homepage.getTopMenuList();
        productpage.selectPrododuct();
        expectedProductNameList = productdespage.getProductNamefromProdDescpageList();
        productdespage.clickaddToCartButton();
        productdespage.clicShoppingCartLink();
    }

    @Then("^Three product is added$")
    public void three_product_is_added() {
        actualProductNameList = shoppingcartpage.getProductNameList();
        assertThat("Expected and Actual are not same", actualProductNameList, containsInAnyOrder(expectedProductNameList.toArray()));
    }

}
