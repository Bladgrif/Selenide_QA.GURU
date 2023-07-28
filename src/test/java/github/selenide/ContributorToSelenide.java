package github.selenide;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ContributorToSelenide {

    @BeforeAll
    static void beforeAll() {
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void andreySolncevFirstContributor() {
        open("https://github.com/selenide/selenide");
        $("div.Layout-sidebar").$(byText("Contributors"))
                .closest("h2").sibling(0).$$("li").first().hover();
//        $(".BorderGrid-cell .list-style-none [href=https://github.com/asolntsev]").shouldHave(text("asolntsev"));
        $(".Popover-message").shouldHave(text("Andrei Solntsev"));
//        $$(".Popover ").findBy(visible).shouldHave(text("Andrei Solntsev"));
        sleep(5000);

    }
}
