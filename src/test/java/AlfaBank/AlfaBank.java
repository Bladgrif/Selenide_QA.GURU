import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AlfaBank {

    @BeforeAll
    static void beforeAll() {
//        Configuration.baseUrl = "https://alfabank.ru/";
        Configuration.pageLoadStrategy = "eager";
        Configuration.browserSize = "1920x1080";
    }

    @Test
    void alfaBank() {
        open("https://alfabank.ru/");
        $("[title = Вклады]").click();
        $("div#alfa-account.uG2mw").$(byText("Максимальный доход с первого месяца")).shouldHave(text("Максимальный доход с первого месяца"));

        SelenideElement alfaButton = $("div#alfa-account.uG2mw");
        $(alfaButton).$(byText("Максимальный доход с первого месяца")).shouldHave(text("Максимальный доход с первого месяца"));
//        sleep(3000);
        // parent - переход в родителю
        // closest - ищет ближайший сверху родитель с таким названием
        // sibling - ищет соседа (брата)  по порядку от указанного элемента( вниз по дереву)
        // preceding - ищет соседа (брата) по порядку от указанного элемента( вверх по дереву)
        //asdasd

    }
}