package com.restworld;

import org.json.simple.JSONObject;
import org.testng.annotations.*;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.HashMap;
import java.util.Map;
public class GetAndPostExamples {

/*
	@Test
	public void testGet() {
		baseURI = "https://reqres.in/api/";

		given()
		.	get("/users?page=2")
		.then()
			.statusCode(200)
			.body("data[4].first_name", equalTo("George"))
			.body("data.first_name", hasItems("George","Rachel"));

	} */

    @Test
    public void testPost() {
        baseURI = "https://reqres.in/api/";
        //	Map<String, Object> map = new HashMap<String, Object>();
        //		map.put("name", "Swapnesh");
        //		map.put("job", "QA");


        //	JSONObject request = new JSONObject(map);
        //	System.out.println(request.toJSONString());

        JSONObject request = new JSONObject();
        request.put("name", "Swapnesh");
        request.put("job", "QA");
//		System.out.println(request.toJSONString());

        given().
                header("Content-Type","application/json; charset=utf-8").
                contentType(ContentType.JSON).
                accept(ContentType.JSON).
                log()
                .all().
                body(request.toJSONString()).
                when().
                post("/users").
                then().
                statusCode(201).
                log()
                .all();
    }
}

