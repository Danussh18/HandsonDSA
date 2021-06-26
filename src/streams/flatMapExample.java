package streams;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class flatMapExample {
    public static List<Student> list = StudentDataBase.getAllStudents();
    public static void main(String[] args) {
        printAllActivities();
        printAllDistinctActivities();
    }

    public static void printAllActivities(){
        List<String> studentList = list.stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .collect(Collectors.toList());

        studentList.forEach(System.out::println);

        System.out.println("**********************************************");


    }

    public static void printAllDistinctActivities(){
        Set<String> set = list.stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<List<String>> using flatMap then results to Stream<String>
                .collect(Collectors.toSet());

        set.forEach(System.out::println);
    }
}
