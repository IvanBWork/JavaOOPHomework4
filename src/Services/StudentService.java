package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.PersonComparator;
import Domain.Student;

/**
 * Класс для обработки операций со студентами.
 */
public class StudentService implements iPersonService<Student>  {

    private int count;
    private List<Student> students;

    /**
     * Конструктор класса StudentService.
     * Создает новый экземпляр класса с пустым списком студентов.
     */
    public StudentService() {
        this.students = new ArrayList<>();
    }

    /**
     * Переопределённый метод getAll:
     * @return Список всех студентов.
     */
    @Override
    public List<Student> getAll() {
       return students;
    }

    /**
     * Переопределённый метод create:
     * Создает нового студента и добавляет его в список.
     * Увеличивает счетчик количества студентов.
     * @param name - имя студента.
     * @param age - возраст студента.
     */
    @Override
    public void create(String name, int age) {
       Student stud = new Student(name, age);
       count++;
       students.add(stud);
    }

    /**
     * Сортирует список студентов по ФИО (фамилия, имя, отчество).
     * Использует компаратор PersonComparator для сравнения и последующей сортировки студентов.
     */
    public void sortByFIO() {
        PersonComparator<Student> persComp = new PersonComparator<Student>();
        students.sort(persComp);
    }
}
