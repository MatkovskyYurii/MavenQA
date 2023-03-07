package hillel.calctest;

import hillel.lessons.lesson22.Calculation;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalcTest {

    private static Calculation calculation; // це обявление поля

    private int a = 0;

    private int b = 2;

    @BeforeAll
    public static void init() {
        calculation = new Calculation(); // це присвоєння обєкта в поле
        System.out.println("Before all");
    }

    @BeforeEach
    public void beforeEach() {
        a = 10;
        b = 2;
        System.out.println("Before each");
    }

    @Test
    @DisplayName("Test division 10 + 2")
    public void testDivision() {
        System.out.println("Test 1");
//        calculation.division(10, 15); // тут ми виконуємо метод для нашого обєкта
        int result = calculation.division(10, 2);
        Assertions.assertEquals(5, result, "Result is wrong " + result);
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3})
    public void testAddition(int a) {
        System.out.println("Test 2");
        int result = calculation.addition(10, 2);
        Assertions.assertFalse(result == 13, "Result is wrong " + result);
    }

    @ParameterizedTest
    @MethodSource("integerStreamProvider")
    public void testDivision(int a, int b, int expected) {
        System.out.println("Test 2");
        int result = calculation.division(a, b);
        Assertions.assertEquals(result, expected, "Result is wrong " + result);
    }

    public static Stream<Arguments> integerStreamProvider() {
        return Stream.of(
                Arguments.arguments(10, 5, 2),// обєкт типу Arguments викликає метод arguments зі значеннями (10,5,2)
                Arguments.arguments(8, 2, 4));// посуті ми тут записуємо ці значення в stream з полями arguments(8,2,4)
    }
    // assertThrows - повертає нам exception який вискочив
    @Test
    void exceptionTesting() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> calculation.division(1, 0));
        assertEquals("/ by zero", exception.getMessage());
    }

    @Test
    public void testAddition() {
        System.out.println("Test 2");
        int result = calculation.addition(10, 2);
        Assertions.assertFalse(result == 13, "Result is wrong " + result);
    }

    @AfterEach
    public void afterEach() {
        System.out.println("After each");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After all");
    }


}
