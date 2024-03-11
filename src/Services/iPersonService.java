package Services;

import Domain.Person;

import java.util.List;

/**
 * Интерфейс описывает работу с наследниками класса Person.
 */
public interface iPersonService<T extends Person> {
    List<T> getAll();
    void create(String name, int age);
}
