package falabellaShopping.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.falabella.com.co/falabella-co")
public class FalabellaPage extends PageObject {
    public static final Target INPUT_ITEM = Target.the("item to be found")
            .located(By.id("testId-SearchBar-Input"));
    public static final Target SEARCH_ICON = Target.the("search icon")
            .located(By.xpath("//img[@src='https://images.falabella.com/v3/assets/blt088e6fffbba20f16/blte9c20b98d24f1a25/60376c9a4a75a66ee92262d6/searcher-glass.svg']"));
    public static final Target BAG_SHOP = Target.the("item to be found")
            .located(By.id("testId-UserAction-basket"));
////*[@id="testId-UserAction-basket"]/div/a/i
}
