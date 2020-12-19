package test;

import config.ConfigHelper;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;



public class GoogleTest {


    @Test
    void selenideSearchTest() {
        String searchItem = ConfigHelper.getSearchItem();
        String searchResult = ConfigHelper.getSearchResult();

        open("https://google.com");
        $(byName("q")).setValue(searchItem).pressEnter();
        $("html").shouldHave(text(searchResult));
    }
    }

