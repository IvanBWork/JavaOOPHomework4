package Services;

import Domain.PersonComparator;
import Domain.Teacher;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс для обработки операций с учителями.
 */
public class TeacherService implements iPersonService<Teacher>{
    private int count;

    private String teacherAcadDegree;

    private List<Teacher> teachers;

    /**
     * Конструктор класса TeacherService.
     * Создает новый экземпляр класса с пустым списком учителей.
     */
    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    /**
     * Метод для получения квалификации преподавателя:
     * @param acadDegree - академическая степень преподавателя.
     */
    public void TeacherAcadDegree(String acadDegree) {
        this.teacherAcadDegree = acadDegree;
    }

    /**
     * Переопределённый метод getAll:
     * @return Список всех учителей.
     */
    @Override
    public List<Teacher> getAll() { return teachers; }

    /**
     * Переопределённый метод create:
     * Создает нового учителя и добавляет его в список.
     * Увеличивает счетчик количества учителей.
     * @param name - имя учителя.
     * @param age - возраст учителя.
     */
    @Override
    public void create(String name, int age) {
        Teacher teach = new Teacher(name, age, teacherAcadDegree);
        count++;
        teachers.add(teach);
    }

    /**
     * Сортирует список учителей по ФИО (фамилия, имя, отчество).
     * Использует компаратор PersonComparator для сравнения и последующей сортировки учителей.
     */
    public void sortByFIO() {
        PersonComparator<Teacher> persComp = new PersonComparator<Teacher>();
        teachers.sort(persComp);
    }
}
