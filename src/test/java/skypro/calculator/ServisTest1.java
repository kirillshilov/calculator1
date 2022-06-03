package skypro.calculator;

import org.assertj.core.internal.bytebuddy.implementation.bind.annotation.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ServisTest1 {
    private final Servis out = new Servis();

    @Test
    void showHello() {
        assertEquals("Добро пожаловать в калькулятор ", out.showHello());
        assertNotNull(out.showHello());
    }

    @ParameterizedTest
    @MethodSource("paramForTesting")
    void plus(int testNum1, int testNum2) {
        assertEquals(testNum1 + "+" + testNum2 + "=" + (testNum1 + testNum2), out.plus(testNum1, testNum2));
    }

    @ParameterizedTest
    @MethodSource("paramForTesting")
    void minus(int testNum1, int testNum2) {
        assertEquals(testNum1 + "-" + testNum2 + "=" + (testNum1 - testNum2), out.minus(testNum1, testNum2));
    }

    @ParameterizedTest
    @MethodSource("paramForTesting")
    void multiple(int testNum1, int testNum2) {
        assertEquals(testNum1 + "*" + testNum2 + "=" + (testNum1 * testNum2), out.multiple(testNum1, testNum2));

    }

    @ParameterizedTest
    @MethodSource("paramForTesting")
    void divide(int testNum1, int testNum2) {
        assertEquals(testNum1 + "/" + testNum2 + "=" + (testNum1 / testNum2), out.divide(testNum1, testNum2));
    }

    private static Stream<Arguments> paramForTesting() {
        int testNum1 = 2;
        int testNum2 = -2;
        int testNum3 = 0;
        return Stream.of(
                Arguments.of(testNum1, testNum2),
                Arguments.of(testNum2, testNum1),
                Arguments.of(testNum3, testNum1)
        );
    }
}