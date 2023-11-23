package base_url;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class MedunnaBaseUrl {

    public static RequestSpecification spec;

    public static void setUp(){
        String token = "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJtYXJrX3R3YWluIiwiYXV0aCI6IlJPTEVfQURNSU4iLCJleHAiOjE3MDA4NjMxOTV9.rgyqhlJsjogSc5qfoXBqp6SksQ0tLpNv76qPGCqCs5AiXsY00CUmhqf7WOVVyV45rpacRER4SRkw7p7jAL3u8g";
        spec = new RequestSpecBuilder().setBaseUri("https://medunna.com").addHeader("Authorization","Bearer "+ token).build();
    }
}
