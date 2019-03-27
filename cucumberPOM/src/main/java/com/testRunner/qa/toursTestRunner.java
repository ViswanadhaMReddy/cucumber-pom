package com.testRunner.qa;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions (
		features="F:\\NewEclipse\\cucumberPOM\\src\\main\\java\\com\\ndt\\features\\qa\\tours.features",
        glue= {"F:\\NewEclipse\\cucumberPOM\\src\\main\\java\\com\\ndt\\stepDefinations\\qa\\flightfinderSteps.java"} ,
        format= {"pretty","html:test-output","json:json-output/cucumber.json","junit:junit_xml/cucumber.xml"},
        monochrome=true, 
        strict=true,
        dryRun=true
        )
public class toursTestRunner {
	

}
