package falabellaShopping.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InfoItemPage extends PageObject {
    public static final Target ADD_ITEM_BAG = Target.the("Add item to cart")
            .located(By.id("buttonForCustomers"));
}
