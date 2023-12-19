package com.restworld;

import io.restassured.http.ContentType;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import static org.hamcrest.Matchers.*;
public class PostStudent {

/*    @Test
    public void post(){
        baseURI = "http://localhost:3000";

        JSONObject request = new JSONObject();
        request.put("firstName", "Neha");
        request.put("lastName", "Kunjir");
        request.put("subjectId", 1);
        request.put("id", 5);

        given()
                .contentType( ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toJSONString())
                .when()
                .post("/users")
                .then()
               // .body("[4].id",equalTo(5))
                .log()
                .all();


    } */



 /*   @Test
    public void put(){
        baseURI = "http://localhost:3000";

        JSONObject request = new JSONObject();
        request.put("firstName", "Neha");
        request.put("lastName", "Nikam");
        request.put("subjectId", 2);
        request.put("id", 5);

        given()
                .contentType( ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toJSONString())
                .when()
                .put("/users/5")
                .then()
                // .body("[4].id",equalTo(5))
                .log()
                .all();
    }*/

/*    @Test
    public void put() {
        baseURI = "http://localhost:3000";

        JSONObject request = new JSONObject();
        request.put("firstName", "Neha");
        request.put("lastName", "Kunjir");
        request.put("subjectId", 2);
        request.put("id", 5);

        given()
                .contentType(ContentType.JSON)
                .accept(ContentType.JSON)
                .body(request.toJSONString())
                .when()
                .patch("/users/5")
                .then()
                // .body("[4].id",equalTo(5))
                .log()
                .all();
    } */
    @Test
    public void delete(){
        baseURI="http://localhost:3000";

        when()
                .delete("/users/5")
                .then()
                .statusCode(200)
                .log()
                .all();
    }

}
