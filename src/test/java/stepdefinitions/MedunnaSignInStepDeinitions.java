package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import utilities.Driver;

public class MedunnaSignInStepDeinitions {
    @Given("User visits {string}")
    public void user_visits(String url) {
        Driver.getDriver().get(url);
    }

    @When("clicks on user icon")
    public void clicks_on_user_icon() {


    }

    @When("clicks on sign in option")
    public void clicks_on_sign_in_option() {

    }

    @When("enters username into username field")
    public void enters_username_into_username_field() {

    }

    @When("enters password into password field")
    public void enters_password_into_password_field() {

    }

    @When("clicks on Sign In submit button")
    public void clicks_on_sign_in_submit_button() {

    }
}
