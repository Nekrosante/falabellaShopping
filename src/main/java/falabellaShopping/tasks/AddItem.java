package falabellaShopping.tasks;

import falabellaShopping.userinterface.ConfirmationPage;
import falabellaShopping.userinterface.InfoItemPage;
import falabellaShopping.userinterface.ItemPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class AddItem implements Task {
    public static AddItem ShopBag() {
        return Tasks.instrumented(AddItem.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ItemPage.ITEM_ICON),
                Click.on(InfoItemPage.ADD_ITEM_BAG),
                Click.on(ConfirmationPage.CONTINUE_LINK));
    }
}
