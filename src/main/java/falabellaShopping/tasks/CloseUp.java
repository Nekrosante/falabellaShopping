package falabellaShopping.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;


public class CloseUp implements Task {
    public static Performable popUP() {
        return Tasks.instrumented(CloseUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
