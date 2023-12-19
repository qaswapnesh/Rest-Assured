package com.soapworld;

import org.apache.commons.io.IOUtils;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import static io.restassured.RestAssured.*;

public class SOAPXMLRequest {
    @Test
    public void soapXMLValidate(){
        try {
            File file = new File("C:\\Users\\DynaPar\\Documents\\JPetStoreApp\\RestAssuredAutomation\\src\\test\\resources\\convert.xml");
            FileInputStream fileInputStream = new FileInputStream(file);
            String requestBody = IOUtils.toString(fileInputStream, StandardCharsets.UTF_8);

            baseURI = "https://www.dataaccess.com/webservicesserver/NumberConversion.wso";
            given()
                    .contentType("text/xml; charset=utf-8")
                    .header("Accept","text/xml")
                    .body(requestBody)
                    .then()
                    .response()
                    .log()
                    .all()
                    .statusCode(200);
        }catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
