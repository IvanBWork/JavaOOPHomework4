package Domain;

import java.util.Comparator;

/**
 * Класс Student
 * Представляет собой структуру для сортировки объектов наследников класса Person.
 */
public class PersonComparator<T extends Person> implements Comparator<T> {

    /**
     * Сравнивает два объекта типа T на основе их имен.
     * @param o1 Первый объект для сравнения.
     * @param o2 Второй объект для сравнения.
     * @return Отрицательное число, если o1 меньше o2, положительное число, если o1 больше o2, и ноль, если они равны.
     */
    @Override
    public int compare(T o1, T o2) {
        int res = o1.getName().compareTo(o2.getName());
        if (res == 0) {
            return 0;
        } else {
            return res;
        }
    }
}
