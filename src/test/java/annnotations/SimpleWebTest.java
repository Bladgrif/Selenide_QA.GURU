package annnotations;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class SimpleWebTest {

    @BeforeEach
    void setUp() {
        Configuration.pageLoadStrategy = "eager";
        open("https://www.google.com/");
    }

//    @DisplayName("Open google.com and find selenide")
//    @Test
//    void successfulSearchTextSelenide() {
//        $("[name=q]")
//                .setValue("selenide")
//                .pressEnter();
//        $("[id=search]").shouldHave(text("https://ru.selenide.org"));
//    }
//
//    @DisplayName("Open google.com and find junit")
//    @Test
//    void successfulSearchTextJunit() {
//        $("[name=q]")
//                .setValue("junit")
//                .pressEnter();
//        $("[id=search]").shouldHave(text("https://junit.org"));
//    }

    @CsvSource({
            "https://ru.selenide.org, Selenide",
            "https://junit.org,       JUnit 5"
    })

//    @CsvFileSource(resources = "/successfulSearchText.csv")

    @ParameterizedTest(name = "Open {0} and find {1}")
    void successfulSearchText(String url, String searchword) {
        $("[name=q]")
                .setValue(searchword)
                .pressEnter();
        $("[id=search]").shouldHave(text(url));
    }
}
