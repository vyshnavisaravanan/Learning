package bdd.argos.functional.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import nextwebsite.NHomePage;

public class nextstepdef {

    NHomePage nhp=new NHomePage();

    @Given("^User in next site$")
    public void user_in_next_site() {
        System.out.println("I am in next page");
    }

    @When("^click on storelocator link$")
    public void click_on_storelocator_link() {
        nhp.gotostorelocator();
    }

    @Then("^enter data$")
    public void enter_data() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        nhp.enterdatainstoreLocator();
        nhp.selectSearchTypeDropDown();
    }

}
