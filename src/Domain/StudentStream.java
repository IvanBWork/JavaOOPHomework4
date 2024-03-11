package Domain;

import java.util.Iterator;
import java.util.List;

public class StudentStream implements Iterable<StudentGroup> {
    private int idStream;
    private List<StudentGroup> studentsStream;

    /**
     * Конструктор класса StudentStream:
     * @param numberStream - список групп студентов на потоке.
     * @param idStream - id потока.
     */
    public StudentStream(List<StudentGroup> numberStream, int idStream) {
        this.idStream = idStream;
        this.studentsStream = numberStream;
    }

    /**
     * Метод для получения id потока.
     */
    public int getIdStream() {
        return idStream;
    }

    /**
     * Метод для установки id потока.
     */
    public void setIdStream(int idStream) {
        this.idStream = idStream;
    }

    /**
     * Метод для получения списка групп студентов на потоке
     */
    public List<StudentGroup> getStudentsStream() {
        return studentsStream;
    }

    /**
     * Метод для установки списка групп студентов на потоке.
     */
    public void setStudentsStream(List<StudentGroup> studentsStream) {
        this.studentsStream = studentsStream;
    }

    /**
     * Переопределенный метод toString для формирования строкового представления объекта StudentStream:
     * @return строковое представление объекта StudentStream.
     */
    @Override
    public String toString() {
        String temp = "";

        for (StudentGroup studentGroup : studentsStream) {
            temp += studentGroup + "\n";
        }

        return "\nidStream = " + idStream + "\ngroupsCount = " + studentsStream.size() + "\n" + temp;
    }

    /**
     * @apiNote Переопределенный метод iterator - для прохождения по элементам списка,
     * который представляет собой список групп студентов на потоке.
     * @return iterator для списка групп на потоке.
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new StudentStreamIterator(studentsStream);
    }
}
