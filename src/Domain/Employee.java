package Domain;

/**
 * Класс Employee, расширяющий класс Person.
 * Представляет собой структуру для создания объектов типа "Employee" с именем, возрастом и степенью.
 */
public class Employee extends Worker{
    private String post;

    /**
     * Конструктор класса Employee:
     * @param firstName - имя.
     * @param age - возраст.
     * @param post - должность.
     */
    public Employee(String firstName, int age, String post) {
        super(firstName, age);
        this.post = post;
    }

    /**
     * Метод для получения должности сотрудника.
     */
    public String getPost() {
        return post;
    }
}
