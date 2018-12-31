package com.nisum.jp.springbootcucumberrest.utils;

import io.restassured.response.Response;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

/**
 * Created by jpnisum on 12/20/18.
 */
@Setter
@Getter
@Component
public class ScenarioContext {

  private Response response;

}
