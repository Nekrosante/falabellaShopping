package falabellaShopping.tasks;

import falabellaShopping.model.Constants;
import falabellaShopping.userinterface.AddressPage;
import falabellaShopping.userinterface.DispatchPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InsertAddress implements Task {

    public static InsertAddress FillTextBox() {
        return Tasks.instrumented(InsertAddress.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Constants Var = new Constants();
        actor.attemptsTo(
                Enter.theValue(Var.getAddres()).into(AddressPage.ADDRESS_TEXTBOX),
                Enter.theValue(Var.getDepartamento()).into(AddressPage.DEPARTMENT_TEXTBOX),
                Click.on(AddressPage.BUTTON_INSERT_ADDRESS),
                Click.on(AddressPage.BUTTON_CONFIRM)
        );

    }
}
