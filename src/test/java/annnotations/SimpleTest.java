package annnotations;

import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.open;

public class SimpleTest {

    @Disabled("jira-123")
    @DisplayName("Описание первого теста")
    @Test
    void simpleTest() {
        Assertions.assertTrue(3>2);
    }


    @Tag("web")
    @DisplayName("Описание второго теста")
    @Test
    void simpleTest1() {
        Assertions.assertTrue(3>2);
    }

    @Tags({
            @Tag("smoke")
    })
    @DisplayName("Описание третьего теста")
    @Test
    void simpleTest2() {
        Assertions.assertTrue(5>2);
    }

    @Tags({
            @Tag("smoke"),
            @Tag("web")
    })
    @DisplayName("Описание четвертого теста")
    @Test
    void simpleTest3() {
        Assertions.assertTrue(5>2);
    }
}
