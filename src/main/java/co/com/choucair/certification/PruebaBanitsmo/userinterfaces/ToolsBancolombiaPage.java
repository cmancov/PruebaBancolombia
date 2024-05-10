package co.com.choucair.certification.PruebaBanitsmo.userinterfaces;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.hamcrest.generator.qdox.model.AbstractJavaEntity;
import org.openqa.selenium.By;

public class ToolsBancolombiaPage extends PageObject {
    public static final Target BTN_NEGOCIOS = Target.the("header-negocios")
            .located(By.id("header-pymes"));
    public static final Target BTN_HERRAMIENTAS = Target.the("boton productos")
            .located(By.xpath("(//*[contains(text(),'Herramientas')])[1]"));
    public static final Target BTN_SIGUIENTE = Target.the("boton-siguiente")
            .located(By.xpath("//*[@class='bc-icon bc-sm']"));
    public static final Target BTN_AMPLIAR = Target.the("boton-ampliar")
            .located(By.xpath("(//*[contains(text(),'Gestionar las finanzas de mi negocio')])[1]"));
    public static final Target BTN_CONVERTIDOR = Target.the("boton-convertidor")
            .located(By.xpath("(//*[contains(text(),'Convertidor de tasas de interés')])"));
    public static final Target BTN_CALCULAR = Target.the("boton-calcular")
            .located(By.xpath("//*[@id='btntoolUno']"));
    public static final Target TXT_INTERES = Target.the("caja-texto-calcular")
            .located(By.xpath("//*[@id='interes']"));
    public static final Target LIST_PERIODICIDAD = Target.the("lista-periodicidad")
            .located(By.xpath("//*[@id='periodicidad-deseada']/option[2]"));
    public static final Target LIST_CAPITALIZACION = Target.the("lista-capitalizacion")
            .located(By.xpath("//*[@id='capitalizacion']/option[6]"));

    public static final Target TXT_RESPUESTA = Target.the("lista-capitalizacion")
            .located(By.xpath("//*[@id='respuesta']"));


}
