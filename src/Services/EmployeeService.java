package Services;

import java.util.ArrayList;
import java.util.List;

import Domain.Employee;
import Domain.PersonComparator;

/**
 * Класс для обработки операций с сотрудниками.
 */
public class EmployeeService implements iPersonService<Employee> {

    private int count;

    private String employeePost;

    private List<Employee> employees;

    /**
     * Конструктор класса EmployeeServices.
     * Создает новый экземпляр класса с пустым списком сотрудников.
     */
    public EmployeeService() {
        this.employees = new ArrayList<>();
    }

    /**
     * Метод для получения занимаемой должности сотрудника:
     * @param emplPost - должность сотрудника.
     */
    public void EmployeePost(String emplPost) {
        this.employeePost = emplPost;
    }

    /**
     * Переопределённый метод getAll:
     * @return Список всех сотрудников.
     */
    @Override
    public List<Employee> getAll() {
        return employees;
    }

    /**
     * Переопределённый метод create:
     * Создает нового сотрудника и добавляет его в список.
     * Увеличивает счетчик количества сотрудников.
     * @param name - имя сотрудника.
     * @param age - возраст сотрудника.
     */
    @Override
    public void create(String name, int age) {
        Employee epls = new Employee(name, age, "Basic");
        count++;
        employees.add(epls);
    }

    /**
     * Сортирует список сотрудников по ФИО (фамилия, имя, отчество).
     * Использует компаратор PersonComparator для сравнения и последующей сортировки сотрудников.
     */
    public void sortByFIO()
    {
        PersonComparator<Employee> persComp = new PersonComparator<Employee>();
        employees.sort(persComp);
    }
}
