package falabellaShopping.stepdefinitions;

import falabellaShopping.questions.VerifyUrl;
import falabellaShopping.tasks.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.GivenWhenThen;

public class StepDefinitionsFalabellaShopping {
    @Before
    public void setStage() { OnStage.setTheStage(new OnlineCast());}
    @Given("access to the falabella page")
    public void access_to_the_falabella_page() {
        OnStage.theActorCalled("Luis").wasAbleTo(OpenUp.thePage());
    }
    @Given("close the pop-up")
    public void close_the_popup() {
        OnStage.theActorInTheSpotlight().attemptsTo(CloseUp.popUP());
    }
    @Given("choose a certain product and add it to the bag {string}")
    public void choose_product_bag(String article) {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchItem.putIn(article), AddItem.ShopBag());
    }

    @When("enter the shopping bag")
    public void enter_shopping_bag() {
        OnStage.theActorInTheSpotlight().attemptsTo(BagShopping.OpenUp(), DataInsert.FillFields(), InsertAddress.FillTextBox());
    }

    @Then("the user expects to be on the payment option page")
    public void expects_payment_option_page() throws InterruptedException{
        Thread.sleep(5000);
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(VerifyUrl.toThe()));
    }
}
