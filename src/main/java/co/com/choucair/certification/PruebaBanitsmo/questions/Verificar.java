package co.com.choucair.certification.PruebaBanitsmo.questions;

import co.com.choucair.certification.PruebaBanitsmo.userinterfaces.ToolsBancolombiaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Verificar implements Question {

    public static Verificar resultado(){
        return new Verificar();
    }

    @Override
    public Object answeredBy(Actor actor){
        return Text.of(ToolsBancolombiaPage.TXT_RESPUESTA).answeredBy(actor).toString();
    }
}
