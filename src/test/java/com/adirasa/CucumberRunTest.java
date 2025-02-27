package com.adirasa;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        glue = {"com.adirasa.stepdef"},
        features = {"src/test/resources/"},
        plugin = {"pretty", "html:reports/cucumber.html", "json:reports/cucumber.json"} // Report yg dibuat
)

public class CucumberRunTest {}

