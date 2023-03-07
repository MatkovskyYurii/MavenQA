package hillel.calctest;

import hillel.lessons.lesson22.Calculation;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class HomeworkCalcTest {

    private static Calculation calculation;

    @BeforeAll
    public static void Init() {
        calculation = new Calculation();
    }

    @Test
    @DisplayName("Multiply value a == Positive")
    public void multiplyTestPositiveValueA() {
        int result = calculation.multiply(5, 4);
        assertTrue(result == 20, "Wrong condition Result = " + result);
    }

    @Test
    @DisplayName("Multiply value a == Negative")
    public void multiplyTestNegativeValueA() {
        int result = calculation.multiply(-5, 4);
        assertEquals(-20, result, "Wrong condition Result = " + result);
    }

    @Test
    @DisplayName("Multiply value a == Zero")
    public void multiplyTestZeroValueA() {
        int result = calculation.multiply(0, 4);
        assertEquals(0, result, "Wrong condition Result = " + result);
    }

    @Test
    @DisplayName("Division value a == Positive")
    public void divisionTestPositiveValueA() {
        int result = calculation.division(10, 2);
        assertEquals(5, result, "Wrong condition Result = " + result);
    }

    @Test
    @DisplayName("Division value a == Negative")
    public void divisionTestNegativeValueA() {
        int result = calculation.division(10, -2);
        assertEquals(-5, result, "Wrong condition Result = " + result);
    }

    @Test
    @DisplayName("Division value a == Zero")
    public void divisionTestZeroValueA() {
        int result = calculation.division(0, 2);
        assertEquals(0, result, "Wrong condition Result = " + result);
    }


    @Test
    @DisplayName("Division value b == Zero/Exception")
    public void divisionTestZeroValueBException() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, ()
                -> calculation.division(2, 0));
        assertEquals("/ by zero", exception.getMessage());
    }

    @ParameterizedTest
    @DisplayName("Addition results == Positive,Negative,Zero")
    @MethodSource("integerStreamProvider")
    public void testAddition(int a, int b, int expected) {
        int result = calculation.addition(a, b);
        assertEquals(result, expected, "Wrong condition Result =  " + result);
    }

    public static Stream<Arguments> integerStreamProvider() {
        return Stream.of(
                Arguments.arguments(5, -4, 1),
                Arguments.arguments(-5, 4, -1),
                Arguments.arguments(0, 0, 0)
        );
    }
}
