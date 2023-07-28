package github.selenide;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class SelenideRepositorySearch {

    @BeforeAll
    static void beforeAll() {
        Configuration.browserSize = "1920x1080";
        Configuration.pageLoadStrategy = "eager";
    }

    @Test
    void shouldFindSelenideRepositorySearchAtTheTop() {
        open("https://github.com/");
        $("button.header-search-button").click();
        $("#query-builder-test").setValue("Selenide").pressEnter();
//        $(byAttribute("data-testid","results-list")).$(byAttribute("href","/selenide/selenide")).$("em").shouldHave(text("selenide")).click();
        $("[data-testid=results-list]").$("em").shouldHave(text("selenide")).click();
        $("#repository-container-header").shouldHave(text("selenide / selenide"));
        sleep(3000);

    }
}
