package falabellaShopping.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmationPage extends PageObject {
    public static final Target CONTINUE_LINK = Target.the("link to confirm the addition of the product")
            .located(By.xpath("//button[contains(text(),'Seguir comprando')]"));
}
