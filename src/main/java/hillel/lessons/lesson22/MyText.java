package hillel.lessons.lesson22;

/**
 * Модульне тестування - це тестування одного блоку метода (модуль = метод)
 * Unit test - має бути найбільше
 * Integration - це типу як на POSTMAN ми зробимо запити але робимо їх кодом
 * нам не цікава поведінка UI надійні тести
 * UI tests - коли за допомогою коду відкриваємо браузер і виконуємо якісь перевірки на відповідність
 * до дизайну: текст, розміри кнопок ,pop-up, що повертає сторінка (вважається не стабільним через часті
 * зміни)
 * E2E - тести коли ми імітуємо юзерів
 * ------- Testing FRAMEWORKS
 * Framework - це набір бібліотек з своїми правилами
 * JUnit 5 Framework - для прогону тестів та assert результатів
 * Анотації
 * --- @Test - так позначаються тестові методи
 * тестові методи можна називати divisionTest або testDivision test_division
 * --- @BeforeAll - виконується перед усіма тестовими методами туди дають initialization
 * він static - для того, щоб бути впевненими що він викличеться першим перед тестами
 * --- @BeforeEach - наприклад нам потрібно постійно створювати новий обєкт перед кожним тестом
 * з якимось новим станом , або для очищення кукі та кешу
 * може бути багато але також не відомо в якому порядку вони виконаються
 * --- @DisplayName поставти ім'я тесту для нашого терміналу IDEA
 * --- @AfterAll - виконує цей блок після тестів  - також може бути багато та не відомо який порядок виконання
 * --- @ParameterizedTest = тест з параметрами які ми передаємо через @ValueSource
 *     @ValueSource(ints = {1, 2, 3}) - тут ми передаємл values типу int = 1,2,3 він зробить три тести з цими трьома
 *     значеннями
 *     @EnumSource - також можна подати enum
 *     @CsvSource - параметри з таблиці CSV
 *     @MethodSource("integerStreamProvider") - можемо передати наші параметри з методу
 * --------------------------------------------Клас Assertions
 * Порівнює Actual result з Expected Result через конструктор
 * TestNG Framework
 *
 * @Test - це анотація для тестового методу
 */
public class MyText {
    public static void main(String[] args) {

    }
}
