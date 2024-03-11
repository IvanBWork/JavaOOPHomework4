package Controllers;

import java.util.List;

import Domain.Person;
import Domain.Worker;

/**
 * Класс, представляющий контроллер с возможностью:
 * Вывода полученного списка.
 * Выплаты зарплаты работающим сотрудникам.
 * Вычесления среднего возраста.
 */
public class AccountController {

    /**
     * Метод вывода в консоль полученного списка:
     * @param group - Список наследника класа Person.
     */
    public static <V extends Person> void print(List<V> group) {
        for(V s : group)
        {
            System.out.println(s);
        }
    }

    /**
     * Метод для выплаты зарплаты работающему сотруднику:
     * @param person Объект типа T, должен быть наследником класса Worker.
     * @param salary Сумма зарплаты для выплаты.
     */
    public static <T extends Worker> void paySalary(T person, int salary) {
        System.out.println(person.getName() + " выплачено зарплата " + salary + "р. ");
    }

    /**
     * @apiNote Метод для определения среднего возраста людей из списка:
     * @param str - комментарий для описания, чей средний возраст будет выведен в консоль.
     * @param <T> тип-наследник класса Person.
     * @param persons - лист с объектами-наследниками класса Person для определения среднего возраста.
     */
    public static <T extends Person> void averageAge(String str, List<T> persons)
    {
        double sumForAverageAge = 0;
        for (T t : persons) {
            sumForAverageAge = sumForAverageAge + t.getAge();
        }
        double averageAge = sumForAverageAge/ persons.size();
        System.out.println(str + averageAge);
    }
}
