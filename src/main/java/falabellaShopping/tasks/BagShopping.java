package falabellaShopping.tasks;

import falabellaShopping.userinterface.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class BagShopping implements Task {
    public static BagShopping OpenUp() {
        return Tasks.instrumented(BagShopping.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FalabellaPage.BAG_SHOP),
                Click.on(BagShoppingPage.SHOPPING_BUTTON)
        );
    }
}
