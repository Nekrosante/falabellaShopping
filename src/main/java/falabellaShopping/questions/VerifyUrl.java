package falabellaShopping.questions;

import falabellaShopping.model.Constants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.core.Serenity.getDriver;

public class VerifyUrl implements Question<Boolean> {
    public static VerifyUrl toThe() {
        return new VerifyUrl();
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        WebDriver driver = getDriver();
        String currentUrl = driver.getCurrentUrl();
        boolean result;
        Constants URL = new Constants();
        if (currentUrl.equals(URL.getURL())){
            result = true;
        }else {result = false;}

        return result;
    }
}
