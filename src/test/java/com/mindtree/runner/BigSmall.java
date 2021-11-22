package com.mindtree.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", glue = { "com.mindtree.stepdefinitions" }, dryRun = false, monochrome = true

)

public class BigSmall extends AbstractTestNGCucumberTests {

}
