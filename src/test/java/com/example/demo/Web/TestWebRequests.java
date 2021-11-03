package com.example.demo.Web;


import io.restassured.RestAssured;
import io.restassured.config.HttpClientConfig;
import io.restassured.config.RestAssuredConfig;
import org.junit.jupiter.api.Test;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static org.apache.http.params.CoreConnectionPNames.CONNECTION_TIMEOUT;
import static org.apache.http.params.CoreConnectionPNames.SO_TIMEOUT;

public class TestWebRequests {
    @Test
    public void testGetResponse() {
        Response response = given()
                .config(restAssuredConfig())
                .get("https://www.google.com");
    }
    private RestAssuredConfig restAssuredConfig() {
        int connectTimeoutMilliseconds = 5000;

        return RestAssured.config()
                .httpClient(HttpClientConfig.httpClientConfig()
                        .setParam(CONNECTION_TIMEOUT, connectTimeoutMilliseconds)
                        .setParam(SO_TIMEOUT, connectTimeoutMilliseconds));
    }
}



