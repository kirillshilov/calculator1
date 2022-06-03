package skypro.calculator;


import org.junit.jupiter.api.Test;



import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;


class ServisTest {
    private final Servis out = new Servis();

    int testNum1 = 2;
    int testNum2 = -2;
    int testNum3 = 0;


    @Test
    void showHello() {
        assertEquals("Добро пожаловать в калькулятор ", out.showHello());
        assertNotNull(out.showHello());
    }

    @Test
    void plus() {
        assertEquals(testNum1 + "+" + testNum2 + "=" + (testNum1 + testNum2), out.plus(testNum1, testNum2));
        assertEquals(testNum2 + "+" + testNum3 + "=" + (testNum2 + testNum3), out.plus(testNum2, testNum3));
        assertEquals(testNum3 + "+" + testNum1 + "=" + (testNum3 + testNum1), out.plus(testNum3, testNum1));
    }

    @Test
    void minus() {
        assertEquals(testNum1 + "-" + testNum2 + "=" + (testNum1 - testNum2), out.minus(testNum1, testNum2));
        assertEquals(testNum2 + "-" + testNum3 + "=" + (testNum2 - testNum3), out.minus(testNum2, testNum3));
        assertEquals(testNum3 + "-" + testNum1 + "=" + (testNum3 - testNum1), out.minus(testNum3, testNum1));
    }

    @Test
    void multiple() {
        assertEquals(testNum1 + "*" + testNum2 + "=" + (testNum1 * testNum2), out.multiple(testNum1, testNum2));
        assertEquals(testNum2 + "*" + testNum3 + "=" + (testNum2 * testNum3), out.multiple(testNum2, testNum3));
        assertEquals(testNum3 + "*" + testNum1 + "=" + (testNum3 * testNum1), out.multiple(testNum3, testNum1));
    }

    @Test
    void divide() {
        assertEquals(testNum1 + "/" + testNum2 + "=" + (testNum1 / testNum2), out.divide(testNum1, testNum2));
        assertEquals(testNum2 + "/" + testNum1 + "=" + (testNum2 / testNum1), out.divide(testNum2, testNum1));
        assertEquals(testNum3 + "/" + testNum1 + "=" + (testNum3 / testNum1), out.divide(testNum3, testNum1));
        assertThrows(ZeroIntException.class, () -> out.divide(testNum1, testNum3));
    }

}
