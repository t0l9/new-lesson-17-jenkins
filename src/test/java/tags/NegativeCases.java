package tags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("simple")
public class NegativeCases {


    @Test
    void test() {
        assertTrue(false);
    }

    @Test
    void test2() {
        assertTrue(false);
    }

    @Test
    void test3() {
        assertTrue(false);
    }

    @Test
    void test4() {
        assertTrue(false);
    }
}
