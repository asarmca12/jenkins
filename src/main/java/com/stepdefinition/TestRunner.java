package com.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features="E:\\ProjectWorkspace\\cucumber1\\src\\main\\resources\\feature",glue="com.stepdefinition",plugin= {"html:target","json:src\\main\\resources\\report.json"})

public class TestRunner {
	

}
