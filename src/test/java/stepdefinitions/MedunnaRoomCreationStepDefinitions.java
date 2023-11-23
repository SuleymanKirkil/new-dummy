package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.Select;
import pages.MedunnaHomePage;
import pages.MedunnaRoomPage;
import utilities.Driver;
import utilities.ReusableMethods;

public class MedunnaRoomCreationStepDefinitions {
    public static String roomNumber;
    public static String roomId;
    MedunnaRoomPage roomPage = new MedunnaRoomPage();
    MedunnaHomePage homePage = new MedunnaHomePage();
    @When("Clicks on items&titles button")
    public void clicks_on_items_titles_button() {
    homePage.itemsdAndTitles.click();
    }
    @When("Selects Room option")
    public void selects_room_option() {
    homePage.roomOption.click();
    }
    @When("Clicks create new room button")
    public void clicks_create_new_room_button() {
    roomPage.createANewRoomButton.click();
    }
    @When("Enters {string} to Room Number field")
    public void enters_to_room_number_field(String roomNo) {
        roomNumber= Faker.instance().number().numberBetween(10000,100000) + "";
        System.out.println("room number = " + roomNumber );
    roomPage.roomNumberInput.sendKeys(roomNumber);
    }
    @When("Select suite option from Room Type dropdown")
    public void select_suite_option_from_room_type_dropdown() {
    new Select(roomPage.roomTypeDropDown).selectByIndex(3);
    }
    @When("clicks on Status checbox")
    public void clicks_on_status_checbox() {
    roomPage.statusCheckbox.click();
    }
    @When("Enter {string} into Price field")
    public void enter_into_price_field(String price) {
    roomPage.priceInput.sendKeys(price);
    }
    @When("Enter {string} into Decription input field")
    public void enter_into_decription_input_field(String description) {
    roomPage.descriptionInput.sendKeys(description);
    }
    @When("Click on Save button")
    public void click_on_save_button() {
        ReusableMethods.click(roomPage.saveSubmitButton);
    }
    @When("Close the Application")
    public void close_the_application() {
        //Driver.closeDriver();
    }



















}
