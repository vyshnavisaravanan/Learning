package bdd.argos.functional;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = ".",
        tags = "@argos",
        plugin ="json:target/cucumber.json"
        )
public class CukesTestRun {
}
