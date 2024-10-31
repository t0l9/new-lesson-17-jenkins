package simple;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple")
public class SkippedCases {

    @Test
    @Disabled
    void test() {
        assertTrue(true);
    }

    @Disabled
    @Test
    void test2() {
        assertTrue(true);
    }

    @Disabled("Выключен")
    @Test
    void test3() {
        assertTrue(true);
    }


    @Disabled
    @Test
    void test4() {
        assertTrue(true);
    }
}
