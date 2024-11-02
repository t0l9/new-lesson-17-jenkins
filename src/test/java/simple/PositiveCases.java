package simple;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple")
public class PositiveCases {

    @DisplayName("Первый автотест в jenkins")
    @Tag("first_secusess")
    @Owner("Kolyshkin")
    @Severity(SeverityLevel.BLOCKER)
    @Feature("Фича теста")
    @Test
    void test() {
        assertTrue(true);
    }

    @Test
    void test2() {
        assertTrue(true);
    }

    @Test
    void test3() {
        assertTrue(true);
    }

    @Test
    void test4() {
        assertTrue(true);
    }

    @Test
    void tes5() {
        assertTrue(true);
    }
}
