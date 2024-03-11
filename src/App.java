import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Controllers.AccountController;
import Domain.*;
import Services.TeacherService;

public class App {
    public static void main(String[] args) throws Exception {
        
        Student s1 = new Student("Иван", 25);
        Student s2 = new Student("Игорь", 23);
        Student s3 = new Student("Иван", 22);
        Student s4 = new Student("Игорь",  23);
        Student s5 = new Student("Даша",  23);
        Student s6 = new Student("Лена",  24);
        Student s7 = new Student("Маша",  22);
        Student s8 = new Student("Катя",  21);
        Student s9 = new Student("Роман",  20);
        Student s10 = new Student("Павел",  21);
        Student s11 = new Student("Александр",  24);

        Teacher t1 = new Teacher("Эдуард", 40, "Доцент");
        Teacher t2 = new Teacher("Елена", 43, "Доцент");
        Teacher t3 = new Teacher("Екатерина", 53, "Профессор");
        Teacher t4 = new Teacher("Алексей", 46, "Доцент");
        Teacher t5 = new Teacher("Виктор", 51, "Профессор");

        Employee e1 = new Employee("Василий", 49, "Слесарь");
        Employee e2 = new Employee("Григорий", 39, "Охранник");

        List<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(e1);
        employeeList.add(e2);

        List<Teacher> teachersList = new ArrayList<Teacher>();
        teachersList.add(t1);
        teachersList.add(t2);
        teachersList.add(t3);
        teachersList.add(t4);
        teachersList.add(t5);

        List<Student> firstGroup = new ArrayList<Student>();
        firstGroup.add(s1);
        firstGroup.add(s2);

        List<Student> secondGroup = new ArrayList<Student>();
        secondGroup.add(s5);
        secondGroup.add(s6);

        List<Student> thirdGroup = new ArrayList<Student>();
        thirdGroup.add(s3);
        thirdGroup.add(s4);
        thirdGroup.add(s9);

        List<Student> fourthGroup = new ArrayList<Student>();
        fourthGroup.add(s7);
        fourthGroup.add(s8);

        List<Student> fifthGroup = new ArrayList<Student>();
        fifthGroup.add(s10);
        fifthGroup.add(s11);

        StudentGroup group5830 = new StudentGroup(firstGroup, 5830);

        StudentGroup group5831 = new StudentGroup(secondGroup, 5831);

        StudentGroup group5832 = new StudentGroup(thirdGroup, 5832);

        StudentGroup group5833 = new StudentGroup(fourthGroup, 5833);

        StudentGroup group5834 = new StudentGroup(fifthGroup, 5833);

        List<StudentGroup> stream1 = new ArrayList<StudentGroup>();
        stream1.add(group5830);
        stream1.add(group5832);
        stream1.add(group5834);

        List<StudentGroup> stream2 = new ArrayList<StudentGroup>();
        stream2.add(group5831);
        stream2.add(group5833);

        StudentStream studStream1 = new StudentStream(stream1, 1);

        StudentStream studStream2 = new StudentStream(stream2, 2);

        System.out.println(studStream2);

        System.out.println("=========================================================");

        for(StudentGroup studGroup : studStream1)
        {
            System.out.println(studGroup);
        }

        System.out.println("=========================================================");

        Collections.sort(studStream1.getStudentsStream());

        for(StudentGroup studGroup : studStream1.getStudentsStream())
        {
            System.out.println(studGroup);
        }

        System.out.println("=========================================================");

        TeacherService teachServ = new TeacherService();
        for (Teacher t : teachersList){
            teachServ.TeacherAcadDegree(t.getAcadDegree());
            teachServ.create(t.getName(), t.getAge());
        }

        AccountController.print(teachServ.getAll());

        System.out.println("=========================================================");

        teachServ.sortByFIO();

        AccountController.print(teachServ.getAll());

        System.out.println("=========================================================");

        AccountController.averageAge("Средний возраст учителей: ", teachersList);

        System.out.println("=========================================================");

        AccountController.averageAge("Средний возраст студентов группы 5830: ", firstGroup);

        System.out.println("=========================================================");

        AccountController.averageAge("Средний возраст сотрудников: ", employeeList);
    }
}
