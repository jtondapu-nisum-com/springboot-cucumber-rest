package com.nisum.jp.springbootcucumberrest.utils;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jpnisum on 12/20/18.
 */
@Component
public class RestWrapper {

  @Autowired
  private ScenarioContext scenarioContext;

  public Response getAsResponse(String host, String endpointUrl, Map<String, String> params, Map<String, Object> headers ){

    Response resp = given().
        baseUri(host).
        basePath(endpointUrl).
        params(params).
        headers(headers).
        urlEncodingEnabled(false).
        log().uri().
        get().
        then().
        extract().
        response();

    scenarioContext.setResponse(resp);
    return resp;
  }

}
