package co.com.choucair.certification.PruebaBanitsmo.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        tags = "@HistoriaDeUsuario",
        glue = "co.com.choucair.certification.PruebaBanitsmo.stepdefinitions"
)
public class RunnerTags{
}