package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pages.MedunnaHomePage;
import pages.MedunnaLoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class MedunnaSignInStepDeinitions {
    MedunnaHomePage homePage = new MedunnaHomePage();
    MedunnaLoginPage loginPage = new MedunnaLoginPage();


    @Given("User visits {string}")
    public void user_visits(String url) {
        Driver.getDriver().get(url);
    }

    @When("clicks on user icon")
    public void clicks_on_user_icon() {
    homePage.userIcon.click();

    }

    @When("clicks on sign in option")
    public void clicks_on_sign_in_option() {
    homePage.signInOption.click();
    }

    @When("enters username into username field")
    public void enters_username_into_username_field() {
    loginPage.usernameInput.sendKeys(ConfigReader.getProperty("medunna_username"));
    }

    @When("enters password into password field")
    public void enters_password_into_password_field() {
    loginPage.passwordInput.sendKeys(ConfigReader.getProperty("medunna_password"));
    }

    @When("clicks on Sign In submit button")
    public void clicks_on_sign_in_submit_button() {
    loginPage.signInSubmitButton.click();
    }
}
