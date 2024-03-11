package Domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс StudentGroup.
 * Представляет собой структуру для создания объектов типа "StudentGroup" с номером группы и списком студентов в группе.
 */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private int idGroup;
    private List<Student> group;

    /**
     * Конструктор класса StudentGroup:
     * @param idGroup - номер группы
     * @param group - список студентов в группе
     */
    public StudentGroup(List<Student> group, int idGroup) {
        this.group = group;
        this.idGroup = idGroup;
    }

    /**
     * Метод для получения списка студентов в группе.
     */
    public List<Student> getGroup() {
        return group;
    }

    /**
     * Метод для установки списка студентов в группе.
     */
    public void setGroup(List<Student> group) {
        this.group = group;
    }

    /**
     * Метод для получения id группы.
     */
    public int getIdGroup() {
        return idGroup;
    }

    /**
     * Метод для установки id группы.
     */
    public void setIdGroup(int idGroup) {
        this.idGroup = idGroup;
    }

    /**
     * Переопределенный метод toString:
     * @return строковое представление объекта StudentGroup.
     */
    @Override
    public String toString() {
        return "StudentGroup {" + "idGroup = " + idGroup + ", studentsCount = " + group.size() + ", students = " + group + '}';
    }

    /**
     * @apiNote Переопределенный метод iterator - для прохождения по элементам списка,
     * который представляет собой список студентов в группе.
     * @return iterator для списка студентов в группе.
     */
     @Override
    public Iterator<Student> iterator() {
       return new StudentIterator(group);
    }

    /**
     * @apiNote Метод для сравнения групп по размеру и по id:
     * @param o группа получаемая для сравнения.
     * @return возвращаемое сравнение по размеру группы:
     * 0 - если значения равны. В таком случае идёт сравнение по идентификатору группы.
     * -1 - если вызываемая группа больше o.
     * 1 - если вызываемая группа меньше o.
     * @return возвращаемое сравнение по идентификатору группы:
     * 0 - если значения равны.
     * 1 - если вызываемая группа больше o.
     * -1 - если вызываемая группа меньше o.
     */
    @Override
    public int compareTo(StudentGroup o) {
        if (o.getGroup().size() == this.getGroup().size())
            {
                if(idGroup == o.idGroup)return 0;
                if(idGroup > o.idGroup)return -1;
                else return 1;
            }

            if(o.getGroup().size() > this.getGroup().size())
                return 1;
            else
                return -1;
    }
}
