package Domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс StudentIterator.
 * Реализует интерфейс Iterator для итерации по списку студентов.
 */
public class StudentIterator implements Iterator<Student> {
    private int counter;
    private final List<Student> students;

    /**
     * Конструктор класса StudentIterator:
     * @param students - список студентов.
     */
    public StudentIterator(List<Student> students) {
        this.students = students;
        this.counter = 0;
    }

    /**
     * Переопределенный метод hasNext:
     * Проверяет есть ли следующий элемент в списке.
     * @return true - если есть следующий элемент.
     * Иначе возвращает значение false.
     */
    @Override
    public boolean hasNext() {
       return counter<students.size();
    }

    /**
     * Переопределенный метод next:
     * Метод для получения следующего элемента из списка.
     * @return следующий элемент из списка групп студентов на потоке.
     */
    @Override
    public Student next() {
        if(!hasNext())
        {
            return null;
        }
        return students.get(counter++);        
    }
}

