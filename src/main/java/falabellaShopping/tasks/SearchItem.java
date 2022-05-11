package falabellaShopping.tasks;

import falabellaShopping.userinterface.FalabellaPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;

public class SearchItem implements Task {
    private String article;

    public SearchItem(String article) {
        this.article = article;
    }

    public static SearchItem putIn(String Article) {
        return Tasks.instrumented(SearchItem.class, Article);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(article).into(FalabellaPage.INPUT_ITEM),
                Click.on(FalabellaPage.SEARCH_ICON)
                );
    }
}
