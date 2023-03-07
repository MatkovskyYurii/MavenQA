package hillel.lessons.Lesson21Maven;


import lombok.Getter;

/**
 * Hello world!
 */
public class Main {

    public static void main(String[] args)
    /**
     * Maven Lifecycle
     * clean - очищає весь кеш який є в maven
     * validate - перевіряє тести
     * test - запускають все що помічено з анотацією test тобто наші тести
     * compile - компилирует  нам код
     * package - запускає build - запускає нашу апку створює папку target
     * verify - запускає компіляцію (test) і запускає package
     * install - перевірити що всі dependency встановлено і покаже які треба добавити
     * site - апдейт всі dependency які є саме в m2 (не проект) а на компі
     * deploy - бере target і відправляє на env
     * clean test - запускає всі тести після очистки
     * clean install - обновляє dependency
     * POM file
     * <build></build>  - для підключення plugin ,report
     * <properties></properties> - туди можна записати всі версії dependency через змінну і там обновляти
     * <repositories></repositories> - якщо ви маєте свій repo і ви туди вставляте щоб maven провіряв ще там
     * lobmbok - працює по анотації ми добавляємо анотацію в наш клас і він створює код сам @Data = getter setter
     * constructor equals hashcode; @Getter - тільки getter якщо писати над класом
     * він створить код для всіх змінних(класу) якщо всередині класу за дужками{} писати саме над змінною
     * то він створить тільки для змінної цієї змінної
     * @ToString
     * @EuqalsAndHashcode
     * бібліотека POJO - для mapping (перетворення) ( з json - в об'єкт)
     * мінус використання lombock - йому потрібен час, щоб згенерувати код перед тим як робити build*
     * я пробую друкувати і так сам не попоадаю але вже блище сам екран і так краще трохи?
     * я друкую на клаві і так само не попадаю але вже блище видно і так ккраще?
     * я тепер дивлюсь на клаву і так дуркую так краще?
     * жаргоні слова ?
     */
    {
        System.out.println("Hello World!");

    }
}





