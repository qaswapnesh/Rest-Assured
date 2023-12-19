package com.restworld;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class PutPatchDeleteExamples {


    @Test
    public void testPut() {
        baseURI = "https://reqres.in/api/";
        JSONObject request = new JSONObject();
        request.put("name", "Swapnesh");
        request.put("job", "QA");

        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                log()
                .all().
                body(request.toJSONString()).
                when().
                put("/users/2").
                then().
                statusCode(200).
                body("name", equalTo("Swapneshd"));
    }

    @Test
    public void testPatch() {
        baseURI = "https://reqres.in";
        JSONObject request = new JSONObject();
        request.put("name", "Manoj");
        request.put("job", "QA");

        given().
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                log()
                .all().
                body(request.toJSONString()).
                when().
                patch("/api/users/2").
                then().
                statusCode(200).
                body("name", equalTo("Manoj"));
    }

}

