package com.nisum.jp.springbootcucumberrest.stepdefinitions;

import com.nisum.jp.springbootcucumberrest.services.PostManEchoService;
import com.nisum.jp.springbootcucumberrest.utils.ScenarioContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;

/**
 * Created by jpnisum on 12/20/18.
 */
public class PostManEchoSteps {

  @Autowired
  private PostManEchoService postManEchoService;

  @Autowired
  private ScenarioContext scenarioContext;

  @Given("I have a postman echo service available")
  public void postmanEchoServiceAvailable() throws Throwable{

  }

  @When("I call get service for postman echo service")
  public void serviceForPostManEchoService() throws Throwable {
    postManEchoService.getPostManEchoResponse("Integration", "Tests");
  }

  @Then("I should be seeing success for the service call")
  public void postmanSuccessCall() throws Throwable {
    Assert.assertEquals(scenarioContext.getResponse().getStatusCode(), HttpStatus.SC_OK);
  }

}
