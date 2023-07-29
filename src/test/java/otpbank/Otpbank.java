package otpbank;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;

public class Otpbank {

    @BeforeAll
    static void beforeAll() {
//        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
        Configuration.timeout = 43000;
    }

    @Test
    void closeCookieBanner() {
        open("https://www.otpbank.ru/");
        $(withText("Продолжая просмотр сайта")).shouldBe(visible);
        $(byTagAndText("a", "Закрыть")).click();
        $(withText("Продолжая просмотр сайта")).shouldBe(hidden);
//        sleep(5000);
    }
}
