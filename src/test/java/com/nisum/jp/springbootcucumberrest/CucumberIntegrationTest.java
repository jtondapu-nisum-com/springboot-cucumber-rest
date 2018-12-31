package com.nisum.jp.springbootcucumberrest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

/**
 * Created by jpnisum on 12/20/18.
 */

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/",
    glue = {"com.nisum.jp.springbootcucumberrest.stepdefinitions"},
    tags = {"not @ignore", "not @wip"},
    plugin = {
        "pretty",
        "html:target/cucumber-html-report",
        "json:target/cucumber.json",
        "rerun:target/cucumber-api-rerun.txt"
    })
public class CucumberIntegrationTest extends AbstractTestNGCucumberTests{

}
