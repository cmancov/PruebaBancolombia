package co.com.choucair.certification.PruebaBanitsmo.tasks;

import co.com.choucair.certification.PruebaBanitsmo.userinterfaces.ToolsBancolombiaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class ToolsPage implements Task {
    public static ToolsPage ThePage() {
        return Tasks.instrumented(ToolsPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Click.on(ToolsBancolombiaPage.BTN_NEGOCIOS),
                Click.on(ToolsBancolombiaPage.BTN_HERRAMIENTAS),
                Click.on(ToolsBancolombiaPage.BTN_SIGUIENTE),
                Click.on(ToolsBancolombiaPage.BTN_AMPLIAR),
                Click.on(ToolsBancolombiaPage.BTN_CONVERTIDOR),
                Click.on(ToolsBancolombiaPage.BTN_CALCULAR),
                Enter.theValue("1").into(ToolsBancolombiaPage.TXT_INTERES),
                Click.on(ToolsBancolombiaPage.LIST_PERIODICIDAD),
                Click.on(ToolsBancolombiaPage.LIST_CAPITALIZACION));

        }
}
