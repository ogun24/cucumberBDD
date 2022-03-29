package renastech.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


    @RunWith(Cucumber.class)
    @CucumberOptions(

    features = "src/test/resources", // tis is for feature files path
    glue = "renastech/stepDefinations", //this is for step path
            tags = "@TC_2",
            dryRun = false, // when it is true, it will check if there is any undefineds steps
plugin = {"pretty",
        "html:target/default-cucumber-reports.html",
            "json:target/cucumber.json",
            "rerun:target/rerun.txt"}
        )


public class TestRunner {
    }

