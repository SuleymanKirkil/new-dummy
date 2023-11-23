package stepdefinitions;

import io.cucumber.java.en.*;
import io.restassured.response.Response;

import java.util.List;

import static base_url.MedunnaBaseUrl.spec;
import static io.restassured.RestAssured.given;
import static stepdefinitions.MedunnaRoomCreationStepDefinitions.roomNumber;

public class ApiRoomVerificationStepDefinitions {
    Response response;
    @Given("User sends Get Request For last creates Rooms")
    public void user_sends_get_request_for_last_creates_rooms() {
    spec.pathParams("first","api"
    ,"second","rooms")
            .queryParam("sort","createdDate,desc");

    response = given(spec).when().get("{first}/{second}");
    response.prettyPrint();
    }
    @Then("User verifies that room is created")
    public void user_verifies_that_room_is_created() {

     response.jsonPath().getList("findAll{it.roomNumber=="+roomNumber+"}.id");

    }

}
