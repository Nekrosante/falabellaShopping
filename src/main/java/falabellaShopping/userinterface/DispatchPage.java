package falabellaShopping.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class DispatchPage extends PageObject {
    public static final Target drpDepartamento = Target.the("dropdown departamento")
            .located(By.id("region"));
    public static final Target drpCiudad = Target.the("dropdown ciudad")
            .located(By.id("ciudad"));
    public static final Target drpComuna = Target.the("dropdown comuna")
            .located(By.id("comuna"));
    // //button[@class="fbra_button fbra_test_button fbra_formItem__field04"]
    public static final Target BUTTON_CONTINUE = Target.the("continue button")
            .located(By.xpath("//button[@class='fbra_button fbra_test_button fbra_formItem__field04']"));

}
