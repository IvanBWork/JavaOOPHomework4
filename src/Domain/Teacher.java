package Domain;

/**
 * Класс Teacher
 * Представляет собой учителя.
 */
public class Teacher extends Worker{
    private String acadDegree;

    /**
     * Конструктор класса Teacher:
     * @param firstName - имя учителя.
     * @param age - возраст учителя.
     */
    public Teacher(String firstName, int age, String acadDegree) {
        super(firstName, age);
        this.acadDegree = acadDegree;
    }

    /**
     * Метод для получения академической степени преподавателя.
     */
    public String getAcadDegree() {
        return acadDegree;
    }

    /**
     * Переопределенный метод toString для вывода информации о учителе:
     * @return Строковое представление объекта Teacher.
     */
    @Override
    public String toString() {
        return "Teacher {" + "name = " + super.getName() + ", age = " + super.getAge() +
                ", degree = '" + acadDegree + '\'' + '}';
    }
}
