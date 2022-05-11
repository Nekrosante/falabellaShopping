package falabellaShopping.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AddressPage extends PageObject {
    ////*[@id="address"]
    // //*[@id="departmentNumber"]
    public static final Target ADDRESS_TEXTBOX = Target.the("address text box")
            .located(By.id("address"));
    public static final Target DEPARTMENT_TEXTBOX = Target.the("department Number text box")
            .located(By.id("departmentNumber"));
    public static final Target BUTTON_INSERT_ADDRESS = Target.the("continue button")
            .located(By.xpath("//button[@class='fbra_button fbra_test_button fbra_formItem__useAddress']"));
    public static final Target BUTTON_CONFIRM = Target.the("confirm button")
            .located(By.xpath("//button[@class='fbra_button fbra_checkoutComponentDeliveryActions__continueToSecurePaymentButton fbra_test_checkoutComponentDeliveryActions__continueToSecurePaymentButton']"));
}
