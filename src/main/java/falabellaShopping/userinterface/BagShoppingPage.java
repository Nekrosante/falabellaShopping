package falabellaShopping.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BagShoppingPage extends PageObject {
    public static final Target SHOPPING_BUTTON = Target.the("link to confirm the addition of the product")
            .located(By.xpath("//button[@class='fb-btn fb-btn-primary fb-btn-icon fb-order-status__continue-purchase js-fb-continue-purchase']"));
}
