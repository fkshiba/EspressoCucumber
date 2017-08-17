package br.com.dextra.felipeshiba.espressocucumber.test;
import cucumber.api.CucumberOptions;

@CucumberOptions(features = "features",
        glue = {"br.com.dextra.felipeshiba.espressocucumber.test"},
        plugin = { "pretty" } //"html: cucumber-html-reports",
        // "json: cucumber-html-reports/cucumber.json"}
)
public class CucumberRunner {
}
