package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class sortExample {

    public static List<Student> list = StudentDataBase.getAllStudents();
    public static void main(String[] args) {
        getStudentActivitiesBySorted().forEach(System.out::println);
    }

    public static List<String> getStudentActivitiesBySorted(){
      return list.stream()
                .map(student -> student.getActivities())
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());

    }
}
