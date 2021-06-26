package streams;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class customizedComparatorExample {
    public static List<Student> list = StudentDataBase.getAllStudents();

    public static void main(String[] args) {
            getByActivitiesSorted().forEach(System.out::println);
    }

    public static List<Student> getByActivitiesSorted(){
        return list.stream()
                .sorted(Comparator.comparing(Student::getGradeLevel).thenComparing(Student::getName).reversed())
                .collect(Collectors.toList());
    }
}
