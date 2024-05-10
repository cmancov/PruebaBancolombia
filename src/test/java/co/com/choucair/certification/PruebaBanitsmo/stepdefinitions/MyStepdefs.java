package co.com.choucair.certification.PruebaBanitsmo.stepdefinitions;

import co.com.choucair.certification.PruebaBanitsmo.questions.Verificar;
import co.com.choucair.certification.PruebaBanitsmo.tasks.OpenUp;
import co.com.choucair.certification.PruebaBanitsmo.tasks.ToolsPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class MyStepdefs {

    @Before
    public void scenarioStart(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("than Crihstian entry to Bancolombia")
    public void thanCrihstianEntryToBancolombia() {
        OnStage.theActorCalled("Crihstian").wasAbleTo(OpenUp.Page());
    }
    @When("entry the tools Bancolombia")
    public void entryTheToolsBancolombia() {
        OnStage.theActorInTheSpotlight().attemptsTo(ToolsPage.ThePage());
    }
    @Then("i can view interest rate")
    public void iCanViewInterestRate() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Verificar.resultado(), Matchers.equalTo("1.00 %")));
    }
}

