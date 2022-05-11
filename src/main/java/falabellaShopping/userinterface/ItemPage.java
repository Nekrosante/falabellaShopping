package falabellaShopping.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ItemPage extends PageObject {
    public static final Target ITEM_ICON = Target.the("search icon")
            .located(By.xpath("(//b[contains(text(),'Por Falabella')])[1]"));
}
