package falabellaShopping.tasks;

import falabellaShopping.model.Constants;
import falabellaShopping.userinterface.BagShoppingPage;
import falabellaShopping.userinterface.DispatchPage;
import falabellaShopping.userinterface.FalabellaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class DataInsert implements Task {
    public static DataInsert FillFields() {
        return Tasks.instrumented(DataInsert.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        Constants Var = new Constants();
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(Var.getDepartamento()).from(DispatchPage.drpDepartamento),
                SelectFromOptions.byVisibleText(Var.getCiudad()).from(DispatchPage.drpCiudad),
                SelectFromOptions.byVisibleText(Var.getComuna()).from(DispatchPage.drpComuna),
                Click.on(DispatchPage.BUTTON_CONTINUE)
        );
    }
}
