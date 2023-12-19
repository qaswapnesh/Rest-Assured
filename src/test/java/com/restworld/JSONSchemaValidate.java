package com.restworld;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.hamcrest.Matchers.*;

public class JSONSchemaValidate {

    @Test
    public void testGet() {
        baseURI = "https://reqres.in/api/";

        given()
                .	get("/users?page=2")
                .then()
                .assertThat().body(matchesJsonSchemaInClasspath("schema.json"))
                .statusCode(200);

    }
}
