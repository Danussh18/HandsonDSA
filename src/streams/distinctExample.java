package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class distinctExample {

    public static List<Student> list = StudentDataBase.getAllStudents();

    public static void main(String[] args) {
         printStudentActivities();
    }

    public static void printStudentActivities(){
        List<String> studentList = list.stream()
                .map(student -> student.getActivities())
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());

        studentList.forEach(System.out::println);
    }
}
