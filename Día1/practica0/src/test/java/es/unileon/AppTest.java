package es.unileon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * Unit test for simple App.
 */
class AppTest {
    /**
     * Rigorous Test.
     */
    @Test
    void simpleTest() {
        Person alice = new Person("Alice", "12837127x");
        Person albert = new Person("albert", "73915494u");

        assertTrue((alice.getName() != null) & (albert.getName() != null));
    }
}
