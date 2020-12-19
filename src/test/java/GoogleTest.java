
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;



public class GoogleTest {


    @Test
    void selenideSearchTest() {
        String searchItem = "";
        String searchResult = "";
        // Открыть google
        open("https://google.com");

        // Ввести Selenide в поиск
        $(byName("q")).setValue(searchItem).pressEnter();

        // Проверить, что Selenide появился в результатах поиска
        $("html").shouldHave(text(searchResult));
    }
    }

